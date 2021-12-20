// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateGroupAuthorizationRuleAttributeResponseBody extends TeaModel {
    @NameInMap("AuthorizationRuleId")
    public String authorizationRuleId;

    @NameInMap("IoTCloudConnectorGroupId")
    public String ioTCloudConnectorGroupId;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateGroupAuthorizationRuleAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupAuthorizationRuleAttributeResponseBody self = new UpdateGroupAuthorizationRuleAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGroupAuthorizationRuleAttributeResponseBody setAuthorizationRuleId(String authorizationRuleId) {
        this.authorizationRuleId = authorizationRuleId;
        return this;
    }
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    public UpdateGroupAuthorizationRuleAttributeResponseBody setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
        this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
        return this;
    }
    public String getIoTCloudConnectorGroupId() {
        return this.ioTCloudConnectorGroupId;
    }

    public UpdateGroupAuthorizationRuleAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
