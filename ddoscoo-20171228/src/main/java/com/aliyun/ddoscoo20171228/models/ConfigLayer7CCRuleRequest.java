// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigLayer7CCRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>close</p>
     */
    @NameInMap("Act")
    public String act;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>match</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testCcRule1</p>
     */
    @NameInMap("Name")
    public String name;

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
     * <p>60</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/a/b/c</p>
     */
    @NameInMap("Uri")
    public String uri;

    public static ConfigLayer7CCRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer7CCRuleRequest self = new ConfigLayer7CCRuleRequest();
        return TeaModel.build(map, self);
    }

    public ConfigLayer7CCRuleRequest setAct(String act) {
        this.act = act;
        return this;
    }
    public String getAct() {
        return this.act;
    }

    public ConfigLayer7CCRuleRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ConfigLayer7CCRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ConfigLayer7CCRuleRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public ConfigLayer7CCRuleRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ConfigLayer7CCRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ConfigLayer7CCRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ConfigLayer7CCRuleRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public ConfigLayer7CCRuleRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
