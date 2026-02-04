// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListEventTypesResponseBody extends TeaModel {
    @NameInMap("EventTypes")
    public java.util.List<ListEventTypesResponseBodyEventTypes> eventTypes;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListEventTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEventTypesResponseBody self = new ListEventTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEventTypesResponseBody setEventTypes(java.util.List<ListEventTypesResponseBodyEventTypes> eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }
    public java.util.List<ListEventTypesResponseBodyEventTypes> getEventTypes() {
        return this.eventTypes;
    }

    public ListEventTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEventTypesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListEventTypesResponseBodyEventTypes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:event:user:create</p>
         */
        @NameInMap("EventType")
        public String eventType;

        public static ListEventTypesResponseBodyEventTypes build(java.util.Map<String, ?> map) throws Exception {
            ListEventTypesResponseBodyEventTypes self = new ListEventTypesResponseBodyEventTypes();
            return TeaModel.build(map, self);
        }

        public ListEventTypesResponseBodyEventTypes setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

    }

}
