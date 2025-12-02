// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateKeywordLibRequest extends TeaModel {
    /**
     * <p>Library ID.</p>
     * 
     * <strong>example:</strong>
     * <p>custom_xxxx</p>
     */
    @NameInMap("LibId")
    public String libId;

    /**
     * <p>Keyword library name.</p>
     * 
     * <strong>example:</strong>
     * <p>测试库</p>
     */
    @NameInMap("LibName")
    public String libName;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateKeywordLibRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKeywordLibRequest self = new UpdateKeywordLibRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKeywordLibRequest setLibId(String libId) {
        this.libId = libId;
        return this;
    }
    public String getLibId() {
        return this.libId;
    }

    public UpdateKeywordLibRequest setLibName(String libName) {
        this.libName = libName;
        return this;
    }
    public String getLibName() {
        return this.libName;
    }

    public UpdateKeywordLibRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
