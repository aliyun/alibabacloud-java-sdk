// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateWebCCRuleRequest extends TeaModel {
    /**
     * <p>The action to be performed on requests that match the rule. Valid values:</p>
     * <ul>
     * <li><strong>close</strong>: blocks the request.</li>
     * <li><strong>captcha</strong>: initiates bot detection.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>close</p>
     */
    @NameInMap("Act")
    public String act;

    /**
     * <p>The number of access requests from a single IP address. Valid values: <strong>2</strong> to <strong>2000</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The domain name of the website.</p>
     * <blockquote>
     * <p>The domain name must have a website forwarding rule configured. You can call <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> to query all domain names.</p>
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
     * <p>20</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The matching mode. Valid values:</p>
     * <ul>
     * <li><strong>prefix</strong>: prefix match.</li>
     * <li><strong>match</strong>: exact match.</li>
     * </ul>
     * <blockquote>
     * <p>If the detection path <strong>URI</strong> contains parameters, select prefix match (<strong>prefix</strong>).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prefix</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The rule name. The name can contain letters, digits, and underscores (_) and cannot exceed 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testrule</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The resource group ID of the Anti-DDoS instance in Resource Management. Default value: empty, which indicates that the instance belongs to the default resource group.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/94485.html">Create a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
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
     * <p>The URI cannot be modified. A rule is uniquely identified by the domain name of the website, the detection path, and the rule name.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/abc/a.php</p>
     */
    @NameInMap("Uri")
    public String uri;

    public static CreateWebCCRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWebCCRuleRequest self = new CreateWebCCRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateWebCCRuleRequest setAct(String act) {
        this.act = act;
        return this;
    }
    public String getAct() {
        return this.act;
    }

    public CreateWebCCRuleRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public CreateWebCCRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateWebCCRuleRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public CreateWebCCRuleRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CreateWebCCRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateWebCCRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateWebCCRuleRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public CreateWebCCRuleRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
