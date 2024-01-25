// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetResourceListRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static GetResourceListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceListRequest self = new GetResourceListRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
