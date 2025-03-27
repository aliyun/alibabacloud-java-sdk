// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafManagedRulesShrinkRequest extends TeaModel {
    /**
     * <p>Attack type of the vulnerability protection event. Values:</p>
     * <ul>
     * <li>SQL injection</li>
     * <li>Cross-site scripting</li>
     * <li>Code execution</li>
     * <li>CRLF</li>
     * <li>Local file inclusion</li>
     * <li>Remote file inclusion</li>
     * <li>Webshell</li>
     * <li>Cross-site request forgery</li>
     * <li>Other</li>
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
     * <p>ID of the WAF rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Language type, which will be used to return the response. Value range:</p>
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
     * <p>Query page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Query page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProtectionLevel")
    public Integer protectionLevel;

    /**
     * <p>Query conditions.</p>
     */
    @NameInMap("QueryArgs")
    public String queryArgsShrink;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
     * <p>This parameter is required.</p>
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

    public ListWafManagedRulesShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
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
