// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListEscalationPlanServicesResponseBody extends TeaModel {
    // data
    @NameInMap("data")
    public java.util.List<ListEscalationPlanServicesResponseBodyData> data;

    // Id of the request
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
        // 范围类型
        @NameInMap("scope")
        public String scope;

        // 范围对象id
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
