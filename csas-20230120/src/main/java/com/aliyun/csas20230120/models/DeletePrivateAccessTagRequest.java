// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeletePrivateAccessTagRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tag-d3f64e8bdd4a****</p>
     */
    @NameInMap("TagId")
    public String tagId;

    public static DeletePrivateAccessTagRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePrivateAccessTagRequest self = new DeletePrivateAccessTagRequest();
        return TeaModel.build(map, self);
    }

    public DeletePrivateAccessTagRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

}
