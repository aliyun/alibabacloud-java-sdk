// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetWafQuotaRequest extends TeaModel {
    /**
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
