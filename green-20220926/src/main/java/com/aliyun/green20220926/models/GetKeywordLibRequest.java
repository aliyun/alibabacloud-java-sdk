// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetKeywordLibRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>customxx_xxx</p>
     */
    @NameInMap("LibId")
    public String libId;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetKeywordLibRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKeywordLibRequest self = new GetKeywordLibRequest();
        return TeaModel.build(map, self);
    }

    public GetKeywordLibRequest setLibId(String libId) {
        this.libId = libId;
        return this;
    }
    public String getLibId() {
        return this.libId;
    }

    public GetKeywordLibRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
