// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateIdpDepartmentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10653</p>
     */
    @NameInMap("DepartmentId")
    public String departmentId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DepartmentName")
    public String departmentName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>598</p>
     */
    @NameInMap("IdpConfigId")
    public String idpConfigId;

    public static UpdateIdpDepartmentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIdpDepartmentRequest self = new UpdateIdpDepartmentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIdpDepartmentRequest setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public String getDepartmentId() {
        return this.departmentId;
    }

    public UpdateIdpDepartmentRequest setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
        return this;
    }
    public String getDepartmentName() {
        return this.departmentName;
    }

    public UpdateIdpDepartmentRequest setIdpConfigId(String idpConfigId) {
        this.idpConfigId = idpConfigId;
        return this;
    }
    public String getIdpConfigId() {
        return this.idpConfigId;
    }

}
