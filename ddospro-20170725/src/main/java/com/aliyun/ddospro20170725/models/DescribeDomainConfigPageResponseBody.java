// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeDomainConfigPageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("ConfigList")
    public java.util.List<DescribeDomainConfigPageResponseBodyConfigList> configList;

    public static DescribeDomainConfigPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainConfigPageResponseBody self = new DescribeDomainConfigPageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainConfigPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainConfigPageResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeDomainConfigPageResponseBody setConfigList(java.util.List<DescribeDomainConfigPageResponseBodyConfigList> configList) {
        this.configList = configList;
        return this;
    }
    public java.util.List<DescribeDomainConfigPageResponseBodyConfigList> getConfigList() {
        return this.configList;
    }

    public static class DescribeDomainConfigPageResponseBodyConfigListInstancesRules extends TeaModel {
        @NameInMap("ProxyTypeList")
        public java.util.List<String> proxyTypeList;

        @NameInMap("Line")
        public String line;

        @NameInMap("RealServers")
        public java.util.List<String> realServers;

        @NameInMap("Ip")
        public String ip;

        public static DescribeDomainConfigPageResponseBodyConfigListInstancesRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainConfigPageResponseBodyConfigListInstancesRules self = new DescribeDomainConfigPageResponseBodyConfigListInstancesRules();
            return TeaModel.build(map, self);
        }

        public DescribeDomainConfigPageResponseBodyConfigListInstancesRules setProxyTypeList(java.util.List<String> proxyTypeList) {
            this.proxyTypeList = proxyTypeList;
            return this;
        }
        public java.util.List<String> getProxyTypeList() {
            return this.proxyTypeList;
        }

        public DescribeDomainConfigPageResponseBodyConfigListInstancesRules setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public DescribeDomainConfigPageResponseBodyConfigListInstancesRules setRealServers(java.util.List<String> realServers) {
            this.realServers = realServers;
            return this;
        }
        public java.util.List<String> getRealServers() {
            return this.realServers;
        }

        public DescribeDomainConfigPageResponseBodyConfigListInstancesRules setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class DescribeDomainConfigPageResponseBodyConfigListInstances extends TeaModel {
        @NameInMap("InstanceRemark")
        public String instanceRemark;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Rules")
        public java.util.List<DescribeDomainConfigPageResponseBodyConfigListInstancesRules> rules;

        public static DescribeDomainConfigPageResponseBodyConfigListInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainConfigPageResponseBodyConfigListInstances self = new DescribeDomainConfigPageResponseBodyConfigListInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDomainConfigPageResponseBodyConfigListInstances setInstanceRemark(String instanceRemark) {
            this.instanceRemark = instanceRemark;
            return this;
        }
        public String getInstanceRemark() {
            return this.instanceRemark;
        }

        public DescribeDomainConfigPageResponseBodyConfigListInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDomainConfigPageResponseBodyConfigListInstances setRules(java.util.List<DescribeDomainConfigPageResponseBodyConfigListInstancesRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeDomainConfigPageResponseBodyConfigListInstancesRules> getRules() {
            return this.rules;
        }

    }

    public static class DescribeDomainConfigPageResponseBodyConfigList extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Cname")
        public String cname;

        @NameInMap("Instances")
        public java.util.List<DescribeDomainConfigPageResponseBodyConfigListInstances> instances;

        public static DescribeDomainConfigPageResponseBodyConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainConfigPageResponseBodyConfigList self = new DescribeDomainConfigPageResponseBodyConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainConfigPageResponseBodyConfigList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDomainConfigPageResponseBodyConfigList setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeDomainConfigPageResponseBodyConfigList setInstances(java.util.List<DescribeDomainConfigPageResponseBodyConfigListInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<DescribeDomainConfigPageResponseBodyConfigListInstances> getInstances() {
            return this.instances;
        }

    }

}
