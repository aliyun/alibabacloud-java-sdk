// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteDIJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11126</p>
     */
    @NameInMap("DIJobId")
    public Long DIJobId;

    public static DeleteDIJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDIJobRequest self = new DeleteDIJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDIJobRequest setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

}
