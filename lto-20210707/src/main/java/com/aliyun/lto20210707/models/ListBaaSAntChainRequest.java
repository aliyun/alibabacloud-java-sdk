// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListBaaSAntChainRequest extends TeaModel {
    @NameInMap("BaaSAntChainConsortiumId")
    public String baaSAntChainConsortiumId;

    public static ListBaaSAntChainRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBaaSAntChainRequest self = new ListBaaSAntChainRequest();
        return TeaModel.build(map, self);
    }

    public ListBaaSAntChainRequest setBaaSAntChainConsortiumId(String baaSAntChainConsortiumId) {
        this.baaSAntChainConsortiumId = baaSAntChainConsortiumId;
        return this;
    }
    public String getBaaSAntChainConsortiumId() {
        return this.baaSAntChainConsortiumId;
    }

}
