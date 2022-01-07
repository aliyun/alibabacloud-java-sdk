// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListProxyAccessesRequest extends TeaModel {
    @NameInMap("ProxyId")
    public Long proxyId;

    @NameInMap("Tid")
    public Long tid;

    public static ListProxyAccessesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProxyAccessesRequest self = new ListProxyAccessesRequest();
        return TeaModel.build(map, self);
    }

    public ListProxyAccessesRequest setProxyId(Long proxyId) {
        this.proxyId = proxyId;
        return this;
    }
    public Long getProxyId() {
        return this.proxyId;
    }

    public ListProxyAccessesRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
