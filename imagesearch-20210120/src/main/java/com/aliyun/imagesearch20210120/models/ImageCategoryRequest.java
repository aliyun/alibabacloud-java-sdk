// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210120.models;

import com.aliyun.tea.*;

public class ImageCategoryRequest extends TeaModel {
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("PicUrl")
    public String picUrl;

    public static ImageCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageCategoryRequest self = new ImageCategoryRequest();
        return TeaModel.build(map, self);
    }

    public ImageCategoryRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ImageCategoryRequest setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

}
