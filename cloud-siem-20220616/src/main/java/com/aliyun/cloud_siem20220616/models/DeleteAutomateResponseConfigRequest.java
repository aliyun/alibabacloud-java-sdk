// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DeleteAutomateResponseConfigRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteAutomateResponseConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutomateResponseConfigRequest self = new DeleteAutomateResponseConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAutomateResponseConfigRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteAutomateResponseConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
