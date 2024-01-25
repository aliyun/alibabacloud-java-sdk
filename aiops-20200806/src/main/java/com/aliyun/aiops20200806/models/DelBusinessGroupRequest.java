// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DelBusinessGroupRequest extends TeaModel {
    @NameInMap("BusinessGroupId")
    public String businessGroupId;

    public static DelBusinessGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DelBusinessGroupRequest self = new DelBusinessGroupRequest();
        return TeaModel.build(map, self);
    }

    public DelBusinessGroupRequest setBusinessGroupId(String businessGroupId) {
        this.businessGroupId = businessGroupId;
        return this;
    }
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

}
