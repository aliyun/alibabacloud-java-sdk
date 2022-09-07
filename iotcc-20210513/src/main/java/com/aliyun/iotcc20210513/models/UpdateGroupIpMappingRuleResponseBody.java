// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateGroupIpMappingRuleResponseBody extends TeaModel {
    @NameInMap("AuthorizationRuleId")
    public String authorizationRuleId;

    @NameInMap("IoTCloudConnectorGroupId")
    public String ioTCloudConnectorGroupId;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateGroupIpMappingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupIpMappingRuleResponseBody self = new UpdateGroupIpMappingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGroupIpMappingRuleResponseBody setAuthorizationRuleId(String authorizationRuleId) {
        this.authorizationRuleId = authorizationRuleId;
        return this;
    }
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    public UpdateGroupIpMappingRuleResponseBody setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
        this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
        return this;
    }
    public String getIoTCloudConnectorGroupId() {
        return this.ioTCloudConnectorGroupId;
    }

    public UpdateGroupIpMappingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
