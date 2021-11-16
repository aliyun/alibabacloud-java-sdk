// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListEscalationPlansResponseBody extends TeaModel {
    // data
    @NameInMap("data")
    public java.util.List<ListEscalationPlansResponseBodyData> data;

    // 分页参数
    @NameInMap("pageNumber")
    public Long pageNumber;

    // 分页参数
    @NameInMap("pageSize")
    public Long pageSize;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // 总条数
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
        // 范围对象类型
        @NameInMap("scope")
        public String scope;

        // 范围对象id（服务id）
        @NameInMap("scopeObjectId")
        public Long scopeObjectId;

        // 范围对象名称
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
        // 升级计划id
        @NameInMap("escalationPlanId")
        public Long escalationPlanId;

        // 升级计划名称
        @NameInMap("escalationPlanName")
        public String escalationPlanName;

        // 升级计划范围对象
        @NameInMap("escalationPlanScopeObjects")
        public java.util.List<ListEscalationPlansResponseBodyDataEscalationPlanScopeObjects> escalationPlanScopeObjects;

        // 修改时间
        @NameInMap("modifyTime")
        public String modifyTime;

        // 启用ENABLE 禁用DISABLE
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
