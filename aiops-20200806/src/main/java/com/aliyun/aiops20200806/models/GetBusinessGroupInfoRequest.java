// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessGroupInfoRequest extends TeaModel {
    @NameInMap("BusinessGroupId")
    public String businessGroupId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetBusinessGroupInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessGroupInfoRequest self = new GetBusinessGroupInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetBusinessGroupInfoRequest setBusinessGroupId(String businessGroupId) {
        this.businessGroupId = businessGroupId;
        return this;
    }
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    public GetBusinessGroupInfoRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
