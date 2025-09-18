// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetTableTokenRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isInternal")
    public Boolean isInternal;

    public static GetTableTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableTokenRequest self = new GetTableTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetTableTokenRequest setIsInternal(Boolean isInternal) {
        this.isInternal = isInternal;
        return this;
    }
    public Boolean getIsInternal() {
        return this.isInternal;
    }

}
