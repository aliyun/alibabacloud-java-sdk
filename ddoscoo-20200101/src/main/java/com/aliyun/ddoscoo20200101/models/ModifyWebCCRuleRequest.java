// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebCCRuleRequest extends TeaModel {
    /**
     * <p>The blocking type. Valid values:</p>
     * <ul>
     * <li><p><strong>close</strong>: block</p>
     * </li>
     * <li><p><strong>captcha</strong>: bot detection</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>close</p>
     */
    @NameInMap("Act")
    public String act;

    /**
     * <p>The number of access attempts from a single IP address. Valid values: <strong>2</strong> to <strong>2000</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The domain name of the website business.</p>
     * <blockquote>
     * <p>The domain name must have a configured website business forwarding rule. You can call <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> to query all domain names.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The detection duration. Valid values: <strong>5</strong> to <strong>10800</strong>. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The matching pattern. Valid values:</p>
     * <ul>
     * <li><p><strong>prefix</strong>: prefix match</p>
     * </li>
     * <li><p><strong>match</strong>: exact match</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prefix</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The rule name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testrule</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The resource group ID to which the Anti-DDoS Proxy instance belongs in the Resource Management product. The default value is empty, which indicates that the instance belongs to the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The blocking duration. Valid values: <strong>60</strong> to <strong>86400</strong>. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <p>The detection path.</p>
     * <blockquote>
     * <p>The URI cannot be modified. A rule is uniquely identified by the domain name of the website business, the detection path, and the rule name.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/abc</p>
     */
    @NameInMap("Uri")
    public String uri;

    public static ModifyWebCCRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebCCRuleRequest self = new ModifyWebCCRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebCCRuleRequest setAct(String act) {
        this.act = act;
        return this;
    }
    public String getAct() {
        return this.act;
    }

    public ModifyWebCCRuleRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ModifyWebCCRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyWebCCRuleRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public ModifyWebCCRuleRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ModifyWebCCRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyWebCCRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyWebCCRuleRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public ModifyWebCCRuleRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
