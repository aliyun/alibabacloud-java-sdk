// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetProxyAccessRequest extends TeaModel {
    @NameInMap("ProxyAccessId")
    public Long proxyAccessId;

    @NameInMap("Tid")
    public Long tid;

    public static GetProxyAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProxyAccessRequest self = new GetProxyAccessRequest();
        return TeaModel.build(map, self);
    }

    public GetProxyAccessRequest setProxyAccessId(Long proxyAccessId) {
        this.proxyAccessId = proxyAccessId;
        return this;
    }
    public Long getProxyAccessId() {
        return this.proxyAccessId;
    }

    public GetProxyAccessRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
