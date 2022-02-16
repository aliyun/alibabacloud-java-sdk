// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateDNSServiceRuleResponseBody extends TeaModel {
    @NameInMap("DNSServiceRuleId")
    public String DNSServiceRuleId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDNSServiceRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDNSServiceRuleResponseBody self = new CreateDNSServiceRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDNSServiceRuleResponseBody setDNSServiceRuleId(String DNSServiceRuleId) {
        this.DNSServiceRuleId = DNSServiceRuleId;
        return this;
    }
    public String getDNSServiceRuleId() {
        return this.DNSServiceRuleId;
    }

    public CreateDNSServiceRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
