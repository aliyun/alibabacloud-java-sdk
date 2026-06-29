// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStandardWordRootRequest extends TeaModel {
    /**
     * <p>The name of the word root.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>平均值</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether to allow a null value to be returned when the word root does not exist. If set to false, an exception is thrown. Default value: true.</p>
     */
    @NameInMap("Nullable")
    public Boolean nullable;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static GetStandardWordRootRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStandardWordRootRequest self = new GetStandardWordRootRequest();
        return TeaModel.build(map, self);
    }

    public GetStandardWordRootRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetStandardWordRootRequest setNullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }
    public Boolean getNullable() {
        return this.nullable;
    }

    public GetStandardWordRootRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
