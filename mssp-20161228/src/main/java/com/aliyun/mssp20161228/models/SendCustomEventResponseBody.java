// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class SendCustomEventResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SendCustomEventResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>606EB377-155D-5AEB-AC4F-F013444A4C45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SendCustomEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendCustomEventResponseBody self = new SendCustomEventResponseBody();
        return TeaModel.build(map, self);
    }

    public SendCustomEventResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendCustomEventResponseBody setData(SendCustomEventResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SendCustomEventResponseBodyData getData() {
        return this.data;
    }

    public SendCustomEventResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SendCustomEventResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendCustomEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendCustomEventResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SendCustomEventResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1601097845544644</p>
         */
        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("CustomerName")
        public String customerName;

        /**
         * <strong>example:</strong>
         * <p>c0dc71d1-8a1d-4043-9767-f6c420e34901-81bd</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <strong>example:</strong>
         * <p>SUSP_CUSTOM_WAF</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <strong>example:</strong>
         * <p>1914348</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>352675</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("WorkTaskName")
        public String workTaskName;

        public static SendCustomEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendCustomEventResponseBodyData self = new SendCustomEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendCustomEventResponseBodyData setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public SendCustomEventResponseBodyData setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public String getCustomerName() {
            return this.customerName;
        }

        public SendCustomEventResponseBodyData setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public SendCustomEventResponseBodyData setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public SendCustomEventResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SendCustomEventResponseBodyData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public SendCustomEventResponseBodyData setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public SendCustomEventResponseBodyData setWorkTaskName(String workTaskName) {
            this.workTaskName = workTaskName;
            return this;
        }
        public String getWorkTaskName() {
            return this.workTaskName;
        }

    }

}
