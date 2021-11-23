// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class TagDbfsRequest extends TeaModel {
    @NameInMap("DbfsId")
    public String dbfsId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Tags")
    public String tags;

    public static TagDbfsRequest build(java.util.Map<String, ?> map) throws Exception {
        TagDbfsRequest self = new TagDbfsRequest();
        return TeaModel.build(map, self);
    }

    public TagDbfsRequest setDbfsId(String dbfsId) {
        this.dbfsId = dbfsId;
        return this;
    }
    public String getDbfsId() {
        return this.dbfsId;
    }

    public TagDbfsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TagDbfsRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
