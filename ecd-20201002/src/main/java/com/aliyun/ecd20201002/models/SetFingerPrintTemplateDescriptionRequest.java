// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class SetFingerPrintTemplateDescriptionRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Index")
    public Integer index;

    @NameInMap("LoginToken")
    public String loginToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SessionId")
    public String sessionId;

    public static SetFingerPrintTemplateDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetFingerPrintTemplateDescriptionRequest self = new SetFingerPrintTemplateDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public SetFingerPrintTemplateDescriptionRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public SetFingerPrintTemplateDescriptionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SetFingerPrintTemplateDescriptionRequest setIndex(Integer index) {
        this.index = index;
        return this;
    }
    public Integer getIndex() {
        return this.index;
    }

    public SetFingerPrintTemplateDescriptionRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public SetFingerPrintTemplateDescriptionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetFingerPrintTemplateDescriptionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
