// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetIpcDetailRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("GbId")
    public String gbId;

    public static GetIpcDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIpcDetailRequest self = new GetIpcDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetIpcDetailRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetIpcDetailRequest setGbId(String gbId) {
        this.gbId = gbId;
        return this;
    }
    public String getGbId() {
        return this.gbId;
    }

}
