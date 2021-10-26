// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListProvisionConfigsResponseBody extends TeaModel {
    // 下次查询的起始token	
    @NameInMap("nextToken")
    public String nextToken;

    // 预留实例列表
    @NameInMap("provisionConfigs")
    public java.util.List<ListProvisionConfigsResponseBodyProvisionConfigs> provisionConfigs;

    public static ListProvisionConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProvisionConfigsResponseBody self = new ListProvisionConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProvisionConfigsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProvisionConfigsResponseBody setProvisionConfigs(java.util.List<ListProvisionConfigsResponseBodyProvisionConfigs> provisionConfigs) {
        this.provisionConfigs = provisionConfigs;
        return this;
    }
    public java.util.List<ListProvisionConfigsResponseBodyProvisionConfigs> getProvisionConfigs() {
        return this.provisionConfigs;
    }

    public static class ListProvisionConfigsResponseBodyProvisionConfigs extends TeaModel {
        // 实际资源个数
        @NameInMap("current")
        public Long current;

        // 资源描述
        @NameInMap("resource")
        public String resource;

        // 定时策略配置
        @NameInMap("scheduledActions")
        public java.util.List<ScheduledActions> scheduledActions;

        // 目标资源个数
        @NameInMap("target")
        public Long target;

        // 指标追踪伸缩策略配置
        @NameInMap("targetTrackingPolicies")
        public java.util.List<TargetTrackingPolicies> targetTrackingPolicies;

        public static ListProvisionConfigsResponseBodyProvisionConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListProvisionConfigsResponseBodyProvisionConfigs self = new ListProvisionConfigsResponseBodyProvisionConfigs();
            return TeaModel.build(map, self);
        }

        public ListProvisionConfigsResponseBodyProvisionConfigs setCurrent(Long current) {
            this.current = current;
            return this;
        }
        public Long getCurrent() {
            return this.current;
        }

        public ListProvisionConfigsResponseBodyProvisionConfigs setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public ListProvisionConfigsResponseBodyProvisionConfigs setScheduledActions(java.util.List<ScheduledActions> scheduledActions) {
            this.scheduledActions = scheduledActions;
            return this;
        }
        public java.util.List<ScheduledActions> getScheduledActions() {
            return this.scheduledActions;
        }

        public ListProvisionConfigsResponseBodyProvisionConfigs setTarget(Long target) {
            this.target = target;
            return this;
        }
        public Long getTarget() {
            return this.target;
        }

        public ListProvisionConfigsResponseBodyProvisionConfigs setTargetTrackingPolicies(java.util.List<TargetTrackingPolicies> targetTrackingPolicies) {
            this.targetTrackingPolicies = targetTrackingPolicies;
            return this;
        }
        public java.util.List<TargetTrackingPolicies> getTargetTrackingPolicies() {
            return this.targetTrackingPolicies;
        }

    }

}
