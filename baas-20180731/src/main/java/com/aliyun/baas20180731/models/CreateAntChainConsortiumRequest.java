// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateAntChainConsortiumRequest extends TeaModel {
    @NameInMap("ConsortiumDescription")
    public String consortiumDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConsortiumName")
    public String consortiumName;

    public static CreateAntChainConsortiumRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntChainConsortiumRequest self = new CreateAntChainConsortiumRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntChainConsortiumRequest setConsortiumDescription(String consortiumDescription) {
        this.consortiumDescription = consortiumDescription;
        return this;
    }
    public String getConsortiumDescription() {
        return this.consortiumDescription;
    }

    public CreateAntChainConsortiumRequest setConsortiumName(String consortiumName) {
        this.consortiumName = consortiumName;
        return this;
    }
    public String getConsortiumName() {
        return this.consortiumName;
    }

}
