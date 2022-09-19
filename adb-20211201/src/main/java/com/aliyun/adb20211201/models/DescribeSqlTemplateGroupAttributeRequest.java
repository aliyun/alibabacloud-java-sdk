// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlTemplateGroupAttributeRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplateGroupId")
    public Long templateGroupId;

    public static DescribeSqlTemplateGroupAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlTemplateGroupAttributeRequest self = new DescribeSqlTemplateGroupAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSqlTemplateGroupAttributeRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSqlTemplateGroupAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSqlTemplateGroupAttributeRequest setTemplateGroupId(Long templateGroupId) {
        this.templateGroupId = templateGroupId;
        return this;
    }
    public Long getTemplateGroupId() {
        return this.templateGroupId;
    }

}
