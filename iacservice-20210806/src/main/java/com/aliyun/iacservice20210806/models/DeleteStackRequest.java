// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteStackRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("cleanResources")
    public Boolean cleanResources;

    public static DeleteStackRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStackRequest self = new DeleteStackRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStackRequest setCleanResources(Boolean cleanResources) {
        this.cleanResources = cleanResources;
        return this;
    }
    public Boolean getCleanResources() {
        return this.cleanResources;
    }

}
