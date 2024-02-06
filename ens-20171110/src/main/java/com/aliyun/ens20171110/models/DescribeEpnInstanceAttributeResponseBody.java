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
     */
    @NameInMap("EPNInstanceId")
    public String EPNInstanceId;

    /**
     * <p>The name of the EPN instance.</p>
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
     * <br>
     * <p>*   SpeedUp: intelligent acceleration network (Internet)</p>
     * <p>*   Connection: internal network</p>
     * <p>*   SpeedUpAndConnection: intelligent acceleration network and internal network</p>
     */
    @NameInMap("NetworkingModel")
    public String networkingModel;

    /**
     * <p>The request ID.</p>
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
         */
        @NameInMap("ConfVersion")
        public String confVersion;

        /**
         * <p>The ID of the node.</p>
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
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The ISP. Valid values:</p>
         * <br>
         * <p>*   cmcc: China Mobile</p>
         * <p>*   unicom: China Unicom</p>
         * <p>*   telecom: China Telecom</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <p>The private IP address.</p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        /**
         * <p>The public IP address.</p>
         */
        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <br>
         * <p>*   Running</p>
         * <p>*   Stopped</p>
         * <p>*   Expired</p>
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
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>The ID of the node.</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The name of the vSwitch.</p>
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
