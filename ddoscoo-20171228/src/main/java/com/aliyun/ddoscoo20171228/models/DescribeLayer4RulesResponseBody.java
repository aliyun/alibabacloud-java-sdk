// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeLayer4RulesResponseBody extends TeaModel {
    @NameInMap("Listeners")
    public java.util.List<DescribeLayer4RulesResponseBodyListeners> listeners;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static DescribeLayer4RulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLayer4RulesResponseBody self = new DescribeLayer4RulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLayer4RulesResponseBody setListeners(java.util.List<DescribeLayer4RulesResponseBodyListeners> listeners) {
        this.listeners = listeners;
        return this;
    }
    public java.util.List<DescribeLayer4RulesResponseBodyListeners> getListeners() {
        return this.listeners;
    }

    public DescribeLayer4RulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLayer4RulesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeLayer4RulesResponseBodyListeners extends TeaModel {
        @NameInMap("FrontendPort")
        public Integer frontendPort;

        @NameInMap("IsAutoCreate")
        public Boolean isAutoCreate;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("RealServers")
        public java.util.List<String> realServers;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("BackendPort")
        public Integer backendPort;

        public static DescribeLayer4RulesResponseBodyListeners build(java.util.Map<String, ?> map) throws Exception {
            DescribeLayer4RulesResponseBodyListeners self = new DescribeLayer4RulesResponseBodyListeners();
            return TeaModel.build(map, self);
        }

        public DescribeLayer4RulesResponseBodyListeners setFrontendPort(Integer frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }
        public Integer getFrontendPort() {
            return this.frontendPort;
        }

        public DescribeLayer4RulesResponseBodyListeners setIsAutoCreate(Boolean isAutoCreate) {
            this.isAutoCreate = isAutoCreate;
            return this;
        }
        public Boolean getIsAutoCreate() {
            return this.isAutoCreate;
        }

        public DescribeLayer4RulesResponseBodyListeners setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeLayer4RulesResponseBodyListeners setRealServers(java.util.List<String> realServers) {
            this.realServers = realServers;
            return this;
        }
        public java.util.List<String> getRealServers() {
            return this.realServers;
        }

        public DescribeLayer4RulesResponseBodyListeners setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeLayer4RulesResponseBodyListeners setBackendPort(Integer backendPort) {
            this.backendPort = backendPort;
            return this;
        }
        public Integer getBackendPort() {
            return this.backendPort;
        }

    }

}
