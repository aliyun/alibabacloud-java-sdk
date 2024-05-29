// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebPreciseAccessRuleRequest extends TeaModel {
    /**
     * <p>The domain name of the website.</p>
     * <br>
     * <p>> A forwarding rule must be configured for the domain name. You can call the [DescribeDomains](https://help.aliyun.com/document_detail/91724.html) operation to query all domain names.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The validity period of the rule. Unit: seconds. This parameter takes effect only when **action** of a rule is **block**. Access requests that match the rule are blocked within the specified validity period of the rule. If you do not specify this parameter, this rule takes effect all the time.</p>
     */
    @NameInMap("Expires")
    public Integer expires;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The settings of the accurate access control rule. This parameter is a JSON string. The following list describes the fields in the value of the parameter:</p>
     * <br>
     * <p>*   **action**: the action that is performed if the rule is matched. This field is required and must be of the string type. Valid values:</p>
     * <br>
     * <p>    *   **accept**: allows the requests that match the rule.</p>
     * <p>    *   **block**: blocks the requests that match the rule.</p>
     * <p>    *   **challenge**: implements a CAPTCHA for the requests that match the rule.</p>
     * <br>
     * <p>*   **name**: the name of the rule. This field is required and must be of the string type.</p>
     * <br>
     * <p>*   **condition**: the match conditions. This field is required and must be of the map type. A match condition contains the following parameters.</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note**The AND logical operator is used to define the relationship among multiple match conditions.</p>
     * <br>
     * <p>    *   **field**: the match field. This parameter is required and must be of the string type.</p>
     * <br>
     * <p>    *   **match_method**: the logical relation. This parameter is required and must be of the string type.</p>
     * <br>
     * <p>        **</p>
     * <br>
     * <p>        **Note**For information about the mappings between the **field** and **match_method** parameters, see the Mappings between the field and match_method parameters table in this topic.</p>
     * <br>
     * <p>    *   **content**: the match content. This parameter is required and must be of the string type.</p>
     * <br>
     * <p>*   **header_name**: the HTTP header. This parameter is optional and must be of the string type. This parameter takes effect only when **field** is **header**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Rules")
    public String rules;

    public static ModifyWebPreciseAccessRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebPreciseAccessRuleRequest self = new ModifyWebPreciseAccessRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebPreciseAccessRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyWebPreciseAccessRuleRequest setExpires(Integer expires) {
        this.expires = expires;
        return this;
    }
    public Integer getExpires() {
        return this.expires;
    }

    public ModifyWebPreciseAccessRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyWebPreciseAccessRuleRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

}
