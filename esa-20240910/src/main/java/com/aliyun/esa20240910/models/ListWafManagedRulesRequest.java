// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafManagedRulesRequest extends TeaModel {
    /**
     * <p>The attack type. Valid values:</p>
     * <ul>
     * <li>SQL injection</li>
     * <li>Cross-site scripting</li>
     * <li>Code execution</li>
     * <li>CRLF</li>
     * <li>Local file inclusion</li>
     * <li>Remote file inclusion</li>
     * <li>webshell</li>
     * <li>Cross-site request forgery</li>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the response. Valid values:</p>
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
     * <p>The page number.</p>
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
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
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

    public ListWafManagedRulesRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
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

    public static class ListWafManagedRulesRequestQueryArgs extends TeaModel {
        /**
         * <p>The action that you want WAF to perform on requests that match the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The rule ID or name for fuzzy search.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("IdNameLike")
        public String idNameLike;

        /**
         * <p>The protection levels of the rules.</p>
         */
        @NameInMap("ProtectionLevels")
        public java.util.List<Integer> protectionLevels;

        /**
         * <p>The status of the rule.</p>
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
