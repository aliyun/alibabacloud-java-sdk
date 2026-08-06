// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateTableBusinessMetadataShrinkRequest extends TeaModel {
    /**
     * <p>The custom attribute values. The key is the custom attribute identifier, and the value contains at most one element. An empty list indicates that the attribute value is deleted. Passing this parameter without Readme prevents the usage description from being cleared. An empty object indicates that custom attributes are not updated.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;biz_owner&quot;:[&quot;张三&quot;]}</p>
     */
    @NameInMap("CustomAttributes")
    public String customAttributesShrink;

    /**
     * <p>The ID of the table. For the format, refer to the response of the ListTables operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-table:::project_name:[schema_name]:table_name</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The usage description. Rich text format is supported.</p>
     * 
     * <strong>example:</strong>
     * <h2>introduction</h2>
     */
    @NameInMap("Readme")
    public String readme;

    public static UpdateTableBusinessMetadataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableBusinessMetadataShrinkRequest self = new UpdateTableBusinessMetadataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTableBusinessMetadataShrinkRequest setCustomAttributesShrink(String customAttributesShrink) {
        this.customAttributesShrink = customAttributesShrink;
        return this;
    }
    public String getCustomAttributesShrink() {
        return this.customAttributesShrink;
    }

    public UpdateTableBusinessMetadataShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateTableBusinessMetadataShrinkRequest setReadme(String readme) {
        this.readme = readme;
        return this;
    }
    public String getReadme() {
        return this.readme;
    }

}
