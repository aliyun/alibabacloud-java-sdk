// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStandardLookupTableRequest extends TeaModel {
    /**
     * <p>The lookup table ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Specifies whether to allow a null value to be returned when the lookup table does not exist. If set to false, an exception is thrown. Default value: true.</p>
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

    public static GetStandardLookupTableRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStandardLookupTableRequest self = new GetStandardLookupTableRequest();
        return TeaModel.build(map, self);
    }

    public GetStandardLookupTableRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetStandardLookupTableRequest setNullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }
    public Boolean getNullable() {
        return this.nullable;
    }

    public GetStandardLookupTableRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
