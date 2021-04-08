// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetDocAsyncRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("urlList")
    public String urlList;

    public static GetDocAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocAsyncRequest self = new GetDocAsyncRequest();
        return TeaModel.build(map, self);
    }

    public GetDocAsyncRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetDocAsyncRequest setUrlList(String urlList) {
        this.urlList = urlList;
        return this;
    }
    public String getUrlList() {
        return this.urlList;
    }

}
