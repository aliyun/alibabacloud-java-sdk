// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class DeleteProjectRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform a logical deletion. The default value is true. A value of false indicates a physical deletion.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isLogical")
    public Boolean isLogical;

    public static DeleteProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectRequest self = new DeleteProjectRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProjectRequest setIsLogical(Boolean isLogical) {
        this.isLogical = isLogical;
        return this;
    }
    public Boolean getIsLogical() {
        return this.isLogical;
    }

}
