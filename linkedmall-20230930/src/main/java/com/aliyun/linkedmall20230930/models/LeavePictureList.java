// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class LeavePictureList extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>退款凭证</p>
     */
    @NameInMap("desc")
    public String desc;

    /**
     * <strong>example:</strong>
     * <p>https://</p>
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
