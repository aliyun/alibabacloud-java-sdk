// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListEscalationPlansResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public java.util.List<ListEscalationPlansResponseBodyData> data;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Long totalCount;

    public static ListEscalationPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEscalationPlansResponseBody self = new ListEscalationPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEscalationPlansResponseBody setData(java.util.List<ListEscalationPlansResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListEscalationPlansResponseBodyData> getData() {
        return this.data;
    }

    public ListEscalationPlansResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListEscalationPlansResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListEscalationPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEscalationPlansResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListEscalationPlansResponseBodyDataEscalationPlanScopeObjects extends TeaModel {
        @NameInMap("scope")
        public String scope;

        @NameInMap("scopeObjectDeletedType")
        public Integer scopeObjectDeletedType;

        @NameInMap("scopeObjectId")
        public Long scopeObjectId;

        @NameInMap("scopeObjectName")
        public String scopeObjectName;

        public static ListEscalationPlansResponseBodyDataEscalationPlanScopeObjects build(java.util.Map<String, ?> map) throws Exception {
            ListEscalationPlansResponseBodyDataEscalationPlanScopeObjects self = new ListEscalationPlansResponseBodyDataEscalationPlanScopeObjects();
            return TeaModel.build(map, self);
        }

        public ListEscalationPlansResponseBodyDataEscalationPlanScopeObjects setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListEscalationPlansResponseBodyDataEscalationPlanScopeObjects setScopeObjectDeletedType(Integer scopeObjectDeletedType) {
            this.scopeObjectDeletedType = scopeObjectDeletedType;
            return this;
        }
        public Integer getScopeObjectDeletedType() {
            return this.scopeObjectDeletedType;
        }

        public ListEscalationPlansResponseBodyDataEscalationPlanScopeObjects setScopeObjectId(Long scopeObjectId) {
            this.scopeObjectId = scopeObjectId;
            return this;
        }
        public Long getScopeObjectId() {
            return this.scopeObjectId;
        }

        public ListEscalationPlansResponseBodyDataEscalationPlanScopeObjects setScopeObjectName(String scopeObjectName) {
            this.scopeObjectName = scopeObjectName;
            return this;
        }
        public String getScopeObjectName() {
            return this.scopeObjectName;
        }

    }

    public static class ListEscalationPlansResponseBodyData extends TeaModel {
        @NameInMap("escalationPlanId")
        public Long escalationPlanId;

        @NameInMap("escalationPlanName")
        public String escalationPlanName;

        @NameInMap("escalationPlanScopeObjects")
        public java.util.List<ListEscalationPlansResponseBodyDataEscalationPlanScopeObjects> escalationPlanScopeObjects;

        @NameInMap("modifyTime")
        public String modifyTime;

        @NameInMap("status")
        public String status;

        public static ListEscalationPlansResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEscalationPlansResponseBodyData self = new ListEscalationPlansResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEscalationPlansResponseBodyData setEscalationPlanId(Long escalationPlanId) {
            this.escalationPlanId = escalationPlanId;
            return this;
        }
        public Long getEscalationPlanId() {
            return this.escalationPlanId;
        }

        public ListEscalationPlansResponseBodyData setEscalationPlanName(String escalationPlanName) {
            this.escalationPlanName = escalationPlanName;
            return this;
        }
        public String getEscalationPlanName() {
            return this.escalationPlanName;
        }

        public ListEscalationPlansResponseBodyData setEscalationPlanScopeObjects(java.util.List<ListEscalationPlansResponseBodyDataEscalationPlanScopeObjects> escalationPlanScopeObjects) {
            this.escalationPlanScopeObjects = escalationPlanScopeObjects;
            return this;
        }
        public java.util.List<ListEscalationPlansResponseBodyDataEscalationPlanScopeObjects> getEscalationPlanScopeObjects() {
            return this.escalationPlanScopeObjects;
        }

        public ListEscalationPlansResponseBodyData setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListEscalationPlansResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
