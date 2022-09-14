// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20170714.models;

import com.aliyun.tea.*;

public class DeleteJobTemplatesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Templates")
    public String templates;

    public static DeleteJobTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobTemplatesRequest self = new DeleteJobTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteJobTemplatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteJobTemplatesRequest setTemplates(String templates) {
        this.templates = templates;
        return this;
    }
    public String getTemplates() {
        return this.templates;
    }

}
