// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListEscalationPlansByNoticeObjectResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListEscalationPlansByNoticeObjectResponseBodyData> data;

    @NameInMap("requestId")
    public String requestId;

    public static ListEscalationPlansByNoticeObjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEscalationPlansByNoticeObjectResponseBody self = new ListEscalationPlansByNoticeObjectResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEscalationPlansByNoticeObjectResponseBody setData(java.util.List<ListEscalationPlansByNoticeObjectResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListEscalationPlansByNoticeObjectResponseBodyData> getData() {
        return this.data;
    }

    public ListEscalationPlansByNoticeObjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEscalationPlansByNoticeObjectResponseBodyDataEscalationPlanScopeObjects extends TeaModel {
        @NameInMap("scope")
        public String scope;

        @NameInMap("scopeObjectDeletedType")
        public Integer scopeObjectDeletedType;

        @NameInMap("scopeObjectId")
        public Long scopeObjectId;

        @NameInMap("scopeObjectName")
        public String scopeObjectName;

        public static ListEscalationPlansByNoticeObjectResponseBodyDataEscalationPlanScopeObjects build(java.util.Map<String, ?> map) throws Exception {
            ListEscalationPlansByNoticeObjectResponseBodyDataEscalationPlanScopeObjects self = new ListEscalationPlansByNoticeObjectResponseBodyDataEscalationPlanScopeObjects();
            return TeaModel.build(map, self);
        }

        public ListEscalationPlansByNoticeObjectResponseBodyDataEscalationPlanScopeObjects setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListEscalationPlansByNoticeObjectResponseBodyDataEscalationPlanScopeObjects setScopeObjectDeletedType(Integer scopeObjectDeletedType) {
            this.scopeObjectDeletedType = scopeObjectDeletedType;
            return this;
        }
        public Integer getScopeObjectDeletedType() {
            return this.scopeObjectDeletedType;
        }

        public ListEscalationPlansByNoticeObjectResponseBodyDataEscalationPlanScopeObjects setScopeObjectId(Long scopeObjectId) {
            this.scopeObjectId = scopeObjectId;
            return this;
        }
        public Long getScopeObjectId() {
            return this.scopeObjectId;
        }

        public ListEscalationPlansByNoticeObjectResponseBodyDataEscalationPlanScopeObjects setScopeObjectName(String scopeObjectName) {
            this.scopeObjectName = scopeObjectName;
            return this;
        }
        public String getScopeObjectName() {
            return this.scopeObjectName;
        }

    }

    public static class ListEscalationPlansByNoticeObjectResponseBodyData extends TeaModel {
        @NameInMap("escalationPlanId")
        public Long escalationPlanId;

        @NameInMap("escalationPlanName")
        public String escalationPlanName;

        @NameInMap("escalationPlanScopeObjects")
        public java.util.List<ListEscalationPlansByNoticeObjectResponseBodyDataEscalationPlanScopeObjects> escalationPlanScopeObjects;

        @NameInMap("modifyTime")
        public String modifyTime;

        @NameInMap("status")
        public String status;

        public static ListEscalationPlansByNoticeObjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEscalationPlansByNoticeObjectResponseBodyData self = new ListEscalationPlansByNoticeObjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEscalationPlansByNoticeObjectResponseBodyData setEscalationPlanId(Long escalationPlanId) {
            this.escalationPlanId = escalationPlanId;
            return this;
        }
        public Long getEscalationPlanId() {
            return this.escalationPlanId;
        }

        public ListEscalationPlansByNoticeObjectResponseBodyData setEscalationPlanName(String escalationPlanName) {
            this.escalationPlanName = escalationPlanName;
            return this;
        }
        public String getEscalationPlanName() {
            return this.escalationPlanName;
        }

        public ListEscalationPlansByNoticeObjectResponseBodyData setEscalationPlanScopeObjects(java.util.List<ListEscalationPlansByNoticeObjectResponseBodyDataEscalationPlanScopeObjects> escalationPlanScopeObjects) {
            this.escalationPlanScopeObjects = escalationPlanScopeObjects;
            return this;
        }
        public java.util.List<ListEscalationPlansByNoticeObjectResponseBodyDataEscalationPlanScopeObjects> getEscalationPlanScopeObjects() {
            return this.escalationPlanScopeObjects;
        }

        public ListEscalationPlansByNoticeObjectResponseBodyData setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListEscalationPlansByNoticeObjectResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
