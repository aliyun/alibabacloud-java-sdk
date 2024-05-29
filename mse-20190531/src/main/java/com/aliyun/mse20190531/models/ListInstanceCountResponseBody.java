// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListInstanceCountResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 is returned if the request is successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data entries returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<Integer> data;

    /**
     * <p>The dynamic part in the error message.</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic part in the error message. This parameter is used to replace `%s` in the `ErrMessage` parameter.</p>
     * <br>
     * <p>>  If the return value of the `ErrMessage` parameter is `The Value of Input Parameter %s is not valid` and the return value of the `DynamicMessage` parameter is `DtsJobId`, the specified `DtsJobId` parameter is invalid.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned if the request failed. If the request failed, the ErrorCode parameter is returned. For more information, see the [Error codes](https://help.aliyun.com/document_detail/456441.html) section of this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message. If the request is successful, a success message is returned. If the request fails, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListInstanceCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceCountResponseBody self = new ListInstanceCountResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceCountResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListInstanceCountResponseBody setData(java.util.List<Integer> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Integer> getData() {
        return this.data;
    }

    public ListInstanceCountResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListInstanceCountResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListInstanceCountResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListInstanceCountResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListInstanceCountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstanceCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceCountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
