// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafManagedRulesShrinkRequest extends TeaModel {
    /**
     * <p>The attack type of the vulnerability prevention event. Valid values:</p>
     * <ul>
     * <li>SQL injection</li>
     * <li>cross-site scripting (XSS)</li>
     * <li>code execute</li>
     * <li>CRLF</li>
     * <li>local file inclusion (LFI)</li>
     * <li>remote file inclusion (RFI)</li>
     * <li>webshell</li>
     * <li>cross-site request forgery</li>
     * <li>Others</li>
     * <li>SEMA</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("AttackType")
    public Integer attackType;

    /**
     * <p>The ID of the WAF rule.</p>
     * 
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The WAF instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-site-awmmx25y2igw</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language type. The response is returned in the specified language. Valid values:</p>
     * <ul>
     * <li><strong>en</strong>: English.</li>
     * <li><strong>zh</strong>: Chinese.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The managed ruleset configuration in JSON string format.</p>
     * <p>Contains the AttackType, ProtectionLevel, Action, and ManagedRules subfields. When ProtectionLevel is set to -1 (custom mode), specify the status and action for each rule through the ManagedRules array.</p>
     */
    @NameInMap("ManagedRuleset")
    public String managedRulesetShrink;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The currently saved protection level, which represents the existing configuration state in the database.</p>
     * <p>Valid values: -1 (custom mode), 1 (loose), 2 (medium), 3 (strict), 4 (super strict).</p>
     * <p>Difference from ManagedRuleset.ProtectionLevel: this parameter indicates the currently effective configuration, while ManagedRuleset.ProtectionLevel indicates the target value being passed in.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProtectionLevel")
    public Integer protectionLevel;

    /**
     * <p>The query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Status\&quot;:\&quot;\&quot;,\&quot;ProtectionLevels\&quot;:[2,1],\&quot;Action\&quot;:\&quot;\&quot;,\&quot;IdNameLike\&quot;:\&quot;\&quot;}</p>
     */
    @NameInMap("QueryArgs")
    public String queryArgsShrink;

    /**
     * <p>The site ID. You can obtain the site ID by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static ListWafManagedRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWafManagedRulesShrinkRequest self = new ListWafManagedRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListWafManagedRulesShrinkRequest setAttackType(Integer attackType) {
        this.attackType = attackType;
        return this;
    }
    public Integer getAttackType() {
        return this.attackType;
    }

    public ListWafManagedRulesShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ListWafManagedRulesShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListWafManagedRulesShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListWafManagedRulesShrinkRequest setManagedRulesetShrink(String managedRulesetShrink) {
        this.managedRulesetShrink = managedRulesetShrink;
        return this;
    }
    public String getManagedRulesetShrink() {
        return this.managedRulesetShrink;
    }

    public ListWafManagedRulesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListWafManagedRulesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWafManagedRulesShrinkRequest setProtectionLevel(Integer protectionLevel) {
        this.protectionLevel = protectionLevel;
        return this;
    }
    public Integer getProtectionLevel() {
        return this.protectionLevel;
    }

    public ListWafManagedRulesShrinkRequest setQueryArgsShrink(String queryArgsShrink) {
        this.queryArgsShrink = queryArgsShrink;
        return this;
    }
    public String getQueryArgsShrink() {
        return this.queryArgsShrink;
    }

    public ListWafManagedRulesShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
