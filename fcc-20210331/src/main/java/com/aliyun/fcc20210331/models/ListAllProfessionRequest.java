// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class ListAllProfessionRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    public static ListAllProfessionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAllProfessionRequest self = new ListAllProfessionRequest();
        return TeaModel.build(map, self);
    }

    public ListAllProfessionRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

}
