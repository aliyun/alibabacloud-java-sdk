// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class SetStudentsDesktopGroupPolicyRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("LoginToken")
    public String loginToken;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SessionId")
    public String sessionId;

    public static SetStudentsDesktopGroupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetStudentsDesktopGroupPolicyRequest self = new SetStudentsDesktopGroupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public SetStudentsDesktopGroupPolicyRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public SetStudentsDesktopGroupPolicyRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public SetStudentsDesktopGroupPolicyRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public SetStudentsDesktopGroupPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public SetStudentsDesktopGroupPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetStudentsDesktopGroupPolicyRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
