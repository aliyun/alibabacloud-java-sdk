// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210120.models;

import com.aliyun.tea.*;

public class ImagePropertyRequest extends TeaModel {
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("PicUrl")
    public String picUrl;

    public static ImagePropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        ImagePropertyRequest self = new ImagePropertyRequest();
        return TeaModel.build(map, self);
    }

    public ImagePropertyRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ImagePropertyRequest setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

}
