// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class AddDocAsyncRequest extends TeaModel {
    @NameInMap("WatermarkId")
    public String watermarkId;

    @NameInMap("urlList")
    public String urlList;

    public static AddDocAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDocAsyncRequest self = new AddDocAsyncRequest();
        return TeaModel.build(map, self);
    }

    public AddDocAsyncRequest setWatermarkId(String watermarkId) {
        this.watermarkId = watermarkId;
        return this;
    }
    public String getWatermarkId() {
        return this.watermarkId;
    }

    public AddDocAsyncRequest setUrlList(String urlList) {
        this.urlList = urlList;
        return this;
    }
    public String getUrlList() {
        return this.urlList;
    }

}
