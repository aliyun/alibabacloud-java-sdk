// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DeleteWhiteRuleListRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteWhiteRuleListRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWhiteRuleListRequest self = new DeleteWhiteRuleListRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWhiteRuleListRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteWhiteRuleListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
