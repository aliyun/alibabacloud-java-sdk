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
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
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
         * 
         * <strong>example:</strong>
         * <p>vipcloudfw-cn-7mz2fj8nm0u</p>
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
         * 
         * <strong>example:</strong>
         * <p>172.17.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The UUID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>181ad081-e4f2-4e3e-b925-03b67f648397</p>
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
