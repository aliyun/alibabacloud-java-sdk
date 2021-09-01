// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetEventInfosRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    public static GetEventInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEventInfosRequest self = new GetEventInfosRequest();
        return TeaModel.build(map, self);
    }

    public GetEventInfosRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

}
