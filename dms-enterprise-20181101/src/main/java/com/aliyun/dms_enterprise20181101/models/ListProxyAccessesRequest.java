// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListProxyAccessesRequest extends TeaModel {
    /**
     * <p>The ID of the secure access proxy. </p>
     * <blockquote>
     * <p> You can call the <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/listproxies">ListProxies</a> operation to query the ID of the secure access proxy.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>47</p>
     */
    @NameInMap("ProxyId")
    public Long proxyId;

    /**
     * <p>The ID of the tenant. </p>
     * <blockquote>
     * <p> You can call the <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/getuseractivetenant">GetUserActiveTenant</a> operation to query the ID of the tenant.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
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
