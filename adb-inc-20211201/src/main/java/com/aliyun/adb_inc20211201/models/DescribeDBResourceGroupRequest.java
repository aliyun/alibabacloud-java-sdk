// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeDBResourceGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CustomerUid")
    public Long customerUid;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("ExcludeAINode")
    public Boolean excludeAINode;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionCode")
    public String regionCode;

    public static DescribeDBResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBResourceGroupRequest self = new DescribeDBResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBResourceGroupRequest setCustomerUid(Long customerUid) {
        this.customerUid = customerUid;
        return this;
    }
    public Long getCustomerUid() {
        return this.customerUid;
    }

    public DescribeDBResourceGroupRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBResourceGroupRequest setExcludeAINode(Boolean excludeAINode) {
        this.excludeAINode = excludeAINode;
        return this;
    }
    public Boolean getExcludeAINode() {
        return this.excludeAINode;
    }

    public DescribeDBResourceGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeDBResourceGroupRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public DescribeDBResourceGroupRequest setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public String getRegionCode() {
        return this.regionCode;
    }

}
