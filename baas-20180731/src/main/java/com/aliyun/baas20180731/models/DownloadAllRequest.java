// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DownloadAllRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    public static DownloadAllRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadAllRequest self = new DownloadAllRequest();
        return TeaModel.build(map, self);
    }

    public DownloadAllRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
