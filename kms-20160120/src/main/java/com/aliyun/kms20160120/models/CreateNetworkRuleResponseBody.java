// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateNetworkRuleResponseBody extends TeaModel {
    @NameInMap("Arn")
    public String arn;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SourcePrivateIp")
    public String sourcePrivateIp;

    @NameInMap("Type")
    public String type;

    public static CreateNetworkRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkRuleResponseBody self = new CreateNetworkRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNetworkRuleResponseBody setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public CreateNetworkRuleResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateNetworkRuleResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateNetworkRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNetworkRuleResponseBody setSourcePrivateIp(String sourcePrivateIp) {
        this.sourcePrivateIp = sourcePrivateIp;
        return this;
    }
    public String getSourcePrivateIp() {
        return this.sourcePrivateIp;
    }

    public CreateNetworkRuleResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
