// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateIdpDepartmentRequest extends TeaModel {
    /**
     * <p>The department name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例部门</p>
     */
    @NameInMap("DepartmentName")
    public String departmentName;

    /**
     * <p>The ID of the custom identity source configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idp-cfg68956d86e********</p>
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
