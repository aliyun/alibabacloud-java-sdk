// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessMetricAllListRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static GetBusinessMetricAllListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessMetricAllListRequest self = new GetBusinessMetricAllListRequest();
        return TeaModel.build(map, self);
    }

    public GetBusinessMetricAllListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
