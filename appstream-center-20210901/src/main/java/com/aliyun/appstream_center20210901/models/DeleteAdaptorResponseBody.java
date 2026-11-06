// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DeleteAdaptorResponseBody extends TeaModel {
    /**
     * <p>The error code. This field is returned when the request fails. A successful response may not contain this field.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the operation was successful. A value of true indicates that the operation was successful.</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The error message or result prompt. This field describes the cause when the request fails. A successful response may not contain this field.</p>
     * 
     * <strong>example:</strong>
     * <p>Internal error.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request. You can provide this value when troubleshooting issues.</p>
     * 
     * <strong>example:</strong>
     * <p>01A1A962-5503-107B-AC8F-EBA85DF905AC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was processed successfully. A value of true indicates that the request was processed successfully. To check whether the asynchronous task is completed, query the task status separately.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteAdaptorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAdaptorResponseBody self = new DeleteAdaptorResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAdaptorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteAdaptorResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteAdaptorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteAdaptorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAdaptorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
