// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteProxyRequest extends TeaModel {
    /**
     * <p>The ID of the security protection agent. You can call the <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/listproxies">ListProxies</a> or <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/getproxy">GetProxy</a> operation to obtain this parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProxyId")
    public Long proxyId;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/getuseractivetenant">GetUserActiveTenant</a> or <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/listusertenants">ListUserTenants</a> operation to obtain this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static DeleteProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProxyRequest self = new DeleteProxyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProxyRequest setProxyId(Long proxyId) {
        this.proxyId = proxyId;
        return this;
    }
    public Long getProxyId() {
        return this.proxyId;
    }

    public DeleteProxyRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
