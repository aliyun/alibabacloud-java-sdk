// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafTemplateRulesRequest extends TeaModel {
    /**
     * <p>WAF operation phase, used to filter template rules for a specific phase.</p>
     * 
     * <strong>example:</strong>
     * <p>http_anti_scan</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <p>Query parameters, used to filter template rules based on conditions such as rule type.</p>
     * 
     * <strong>example:</strong>
     * <p>http_anti_scan</p>
     */
    @NameInMap("QueryArgs")
    public ListWafTemplateRulesRequestQueryArgs queryArgs;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> API.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static ListWafTemplateRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWafTemplateRulesRequest self = new ListWafTemplateRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListWafTemplateRulesRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public ListWafTemplateRulesRequest setQueryArgs(ListWafTemplateRulesRequestQueryArgs queryArgs) {
        this.queryArgs = queryArgs;
        return this;
    }
    public ListWafTemplateRulesRequestQueryArgs getQueryArgs() {
        return this.queryArgs;
    }

    public ListWafTemplateRulesRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public static class ListWafTemplateRulesRequestQueryArgs extends TeaModel {
        @NameInMap("Kinds")
        public java.util.List<String> kinds;

        /**
         * <p>Rule type.</p>
         * 
         * <strong>example:</strong>
         * <p>http_directory_traversal</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListWafTemplateRulesRequestQueryArgs build(java.util.Map<String, ?> map) throws Exception {
            ListWafTemplateRulesRequestQueryArgs self = new ListWafTemplateRulesRequestQueryArgs();
            return TeaModel.build(map, self);
        }

        public ListWafTemplateRulesRequestQueryArgs setKinds(java.util.List<String> kinds) {
            this.kinds = kinds;
            return this;
        }
        public java.util.List<String> getKinds() {
            return this.kinds;
        }

        public ListWafTemplateRulesRequestQueryArgs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
