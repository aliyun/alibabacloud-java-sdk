// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateEventStreamingResponseBody extends TeaModel {
    /**
     * <p>The response code:</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CreateEventStreamingResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The name [xxxx] of event streaming in request is already exist!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B896B484-F16D-59DE-9E23-DD0E5C36****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returns true if the operation is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateEventStreamingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEventStreamingResponseBody self = new CreateEventStreamingResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEventStreamingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateEventStreamingResponseBody setData(CreateEventStreamingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateEventStreamingResponseBodyData getData() {
        return this.data;
    }

    public CreateEventStreamingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateEventStreamingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEventStreamingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateEventStreamingResponseBodyData extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the event stream.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:eventbridge:cn-hangzhou:164901546557****:eventstreaming/myeventstreaming</p>
         */
        @NameInMap("EventStreamingARN")
        public String eventStreamingARN;

        public static CreateEventStreamingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingResponseBodyData self = new CreateEventStreamingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingResponseBodyData setEventStreamingARN(String eventStreamingARN) {
            this.eventStreamingARN = eventStreamingARN;
            return this;
        }
        public String getEventStreamingARN() {
            return this.eventStreamingARN;
        }

    }

}
