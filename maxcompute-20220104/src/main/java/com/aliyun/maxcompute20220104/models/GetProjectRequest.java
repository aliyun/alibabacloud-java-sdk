// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetProjectRequest extends TeaModel {
    /**
     * <p>Specifies whether to use additional information.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("verbose")
    public Boolean verbose;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("withQuotaProductType")
    public Boolean withQuotaProductType;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("withStorageTierInfo")
    public Boolean withStorageTierInfo;

    public static GetProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProjectRequest self = new GetProjectRequest();
        return TeaModel.build(map, self);
    }

    public GetProjectRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

    public GetProjectRequest setWithQuotaProductType(Boolean withQuotaProductType) {
        this.withQuotaProductType = withQuotaProductType;
        return this;
    }
    public Boolean getWithQuotaProductType() {
        return this.withQuotaProductType;
    }

    public GetProjectRequest setWithStorageTierInfo(Boolean withStorageTierInfo) {
        this.withStorageTierInfo = withStorageTierInfo;
        return this;
    }
    public Boolean getWithStorageTierInfo() {
        return this.withStorageTierInfo;
    }

}
