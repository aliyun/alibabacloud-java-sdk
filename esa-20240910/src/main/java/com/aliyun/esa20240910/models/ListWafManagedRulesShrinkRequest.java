// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafManagedRulesShrinkRequest extends TeaModel {
    /**
     * <p>The attack type to filter the results by. Valid values:</p>
     * <ul>
     * <li><p>SQL injection</p>
     * </li>
     * <li><p>cross-site scripting</p>
     * </li>
     * <li><p>code execution</p>
     * </li>
     * <li><p>CRLF</p>
     * </li>
     * <li><p>local file inclusion</p>
     * </li>
     * <li><p>remote file inclusion</p>
     * </li>
     * <li><p>webshell</p>
     * </li>
     * <li><p>cross-site request forgery</p>
     * </li>
     * <li><p>Other</p>
     * </li>
     * <li><p>SEMA</p>
     * </li>
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

    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The response language. Valid values:</p>
     * <ul>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * <li><p><strong>zh</strong>: Chinese.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Language")
    public String language;

    @NameInMap("ManagedRuleset")
    public String managedRulesetShrink;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProtectionLevel")
    public Integer protectionLevel;

    /**
     * <p>The query conditions.</p>
     */
    @NameInMap("QueryArgs")
    public String queryArgsShrink;

    /**
     * <p>The ID of the site. Call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain this ID.</p>
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
