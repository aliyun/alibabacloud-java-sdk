// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListNetworkAccessEndpointsResponseBody extends TeaModel {
    /**
     * <p>A collection of network endpoints.</p>
     */
    @NameInMap("NetworkAccessEndpoints")
    public java.util.List<ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints> networkAccessEndpoints;

    /**
     * <p>The token returned for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListNetworkAccessEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkAccessEndpointsResponseBody self = new ListNetworkAccessEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNetworkAccessEndpointsResponseBody setNetworkAccessEndpoints(java.util.List<ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints> networkAccessEndpoints) {
        this.networkAccessEndpoints = networkAccessEndpoints;
        return this;
    }
    public java.util.List<ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints> getNetworkAccessEndpoints() {
        return this.networkAccessEndpoints;
    }

    public ListNetworkAccessEndpointsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNetworkAccessEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNetworkAccessEndpointsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints extends TeaModel {
        /**
         * <p>The time when the network endpoint was created. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The network endpoint ID.</p>
         * 
         * <strong>example:</strong>
         * <p>nae_examplexxx</p>
         */
        @NameInMap("NetworkAccessEndpointId")
        public String networkAccessEndpointId;

        /**
         * <p>The name of the network endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC access endpoint for xx service</p>
         */
        @NameInMap("NetworkAccessEndpointName")
        public String networkAccessEndpointName;

        /**
         * <p>The type of the network endpoint. Valid values:</p>
         * <ul>
         * <li><p>shared: a shared network endpoint.</p>
         * </li>
         * <li><p>private: a private network endpoint.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("NetworkAccessEndpointType")
        public String networkAccessEndpointType;

        /**
         * <p>The ID of the security group used by the private network endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-examplexxx</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The status of the network endpoint. Valid values:</p>
         * <ul>
         * <li><p>pending: The endpoint is pending initialization.</p>
         * </li>
         * <li><p>creating: The endpoint is being created.</p>
         * </li>
         * <li><p>running: The endpoint is running.</p>
         * </li>
         * <li><p>deleting: The endpoint is being deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the network endpoint was last updated. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>A list of vSwitches to which the private network endpoint is connected.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-examplexxx</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The ID of the VPC to which the private network endpoint is connected.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-examplexxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The region ID of the VPC to which the private network endpoint is connected.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("VpcRegionId")
        public String vpcRegionId;

        public static ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints build(java.util.Map<String, ?> map) throws Exception {
            ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints self = new ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints();
            return TeaModel.build(map, self);
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints setNetworkAccessEndpointId(String networkAccessEndpointId) {
            this.networkAccessEndpointId = networkAccessEndpointId;
            return this;
        }
        public String getNetworkAccessEndpointId() {
            return this.networkAccessEndpointId;
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints setNetworkAccessEndpointName(String networkAccessEndpointName) {
            this.networkAccessEndpointName = networkAccessEndpointName;
            return this;
        }
        public String getNetworkAccessEndpointName() {
            return this.networkAccessEndpointName;
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints setNetworkAccessEndpointType(String networkAccessEndpointType) {
            this.networkAccessEndpointType = networkAccessEndpointType;
            return this;
        }
        public String getNetworkAccessEndpointType() {
            return this.networkAccessEndpointType;
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints setVpcRegionId(String vpcRegionId) {
            this.vpcRegionId = vpcRegionId;
            return this;
        }
        public String getVpcRegionId() {
            return this.vpcRegionId;
        }

    }

}
