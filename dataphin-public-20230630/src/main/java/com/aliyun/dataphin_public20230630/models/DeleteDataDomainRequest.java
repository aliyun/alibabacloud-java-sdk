// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteDataDomainRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6798087749072704</p>
     */
    @NameInMap("BizUnitId")
    public Long bizUnitId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1241844456</p>
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

    public static DeleteDataDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataDomainRequest self = new DeleteDataDomainRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataDomainRequest setBizUnitId(Long bizUnitId) {
        this.bizUnitId = bizUnitId;
        return this;
    }
    public Long getBizUnitId() {
        return this.bizUnitId;
    }

    public DeleteDataDomainRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteDataDomainRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
