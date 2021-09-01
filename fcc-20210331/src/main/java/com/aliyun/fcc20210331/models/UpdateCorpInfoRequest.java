// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class UpdateCorpInfoRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("CorpName")
    public String corpName;

    public static UpdateCorpInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCorpInfoRequest self = new UpdateCorpInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCorpInfoRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public UpdateCorpInfoRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

}
