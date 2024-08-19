// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class AddImageLibRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("LibName")
    public String libName;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AddImageLibRequest build(java.util.Map<String, ?> map) throws Exception {
        AddImageLibRequest self = new AddImageLibRequest();
        return TeaModel.build(map, self);
    }

    public AddImageLibRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public AddImageLibRequest setLibName(String libName) {
        this.libName = libName;
        return this;
    }
    public String getLibName() {
        return this.libName;
    }

    public AddImageLibRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
