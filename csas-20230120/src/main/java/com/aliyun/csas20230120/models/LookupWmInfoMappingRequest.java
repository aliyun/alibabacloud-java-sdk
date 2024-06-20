// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class LookupWmInfoMappingRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("WmInfoSize")
    public Long wmInfoSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123***</p>
     */
    @NameInMap("WmInfoUint")
    public String wmInfoUint;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PureDocument</p>
     */
    @NameInMap("WmType")
    public String wmType;

    public static LookupWmInfoMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        LookupWmInfoMappingRequest self = new LookupWmInfoMappingRequest();
        return TeaModel.build(map, self);
    }

    public LookupWmInfoMappingRequest setWmInfoSize(Long wmInfoSize) {
        this.wmInfoSize = wmInfoSize;
        return this;
    }
    public Long getWmInfoSize() {
        return this.wmInfoSize;
    }

    public LookupWmInfoMappingRequest setWmInfoUint(String wmInfoUint) {
        this.wmInfoUint = wmInfoUint;
        return this;
    }
    public String getWmInfoUint() {
        return this.wmInfoUint;
    }

    public LookupWmInfoMappingRequest setWmType(String wmType) {
        this.wmType = wmType;
        return this;
    }
    public String getWmType() {
        return this.wmType;
    }

}
