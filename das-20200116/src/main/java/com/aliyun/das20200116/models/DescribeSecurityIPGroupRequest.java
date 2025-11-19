// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSecurityIPGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionName")
    public String regionName;

    public static DescribeSecurityIPGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityIPGroupRequest self = new DescribeSecurityIPGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityIPGroupRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

}
