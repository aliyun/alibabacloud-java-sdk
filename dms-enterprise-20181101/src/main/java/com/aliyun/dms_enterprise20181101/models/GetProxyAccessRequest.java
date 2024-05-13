// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetProxyAccessRequest extends TeaModel {
    /**
     * <p>The ID that Data Management (DMS) generates after the user is authorized to enable the secure access proxy feature for an instance. The ID is unique in DMS. You can call the [ListProxyAccesses](https://help.aliyun.com/document_detail/295386.html) operation to query the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProxyAccessId")
    public Long proxyAccessId;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) or [ListUserTenants](https://help.aliyun.com/document_detail/198074.html) operation to query the tenant ID.</p>
     */
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
