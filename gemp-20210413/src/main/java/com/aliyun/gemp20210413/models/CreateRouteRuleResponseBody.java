// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateRouteRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>65</p>
     */
    @NameInMap("data")
    public CreateRouteRuleResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>请求ID</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateRouteRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteRuleResponseBody self = new CreateRouteRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRouteRuleResponseBody setData(CreateRouteRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateRouteRuleResponseBodyData getData() {
        return this.data;
    }

    public CreateRouteRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateRouteRuleResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("routeRuleId")
        public Long routeRuleId;

        public static CreateRouteRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateRouteRuleResponseBodyData self = new CreateRouteRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateRouteRuleResponseBodyData setRouteRuleId(Long routeRuleId) {
            this.routeRuleId = routeRuleId;
            return this;
        }
        public Long getRouteRuleId() {
            return this.routeRuleId;
        }

    }

}
