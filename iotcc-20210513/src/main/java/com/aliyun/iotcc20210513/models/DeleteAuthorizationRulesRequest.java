// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteAuthorizationRulesRequest extends TeaModel {
    @NameInMap("AuthorizationRuleIds")
    public java.util.List<String> authorizationRuleIds;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteAuthorizationRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuthorizationRulesRequest self = new DeleteAuthorizationRulesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAuthorizationRulesRequest setAuthorizationRuleIds(java.util.List<String> authorizationRuleIds) {
        this.authorizationRuleIds = authorizationRuleIds;
        return this;
    }
    public java.util.List<String> getAuthorizationRuleIds() {
        return this.authorizationRuleIds;
    }

    public DeleteAuthorizationRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteAuthorizationRulesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteAuthorizationRulesRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public DeleteAuthorizationRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
