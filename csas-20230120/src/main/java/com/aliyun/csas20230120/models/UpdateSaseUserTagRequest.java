// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateSaseUserTagRequest extends TeaModel {
    /**
     * <p>The description of the user tag.</p>
     * 
     * <strong>example:</strong>
     * <p>These are the company\&quot;s employees</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the user tag.</p>
     * 
     * <strong>example:</strong>
     * <p>boss</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the user tag. You can obtain the tag ID from the following operations:</p>
     * <ul>
     * <li><a href="~~ListSaseUserTags~~">ListSaseUserTags</a>: Lists user tags.</li>
     * <li><a href="~~CreateSaseUserTag~~">CreateSaseUserTag</a>: Creates a user tag.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tag-d3f64e8bdd4a****</p>
     */
    @NameInMap("TagId")
    public String tagId;

    public static UpdateSaseUserTagRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSaseUserTagRequest self = new UpdateSaseUserTagRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSaseUserTagRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSaseUserTagRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSaseUserTagRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

}
