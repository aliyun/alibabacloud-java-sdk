// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class AcceptInvitationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bank</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAccepted")
    public Boolean isAccepted;

    public static AcceptInvitationRequest build(java.util.Map<String, ?> map) throws Exception {
        AcceptInvitationRequest self = new AcceptInvitationRequest();
        return TeaModel.build(map, self);
    }

    public AcceptInvitationRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AcceptInvitationRequest setIsAccepted(Boolean isAccepted) {
        this.isAccepted = isAccepted;
        return this;
    }
    public Boolean getIsAccepted() {
        return this.isAccepted;
    }

}
