// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DownloadSdkRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    public static DownloadSdkRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadSdkRequest self = new DownloadSdkRequest();
        return TeaModel.build(map, self);
    }

    public DownloadSdkRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
