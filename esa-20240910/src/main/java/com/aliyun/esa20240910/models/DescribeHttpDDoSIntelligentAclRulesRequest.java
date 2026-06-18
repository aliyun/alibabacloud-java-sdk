// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeHttpDDoSIntelligentAclRulesRequest extends TeaModel {
    /**
     * <p>The current page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The rule type.</p>
     * 
     * <strong>example:</strong>
     * <p>acl</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    /**
     * <p>The site ID. To obtain the site ID, call the <a href="~~ListSites~~">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5407498413****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static DescribeHttpDDoSIntelligentAclRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHttpDDoSIntelligentAclRulesRequest self = new DescribeHttpDDoSIntelligentAclRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHttpDDoSIntelligentAclRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHttpDDoSIntelligentAclRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHttpDDoSIntelligentAclRulesRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public DescribeHttpDDoSIntelligentAclRulesRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
