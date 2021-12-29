// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListBaaSAntChainPeerRequest extends TeaModel {
    @NameInMap("BaaSAntChainChainId")
    public String baaSAntChainChainId;

    @NameInMap("BaaSAntChainConsortiumId")
    public String baaSAntChainConsortiumId;

    public static ListBaaSAntChainPeerRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBaaSAntChainPeerRequest self = new ListBaaSAntChainPeerRequest();
        return TeaModel.build(map, self);
    }

    public ListBaaSAntChainPeerRequest setBaaSAntChainChainId(String baaSAntChainChainId) {
        this.baaSAntChainChainId = baaSAntChainChainId;
        return this;
    }
    public String getBaaSAntChainChainId() {
        return this.baaSAntChainChainId;
    }

    public ListBaaSAntChainPeerRequest setBaaSAntChainConsortiumId(String baaSAntChainConsortiumId) {
        this.baaSAntChainConsortiumId = baaSAntChainConsortiumId;
        return this;
    }
    public String getBaaSAntChainConsortiumId() {
        return this.baaSAntChainConsortiumId;
    }

}
