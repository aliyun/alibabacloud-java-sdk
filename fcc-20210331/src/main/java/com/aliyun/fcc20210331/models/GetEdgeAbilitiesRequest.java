// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetEdgeAbilitiesRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("EdgeId")
    public String edgeId;

    public static GetEdgeAbilitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeAbilitiesRequest self = new GetEdgeAbilitiesRequest();
        return TeaModel.build(map, self);
    }

    public GetEdgeAbilitiesRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetEdgeAbilitiesRequest setEdgeId(String edgeId) {
        this.edgeId = edgeId;
        return this;
    }
    public String getEdgeId() {
        return this.edgeId;
    }

}
