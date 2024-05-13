// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetUserActiveTenantRequest extends TeaModel {
    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) operation to query the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetUserActiveTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserActiveTenantRequest self = new GetUserActiveTenantRequest();
        return TeaModel.build(map, self);
    }

    public GetUserActiveTenantRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
