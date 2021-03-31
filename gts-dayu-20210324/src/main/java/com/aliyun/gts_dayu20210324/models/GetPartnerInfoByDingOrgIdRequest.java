// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210324.models;

import com.aliyun.tea.*;

public class GetPartnerInfoByDingOrgIdRequest extends TeaModel {
    // dingOrgId
    @NameInMap("DingOrgId")
    public String dingOrgId;

    public static GetPartnerInfoByDingOrgIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPartnerInfoByDingOrgIdRequest self = new GetPartnerInfoByDingOrgIdRequest();
        return TeaModel.build(map, self);
    }

    public GetPartnerInfoByDingOrgIdRequest setDingOrgId(String dingOrgId) {
        this.dingOrgId = dingOrgId;
        return this;
    }
    public String getDingOrgId() {
        return this.dingOrgId;
    }

}
