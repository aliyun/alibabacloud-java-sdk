// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListRouteRulesByServiceResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListRouteRulesByServiceResponseBodyData> data;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListRouteRulesByServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRouteRulesByServiceResponseBody self = new ListRouteRulesByServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRouteRulesByServiceResponseBody setData(java.util.List<ListRouteRulesByServiceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListRouteRulesByServiceResponseBodyData> getData() {
        return this.data;
    }

    public ListRouteRulesByServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRouteRulesByServiceResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListRouteRulesByServiceResponseBodyData extends TeaModel {
        @NameInMap("id")
        public Integer id;

        @NameInMap("ruleName")
        public String ruleName;

        public static ListRouteRulesByServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRouteRulesByServiceResponseBodyData self = new ListRouteRulesByServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRouteRulesByServiceResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListRouteRulesByServiceResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

}
