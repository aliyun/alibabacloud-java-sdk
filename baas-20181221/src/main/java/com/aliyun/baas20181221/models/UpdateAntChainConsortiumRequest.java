// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UpdateAntChainConsortiumRequest extends TeaModel {
    @NameInMap("ConsortiumId")
    public String consortiumId;

    @NameInMap("ConsortiumName")
    public String consortiumName;

    @NameInMap("ConsortiumDescription")
    public String consortiumDescription;

    public static UpdateAntChainConsortiumRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntChainConsortiumRequest self = new UpdateAntChainConsortiumRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAntChainConsortiumRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public UpdateAntChainConsortiumRequest setConsortiumName(String consortiumName) {
        this.consortiumName = consortiumName;
        return this;
    }
    public String getConsortiumName() {
        return this.consortiumName;
    }

    public UpdateAntChainConsortiumRequest setConsortiumDescription(String consortiumDescription) {
        this.consortiumDescription = consortiumDescription;
        return this;
    }
    public String getConsortiumDescription() {
        return this.consortiumDescription;
    }

}
