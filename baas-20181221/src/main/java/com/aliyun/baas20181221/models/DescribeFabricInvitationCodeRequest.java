// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricInvitationCodeRequest extends TeaModel {
    @NameInMap("ConsortiumId")
    public String consortiumId;

    public static DescribeFabricInvitationCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricInvitationCodeRequest self = new DescribeFabricInvitationCodeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFabricInvitationCodeRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

}
