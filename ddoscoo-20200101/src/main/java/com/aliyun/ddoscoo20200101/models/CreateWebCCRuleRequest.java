// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateWebCCRuleRequest extends TeaModel {
    /**
     * <p>The blocking type. Valid values:</p>
     * <br>
     * <p>*   **close**: blocks the request.</p>
     * <p>*   **captcha**: enables Completely Automated Public Turing test to tell Computers and Humans Apart (CAPTCHA) verification.</p>
     */
    @NameInMap("Act")
    public String act;

    /**
     * <p>The number of requests that are allowed from an individual IP address. Valid values: **2** to **2000**.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The domain name of the website.</p>
     * <br>
     * <p>> A forwarding rule must be configured for the domain name. You can call the [DescribeDomains](~~91724~~) operation to query all domain names.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The detection interval. Valid values: **5** to **10800**. Unit: seconds.</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The match mode. Valid values:</p>
     * <br>
     * <p>*   **prefix**: prefix match.</p>
     * <p>*   **match**: exact match.</p>
     * <br>
     * <p>> If the **Uri** of the check path contains parameters, you must set the value to Prefix Match.</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The name of the rule. The name can be up to 128 characters in length and contain letters, digits, and underscores (\_).</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The blocking duration. Valid values: **1** to **1440**. Unit: minutes.</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <p>The check path.</p>
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
