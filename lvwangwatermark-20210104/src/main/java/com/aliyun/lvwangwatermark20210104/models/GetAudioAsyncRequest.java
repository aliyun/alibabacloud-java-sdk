// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetAudioAsyncRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("urlList")
    public String urlList;

    @NameInMap("WaterMarkType")
    public String waterMarkType;

    public static GetAudioAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAudioAsyncRequest self = new GetAudioAsyncRequest();
        return TeaModel.build(map, self);
    }

    public GetAudioAsyncRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public GetAudioAsyncRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAudioAsyncRequest setUrlList(String urlList) {
        this.urlList = urlList;
        return this;
    }
    public String getUrlList() {
        return this.urlList;
    }

    public GetAudioAsyncRequest setWaterMarkType(String waterMarkType) {
        this.waterMarkType = waterMarkType;
        return this;
    }
    public String getWaterMarkType() {
        return this.waterMarkType;
    }

}
