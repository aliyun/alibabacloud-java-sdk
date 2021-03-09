// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210120.models;

import com.aliyun.tea.*;

public class CommodityTitleRequest extends TeaModel {
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("PicContent")
    public String picContent;

    @NameInMap("TitleIndex")
    public Long titleIndex;

    public static CommodityTitleRequest build(java.util.Map<String, ?> map) throws Exception {
        CommodityTitleRequest self = new CommodityTitleRequest();
        return TeaModel.build(map, self);
    }

    public CommodityTitleRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CommodityTitleRequest setPicContent(String picContent) {
        this.picContent = picContent;
        return this;
    }
    public String getPicContent() {
        return this.picContent;
    }

    public CommodityTitleRequest setTitleIndex(Long titleIndex) {
        this.titleIndex = titleIndex;
        return this;
    }
    public Long getTitleIndex() {
        return this.titleIndex;
    }

}
