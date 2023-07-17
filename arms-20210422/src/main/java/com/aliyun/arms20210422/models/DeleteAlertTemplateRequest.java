// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class DeleteAlertTemplateRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteAlertTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertTemplateRequest self = new DeleteAlertTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlertTemplateRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteAlertTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
