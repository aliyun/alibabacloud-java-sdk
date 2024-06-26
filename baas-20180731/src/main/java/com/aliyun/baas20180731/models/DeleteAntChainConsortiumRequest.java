// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DeleteAntChainConsortiumRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConsortiumId")
    public String consortiumId;

    public static DeleteAntChainConsortiumRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAntChainConsortiumRequest self = new DeleteAntChainConsortiumRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAntChainConsortiumRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

}
