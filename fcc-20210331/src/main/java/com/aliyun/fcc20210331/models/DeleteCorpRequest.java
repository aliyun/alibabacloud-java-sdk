// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class DeleteCorpRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    public static DeleteCorpRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCorpRequest self = new DeleteCorpRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCorpRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

}
