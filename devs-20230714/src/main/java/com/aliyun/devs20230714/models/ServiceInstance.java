// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ServiceInstance extends TeaModel {
    @NameInMap("config")
    public ServiceConfig config;

    @NameInMap("latestDeployment")
    public ServiceInstanceLatestDeployment latestDeployment;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("outputs")
    public java.util.Map<String, ?> outputs;

    @NameInMap("variables")
    public java.util.Map<String, Variable> variables;

    public static ServiceInstance build(java.util.Map<String, ?> map) throws Exception {
        ServiceInstance self = new ServiceInstance();
        return TeaModel.build(map, self);
    }

    public ServiceInstance setConfig(ServiceConfig config) {
        this.config = config;
        return this;
    }
    public ServiceConfig getConfig() {
        return this.config;
    }

    public ServiceInstance setLatestDeployment(ServiceInstanceLatestDeployment latestDeployment) {
        this.latestDeployment = latestDeployment;
        return this;
    }
    public ServiceInstanceLatestDeployment getLatestDeployment() {
        return this.latestDeployment;
    }

    public ServiceInstance setOutputs(java.util.Map<String, ?> outputs) {
        this.outputs = outputs;
        return this;
    }
    public java.util.Map<String, ?> getOutputs() {
        return this.outputs;
    }

    public ServiceInstance setVariables(java.util.Map<String, Variable> variables) {
        this.variables = variables;
        return this;
    }
    public java.util.Map<String, Variable> getVariables() {
        return this.variables;
    }

    public static class ServiceInstanceLatestDeployment extends TeaModel {
        @NameInMap("finishedTime")
        public String finishedTime;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("phase")
        public String phase;

        @NameInMap("startTime")
        public String startTime;

        public static ServiceInstanceLatestDeployment build(java.util.Map<String, ?> map) throws Exception {
            ServiceInstanceLatestDeployment self = new ServiceInstanceLatestDeployment();
            return TeaModel.build(map, self);
        }

        public ServiceInstanceLatestDeployment setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public ServiceInstanceLatestDeployment setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ServiceInstanceLatestDeployment setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public ServiceInstanceLatestDeployment setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
