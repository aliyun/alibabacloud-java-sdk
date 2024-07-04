// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>The information about the EPN configurations.</p>
     */
    @NameInMap("ConfVersions")
    public java.util.List<DescribeEpnInstanceAttributeResponseBodyConfVersions> confVersions;

    /**
     * <p>The ID of the EPN instance.</p>
     * 
     * <strong>example:</strong>
     * <p>epn-xxxx</p>
     */
    @NameInMap("EPNInstanceId")
    public String EPNInstanceId;

    /**
     * <p>The name of the EPN instance.</p>
     * 
     * <strong>example:</strong>
     * <p>epn-test</p>
     */
    @NameInMap("EPNInstanceName")
    public String EPNInstanceName;

    /**
     * <p>The information about the instance.</p>
     */
    @NameInMap("Instances")
    public java.util.List<DescribeEpnInstanceAttributeResponseBodyInstances> instances;

    /**
     * <p>The networking mode. Valid values:</p>
     * <ul>
     * <li>SpeedUp: intelligent acceleration network (Internet)</li>
     * <li>Connection: internal network</li>
     * <li>SpeedUpAndConnection: intelligent acceleration network and internal network</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SpeedUp</p>
     */
    @NameInMap("NetworkingModel")
    public String networkingModel;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details of the vSwitch.</p>
     */
    @NameInMap("VSwitches")
    public java.util.List<DescribeEpnInstanceAttributeResponseBodyVSwitches> vSwitches;

    public static DescribeEpnInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEpnInstanceAttributeResponseBody self = new DescribeEpnInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEpnInstanceAttributeResponseBody setConfVersions(java.util.List<DescribeEpnInstanceAttributeResponseBodyConfVersions> confVersions) {
        this.confVersions = confVersions;
        return this;
    }
    public java.util.List<DescribeEpnInstanceAttributeResponseBodyConfVersions> getConfVersions() {
        return this.confVersions;
    }

    public DescribeEpnInstanceAttributeResponseBody setEPNInstanceId(String EPNInstanceId) {
        this.EPNInstanceId = EPNInstanceId;
        return this;
    }
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

    public DescribeEpnInstanceAttributeResponseBody setEPNInstanceName(String EPNInstanceName) {
        this.EPNInstanceName = EPNInstanceName;
        return this;
    }
    public String getEPNInstanceName() {
        return this.EPNInstanceName;
    }

    public DescribeEpnInstanceAttributeResponseBody setInstances(java.util.List<DescribeEpnInstanceAttributeResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeEpnInstanceAttributeResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public DescribeEpnInstanceAttributeResponseBody setNetworkingModel(String networkingModel) {
        this.networkingModel = networkingModel;
        return this;
    }
    public String getNetworkingModel() {
        return this.networkingModel;
    }

    public DescribeEpnInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEpnInstanceAttributeResponseBody setVSwitches(java.util.List<DescribeEpnInstanceAttributeResponseBodyVSwitches> vSwitches) {
        this.vSwitches = vSwitches;
        return this;
    }
    public java.util.List<DescribeEpnInstanceAttributeResponseBodyVSwitches> getVSwitches() {
        return this.vSwitches;
    }

    public static class DescribeEpnInstanceAttributeResponseBodyConfVersions extends TeaModel {
        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-10-11</p>
         */
        @NameInMap("ConfVersion")
        public String confVersion;

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu-telecom</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        public static DescribeEpnInstanceAttributeResponseBodyConfVersions build(java.util.Map<String, ?> map) throws Exception {
            DescribeEpnInstanceAttributeResponseBodyConfVersions self = new DescribeEpnInstanceAttributeResponseBodyConfVersions();
            return TeaModel.build(map, self);
        }

        public DescribeEpnInstanceAttributeResponseBodyConfVersions setConfVersion(String confVersion) {
            this.confVersion = confVersion;
            return this;
        }
        public String getConfVersion() {
            return this.confVersion;
        }

        public DescribeEpnInstanceAttributeResponseBodyConfVersions setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

    }

    public static class DescribeEpnInstanceAttributeResponseBodyInstances extends TeaModel {
        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu-telecom-4</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>epn-xxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>epn-test</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The ISP. Valid values:</p>
         * <ul>
         * <li>cmcc: China Mobile</li>
         * <li>unicom: China Unicom</li>
         * <li>telecom: China Telecom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cmcc</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <p>The private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.12</p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>20.3.XX.XX</p>
         */
        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <ul>
         * <li>Running</li>
         * <li>Stopped</li>
         * <li>Expired</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeEpnInstanceAttributeResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeEpnInstanceAttributeResponseBodyInstances self = new DescribeEpnInstanceAttributeResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeEpnInstanceAttributeResponseBodyInstances setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeEpnInstanceAttributeResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeEpnInstanceAttributeResponseBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeEpnInstanceAttributeResponseBodyInstances setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeEpnInstanceAttributeResponseBodyInstances setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeEpnInstanceAttributeResponseBodyInstances setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public DescribeEpnInstanceAttributeResponseBodyInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeEpnInstanceAttributeResponseBodyVSwitches extends TeaModel {
        /**
         * <p>The CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.1/24</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu-telecom-4</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vs-xxxx</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The name of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vs-test</p>
         */
        @NameInMap("VSwitchName")
        public String vSwitchName;

        public static DescribeEpnInstanceAttributeResponseBodyVSwitches build(java.util.Map<String, ?> map) throws Exception {
            DescribeEpnInstanceAttributeResponseBodyVSwitches self = new DescribeEpnInstanceAttributeResponseBodyVSwitches();
            return TeaModel.build(map, self);
        }

        public DescribeEpnInstanceAttributeResponseBodyVSwitches setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeEpnInstanceAttributeResponseBodyVSwitches setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeEpnInstanceAttributeResponseBodyVSwitches setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeEpnInstanceAttributeResponseBodyVSwitches setVSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }
        public String getVSwitchName() {
            return this.vSwitchName;
        }

    }

}
