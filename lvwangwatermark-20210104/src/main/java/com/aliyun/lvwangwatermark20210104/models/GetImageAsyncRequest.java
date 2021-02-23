// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetImageAsyncRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("AppName")
    public Long appName;

    @NameInMap("urlList")
    public String urlList;

    public static GetImageAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageAsyncRequest self = new GetImageAsyncRequest();
        return TeaModel.build(map, self);
    }

    public GetImageAsyncRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public GetImageAsyncRequest setAppName(Long appName) {
        this.appName = appName;
        return this;
    }
    public Long getAppName() {
        return this.appName;
    }

    public GetImageAsyncRequest setUrlList(String urlList) {
        this.urlList = urlList;
        return this;
    }
    public String getUrlList() {
        return this.urlList;
    }

}
