// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateColumnBusinessMetadataRequest extends TeaModel {
    /**
     * <p>The custom attributes of the column, specified as key-value pairs. The key is the attribute identifier, and the value is an array that can contain at most one element. An empty array deletes the attribute\&quot;s value. To avoid overwriting the column\&quot;s business description, omit the <code>Description</code> parameter from the request. An empty object (<code>{}</code>) indicates that no custom attributes are updated.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;biz_owner&quot;:[&quot;张三&quot;]}</p>
     */
    @NameInMap("CustomAttributes")
    public java.util.Map<String, java.util.List<String>> customAttributes;

    /**
     * <p>The business description of the column.</p>
     * 
     * <strong>example:</strong>
     * <p>test description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the column. You can obtain this ID from the response of the <code>ListColumns</code> operation. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Metadata Entity Concepts</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-column:::project_name:[schema_name]:table_name:column_name</p>
     */
    @NameInMap("Id")
    public String id;

    public static UpdateColumnBusinessMetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateColumnBusinessMetadataRequest self = new UpdateColumnBusinessMetadataRequest();
        return TeaModel.build(map, self);
    }

    public UpdateColumnBusinessMetadataRequest setCustomAttributes(java.util.Map<String, java.util.List<String>> customAttributes) {
        this.customAttributes = customAttributes;
        return this;
    }
    public java.util.Map<String, java.util.List<String>> getCustomAttributes() {
        return this.customAttributes;
    }

    public UpdateColumnBusinessMetadataRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateColumnBusinessMetadataRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
