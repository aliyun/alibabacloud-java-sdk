// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetCnameFlatteningResponseBody extends TeaModel {
    /**
     * <p>The CNAME flattening mode. Valid values:</p>
     * <ul>
     * <li>flatten_all: flattens all CNAMEs.</li>
     * <li>flatten_all (default): flattens only the root domain.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>flatten_all</p>
     */
    @NameInMap("FlattenMode")
    public String flattenMode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F61CDR30-E83C-4FDA-BF73-9A94CDD44229</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCnameFlatteningResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCnameFlatteningResponseBody self = new GetCnameFlatteningResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCnameFlatteningResponseBody setFlattenMode(String flattenMode) {
        this.flattenMode = flattenMode;
        return this;
    }
    public String getFlattenMode() {
        return this.flattenMode;
    }

    public GetCnameFlatteningResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
