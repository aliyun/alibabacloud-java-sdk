// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetVideoAsyncRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("urlList")
    public String urlList;

    @NameInMap("WaterMarkType")
    public String waterMarkType;

    @NameInMap("VmType")
    public String vmType;

    public static GetVideoAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoAsyncRequest self = new GetVideoAsyncRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoAsyncRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetVideoAsyncRequest setUrlList(String urlList) {
        this.urlList = urlList;
        return this;
    }
    public String getUrlList() {
        return this.urlList;
    }

    public GetVideoAsyncRequest setWaterMarkType(String waterMarkType) {
        this.waterMarkType = waterMarkType;
        return this;
    }
    public String getWaterMarkType() {
        return this.waterMarkType;
    }

    public GetVideoAsyncRequest setVmType(String vmType) {
        this.vmType = vmType;
        return this;
    }
    public String getVmType() {
        return this.vmType;
    }

}
