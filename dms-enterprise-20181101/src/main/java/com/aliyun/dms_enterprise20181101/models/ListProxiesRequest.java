// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListProxiesRequest extends TeaModel {
    // The ID of the tenant. You can call the [GetUserActiveTenant](https://www.alibabacloud.com/help/en/data-management-service/latest/getuseractivetenant) operation to query the tenant ID.
    @NameInMap("Tid")
    public Long tid;

    public static ListProxiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProxiesRequest self = new ListProxiesRequest();
        return TeaModel.build(map, self);
    }

    public ListProxiesRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
