// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebPreciseAccessRuleRequest extends TeaModel {
    /**
     * <p>The domain of the website.</p>
     * <blockquote>
     * <p>You must configure a forwarding rule for the domain. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all domains.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The validity period of the rule, in seconds. This parameter applies only when <strong>action</strong> is set to <strong>block</strong>. Requests that match the rule are blocked for the specified duration. If you do not specify this parameter, the rule is permanently effective.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("Expires")
    public Integer expires;

    /**
     * <p>The ID of the resource group to which the Anti-DDoS Pro instance belongs. If you do not specify this parameter, the instance belongs to the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The configuration of the precise access control rule, specified as a JSON-formatted string. The string has the following structure:</p>
     * <ul>
     * <li><p><strong>action</strong>: String. Required. The action to perform on matching requests. Valid values:</p>
     * <ul>
     * <li><p><strong>accept</strong>: Allows the request.</p>
     * </li>
     * <li><p><strong>block</strong>: Blocks the request.</p>
     * </li>
     * <li><p><strong>challenge</strong>: Initiates a challenge to verify the request.</p>
     * </li>
     * <li><p><strong>watch</strong>: Monitors the request.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>name</strong>: String. Required. The name of the rule.</p>
     * </li>
     * <li><p><strong>condition</strong>: Map. Required. The match conditions. The structure is as follows:</p>
     * <blockquote>
     * <p>If you specify multiple match conditions, they are evaluated with a logical AND.</p>
     * </blockquote>
     * <ul>
     * <li><p><strong>field</strong>: String. Required. The match field.</p>
     * </li>
     * <li><p><strong>match_method</strong>: String. Required. The match method.</p>
     * <blockquote>
     * <p>For information about the valid values for <strong>field</strong> and <strong>match_method</strong>, see the &quot;Additional information about request parameters&quot; section.</p>
     * </blockquote>
     * </li>
     * <li><p><strong>content</strong>: String. The value to match. You can specify either this parameter or <code>content_list</code>.</p>
     * </li>
     * <li><p><strong>content_list</strong>: String. A list of values to match. You can specify either this parameter or <code>content</code>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For information about the valid values for <strong>match_method</strong> and <strong>content/content_list</strong>, see the &quot;Additional information about request parameters&quot; section.</p>
     * </blockquote>
     * </li>
     * <li><p><strong>header_name</strong>: String. Optional. The name of the request header. This parameter applies only when <strong>field</strong> is set to <strong>header</strong>.</p>
     * </li>
     * <li><p><strong>case_insensitive</strong>: Boolean. Optional. The default value is false. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong>: case-sensitive</p>
     * </li>
     * <li><p><strong>true</strong>: case-insensitive</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;action&quot;:&quot;block&quot;,&quot;name&quot;:&quot;testrule&quot;,&quot;condition&quot;:[{&quot;field&quot;:&quot;uri&quot;,&quot;match_method&quot;:&quot;contain&quot;,&quot;content&quot;:&quot;/test/123&quot;}]}]</p>
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
