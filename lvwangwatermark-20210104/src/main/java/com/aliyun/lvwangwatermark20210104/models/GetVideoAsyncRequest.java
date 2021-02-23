// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetVideoAsyncRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("urlList")
    public String urlList;

    @NameInMap("WaterMarkType")
    public String waterMarkType;

    public static GetVideoAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoAsyncRequest self = new GetVideoAsyncRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoAsyncRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
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

}
