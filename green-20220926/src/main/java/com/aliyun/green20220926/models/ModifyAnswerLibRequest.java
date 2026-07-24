// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ModifyAnswerLibRequest extends TeaModel {
    /**
     * <p>The ID of the proxy response library.</p>
     * 
     * <strong>example:</strong>
     * <p>custom_xxxx</p>
     */
    @NameInMap("LibId")
    public String libId;

    /**
     * <p>The name of the library.</p>
     * 
     * <strong>example:</strong>
     * <p>测试库</p>
     */
    @NameInMap("LibName")
    public String libName;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyAnswerLibRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAnswerLibRequest self = new ModifyAnswerLibRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAnswerLibRequest setLibId(String libId) {
        this.libId = libId;
        return this;
    }
    public String getLibId() {
        return this.libId;
    }

    public ModifyAnswerLibRequest setLibName(String libName) {
        this.libName = libName;
        return this;
    }
    public String getLibName() {
        return this.libName;
    }

    public ModifyAnswerLibRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
