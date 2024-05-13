// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetProxyRequest extends TeaModel {
    /**
     * <p>The ID of the secure access proxy. You can call the [ListProxies](https://help.aliyun.com/document_detail/295371.html) operation to query the ID of the secure access proxy.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProxyId")
    public Long proxyId;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) operation to obtain the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProxyRequest self = new GetProxyRequest();
        return TeaModel.build(map, self);
    }

    public GetProxyRequest setProxyId(Long proxyId) {
        this.proxyId = proxyId;
        return this;
    }
    public Long getProxyId() {
        return this.proxyId;
    }

    public GetProxyRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
