// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetWafQuotaRequest extends TeaModel {
    /**
     * <p>The path of the WAF quota, for example:</p>
     * <ul>
     * <li>managed_rules_group: represents the quota for the WAF managed rules group</li>
     * <li>list: represents the quota for custom lists</li>
     * <li>page: represents the quota for custom response pages</li>
     * <li>scene_policy: represents the quota for scenario protection</li>
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
