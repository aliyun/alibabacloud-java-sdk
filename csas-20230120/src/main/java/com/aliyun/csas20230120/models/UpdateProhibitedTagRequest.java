// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateProhibitedTagRequest extends TeaModel {
    /**
     * <p>The description of the prohibited software tag. The description can contain letters, digits, Chinese characters, spaces, periods (.), underscores (_), and hyphens (-), and cannot exceed 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>No description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the prohibited software tag. The name must be 1 to 128 characters in length and can contain letters, digits, Chinese characters, periods (.), underscores (_), and hyphens (-). Spaces are not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Edge</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the custom prohibited software tag. Only custom tags under the current Alibaba Cloud account can be modified. Built-in system tags cannot be modified. You can obtain the value from the following operations:</p>
     * <ul>
     * <li><a href="~~ListProhibitedTags~~">ListProhibitedTags</a>: Lists prohibited software tags.</li>
     * <li><a href="~~CreateProhibitedTag~~">CreateProhibitedTag</a>: Creates a custom prohibited software tag.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tag-996078937c00****</p>
     */
    @NameInMap("TagId")
    public String tagId;

    public static UpdateProhibitedTagRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProhibitedTagRequest self = new UpdateProhibitedTagRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProhibitedTagRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProhibitedTagRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateProhibitedTagRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

}
