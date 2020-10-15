// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnInstanceAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("EPNInstanceId")
    @Validation(required = true)
    public String EPNInstanceId;

    @NameInMap("EPNInstanceName")
    @Validation(required = true)
    public String EPNInstanceName;

    @NameInMap("NetworkingModel")
    @Validation(required = true)
    public String networkingModel;

    @NameInMap("VSwitches")
    @Validation(required = true)
    public java.util.List<DescribeEpnInstanceAttributeResponseVSwitches> vSwitches;

    @NameInMap("Instances")
    @Validation(required = true)
    public java.util.List<DescribeEpnInstanceAttributeResponseInstances> instances;

    @NameInMap("ConfVersions")
    @Validation(required = true)
    public java.util.List<DescribeEpnInstanceAttributeResponseConfVersions> confVersions;

    public static DescribeEpnInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEpnInstanceAttributeResponse self = new DescribeEpnInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEpnInstanceAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEpnInstanceAttributeResponse setEPNInstanceId(String EPNInstanceId) {
        this.EPNInstanceId = EPNInstanceId;
        return this;
    }
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

    public DescribeEpnInstanceAttributeResponse setEPNInstanceName(String EPNInstanceName) {
        this.EPNInstanceName = EPNInstanceName;
        return this;
    }
    public String getEPNInstanceName() {
        return this.EPNInstanceName;
    }

    public DescribeEpnInstanceAttributeResponse setNetworkingModel(String networkingModel) {
        this.networkingModel = networkingModel;
        return this;
    }
    public String getNetworkingModel() {
        return this.networkingModel;
    }

    public DescribeEpnInstanceAttributeResponse setVSwitches(java.util.List<DescribeEpnInstanceAttributeResponseVSwitches> vSwitches) {
        this.vSwitches = vSwitches;
        return this;
    }
    public java.util.List<DescribeEpnInstanceAttributeResponseVSwitches> getVSwitches() {
        return this.vSwitches;
    }

    public DescribeEpnInstanceAttributeResponse setInstances(java.util.List<DescribeEpnInstanceAttributeResponseInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeEpnInstanceAttributeResponseInstances> getInstances() {
        return this.instances;
    }

    public DescribeEpnInstanceAttributeResponse setConfVersions(java.util.List<DescribeEpnInstanceAttributeResponseConfVersions> confVersions) {
        this.confVersions = confVersions;
        return this;
    }
    public java.util.List<DescribeEpnInstanceAttributeResponseConfVersions> getConfVersions() {
        return this.confVersions;
    }

    public static class DescribeEpnInstanceAttributeResponseVSwitches extends TeaModel {
        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("EnsRegionId")
        @Validation(required = true)
        public String ensRegionId;

        @NameInMap("CidrBlock")
        @Validation(required = true)
        public String cidrBlock;

        @NameInMap("VSwitchName")
        @Validation(required = true)
        public String vSwitchName;

        public static DescribeEpnInstanceAttributeResponseVSwitches build(java.util.Map<String, ?> map) throws Exception {
            DescribeEpnInstanceAttributeResponseVSwitches self = new DescribeEpnInstanceAttributeResponseVSwitches();
            return TeaModel.build(map, self);
        }

        public DescribeEpnInstanceAttributeResponseVSwitches setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeEpnInstanceAttributeResponseVSwitches setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeEpnInstanceAttributeResponseVSwitches setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeEpnInstanceAttributeResponseVSwitches setVSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }
        public String getVSwitchName() {
            return this.vSwitchName;
        }

    }

    public static class DescribeEpnInstanceAttributeResponseInstances extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("PublicIpAddress")
        @Validation(required = true)
        public String publicIpAddress;

        @NameInMap("EnsRegionId")
        @Validation(required = true)
        public String ensRegionId;

        @NameInMap("Isp")
        @Validation(required = true)
        public String isp;

        @NameInMap("InstanceName")
        @Validation(required = true)
        public String instanceName;

        @NameInMap("PrivateIpAddress")
        @Validation(required = true)
        public String privateIpAddress;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DescribeEpnInstanceAttributeResponseInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeEpnInstanceAttributeResponseInstances self = new DescribeEpnInstanceAttributeResponseInstances();
            return TeaModel.build(map, self);
        }

        public DescribeEpnInstanceAttributeResponseInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeEpnInstanceAttributeResponseInstances setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public DescribeEpnInstanceAttributeResponseInstances setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeEpnInstanceAttributeResponseInstances setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeEpnInstanceAttributeResponseInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeEpnInstanceAttributeResponseInstances setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeEpnInstanceAttributeResponseInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeEpnInstanceAttributeResponseConfVersions extends TeaModel {
        @NameInMap("EnsRegionId")
        @Validation(required = true)
        public String ensRegionId;

        @NameInMap("ConfVersion")
        @Validation(required = true)
        public String confVersion;

        public static DescribeEpnInstanceAttributeResponseConfVersions build(java.util.Map<String, ?> map) throws Exception {
            DescribeEpnInstanceAttributeResponseConfVersions self = new DescribeEpnInstanceAttributeResponseConfVersions();
            return TeaModel.build(map, self);
        }

        public DescribeEpnInstanceAttributeResponseConfVersions setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeEpnInstanceAttributeResponseConfVersions setConfVersion(String confVersion) {
            this.confVersion = confVersion;
            return this;
        }
        public String getConfVersion() {
            return this.confVersion;
        }

    }

}
