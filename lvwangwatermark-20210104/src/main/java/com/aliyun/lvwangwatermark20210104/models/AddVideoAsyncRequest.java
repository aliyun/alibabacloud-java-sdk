// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class AddVideoAsyncRequest extends TeaModel {
    @NameInMap("WatermarkId")
    public String watermarkId;

    @NameInMap("VmType")
    public String vmType;

    @NameInMap("urlList")
    public String urlList;

    public static AddVideoAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        AddVideoAsyncRequest self = new AddVideoAsyncRequest();
        return TeaModel.build(map, self);
    }

    public AddVideoAsyncRequest setWatermarkId(String watermarkId) {
        this.watermarkId = watermarkId;
        return this;
    }
    public String getWatermarkId() {
        return this.watermarkId;
    }

    public AddVideoAsyncRequest setVmType(String vmType) {
        this.vmType = vmType;
        return this;
    }
    public String getVmType() {
        return this.vmType;
    }

    public AddVideoAsyncRequest setUrlList(String urlList) {
        this.urlList = urlList;
        return this;
    }
    public String getUrlList() {
        return this.urlList;
    }

}
