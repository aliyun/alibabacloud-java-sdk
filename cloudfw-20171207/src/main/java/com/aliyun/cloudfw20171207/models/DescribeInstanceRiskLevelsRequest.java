// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInstanceRiskLevelsRequest extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<DescribeInstanceRiskLevelsRequestInstances> instances;

    @NameInMap("Lang")
    public String lang;

    public static DescribeInstanceRiskLevelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRiskLevelsRequest self = new DescribeInstanceRiskLevelsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceRiskLevelsRequest setInstances(java.util.List<DescribeInstanceRiskLevelsRequestInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeInstanceRiskLevelsRequestInstances> getInstances() {
        return this.instances;
    }

    public DescribeInstanceRiskLevelsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public static class DescribeInstanceRiskLevelsRequestInstances extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InternetIp")
        public java.util.List<String> internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("Uuid")
        public String uuid;

        public static DescribeInstanceRiskLevelsRequestInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceRiskLevelsRequestInstances self = new DescribeInstanceRiskLevelsRequestInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceRiskLevelsRequestInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceRiskLevelsRequestInstances setInternetIp(java.util.List<String> internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public java.util.List<String> getInternetIp() {
            return this.internetIp;
        }

        public DescribeInstanceRiskLevelsRequestInstances setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeInstanceRiskLevelsRequestInstances setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
