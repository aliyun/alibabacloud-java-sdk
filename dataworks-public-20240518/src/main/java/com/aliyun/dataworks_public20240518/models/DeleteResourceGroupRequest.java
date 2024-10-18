// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteResourceGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Serverless_res_group_524257424564736_6831777003XXXXX</p>
     */
    @NameInMap("Id")
    public String id;

    public static DeleteResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceGroupRequest self = new DeleteResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResourceGroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
