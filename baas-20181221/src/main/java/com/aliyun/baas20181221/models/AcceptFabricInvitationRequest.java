// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class AcceptFabricInvitationRequest extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("IsAccepted")
    public Boolean isAccepted;

    public static AcceptFabricInvitationRequest build(java.util.Map<String, ?> map) throws Exception {
        AcceptFabricInvitationRequest self = new AcceptFabricInvitationRequest();
        return TeaModel.build(map, self);
    }

    public AcceptFabricInvitationRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AcceptFabricInvitationRequest setIsAccepted(Boolean isAccepted) {
        this.isAccepted = isAccepted;
        return this;
    }
    public Boolean getIsAccepted() {
        return this.isAccepted;
    }

}
