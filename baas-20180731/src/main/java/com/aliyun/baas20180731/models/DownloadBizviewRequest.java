// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DownloadBizviewRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    public static DownloadBizviewRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadBizviewRequest self = new DownloadBizviewRequest();
        return TeaModel.build(map, self);
    }

    public DownloadBizviewRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
