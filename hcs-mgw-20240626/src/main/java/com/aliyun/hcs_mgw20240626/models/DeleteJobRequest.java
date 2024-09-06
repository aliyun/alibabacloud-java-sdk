// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class DeleteJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("forceDelete")
    public Boolean forceDelete;

    public static DeleteJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobRequest self = new DeleteJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteJobRequest setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
        return this;
    }
    public Boolean getForceDelete() {
        return this.forceDelete;
    }

}
