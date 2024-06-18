// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateIdpDepartmentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DepartmentName")
    public String departmentName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1222</p>
     */
    @NameInMap("IdpConfigId")
    public String idpConfigId;

    public static CreateIdpDepartmentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIdpDepartmentRequest self = new CreateIdpDepartmentRequest();
        return TeaModel.build(map, self);
    }

    public CreateIdpDepartmentRequest setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
        return this;
    }
    public String getDepartmentName() {
        return this.departmentName;
    }

    public CreateIdpDepartmentRequest setIdpConfigId(String idpConfigId) {
        this.idpConfigId = idpConfigId;
        return this;
    }
    public String getIdpConfigId() {
        return this.idpConfigId;
    }

}
