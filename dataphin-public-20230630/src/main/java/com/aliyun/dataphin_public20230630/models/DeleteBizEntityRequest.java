// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteBizEntityRequest extends TeaModel {
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
     * <p>101001201</p>
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

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BIZ_OBJECT</p>
     */
    @NameInMap("Type")
    public String type;

    public static DeleteBizEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBizEntityRequest self = new DeleteBizEntityRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBizEntityRequest setBizUnitId(Long bizUnitId) {
        this.bizUnitId = bizUnitId;
        return this;
    }
    public Long getBizUnitId() {
        return this.bizUnitId;
    }

    public DeleteBizEntityRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteBizEntityRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public DeleteBizEntityRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
