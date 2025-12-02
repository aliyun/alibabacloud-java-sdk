// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class AddImageLibRequest extends TeaModel {
    /**
     * <p>The remarks of the image library.</p>
     * 
     * <strong>example:</strong>
     * <p>Explicit_Content_Blacklist_Image_lib</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The name of image library</p>
     * 
     * <strong>example:</strong>
     * <p>test_image_lib</p>
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
