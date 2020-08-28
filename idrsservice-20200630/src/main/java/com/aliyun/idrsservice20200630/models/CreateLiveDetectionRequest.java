// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateLiveDetectionRequest extends TeaModel {
    @NameInMap("LiveId")
    @Validation(required = true)
    public String liveId;

    @NameInMap("UserId")
    @Validation(required = true)
    public String userId;

    @NameInMap("RuleId")
    @Validation(required = true)
    public String ruleId;

    @NameInMap("MetaUrl")
    @Validation(required = true)
    public String metaUrl;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateLiveDetectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveDetectionRequest self = new CreateLiveDetectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateLiveDetectionRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public CreateLiveDetectionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateLiveDetectionRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public CreateLiveDetectionRequest setMetaUrl(String metaUrl) {
        this.metaUrl = metaUrl;
        return this;
    }
    public String getMetaUrl() {
        return this.metaUrl;
    }

    public CreateLiveDetectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
