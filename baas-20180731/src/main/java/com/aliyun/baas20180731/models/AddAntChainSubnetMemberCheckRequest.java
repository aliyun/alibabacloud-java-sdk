// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class AddAntChainSubnetMemberCheckRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AntChainId")
    public String antChainId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConsortiumId")
    public String consortiumId;

    public static AddAntChainSubnetMemberCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAntChainSubnetMemberCheckRequest self = new AddAntChainSubnetMemberCheckRequest();
        return TeaModel.build(map, self);
    }

    public AddAntChainSubnetMemberCheckRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public AddAntChainSubnetMemberCheckRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

}
