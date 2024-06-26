// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DownloadSignedDataRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("Path")
    public String path;

    public static DownloadSignedDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadSignedDataRequest self = new DownloadSignedDataRequest();
        return TeaModel.build(map, self);
    }

    public DownloadSignedDataRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public DownloadSignedDataRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

}
