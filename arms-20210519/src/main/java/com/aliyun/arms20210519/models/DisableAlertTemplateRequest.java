// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class DisableAlertTemplateRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Id")
    public Long id;

    public static DisableAlertTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableAlertTemplateRequest self = new DisableAlertTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DisableAlertTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DisableAlertTemplateRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
