// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class CreateDemoInstanceRequest extends TeaModel {
    @NameInMap("OutboundCallWhitelist")
    public String outboundCallWhitelist;

    public static CreateDemoInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDemoInstanceRequest self = new CreateDemoInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDemoInstanceRequest setOutboundCallWhitelist(String outboundCallWhitelist) {
        this.outboundCallWhitelist = outboundCallWhitelist;
        return this;
    }
    public String getOutboundCallWhitelist() {
        return this.outboundCallWhitelist;
    }

}
