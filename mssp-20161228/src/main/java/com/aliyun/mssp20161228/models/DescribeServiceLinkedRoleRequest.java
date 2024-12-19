// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class DescribeServiceLinkedRoleRequest extends TeaModel {
    /**
     * <p>Language.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeServiceLinkedRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceLinkedRoleRequest self = new DescribeServiceLinkedRoleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceLinkedRoleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeServiceLinkedRoleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
