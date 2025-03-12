// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class CreateLayer7RuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>ddoscoo-cn-XXXXX</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RsType")
    public Integer rsType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ProxyRules&quot;:[{&quot;ProxyPort&quot;:443,&quot;RealServers&quot;:[&quot;1.1.1.1:443&quot;]}],&quot;ProxyType&quot;:&quot;https&quot;},{&quot;ProxyRules&quot;:[{&quot;ProxyPort&quot;:80,&quot;RealServers&quot;:[&quot;1.1.1.1:80&quot;]}],&quot;ProxyType&quot;:&quot;http&quot;}]</p>
     */
    @NameInMap("Rules")
    public String rules;

    public static CreateLayer7RuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLayer7RuleRequest self = new CreateLayer7RuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateLayer7RuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateLayer7RuleRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public CreateLayer7RuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateLayer7RuleRequest setRsType(Integer rsType) {
        this.rsType = rsType;
        return this;
    }
    public Integer getRsType() {
        return this.rsType;
    }

    public CreateLayer7RuleRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

}
