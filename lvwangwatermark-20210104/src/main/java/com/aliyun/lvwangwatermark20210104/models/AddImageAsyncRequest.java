// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class AddImageAsyncRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("WatermarkId")
    public String watermarkId;

    @NameInMap("urlList")
    public String urlList;

    public static AddImageAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        AddImageAsyncRequest self = new AddImageAsyncRequest();
        return TeaModel.build(map, self);
    }

    public AddImageAsyncRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public AddImageAsyncRequest setWatermarkId(String watermarkId) {
        this.watermarkId = watermarkId;
        return this;
    }
    public String getWatermarkId() {
        return this.watermarkId;
    }

    public AddImageAsyncRequest setUrlList(String urlList) {
        this.urlList = urlList;
        return this;
    }
    public String getUrlList() {
        return this.urlList;
    }

}
