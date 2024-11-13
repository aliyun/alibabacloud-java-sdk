// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafTemplateRulesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>http_anti_scan</p>
     */
    @NameInMap("Phase")
    public String phase;

    @NameInMap("QueryArgs")
    public ListWafTemplateRulesRequestQueryArgs queryArgs;

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
        /**
         * <strong>example:</strong>
         * <p>http_directory_traversal</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListWafTemplateRulesRequestQueryArgs build(java.util.Map<String, ?> map) throws Exception {
            ListWafTemplateRulesRequestQueryArgs self = new ListWafTemplateRulesRequestQueryArgs();
            return TeaModel.build(map, self);
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
