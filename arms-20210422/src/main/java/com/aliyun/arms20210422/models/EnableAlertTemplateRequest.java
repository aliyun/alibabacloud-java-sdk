// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class EnableAlertTemplateRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("RegionId")
    public String regionId;

    public static EnableAlertTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableAlertTemplateRequest self = new EnableAlertTemplateRequest();
        return TeaModel.build(map, self);
    }

    public EnableAlertTemplateRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public EnableAlertTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
