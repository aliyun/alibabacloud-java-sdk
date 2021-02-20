// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("ConfVersions")
    public java.util.List<DescribeEpnInstanceAttributeResponseBodyConfVersions> confVersions;

    @NameInMap("EPNInstanceId")
    public String EPNInstanceId;

    @NameInMap("EPNInstanceName")
    public String EPNInstanceName;

    @NameInMap("Instances")
    public java.util.List<DescribeEpnInstanceAttributeResponseBodyInstances> instances;

    @NameInMap("NetworkingModel")
    public String networkingModel;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ConfVersion")
        public String confVersion;

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
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Isp")
        public String isp;

        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

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
        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("EnsRegionId")
        public String ensRegionId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

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
