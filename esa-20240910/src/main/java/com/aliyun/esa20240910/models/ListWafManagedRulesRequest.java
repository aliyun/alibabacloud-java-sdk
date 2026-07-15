// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafManagedRulesRequest extends TeaModel {
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
    public ListWafManagedRulesRequestManagedRuleset managedRuleset;

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
    public ListWafManagedRulesRequestQueryArgs queryArgs;

    /**
     * <p>The site ID. You can obtain the site ID by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
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
        /**
         * <p>The action for a single rule. This parameter takes effect only in custom mode (ProtectionLevel = -1).</p>
         * <p>Common valid values: monitor, deny, js, captcha. The actual available values depend on the instance quota.</p>
         * 
         * <strong>example:</strong>
         * <p>js</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The unique ID of a single managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>20611349</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The rule enabled status.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
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
        /**
         * <p>The unified action when ProtectionLevel is greater than 0. This parameter cannot be empty in this case.</p>
         * <p>Common valid values: monitor, deny, js, captcha. The actual available values depend on the instance quota.</p>
         * 
         * <strong>example:</strong>
         * <p>monitor</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The attack type encoding. The value cannot be 0.</p>
         * <p>Example values: 11 (SQL injection), 12 (XSS), 13 (code execute), 14 (CRLF), 15 (local file inclusion (LFI)), 16 (remote file inclusion (RFI)), 17 (WebShell), 22 (command injection), 26 (SSRF), 27 (path traversal), 28 (protocol violation), 31 (scanner behavior).</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("AttackType")
        public Integer attackType;

        /**
         * <p>The rule configuration list in custom mode. This parameter is used only when ProtectionLevel is set to -1.</p>
         * <p>Each element contains Id, Status, and Action, which are used to specify the enabled status and action for each managed rule.</p>
         */
        @NameInMap("ManagedRules")
        public java.util.List<ListWafManagedRulesRequestManagedRulesetManagedRules> managedRules;

        /**
         * <p>The protection level within the ruleset.</p>
         * <p>Valid values: -1 (custom mode, specify each rule through ManagedRules), 1 (loose), 2 (medium), 3 (strict), 4 (super strict).</p>
         * <p>When the value is -1, ManagedRules cannot be empty. When the value is greater than 0, Action cannot be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
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
         * <p>The action.</p>
         * 
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>Fuzzy match by rule ID or rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("IdNameLike")
        public String idNameLike;

        /**
         * <p>The list of rule protection levels.</p>
         */
        @NameInMap("ProtectionLevels")
        public java.util.List<Integer> protectionLevels;

        /**
         * <p>The status.</p>
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
