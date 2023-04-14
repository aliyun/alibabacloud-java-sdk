// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CreateSubCorpRequest extends TeaModel {
    @NameInMap("outer_corp_id")
    public String outerCorpId;

    @NameInMap("outer_corp_name")
    public String outerCorpName;

    @NameInMap("user_id")
    public String userId;

    public static CreateSubCorpRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSubCorpRequest self = new CreateSubCorpRequest();
        return TeaModel.build(map, self);
    }

    public CreateSubCorpRequest setOuterCorpId(String outerCorpId) {
        this.outerCorpId = outerCorpId;
        return this;
    }
    public String getOuterCorpId() {
        return this.outerCorpId;
    }

    public CreateSubCorpRequest setOuterCorpName(String outerCorpName) {
        this.outerCorpName = outerCorpName;
        return this;
    }
    public String getOuterCorpName() {
        return this.outerCorpName;
    }

    public CreateSubCorpRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
