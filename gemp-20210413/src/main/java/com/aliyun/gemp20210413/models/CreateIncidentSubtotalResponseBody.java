// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateIncidentSubtotalResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public CreateIncidentSubtotalResponseBodyData data;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>FD200FAE-E98F-496E-BFE6-4CE61E59A2E9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateIncidentSubtotalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIncidentSubtotalResponseBody self = new CreateIncidentSubtotalResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIncidentSubtotalResponseBody setData(CreateIncidentSubtotalResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateIncidentSubtotalResponseBodyData getData() {
        return this.data;
    }

    public CreateIncidentSubtotalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateIncidentSubtotalResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("subtotalId")
        public Long subtotalId;

        public static CreateIncidentSubtotalResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateIncidentSubtotalResponseBodyData self = new CreateIncidentSubtotalResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateIncidentSubtotalResponseBodyData setSubtotalId(Long subtotalId) {
            this.subtotalId = subtotalId;
            return this;
        }
        public Long getSubtotalId() {
            return this.subtotalId;
        }

    }

}
