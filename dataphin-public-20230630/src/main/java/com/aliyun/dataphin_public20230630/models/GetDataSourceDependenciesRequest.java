// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataSourceDependenciesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1023211</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static GetDataSourceDependenciesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceDependenciesRequest self = new GetDataSourceDependenciesRequest();
        return TeaModel.build(map, self);
    }

    public GetDataSourceDependenciesRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetDataSourceDependenciesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
