// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteSourceLocationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SoftDelete")
    public Boolean softDelete;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySourceLocation</p>
     */
    @NameInMap("SourceLocationName")
    public String sourceLocationName;

    public static DeleteSourceLocationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSourceLocationRequest self = new DeleteSourceLocationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSourceLocationRequest setSoftDelete(Boolean softDelete) {
        this.softDelete = softDelete;
        return this;
    }
    public Boolean getSoftDelete() {
        return this.softDelete;
    }

    public DeleteSourceLocationRequest setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
        return this;
    }
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

}
