// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListEscalationPlanServicesResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public java.util.List<ListEscalationPlanServicesResponseBodyData> data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A5A1FEAE-9C47-011C-9C73-A376BC2REQUEST</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListEscalationPlanServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEscalationPlanServicesResponseBody self = new ListEscalationPlanServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEscalationPlanServicesResponseBody setData(java.util.List<ListEscalationPlanServicesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListEscalationPlanServicesResponseBodyData> getData() {
        return this.data;
    }

    public ListEscalationPlanServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEscalationPlanServicesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SERVICE</p>
         */
        @NameInMap("scope")
        public String scope;

        /**
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("scopeObjectId")
        public Long scopeObjectId;

        public static ListEscalationPlanServicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEscalationPlanServicesResponseBodyData self = new ListEscalationPlanServicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEscalationPlanServicesResponseBodyData setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListEscalationPlanServicesResponseBodyData setScopeObjectId(Long scopeObjectId) {
            this.scopeObjectId = scopeObjectId;
            return this;
        }
        public Long getScopeObjectId() {
            return this.scopeObjectId;
        }

    }

}
