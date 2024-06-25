// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetEventBusResponseBody extends TeaModel {
    /**
     * <p>The response code. The value Success indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetEventBusResponseBodyData data;

    /**
     * <p>The error message that is returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>EventBusNotExist</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d5bfc188-4452-4ba7-b73a-a9005e522439</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is successful. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetEventBusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEventBusResponseBody self = new GetEventBusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEventBusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEventBusResponseBody setData(GetEventBusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEventBusResponseBodyData getData() {
        return this.data;
    }

    public GetEventBusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEventBusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEventBusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetEventBusResponseBodyData extends TeaModel {
        /**
         * <p>The timestamp that indicates when the event bus was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1641781825000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The description of the event bus.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the event bus.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:eventbridge:cn-hangzhou:123456789098****:eventbus/MyEventBus</p>
         */
        @NameInMap("EventBusARN")
        public String eventBusARN;

        /**
         * <p>The name of the event bus.</p>
         * 
         * <strong>example:</strong>
         * <p>MyEventBus</p>
         */
        @NameInMap("EventBusName")
        public String eventBusName;

        public static GetEventBusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEventBusResponseBodyData self = new GetEventBusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEventBusResponseBodyData setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public GetEventBusResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetEventBusResponseBodyData setEventBusARN(String eventBusARN) {
            this.eventBusARN = eventBusARN;
            return this;
        }
        public String getEventBusARN() {
            return this.eventBusARN;
        }

        public GetEventBusResponseBodyData setEventBusName(String eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }
        public String getEventBusName() {
            return this.eventBusName;
        }

    }

}
