// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListNetworkAccessEndpointsResponseBody extends TeaModel {
    /**
     * <p>The list of network access endpoints.</p>
     */
    @NameInMap("NetworkAccessEndpoints")
    public java.util.List<ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints> networkAccessEndpoints;

    /**
     * <p>The pagination token returned by this call.</p>
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
     * <p>The total number of entries in the list.</p>
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

    public static class ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpointsBackupVpcEndpoint extends TeaModel {
        @NameInMap("BackupEgressPrivateIpAddresses")
        public java.util.List<String> backupEgressPrivateIpAddresses;

        @NameInMap("BackupEgressPublicIpAddresses")
        public java.util.List<String> backupEgressPublicIpAddresses;

        @NameInMap("BackupSecurityGroupId")
        public String backupSecurityGroupId;

        @NameInMap("BackupVSwitchIds")
        public java.util.List<String> backupVSwitchIds;

        @NameInMap("BackupVpcId")
        public String backupVpcId;

        @NameInMap("BackupVpcRegionId")
        public String backupVpcRegionId;

        public static ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpointsBackupVpcEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpointsBackupVpcEndpoint self = new ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpointsBackupVpcEndpoint();
            return TeaModel.build(map, self);
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpointsBackupVpcEndpoint setBackupEgressPrivateIpAddresses(java.util.List<String> backupEgressPrivateIpAddresses) {
            this.backupEgressPrivateIpAddresses = backupEgressPrivateIpAddresses;
            return this;
        }
        public java.util.List<String> getBackupEgressPrivateIpAddresses() {
            return this.backupEgressPrivateIpAddresses;
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpointsBackupVpcEndpoint setBackupEgressPublicIpAddresses(java.util.List<String> backupEgressPublicIpAddresses) {
            this.backupEgressPublicIpAddresses = backupEgressPublicIpAddresses;
            return this;
        }
        public java.util.List<String> getBackupEgressPublicIpAddresses() {
            return this.backupEgressPublicIpAddresses;
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpointsBackupVpcEndpoint setBackupSecurityGroupId(String backupSecurityGroupId) {
            this.backupSecurityGroupId = backupSecurityGroupId;
            return this;
        }
        public String getBackupSecurityGroupId() {
            return this.backupSecurityGroupId;
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpointsBackupVpcEndpoint setBackupVSwitchIds(java.util.List<String> backupVSwitchIds) {
            this.backupVSwitchIds = backupVSwitchIds;
            return this;
        }
        public java.util.List<String> getBackupVSwitchIds() {
            return this.backupVSwitchIds;
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpointsBackupVpcEndpoint setBackupVpcId(String backupVpcId) {
            this.backupVpcId = backupVpcId;
            return this;
        }
        public String getBackupVpcId() {
            return this.backupVpcId;
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpointsBackupVpcEndpoint setBackupVpcRegionId(String backupVpcRegionId) {
            this.backupVpcRegionId = backupVpcRegionId;
            return this;
        }
        public String getBackupVpcRegionId() {
            return this.backupVpcRegionId;
        }

    }

    public static class ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints extends TeaModel {
        @NameInMap("BackupVpcEndpoint")
        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpointsBackupVpcEndpoint backupVpcEndpoint;

        /**
         * <p>The creation time of the network access endpoint. The value is a UNIX timestamp in milliseconds.</p>
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
         * <p>The network access endpoint ID.</p>
         * 
         * <strong>example:</strong>
         * <p>nae_examplexxx</p>
         */
        @NameInMap("NetworkAccessEndpointId")
        public String networkAccessEndpointId;

        /**
         * <p>The network access endpoint name.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC access endpoint for xx service</p>
         */
        @NameInMap("NetworkAccessEndpointName")
        public String networkAccessEndpointName;

        /**
         * <p>The type of the network access endpoint. Valid values:</p>
         * <ul>
         * <li>shared: Shared network access endpoint.</li>
         * <li>private: Dedicated network access endpoint.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("NetworkAccessEndpointType")
        public String networkAccessEndpointType;

        /**
         * <p>The security group ID used by the dedicated network access endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-examplexxx</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The status of the network access endpoint. Valid values:</p>
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
         * <p>The last update time of the network access endpoint. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The list of vSwitches for the dedicated network access endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-examplexxx</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The VPC ID of the dedicated network access endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-examplexxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The region of the VPC for the dedicated network access endpoint.</p>
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

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints setBackupVpcEndpoint(ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpointsBackupVpcEndpoint backupVpcEndpoint) {
            this.backupVpcEndpoint = backupVpcEndpoint;
            return this;
        }
        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpointsBackupVpcEndpoint getBackupVpcEndpoint() {
            return this.backupVpcEndpoint;
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
