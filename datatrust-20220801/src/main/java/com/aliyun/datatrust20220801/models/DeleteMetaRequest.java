// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class DeleteMetaRequest extends TeaModel {
    @NameInMap("LsccTableId")
    public Long lsccTableId;

    public static DeleteMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetaRequest self = new DeleteMetaRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMetaRequest setLsccTableId(Long lsccTableId) {
        this.lsccTableId = lsccTableId;
        return this;
    }
    public Long getLsccTableId() {
        return this.lsccTableId;
    }

}
