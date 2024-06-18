// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteIdpDepartmentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10829</p>
     */
    @NameInMap("DepartmentId")
    public String departmentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>507</p>
     */
    @NameInMap("IdpConfigId")
    public String idpConfigId;

    public static DeleteIdpDepartmentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIdpDepartmentRequest self = new DeleteIdpDepartmentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIdpDepartmentRequest setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public String getDepartmentId() {
        return this.departmentId;
    }

    public DeleteIdpDepartmentRequest setIdpConfigId(String idpConfigId) {
        this.idpConfigId = idpConfigId;
        return this;
    }
    public String getIdpConfigId() {
        return this.idpConfigId;
    }

}
