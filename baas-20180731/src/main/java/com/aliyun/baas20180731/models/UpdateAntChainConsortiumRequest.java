// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateAntChainConsortiumRequest extends TeaModel {
    @NameInMap("ConsortiumDescription")
    public String consortiumDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConsortiumId")
    public String consortiumId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConsortiumName")
    public String consortiumName;

    public static UpdateAntChainConsortiumRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntChainConsortiumRequest self = new UpdateAntChainConsortiumRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAntChainConsortiumRequest setConsortiumDescription(String consortiumDescription) {
        this.consortiumDescription = consortiumDescription;
        return this;
    }
    public String getConsortiumDescription() {
        return this.consortiumDescription;
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

}
