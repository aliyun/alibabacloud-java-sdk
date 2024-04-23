// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInstanceRiskLevelsRequest extends TeaModel {
    /**
     * <p>The information about the instances.</p>
     */
    @NameInMap("Instances")
    public java.util.List<DescribeInstanceRiskLevelsRequestInstances> instances;

    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <br>
     * <p>*   **zh** (default): Chinese</p>
     * <p>*   **en**: English</p>
     */
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
        /**
         * <p>The instance ID of your Cloud Firewall.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The public IP addresses of instances.</p>
         */
        @NameInMap("InternetIp")
        public java.util.List<String> internetIp;

        /**
         * <p>The private IP address of the instance.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The UUID of the instance.</p>
         */
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
