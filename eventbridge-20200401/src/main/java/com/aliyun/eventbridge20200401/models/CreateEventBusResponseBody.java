// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateEventBusResponseBody extends TeaModel {
    /**
     * <p>The returned response code. The value Success indicates that the request is successful. Other values indicate that the request failed. For more information about error codes, see Error codes.</p>
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
    public CreateEventBusResponseBodyData data;

    /**
     * <p>The returned error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The event bus [xxxx] not existed!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A995F07C-E503-5881-9962-9CECA8566876</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. The value true indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateEventBusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEventBusResponseBody self = new CreateEventBusResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEventBusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateEventBusResponseBody setData(CreateEventBusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateEventBusResponseBodyData getData() {
        return this.data;
    }

    public CreateEventBusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateEventBusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEventBusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateEventBusResponseBodyData extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the event bus.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:eventbridge:cn-hangzhou:123456789098****:eventbus/MyEventBus</p>
         */
        @NameInMap("EventBusARN")
        public String eventBusARN;

        public static CreateEventBusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateEventBusResponseBodyData self = new CreateEventBusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateEventBusResponseBodyData setEventBusARN(String eventBusARN) {
            this.eventBusARN = eventBusARN;
            return this;
        }
        public String getEventBusARN() {
            return this.eventBusARN;
        }

    }

}
