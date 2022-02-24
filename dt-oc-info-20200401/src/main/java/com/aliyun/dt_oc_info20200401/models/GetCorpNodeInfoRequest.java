// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCorpNodeInfoRequest extends TeaModel {
    @NameInMap("OneCompanyId")
    public String oneCompanyId;

    public static GetCorpNodeInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCorpNodeInfoRequest self = new GetCorpNodeInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetCorpNodeInfoRequest setOneCompanyId(String oneCompanyId) {
        this.oneCompanyId = oneCompanyId;
        return this;
    }
    public String getOneCompanyId() {
        return this.oneCompanyId;
    }

}
