// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class DeleteDataCheckConfigRequest extends TeaModel {
    /**
     * <p>The configuration ID. You can obtain this ID by calling the GetDataCheckConfig operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("id")
    public Long id;

    public static DeleteDataCheckConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataCheckConfigRequest self = new DeleteDataCheckConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataCheckConfigRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
