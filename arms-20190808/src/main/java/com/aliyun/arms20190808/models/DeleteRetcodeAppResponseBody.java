// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteRetcodeAppResponseBody extends TeaModel {
    /**
     * <p>The status code. The status code 200 indicates that the request was successful. If another status code is returned, the request failed.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Indicates whether the Browser Monitoring task was deleted. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The message returned for the operation. Valid values:</p>
     * <br>
     * <p>*   **Success** is returned if the operation is successful.</p>
     * <p>*   An error message is returned if the operation fails.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>true: The request was successful.</p>
     * <br>
     * <p>false: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteRetcodeAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRetcodeAppResponseBody self = new DeleteRetcodeAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRetcodeAppResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteRetcodeAppResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteRetcodeAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteRetcodeAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRetcodeAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
