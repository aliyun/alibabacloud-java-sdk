// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetThroughPutRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static GetThroughPutRequest build(java.util.Map<String, ?> map) throws Exception {
        GetThroughPutRequest self = new GetThroughPutRequest();
        return TeaModel.build(map, self);
    }

    public GetThroughPutRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
