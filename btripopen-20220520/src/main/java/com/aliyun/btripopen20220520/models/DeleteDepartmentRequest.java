// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class DeleteDepartmentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dept123</p>
     */
    @NameInMap("out_dept_id")
    public String outDeptId;

    public static DeleteDepartmentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDepartmentRequest self = new DeleteDepartmentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDepartmentRequest setOutDeptId(String outDeptId) {
        this.outDeptId = outDeptId;
        return this;
    }
    public String getOutDeptId() {
        return this.outDeptId;
    }

}
