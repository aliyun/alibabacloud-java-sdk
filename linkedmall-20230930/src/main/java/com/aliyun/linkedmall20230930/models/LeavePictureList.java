// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class LeavePictureList extends TeaModel {
    /**
     * <p>Description&gt;Notice: If the after-sales order rendering API returns that a message description is required, this field is mandatory.</notice></p>
     * 
     * <strong>example:</strong>
     * <p>外观破损了。</p>
     */
    @NameInMap("desc")
    public String desc;

    /**
     * <p>Image of the after-sales Credential&gt;Notice: If the after-sales order rendering API returns that an after-sales image is required, this field is mandatory.</notice></p>
     */
    @NameInMap("picture")
    public String picture;

    public static LeavePictureList build(java.util.Map<String, ?> map) throws Exception {
        LeavePictureList self = new LeavePictureList();
        return TeaModel.build(map, self);
    }

    public LeavePictureList setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public LeavePictureList setPicture(String picture) {
        this.picture = picture;
        return this;
    }
    public String getPicture() {
        return this.picture;
    }

}
