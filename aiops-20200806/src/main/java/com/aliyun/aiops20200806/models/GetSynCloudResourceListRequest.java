// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetSynCloudResourceListRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static GetSynCloudResourceListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSynCloudResourceListRequest self = new GetSynCloudResourceListRequest();
        return TeaModel.build(map, self);
    }

    public GetSynCloudResourceListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
