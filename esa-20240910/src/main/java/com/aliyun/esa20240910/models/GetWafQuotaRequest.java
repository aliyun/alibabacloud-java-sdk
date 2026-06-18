// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetWafQuotaRequest extends TeaModel {
    /**
     * <p>The path of the WAF quota. Valid values:</p>
     * <ul>
     * <li><p>managed_rules_group: The quota for managed rule groups.</p>
     * </li>
     * <li><p>list: The quota for custom lists.</p>
     * </li>
     * <li><p>page: The quota for custom response pages.</p>
     * </li>
     * <li><p>scene_policy: The quota for scene-based protection.</p>
     * </li>
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
