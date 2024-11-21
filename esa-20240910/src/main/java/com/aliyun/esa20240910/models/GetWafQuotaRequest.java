// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetWafQuotaRequest extends TeaModel {
    /**
     * <p>The type of WAF resources. Valid values:</p>
     * <ul>
     * <li>managed_rules_group: the managed rule group.</li>
     * <li>list: the custom list.</li>
     * <li>page: the custom error page.</li>
     * <li>scene_policy: the scenario-specific policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>page</p>
     */
    @NameInMap("Paths")
    public String paths;

    public static GetWafQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWafQuotaRequest self = new GetWafQuotaRequest();
        return TeaModel.build(map, self);
    }

    public GetWafQuotaRequest setPaths(String paths) {
        this.paths = paths;
        return this;
    }
    public String getPaths() {
        return this.paths;
    }

}
