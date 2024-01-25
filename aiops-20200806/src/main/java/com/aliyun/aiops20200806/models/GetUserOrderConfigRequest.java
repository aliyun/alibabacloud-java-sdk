// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetUserOrderConfigRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static GetUserOrderConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserOrderConfigRequest self = new GetUserOrderConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetUserOrderConfigRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
