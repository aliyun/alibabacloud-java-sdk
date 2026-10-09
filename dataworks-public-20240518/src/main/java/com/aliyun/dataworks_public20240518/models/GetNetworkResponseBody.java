// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetNetworkResponseBody extends TeaModel {
    /**
     * <p>The details of the network resource.</p>
     */
    @NameInMap("Network")
    public GetNetworkResponseBodyNetwork network;

    /**
     * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkResponseBody self = new GetNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNetworkResponseBody setNetwork(GetNetworkResponseBodyNetwork network) {
        this.network = network;
        return this;
    }
    public GetNetworkResponseBodyNetwork getNetwork() {
        return this.network;
    }

    public GetNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNetworkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetNetworkResponseBodyNetwork extends TeaModel {
        /**
         * <p>The time when the network resource was created. The value is a 64-bit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1727055811000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the user who created the network resource.</p>
         * 
         * <strong>example:</strong>
         * <p>11075500042XXXXX</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The ID of the network resource.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the resource group to which the network resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Serverless_res_group_524257424564736_6831777003XXXXX</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The security group ID of the network resource.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2ze13vamugr7jenXXXXX</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The current status of the network resource. Valid values:</p>
         * <ul>
         * <li>Pending: The resource is pending.</li>
         * <li>Creating: The resource is being created.</li>
         * <li>Running: The resource is running.</li>
         * <li>Deleting: The resource is being deleted.</li>
         * <li>Deleted: The resource is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The VPC ID of the network resource.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-m2et4f3oc8msfbccXXXXX</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The vSwitch ID of the network resource.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf8usrhs7hjd9amsXXXXX</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        public static GetNetworkResponseBodyNetwork build(java.util.Map<String, ?> map) throws Exception {
            GetNetworkResponseBodyNetwork self = new GetNetworkResponseBodyNetwork();
            return TeaModel.build(map, self);
        }

        public GetNetworkResponseBodyNetwork setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetNetworkResponseBodyNetwork setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetNetworkResponseBodyNetwork setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetNetworkResponseBodyNetwork setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetNetworkResponseBodyNetwork setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetNetworkResponseBodyNetwork setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetNetworkResponseBodyNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetNetworkResponseBodyNetwork setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

}
