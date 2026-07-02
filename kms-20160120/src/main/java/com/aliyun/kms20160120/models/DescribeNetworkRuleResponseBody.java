// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeNetworkRuleResponseBody extends TeaModel {
    /**
     * <p>The ARN of the network rule.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:kms:cn-hangzhou:119285303511****:network/networkrule_test</p>
     */
    @NameInMap("Arn")
    public String arn;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>Create by kst-hzz62ee817bvyyr5****</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the request. Alibaba Cloud generates a unique ID for each request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>3bf02f7a-015b-4f93-be0f-cc043fda2d33</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The private IP addresses or private CIDR blocks.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;192.10.XX.XX&quot;,&quot;192.168.XX.XX/24&quot;]</p>
     */
    @NameInMap("SourcePrivateIp")
    public String sourcePrivateIp;

    /**
     * <p>The network type. The only valid value is Private, which means only private IP addresses are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Private</p>
     */
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
