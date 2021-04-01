// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeLayer4RulesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Long total;

    @NameInMap("Listeners")
    @Validation(required = true)
    public java.util.List<DescribeLayer4RulesResponseListeners> listeners;

    public static DescribeLayer4RulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLayer4RulesResponse self = new DescribeLayer4RulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLayer4RulesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLayer4RulesResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeLayer4RulesResponse setListeners(java.util.List<DescribeLayer4RulesResponseListeners> listeners) {
        this.listeners = listeners;
        return this;
    }
    public java.util.List<DescribeLayer4RulesResponseListeners> getListeners() {
        return this.listeners;
    }

    public static class DescribeLayer4RulesResponseListeners extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Protocol")
        @Validation(required = true)
        public String protocol;

        @NameInMap("FrontendPort")
        @Validation(required = true)
        public Integer frontendPort;

        @NameInMap("BackendPort")
        @Validation(required = true)
        public Integer backendPort;

        @NameInMap("IsAutoCreate")
        @Validation(required = true)
        public Boolean isAutoCreate;

        @NameInMap("RealServers")
        @Validation(required = true)
        public java.util.List<String> realServers;

        public static DescribeLayer4RulesResponseListeners build(java.util.Map<String, ?> map) throws Exception {
            DescribeLayer4RulesResponseListeners self = new DescribeLayer4RulesResponseListeners();
            return TeaModel.build(map, self);
        }

        public DescribeLayer4RulesResponseListeners setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeLayer4RulesResponseListeners setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeLayer4RulesResponseListeners setFrontendPort(Integer frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }
        public Integer getFrontendPort() {
            return this.frontendPort;
        }

        public DescribeLayer4RulesResponseListeners setBackendPort(Integer backendPort) {
            this.backendPort = backendPort;
            return this;
        }
        public Integer getBackendPort() {
            return this.backendPort;
        }

        public DescribeLayer4RulesResponseListeners setIsAutoCreate(Boolean isAutoCreate) {
            this.isAutoCreate = isAutoCreate;
            return this;
        }
        public Boolean getIsAutoCreate() {
            return this.isAutoCreate;
        }

        public DescribeLayer4RulesResponseListeners setRealServers(java.util.List<String> realServers) {
            this.realServers = realServers;
            return this;
        }
        public java.util.List<String> getRealServers() {
            return this.realServers;
        }

    }

}
