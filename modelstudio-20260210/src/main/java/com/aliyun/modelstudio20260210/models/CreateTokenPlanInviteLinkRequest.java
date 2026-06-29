// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class CreateTokenPlanInviteLinkRequest extends TeaModel {
    /**
     * <p>The expiration period. Default value: DAYS_7. Valid values:</p>
     * <ul>
     * <li>DAYS_7</li>
     * <li>DAYS_30</li>
     * <li>MONTHS_6</li>
     * <li>YEAR_1</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DAYS_7</p>
     */
    @NameInMap("ExpireType")
    public String expireType;

    /**
     * <p>The SSO logon method bound to the invitation link. Valid values:</p>
     * <ul>
     * <li>SAML</li>
     * <li>DINGTALK</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SAML</p>
     */
    @NameInMap("SsoSource")
    public String ssoSource;

    public static CreateTokenPlanInviteLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTokenPlanInviteLinkRequest self = new CreateTokenPlanInviteLinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTokenPlanInviteLinkRequest setExpireType(String expireType) {
        this.expireType = expireType;
        return this;
    }
    public String getExpireType() {
        return this.expireType;
    }

    public CreateTokenPlanInviteLinkRequest setSsoSource(String ssoSource) {
        this.ssoSource = ssoSource;
        return this;
    }
    public String getSsoSource() {
        return this.ssoSource;
    }

}
