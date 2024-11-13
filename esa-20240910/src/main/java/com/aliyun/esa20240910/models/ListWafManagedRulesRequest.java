// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafManagedRulesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("AttackType")
    public Integer attackType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProtectionLevel")
    public Integer protectionLevel;

    @NameInMap("QueryArgs")
    public ListWafManagedRulesRequestQueryArgs queryArgs;

    /**
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
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("IdNameLike")
        public String idNameLike;

        @NameInMap("ProtectionLevels")
        public java.util.List<Integer> protectionLevels;

        /**
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
