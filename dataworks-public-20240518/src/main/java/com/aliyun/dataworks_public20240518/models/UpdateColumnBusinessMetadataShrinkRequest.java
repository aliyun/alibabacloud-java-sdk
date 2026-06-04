// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateColumnBusinessMetadataShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;biz_owner&quot;:[&quot;张三&quot;]}</p>
     */
    @NameInMap("CustomAttributes")
    public String customAttributesShrink;

    /**
     * <p>The field business description.</p>
     * 
     * <strong>example:</strong>
     * <p>test description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The field ID. You can refer to the response from the ListColumns operation. You can also refer to the <a href="https://help.aliyun.com/document_detail/2880092.html">Concepts related to metadata entities</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-column:11075xxxx::test_project:test_schema:test_table:test_column</p>
     */
    @NameInMap("Id")
    public String id;

    public static UpdateColumnBusinessMetadataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateColumnBusinessMetadataShrinkRequest self = new UpdateColumnBusinessMetadataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateColumnBusinessMetadataShrinkRequest setCustomAttributesShrink(String customAttributesShrink) {
        this.customAttributesShrink = customAttributesShrink;
        return this;
    }
    public String getCustomAttributesShrink() {
        return this.customAttributesShrink;
    }

    public UpdateColumnBusinessMetadataShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateColumnBusinessMetadataShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
