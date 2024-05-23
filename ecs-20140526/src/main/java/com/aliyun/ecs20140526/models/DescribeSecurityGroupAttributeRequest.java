// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupAttributeRequest extends TeaModel {
    /**
     * <p>The direction in which the security group rule is applied. Valid values:</p>
     * <br>
     * <p>*   egress: outbound.</p>
     * <p>*   ingress: inbound.</p>
     * <p>*   all: outbound and inbound.</p>
     * <br>
     * <p>Default value: all.</p>
     */
    @NameInMap("Direction")
    public String direction;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The network interface controller (NIC) type of the security group rule.</p>
     * <br>
     * <p>*   Valid values for rules of security groups in the classic network:</p>
     * <br>
     * <p>    *   internet (default)</p>
     * <p>    *   intranet</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note** You can query security group rules of only one NIC type in a single call. To query security group rules of both NIC types, call the operation twice.</p>
     * <br>
     * <p>*   When the security group is in a virtual private cloud (VPC), set the value to intranet, which is the default value for rules of security groups in VPCs.</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note** If you set this parameter to internet or leave this parameter empty, a value of intranet is automatically used.</p>
     */
    @NameInMap("NicType")
    public String nicType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the security group. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the security group.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    public static DescribeSecurityGroupAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupAttributeRequest self = new DescribeSecurityGroupAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityGroupAttributeRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeSecurityGroupAttributeRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeSecurityGroupAttributeRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSecurityGroupAttributeRequest setNicType(String nicType) {
        this.nicType = nicType;
        return this;
    }
    public String getNicType() {
        return this.nicType;
    }

    public DescribeSecurityGroupAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeSecurityGroupAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSecurityGroupAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSecurityGroupAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSecurityGroupAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSecurityGroupAttributeRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

}
