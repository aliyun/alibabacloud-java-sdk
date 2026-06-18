// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafManagedRulesRequest extends TeaModel {
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
    public ListWafManagedRulesRequestManagedRuleset managedRuleset;

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
    public ListWafManagedRulesRequestQueryArgs queryArgs;

    /**
     * <p>The ID of the site. Call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain this ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static ListWafManagedRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWafManagedRulesRequest self = new ListWafManagedRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListWafManagedRulesRequest setAttackType(Integer attackType) {
        this.attackType = attackType;
        return this;
    }
    public Integer getAttackType() {
        return this.attackType;
    }

    public ListWafManagedRulesRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ListWafManagedRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListWafManagedRulesRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListWafManagedRulesRequest setManagedRuleset(ListWafManagedRulesRequestManagedRuleset managedRuleset) {
        this.managedRuleset = managedRuleset;
        return this;
    }
    public ListWafManagedRulesRequestManagedRuleset getManagedRuleset() {
        return this.managedRuleset;
    }

    public ListWafManagedRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListWafManagedRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWafManagedRulesRequest setProtectionLevel(Integer protectionLevel) {
        this.protectionLevel = protectionLevel;
        return this;
    }
    public Integer getProtectionLevel() {
        return this.protectionLevel;
    }

    public ListWafManagedRulesRequest setQueryArgs(ListWafManagedRulesRequestQueryArgs queryArgs) {
        this.queryArgs = queryArgs;
        return this;
    }
    public ListWafManagedRulesRequestQueryArgs getQueryArgs() {
        return this.queryArgs;
    }

    public ListWafManagedRulesRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public static class ListWafManagedRulesRequestManagedRulesetManagedRules extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Status")
        public String status;

        public static ListWafManagedRulesRequestManagedRulesetManagedRules build(java.util.Map<String, ?> map) throws Exception {
            ListWafManagedRulesRequestManagedRulesetManagedRules self = new ListWafManagedRulesRequestManagedRulesetManagedRules();
            return TeaModel.build(map, self);
        }

        public ListWafManagedRulesRequestManagedRulesetManagedRules setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListWafManagedRulesRequestManagedRulesetManagedRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListWafManagedRulesRequestManagedRulesetManagedRules setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListWafManagedRulesRequestManagedRuleset extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("AttackType")
        public Integer attackType;

        @NameInMap("ManagedRules")
        public java.util.List<ListWafManagedRulesRequestManagedRulesetManagedRules> managedRules;

        @NameInMap("ProtectionLevel")
        public Integer protectionLevel;

        public static ListWafManagedRulesRequestManagedRuleset build(java.util.Map<String, ?> map) throws Exception {
            ListWafManagedRulesRequestManagedRuleset self = new ListWafManagedRulesRequestManagedRuleset();
            return TeaModel.build(map, self);
        }

        public ListWafManagedRulesRequestManagedRuleset setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListWafManagedRulesRequestManagedRuleset setAttackType(Integer attackType) {
            this.attackType = attackType;
            return this;
        }
        public Integer getAttackType() {
            return this.attackType;
        }

        public ListWafManagedRulesRequestManagedRuleset setManagedRules(java.util.List<ListWafManagedRulesRequestManagedRulesetManagedRules> managedRules) {
            this.managedRules = managedRules;
            return this;
        }
        public java.util.List<ListWafManagedRulesRequestManagedRulesetManagedRules> getManagedRules() {
            return this.managedRules;
        }

        public ListWafManagedRulesRequestManagedRuleset setProtectionLevel(Integer protectionLevel) {
            this.protectionLevel = protectionLevel;
            return this;
        }
        public Integer getProtectionLevel() {
            return this.protectionLevel;
        }

    }

    public static class ListWafManagedRulesRequestQueryArgs extends TeaModel {
        /**
         * <p>The rule action to filter by.</p>
         * 
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The keyword for a fuzzy search on the rule ID or rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("IdNameLike")
        public String idNameLike;

        /**
         * <p>The rule protection levels to filter the results by.</p>
         */
        @NameInMap("ProtectionLevels")
        public java.util.List<Integer> protectionLevels;

        /**
         * <p>The rule status to filter by.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListWafManagedRulesRequestQueryArgs build(java.util.Map<String, ?> map) throws Exception {
            ListWafManagedRulesRequestQueryArgs self = new ListWafManagedRulesRequestQueryArgs();
            return TeaModel.build(map, self);
        }

        public ListWafManagedRulesRequestQueryArgs setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListWafManagedRulesRequestQueryArgs setIdNameLike(String idNameLike) {
            this.idNameLike = idNameLike;
            return this;
        }
        public String getIdNameLike() {
            return this.idNameLike;
        }

        public ListWafManagedRulesRequestQueryArgs setProtectionLevels(java.util.List<Integer> protectionLevels) {
            this.protectionLevels = protectionLevels;
            return this;
        }
        public java.util.List<Integer> getProtectionLevels() {
            return this.protectionLevels;
        }

        public ListWafManagedRulesRequestQueryArgs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
