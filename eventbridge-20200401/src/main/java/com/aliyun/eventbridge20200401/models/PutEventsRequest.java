// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class PutEventsRequest extends TeaModel {
    /**
     * <p>The name of the event bus.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-bus</p>
     */
    @NameInMap("EventBusName")
    public String eventBusName;

    /**
     * <p>The list of events.</p>
     */
    @NameInMap("EventList")
    public java.util.List<PutEventsRequestEventList> eventList;

    public static PutEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        PutEventsRequest self = new PutEventsRequest();
        return TeaModel.build(map, self);
    }

    public PutEventsRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public PutEventsRequest setEventList(java.util.List<PutEventsRequestEventList> eventList) {
        this.eventList = eventList;
        return this;
    }
    public java.util.List<PutEventsRequestEventList> getEventList() {
        return this.eventList;
    }

    public static class PutEventsRequestEventList extends TeaModel {
        /**
         * <p>The event payload.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;orderId&quot;: &quot;1001&quot;, &quot;amount&quot;: 99.9}</p>
         */
        @NameInMap("Data")
        public Object data;

        /**
         * <p>The data format.</p>
         * 
         * <strong>example:</strong>
         * <p>application/json</p>
         */
        @NameInMap("DataContentType")
        public String dataContentType;

        /**
         * <p>The data schema address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/schema/v1">https://example.com/schema/v1</a></p>
         */
        @NameInMap("DataSchema")
        public String dataSchema;

        /**
         * <p>The event ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5a2c8f4e-0001</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The event source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my.custom.source</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The protocol version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("SpecVersion")
        public String specVersion;

        /**
         * <p>The event subject.</p>
         * 
         * <strong>example:</strong>
         * <p>order-1001</p>
         */
        @NameInMap("Subject")
        public String subject;

        /**
         * <p>The event time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-04T10:00:00Z</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The event type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>order:created</p>
         */
        @NameInMap("Type")
        public String type;

        public static PutEventsRequestEventList build(java.util.Map<String, ?> map) throws Exception {
            PutEventsRequestEventList self = new PutEventsRequestEventList();
            return TeaModel.build(map, self);
        }

        public PutEventsRequestEventList setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

        public PutEventsRequestEventList setDataContentType(String dataContentType) {
            this.dataContentType = dataContentType;
            return this;
        }
        public String getDataContentType() {
            return this.dataContentType;
        }

        public PutEventsRequestEventList setDataSchema(String dataSchema) {
            this.dataSchema = dataSchema;
            return this;
        }
        public String getDataSchema() {
            return this.dataSchema;
        }

        public PutEventsRequestEventList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PutEventsRequestEventList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public PutEventsRequestEventList setSpecVersion(String specVersion) {
            this.specVersion = specVersion;
            return this;
        }
        public String getSpecVersion() {
            return this.specVersion;
        }

        public PutEventsRequestEventList setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public PutEventsRequestEventList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public PutEventsRequestEventList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
