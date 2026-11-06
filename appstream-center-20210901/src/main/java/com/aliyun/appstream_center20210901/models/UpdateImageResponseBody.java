// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UpdateImageResponseBody extends TeaModel {
    /**
     * <p>The error code. This field is returned when the request fails. A successful response may not contain this field.</p>
     * 
     * <strong>example:</strong>
     * <p>Image.NotExist</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the operation was processed successfully. A value of true indicates that the operation was successful.</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The error or result message. This field describes the cause when a request fails. A successful response may not contain this field.</p>
     * 
     * <strong>example:</strong>
     * <p>The image does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request. You can provide this value when you troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>01A1A962-5503-107B-AC8F-EBA85DF905AC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was processed successfully. A value of true indicates that the request was processed successfully. For asynchronous tasks, you must query the task status separately to check whether the task is completed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageResponseBody self = new UpdateImageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateImageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateImageResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UpdateImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
