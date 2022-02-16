// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateGroupDNSServiceRuleResponseBody extends TeaModel {
    @NameInMap("DNSServiceRuleId")
    public String DNSServiceRuleId;

    @NameInMap("IoTCloudConnectorGroupId")
    public String ioTCloudConnectorGroupId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateGroupDNSServiceRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupDNSServiceRuleResponseBody self = new CreateGroupDNSServiceRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGroupDNSServiceRuleResponseBody setDNSServiceRuleId(String DNSServiceRuleId) {
        this.DNSServiceRuleId = DNSServiceRuleId;
        return this;
    }
    public String getDNSServiceRuleId() {
        return this.DNSServiceRuleId;
    }

    public CreateGroupDNSServiceRuleResponseBody setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
        this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
        return this;
    }
    public String getIoTCloudConnectorGroupId() {
        return this.ioTCloudConnectorGroupId;
    }

    public CreateGroupDNSServiceRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
