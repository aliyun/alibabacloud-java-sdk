// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeletePrivateAccessTagRequest extends TeaModel {
    /**
     * <p>The ID of the internal access tag. You can obtain the value from the following operations:</p>
     * <ul>
     * <li><a href="~~ListPrivateAccessTags~~">ListPrivateAccessTags</a>: Lists internal access tags.</li>
     * <li><a href="~~CreatePrivateAccessTag~~">CreatePrivateAccessTag</a>: Creates an internal access tag.</li>
     * </ul>
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
