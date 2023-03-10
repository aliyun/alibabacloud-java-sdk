// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebCCRuleRequest extends TeaModel {
    /**
     * <p>The blocking type. Valid values:</p>
     * <br>
     * <p>*   **close**: blocks the request.</p>
     * <p>*   **captcha**: enables captcha verification.</p>
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
     * <p>*   **prefix**: prefix match</p>
     * <p>*   **match**: exact match</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The name of the rule.</p>
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
