// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetWafQuotaRequest extends TeaModel {
    /**
     * <p>The paths of WAF quotas. Valid values:</p>
     * <ul>
     * <li>managed_rules_group: the quota for WAF managed rule groups.</li>
     * <li>list: the quota for custom lists.</li>
     * <li>page: the quota for custom response pages.</li>
     * <li>scene_policy: the quota for scenario-specific protection rules.</li>
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
