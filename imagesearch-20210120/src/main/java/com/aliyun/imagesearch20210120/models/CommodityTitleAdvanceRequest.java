// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210120.models;

import com.aliyun.tea.*;

public class CommodityTitleAdvanceRequest extends TeaModel {
    @NameInMap("PicContentObject")
    @Validation(required = true)
    public java.io.InputStream picContentObject;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("TitleIndex")
    public Long titleIndex;

    public static CommodityTitleAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CommodityTitleAdvanceRequest self = new CommodityTitleAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public CommodityTitleAdvanceRequest setPicContentObject(java.io.InputStream picContentObject) {
        this.picContentObject = picContentObject;
        return this;
    }
    public java.io.InputStream getPicContentObject() {
        return this.picContentObject;
    }

    public CommodityTitleAdvanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CommodityTitleAdvanceRequest setTitleIndex(Long titleIndex) {
        this.titleIndex = titleIndex;
        return this;
    }
    public Long getTitleIndex() {
        return this.titleIndex;
    }

}
