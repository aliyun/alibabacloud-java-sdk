// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateNetworkRuleResponseBody extends TeaModel {
    /**
     * <p>The ARN of the access control rule.</p>
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
     * <p>networkrule description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the access control rule.</p>
     * 
     * <strong>example:</strong>
     * <p>networkrule_test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>3bf02f7a-015b-4f93-be0f-cc043fda2dd3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The private IP address or private CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;192.10.XX.XX&quot;,&quot;192.168.XX.XX/24&quot;]</p>
     */
    @NameInMap("SourcePrivateIp")
    public String sourcePrivateIp;

    /**
     * <p>The network type.</p>
     * 
     * <strong>example:</strong>
     * <p>Private</p>
     */
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
