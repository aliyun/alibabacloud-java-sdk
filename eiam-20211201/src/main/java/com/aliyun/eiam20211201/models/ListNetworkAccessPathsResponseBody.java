// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListNetworkAccessPathsResponseBody extends TeaModel {
    /**
     * <p>The list of network access endpoint paths.</p>
     */
    @NameInMap("NetworkAccessPaths")
    public java.util.List<ListNetworkAccessPathsResponseBodyNetworkAccessPaths> networkAccessPaths;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListNetworkAccessPathsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkAccessPathsResponseBody self = new ListNetworkAccessPathsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNetworkAccessPathsResponseBody setNetworkAccessPaths(java.util.List<ListNetworkAccessPathsResponseBodyNetworkAccessPaths> networkAccessPaths) {
        this.networkAccessPaths = networkAccessPaths;
        return this;
    }
    public java.util.List<ListNetworkAccessPathsResponseBodyNetworkAccessPaths> getNetworkAccessPaths() {
        return this.networkAccessPaths;
    }

    public ListNetworkAccessPathsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListNetworkAccessPathsResponseBodyNetworkAccessPaths extends TeaModel {
        /**
         * <p>The creation time of the dedicated network access endpoint path. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CrossRegionReplicationRole")
        public String crossRegionReplicationRole;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the dedicated network access endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>nae_examplexxx</p>
         */
        @NameInMap("NetworkAccessEndpointId")
        public String networkAccessEndpointId;

        /**
         * <p>The ID of the dedicated network access endpoint path.</p>
         * 
         * <strong>example:</strong>
         * <p>nap_examplexxx</p>
         */
        @NameInMap("NetworkAccessPathId")
        public String networkAccessPathId;

        /**
         * <p>The ID of the ENI used by the dedicated network access endpoint path.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-examplexxx</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>The private endpoint of the ENI used by the dedicated network access endpoint path.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        /**
         * <p>The status of the dedicated network access endpoint path. Valid values:</p>
         * <ul>
         * <li>pending: Pending initialization.</li>
         * <li>creating: Being created.</li>
         * <li>running: Running.</li>
         * <li>deleting: Being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The last update time of the dedicated network access endpoint path. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The ID of the vSwitch to which the ENI of the dedicated network access endpoint path belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-examplexxx</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcRegionId")
        public String vpcRegionId;

        public static ListNetworkAccessPathsResponseBodyNetworkAccessPaths build(java.util.Map<String, ?> map) throws Exception {
            ListNetworkAccessPathsResponseBodyNetworkAccessPaths self = new ListNetworkAccessPathsResponseBodyNetworkAccessPaths();
            return TeaModel.build(map, self);
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setCrossRegionReplicationRole(String crossRegionReplicationRole) {
            this.crossRegionReplicationRole = crossRegionReplicationRole;
            return this;
        }
        public String getCrossRegionReplicationRole() {
            return this.crossRegionReplicationRole;
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setNetworkAccessEndpointId(String networkAccessEndpointId) {
            this.networkAccessEndpointId = networkAccessEndpointId;
            return this;
        }
        public String getNetworkAccessEndpointId() {
            return this.networkAccessEndpointId;
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setNetworkAccessPathId(String networkAccessPathId) {
            this.networkAccessPathId = networkAccessPathId;
            return this;
        }
        public String getNetworkAccessPathId() {
            return this.networkAccessPathId;
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setVpcRegionId(String vpcRegionId) {
            this.vpcRegionId = vpcRegionId;
            return this;
        }
        public String getVpcRegionId() {
            return this.vpcRegionId;
        }

    }

}
