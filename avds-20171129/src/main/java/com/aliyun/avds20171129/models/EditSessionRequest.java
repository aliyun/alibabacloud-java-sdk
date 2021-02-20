// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class EditSessionRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("SessionId")
    public Integer sessionId;

    @NameInMap("Asset")
    public String asset;

    @NameInMap("TTL")
    public Integer TTL;

    @NameInMap("LoginSession")
    public String loginSession;

    public static EditSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        EditSessionRequest self = new EditSessionRequest();
        return TeaModel.build(map, self);
    }

    public EditSessionRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public EditSessionRequest setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public Integer getSessionId() {
        return this.sessionId;
    }

    public EditSessionRequest setAsset(String asset) {
        this.asset = asset;
        return this;
    }
    public String getAsset() {
        return this.asset;
    }

    public EditSessionRequest setTTL(Integer TTL) {
        this.TTL = TTL;
        return this;
    }
    public Integer getTTL() {
        return this.TTL;
    }

    public EditSessionRequest setLoginSession(String loginSession) {
        this.loginSession = loginSession;
        return this;
    }
    public String getLoginSession() {
        return this.loginSession;
    }

}
