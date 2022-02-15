// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class VerifyRouteRuleRequest extends TeaModel {
    // 规则id
    @NameInMap("routeRuleId")
    public Long routeRuleId;

    // 测试告警
    @NameInMap("testSourceEvents")
    public java.util.List<VerifyRouteRuleRequestTestSourceEvents> testSourceEvents;

    public static VerifyRouteRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyRouteRuleRequest self = new VerifyRouteRuleRequest();
        return TeaModel.build(map, self);
    }

    public VerifyRouteRuleRequest setRouteRuleId(Long routeRuleId) {
        this.routeRuleId = routeRuleId;
        return this;
    }
    public Long getRouteRuleId() {
        return this.routeRuleId;
    }

    public VerifyRouteRuleRequest setTestSourceEvents(java.util.List<VerifyRouteRuleRequestTestSourceEvents> testSourceEvents) {
        this.testSourceEvents = testSourceEvents;
        return this;
    }
    public java.util.List<VerifyRouteRuleRequestTestSourceEvents> getTestSourceEvents() {
        return this.testSourceEvents;
    }

    public static class VerifyRouteRuleRequestTestSourceEvents extends TeaModel {
        // 告警内容
        @NameInMap("eventJson")
        public String eventJson;

        // 告警上报时间
        @NameInMap("eventTime")
        public String eventTime;

        // 监控告警源ID
        @NameInMap("monitorSourceId")
        public Long monitorSourceId;

        // 监控告警源名称
        @NameInMap("monitorSourceName")
        public String monitorSourceName;

        public static VerifyRouteRuleRequestTestSourceEvents build(java.util.Map<String, ?> map) throws Exception {
            VerifyRouteRuleRequestTestSourceEvents self = new VerifyRouteRuleRequestTestSourceEvents();
            return TeaModel.build(map, self);
        }

        public VerifyRouteRuleRequestTestSourceEvents setEventJson(String eventJson) {
            this.eventJson = eventJson;
            return this;
        }
        public String getEventJson() {
            return this.eventJson;
        }

        public VerifyRouteRuleRequestTestSourceEvents setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public VerifyRouteRuleRequestTestSourceEvents setMonitorSourceId(Long monitorSourceId) {
            this.monitorSourceId = monitorSourceId;
            return this;
        }
        public Long getMonitorSourceId() {
            return this.monitorSourceId;
        }

        public VerifyRouteRuleRequestTestSourceEvents setMonitorSourceName(String monitorSourceName) {
            this.monitorSourceName = monitorSourceName;
            return this;
        }
        public String getMonitorSourceName() {
            return this.monitorSourceName;
        }

    }

}
