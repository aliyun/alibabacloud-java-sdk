// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class AddImageSyncRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("WatermarkId")
    public String watermarkId;

    @NameInMap("urlList")
    public String urlList;

    public static AddImageSyncRequest build(java.util.Map<String, ?> map) throws Exception {
        AddImageSyncRequest self = new AddImageSyncRequest();
        return TeaModel.build(map, self);
    }

    public AddImageSyncRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public AddImageSyncRequest setWatermarkId(String watermarkId) {
        this.watermarkId = watermarkId;
        return this;
    }
    public String getWatermarkId() {
        return this.watermarkId;
    }

    public AddImageSyncRequest setUrlList(String urlList) {
        this.urlList = urlList;
        return this;
    }
    public String getUrlList() {
        return this.urlList;
    }

}
