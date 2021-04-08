// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetImageSyncRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("urlList")
    public String urlList;

    public static GetImageSyncRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageSyncRequest self = new GetImageSyncRequest();
        return TeaModel.build(map, self);
    }

    public GetImageSyncRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetImageSyncRequest setUrlList(String urlList) {
        this.urlList = urlList;
        return this;
    }
    public String getUrlList() {
        return this.urlList;
    }

}
