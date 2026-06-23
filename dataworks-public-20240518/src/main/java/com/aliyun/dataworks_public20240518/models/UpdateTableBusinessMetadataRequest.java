// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateTableBusinessMetadataRequest extends TeaModel {
    /**
     * <p>The values of custom attributes. The key specifies the identifier of a custom attribute, and the value is an array that can contain at most one item. To delete the value for an attribute, pass an empty array. To update only custom attributes, omit the <code>Readme</code> parameter to prevent its existing value from being cleared. To leave the custom attributes unchanged, pass an empty object <code>{}</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;biz_owner&quot;:[&quot;张三&quot;]}</p>
     */
    @NameInMap("CustomAttributes")
    public java.util.Map<String, java.util.List<String>> customAttributes;

    /**
     * <p>The table ID. For the required format, see the response of the <code>ListTables</code> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-table:::project_name:[schema_name]:table_name</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The Readme of the table, which supports rich text format.</p>
     * 
     * <strong>example:</strong>
     * <h2>introduction</h2>
     */
    @NameInMap("Readme")
    public String readme;

    public static UpdateTableBusinessMetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableBusinessMetadataRequest self = new UpdateTableBusinessMetadataRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTableBusinessMetadataRequest setCustomAttributes(java.util.Map<String, java.util.List<String>> customAttributes) {
        this.customAttributes = customAttributes;
        return this;
    }
    public java.util.Map<String, java.util.List<String>> getCustomAttributes() {
        return this.customAttributes;
    }

    public UpdateTableBusinessMetadataRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateTableBusinessMetadataRequest setReadme(String readme) {
        this.readme = readme;
        return this;
    }
    public String getReadme() {
        return this.readme;
    }

}
