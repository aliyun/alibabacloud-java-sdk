// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateGroupConfigSynFlowRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("FlowVersion")
    public Integer flowVersion;

    @NameInMap("SourceGroupId")
    public String sourceGroupId;

    @NameInMap("TargetGroupId")
    public String targetGroupId;

    @NameInMap("ApiSynVersion")
    public String apiSynVersion;

    @NameInMap("SourceGroupRegion")
    public String sourceGroupRegion;

    public static CreateGroupConfigSynFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupConfigSynFlowRequest self = new CreateGroupConfigSynFlowRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupConfigSynFlowRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateGroupConfigSynFlowRequest setFlowVersion(Integer flowVersion) {
        this.flowVersion = flowVersion;
        return this;
    }
    public Integer getFlowVersion() {
        return this.flowVersion;
    }

    public CreateGroupConfigSynFlowRequest setSourceGroupId(String sourceGroupId) {
        this.sourceGroupId = sourceGroupId;
        return this;
    }
    public String getSourceGroupId() {
        return this.sourceGroupId;
    }

    public CreateGroupConfigSynFlowRequest setTargetGroupId(String targetGroupId) {
        this.targetGroupId = targetGroupId;
        return this;
    }
    public String getTargetGroupId() {
        return this.targetGroupId;
    }

    public CreateGroupConfigSynFlowRequest setApiSynVersion(String apiSynVersion) {
        this.apiSynVersion = apiSynVersion;
        return this;
    }
    public String getApiSynVersion() {
        return this.apiSynVersion;
    }

    public CreateGroupConfigSynFlowRequest setSourceGroupRegion(String sourceGroupRegion) {
        this.sourceGroupRegion = sourceGroupRegion;
        return this;
    }
    public String getSourceGroupRegion() {
        return this.sourceGroupRegion;
    }

}
