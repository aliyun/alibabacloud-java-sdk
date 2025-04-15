// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeResourceGroupSpecRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-8vbo40tl1dxxxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ai</p>
     */
    @NameInMap("ResourceGroupType")
    public String resourceGroupType;

    public static DescribeResourceGroupSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceGroupSpecRequest self = new DescribeResourceGroupSpecRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourceGroupSpecRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeResourceGroupSpecRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeResourceGroupSpecRequest setResourceGroupType(String resourceGroupType) {
        this.resourceGroupType = resourceGroupType;
        return this;
    }
    public String getResourceGroupType() {
        return this.resourceGroupType;
    }

}
