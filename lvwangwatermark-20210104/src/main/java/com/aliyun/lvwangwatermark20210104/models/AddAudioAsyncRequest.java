// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class AddAudioAsyncRequest extends TeaModel {
    @NameInMap("WatermarkId")
    public String watermarkId;

    @NameInMap("urlList")
    public String urlList;

    public static AddAudioAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAudioAsyncRequest self = new AddAudioAsyncRequest();
        return TeaModel.build(map, self);
    }

    public AddAudioAsyncRequest setWatermarkId(String watermarkId) {
        this.watermarkId = watermarkId;
        return this;
    }
    public String getWatermarkId() {
        return this.watermarkId;
    }

    public AddAudioAsyncRequest setUrlList(String urlList) {
        this.urlList = urlList;
        return this;
    }
    public String getUrlList() {
        return this.urlList;
    }

}
