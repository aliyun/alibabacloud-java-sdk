// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListProxyAccessesRequest extends TeaModel {
    // The ID of the secure access proxy. 
    // 
    // >  You can call the [ListProxies](https://www.alibabacloud.com/help/en/data-management-service/latest/listproxies) operation to query the ID of the secure access proxy.
    @NameInMap("ProxyId")
    public Long proxyId;

    // The ID of the tenant. 
    // 
    // >  You can call the [GetUserActiveTenant](https://www.alibabacloud.com/help/en/data-management-service/latest/getuseractivetenant) operation to query the ID of the tenant.
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
