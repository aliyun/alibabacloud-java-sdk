// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteUserDefineRegionRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("RegionTag")
    public String regionTag;

    public static DeleteUserDefineRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserDefineRegionRequest self = new DeleteUserDefineRegionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserDefineRegionRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteUserDefineRegionRequest setRegionTag(String regionTag) {
        this.regionTag = regionTag;
        return this;
    }
    public String getRegionTag() {
        return this.regionTag;
    }

}
