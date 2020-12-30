// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ReleaseClusterByTemplateTagForInternalRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplateTagSet")
    public java.util.List<String> templateTagSet;

    public static ReleaseClusterByTemplateTagForInternalRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseClusterByTemplateTagForInternalRequest self = new ReleaseClusterByTemplateTagForInternalRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseClusterByTemplateTagForInternalRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ReleaseClusterByTemplateTagForInternalRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReleaseClusterByTemplateTagForInternalRequest setTemplateTagSet(java.util.List<String> templateTagSet) {
        this.templateTagSet = templateTagSet;
        return this;
    }
    public java.util.List<String> getTemplateTagSet() {
        return this.templateTagSet;
    }

}
