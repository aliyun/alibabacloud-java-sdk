// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostFinishCustomizeRuleTestRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("RegionId")
    public String regionId;

    public static PostFinishCustomizeRuleTestRequest build(java.util.Map<String, ?> map) throws Exception {
        PostFinishCustomizeRuleTestRequest self = new PostFinishCustomizeRuleTestRequest();
        return TeaModel.build(map, self);
    }

    public PostFinishCustomizeRuleTestRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PostFinishCustomizeRuleTestRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
