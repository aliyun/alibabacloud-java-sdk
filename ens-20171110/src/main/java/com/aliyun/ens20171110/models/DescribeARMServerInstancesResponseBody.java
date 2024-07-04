// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeARMServerInstancesResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the servers and the AIC instances.</p>
     */
    @NameInMap("Servers")
    public java.util.List<DescribeARMServerInstancesResponseBodyServers> servers;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeARMServerInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeARMServerInstancesResponseBody self = new DescribeARMServerInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeARMServerInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeARMServerInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeARMServerInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeARMServerInstancesResponseBody setServers(java.util.List<DescribeARMServerInstancesResponseBodyServers> servers) {
        this.servers = servers;
        return this;
    }
    public java.util.List<DescribeARMServerInstancesResponseBodyServers> getServers() {
        return this.servers;
    }

    public DescribeARMServerInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeARMServerInstancesResponseBodyServersAICInstancesNetworkAttributes extends TeaModel {
        /**
         * <p>The IP address of the AIC instance.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The network ID of the AIC instance.</p>
         * 
         * <strong>example:</strong>
         * <p>n-*****</p>
         */
        @NameInMap("NetworkId")
        public String networkId;

        /**
         * <p>The vSwitch ID of the AIC instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeARMServerInstancesResponseBodyServersAICInstancesNetworkAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeARMServerInstancesResponseBodyServersAICInstancesNetworkAttributes self = new DescribeARMServerInstancesResponseBodyServersAICInstancesNetworkAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstancesNetworkAttributes setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstancesNetworkAttributes setNetworkId(String networkId) {
            this.networkId = networkId;
            return this;
        }
        public String getNetworkId() {
            return this.networkId;
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstancesNetworkAttributes setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeARMServerInstancesResponseBodyServersAICInstancesSdgDeployInfo extends TeaModel {
        /**
         * <p>The ID of the SDG.</p>
         * 
         * <strong>example:</strong>
         * <p>sdg-xxxxx</p>
         */
        @NameInMap("SDGId")
        public String SDGId;

        /**
         * <p>The deployment status of the SDG. Valid values:</p>
         * <ul>
         * <li><strong>sdg_deploying</strong></li>
         * <li><strong>failed</strong></li>
         * <li><strong>success</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeARMServerInstancesResponseBodyServersAICInstancesSdgDeployInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeARMServerInstancesResponseBodyServersAICInstancesSdgDeployInfo self = new DescribeARMServerInstancesResponseBodyServersAICInstancesSdgDeployInfo();
            return TeaModel.build(map, self);
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstancesSdgDeployInfo setSDGId(String SDGId) {
            this.SDGId = SDGId;
            return this;
        }
        public String getSDGId() {
            return this.SDGId;
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstancesSdgDeployInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeARMServerInstancesResponseBodyServersAICInstances extends TeaModel {
        /**
         * <p>The refresh rate of the AIC instance. Unit: Hz.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("Frequency")
        public Long frequency;

        /**
         * <p>The ID of the AIC image.</p>
         * 
         * <strong>example:</strong>
         * <p>m-****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The ID of the AIC instance.</p>
         * 
         * <strong>example:</strong>
         * <p>aic-instance****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The operation that was most recently performed.</p>
         * 
         * <strong>example:</strong>
         * <p>ServerCreate</p>
         */
        @NameInMap("LatestAction")
        public String latestAction;

        /**
         * <p>The name of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>AIC-Name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The network attributes of the AIC instance.</p>
         */
        @NameInMap("NetworkAttributes")
        public DescribeARMServerInstancesResponseBodyServersAICInstancesNetworkAttributes networkAttributes;

        /**
         * <p>The resolution of the AIC instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1920*1080</p>
         */
        @NameInMap("Resolution")
        public String resolution;

        /**
         * <p>The information about the shared data group (SDG) that is deployed on the AIC instance.</p>
         */
        @NameInMap("SdgDeployInfo")
        public DescribeARMServerInstancesResponseBodyServersAICInstancesSdgDeployInfo sdgDeployInfo;

        /**
         * <p>The specification of the AIC instance.</p>
         * 
         * <strong>example:</strong>
         * <p>aic.cf53r.c2.np</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The operation status of the AIC instance. Valid values:</p>
         * <ul>
         * <li><strong>success</strong></li>
         * <li><strong>failed</strong></li>
         * <li><strong>creating</strong></li>
         * <li><strong>releasing</strong></li>
         * <li><strong>rebooting</strong></li>
         * <li><strong>reseting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The running status of the AIC instance. Valid values:</p>
         * <ul>
         * <li><strong>running</strong></li>
         * <li><strong>pending</strong></li>
         * <li><strong>terminating</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeARMServerInstancesResponseBodyServersAICInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeARMServerInstancesResponseBodyServersAICInstances self = new DescribeARMServerInstancesResponseBodyServersAICInstances();
            return TeaModel.build(map, self);
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstances setFrequency(Long frequency) {
            this.frequency = frequency;
            return this;
        }
        public Long getFrequency() {
            return this.frequency;
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstances setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstances setLatestAction(String latestAction) {
            this.latestAction = latestAction;
            return this;
        }
        public String getLatestAction() {
            return this.latestAction;
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstances setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstances setNetworkAttributes(DescribeARMServerInstancesResponseBodyServersAICInstancesNetworkAttributes networkAttributes) {
            this.networkAttributes = networkAttributes;
            return this;
        }
        public DescribeARMServerInstancesResponseBodyServersAICInstancesNetworkAttributes getNetworkAttributes() {
            return this.networkAttributes;
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstances setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstances setSdgDeployInfo(DescribeARMServerInstancesResponseBodyServersAICInstancesSdgDeployInfo sdgDeployInfo) {
            this.sdgDeployInfo = sdgDeployInfo;
            return this;
        }
        public DescribeARMServerInstancesResponseBodyServersAICInstancesSdgDeployInfo getSdgDeployInfo() {
            return this.sdgDeployInfo;
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstances setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstances setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeARMServerInstancesResponseBodyServers extends TeaModel {
        /**
         * <p>The information about the AIC instances.</p>
         */
        @NameInMap("AICInstances")
        public java.util.List<DescribeARMServerInstancesResponseBodyServersAICInstances> AICInstances;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-07 11:59:09</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the ENS node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hanghzou-27</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The time when the instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2027-05-07 11:59:09</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The operation that was most recently performed.</p>
         * 
         * <strong>example:</strong>
         * <p>ServerCreate</p>
         */
        @NameInMap("LatestAction")
        public String latestAction;

        /**
         * <p>The name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>Server-Name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace of the cluster to which the server belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>prepay</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>cas-******</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The server specification.</p>
         * 
         * <strong>example:</strong>
         * <p>cas.cf53r</p>
         */
        @NameInMap("SpecName")
        public String specName;

        /**
         * <p>The operation status of the server. Valid values:</p>
         * <ul>
         * <li><strong>success</strong></li>
         * <li><strong>failed</strong></li>
         * <li><strong>creating</strong></li>
         * <li><strong>releasing</strong></li>
         * <li><strong>rebooting</strong></li>
         * <li><strong>upgrading</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The running status of the server. Valid values:</p>
         * <ul>
         * <li><strong>running</strong></li>
         * <li><strong>stopping</strong></li>
         * <li><strong>down</strong></li>
         * <li><strong>starting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeARMServerInstancesResponseBodyServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeARMServerInstancesResponseBodyServers self = new DescribeARMServerInstancesResponseBodyServers();
            return TeaModel.build(map, self);
        }

        public DescribeARMServerInstancesResponseBodyServers setAICInstances(java.util.List<DescribeARMServerInstancesResponseBodyServersAICInstances> AICInstances) {
            this.AICInstances = AICInstances;
            return this;
        }
        public java.util.List<DescribeARMServerInstancesResponseBodyServersAICInstances> getAICInstances() {
            return this.AICInstances;
        }

        public DescribeARMServerInstancesResponseBodyServers setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeARMServerInstancesResponseBodyServers setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeARMServerInstancesResponseBodyServers setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeARMServerInstancesResponseBodyServers setLatestAction(String latestAction) {
            this.latestAction = latestAction;
            return this;
        }
        public String getLatestAction() {
            return this.latestAction;
        }

        public DescribeARMServerInstancesResponseBodyServers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeARMServerInstancesResponseBodyServers setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeARMServerInstancesResponseBodyServers setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeARMServerInstancesResponseBodyServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public DescribeARMServerInstancesResponseBodyServers setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

        public DescribeARMServerInstancesResponseBodyServers setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeARMServerInstancesResponseBodyServers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
