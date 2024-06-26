// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DownloadSDK2Request extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    public static DownloadSDK2Request build(java.util.Map<String, ?> map) throws Exception {
        DownloadSDK2Request self = new DownloadSDK2Request();
        return TeaModel.build(map, self);
    }

    public DownloadSDK2Request setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
