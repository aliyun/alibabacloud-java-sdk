// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeNetworkRuleResponseBody extends TeaModel {
    @NameInMap("Arn")
    public String arn;

    @NameInMap("Description")
    public String description;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SourcePrivateIp")
    public String sourcePrivateIp;

    @NameInMap("Type")
    public String type;

    public static DescribeNetworkRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkRuleResponseBody self = new DescribeNetworkRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkRuleResponseBody setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public DescribeNetworkRuleResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeNetworkRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworkRuleResponseBody setSourcePrivateIp(String sourcePrivateIp) {
        this.sourcePrivateIp = sourcePrivateIp;
        return this;
    }
    public String getSourcePrivateIp() {
        return this.sourcePrivateIp;
    }

    public DescribeNetworkRuleResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
