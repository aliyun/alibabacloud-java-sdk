// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class InspectProxyAccessSecretRequest extends TeaModel {
    /**
     * <p>The ID of the security protection authorization. After the security protection agent authorizes the target user, the system automatically generates a security protection authorization ID. The ID is globally unique. You can call the [ListProxyAccesses](https://www.alibabacloud.com/help/en/data-management-service/latest/listproxyaccesses) operation to obtain this parameter.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProxyAccessId")
    public Long proxyAccessId;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://www.alibabacloud.com/help/en/data-management-service/latest/getuseractivetenant) or [ListUserTenants](https://www.alibabacloud.com/help/en/data-management-service/latest/listusertenants) operation to obtain this parameter.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static InspectProxyAccessSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        InspectProxyAccessSecretRequest self = new InspectProxyAccessSecretRequest();
        return TeaModel.build(map, self);
    }

    public InspectProxyAccessSecretRequest setProxyAccessId(Long proxyAccessId) {
        this.proxyAccessId = proxyAccessId;
        return this;
    }
    public Long getProxyAccessId() {
        return this.proxyAccessId;
    }

    public InspectProxyAccessSecretRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
