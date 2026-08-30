// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetSaseUserTagRequest extends TeaModel {
    /**
     * <p>The user tag ID. You can obtain this value from the following operations:</p>
     * <ul>
     * <li><a href="~~ListSaseUserTags~~">ListSaseUserTags</a>: Lists user tags.</li>
     * <li><a href="~~CreateSaseUserTag~~">CreateSaseUserTag</a>: Creates a user tag.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>su-tag-1ae52f66039fa0d4****</p>
     */
    @NameInMap("TagId")
    public String tagId;

    public static GetSaseUserTagRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSaseUserTagRequest self = new GetSaseUserTagRequest();
        return TeaModel.build(map, self);
    }

    public GetSaseUserTagRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

}
