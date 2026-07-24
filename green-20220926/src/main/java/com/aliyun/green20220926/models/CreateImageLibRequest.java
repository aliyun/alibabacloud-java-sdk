// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class CreateImageLibRequest extends TeaModel {
    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>Politically sensitive.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The name of the image library.</p>
     * 
     * <strong>example:</strong>
     * <p>Malicious ads.</p>
     */
    @NameInMap("LibName")
    public String libName;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateImageLibRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageLibRequest self = new CreateImageLibRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageLibRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateImageLibRequest setLibName(String libName) {
        this.libName = libName;
        return this;
    }
    public String getLibName() {
        return this.libName;
    }

    public CreateImageLibRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
