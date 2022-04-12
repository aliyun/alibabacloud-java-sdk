// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertOrUpdateRegionRequest extends TeaModel {
    @NameInMap("DebugEnable")
    public Boolean debugEnable;

    @NameInMap("Description")
    public String description;

    @NameInMap("Id")
    public Long id;

    @NameInMap("RegionName")
    public String regionName;

    @NameInMap("RegionTag")
    public String regionTag;

    public static InsertOrUpdateRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertOrUpdateRegionRequest self = new InsertOrUpdateRegionRequest();
        return TeaModel.build(map, self);
    }

    public InsertOrUpdateRegionRequest setDebugEnable(Boolean debugEnable) {
        this.debugEnable = debugEnable;
        return this;
    }
    public Boolean getDebugEnable() {
        return this.debugEnable;
    }

    public InsertOrUpdateRegionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public InsertOrUpdateRegionRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public InsertOrUpdateRegionRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public InsertOrUpdateRegionRequest setRegionTag(String regionTag) {
        this.regionTag = regionTag;
        return this;
    }
    public String getRegionTag() {
        return this.regionTag;
    }

}
