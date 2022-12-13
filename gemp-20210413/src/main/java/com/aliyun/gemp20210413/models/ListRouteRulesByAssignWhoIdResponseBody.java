// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListRouteRulesByAssignWhoIdResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListRouteRulesByAssignWhoIdResponseBodyData> data;

    @NameInMap("requestId")
    public String requestId;

    public static ListRouteRulesByAssignWhoIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRouteRulesByAssignWhoIdResponseBody self = new ListRouteRulesByAssignWhoIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRouteRulesByAssignWhoIdResponseBody setData(java.util.List<ListRouteRulesByAssignWhoIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListRouteRulesByAssignWhoIdResponseBodyData> getData() {
        return this.data;
    }

    public ListRouteRulesByAssignWhoIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRouteRulesByAssignWhoIdResponseBodyData extends TeaModel {
        @NameInMap("id")
        public Long id;

        @NameInMap("ruleName")
        public String ruleName;

        @NameInMap("tenantRamId")
        public Long tenantRamId;

        public static ListRouteRulesByAssignWhoIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRouteRulesByAssignWhoIdResponseBodyData self = new ListRouteRulesByAssignWhoIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRouteRulesByAssignWhoIdResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListRouteRulesByAssignWhoIdResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListRouteRulesByAssignWhoIdResponseBodyData setTenantRamId(Long tenantRamId) {
            this.tenantRamId = tenantRamId;
            return this;
        }
        public Long getTenantRamId() {
            return this.tenantRamId;
        }

    }

}
