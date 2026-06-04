// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateTableBusinessMetadataShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;biz_owner&quot;:[&quot;张三&quot;]}</p>
     */
    @NameInMap("CustomAttributes")
    public String customAttributesShrink;

    /**
     * <p>The table ID. You can refer to the format of the table ID returned by the ListTables operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-table:123456XXX::test_project::test_tbl
     * dlf-table:123456XXX:test_catalog:test_db::test_tbl
     * hms-table:c-abc123xxx::test_db::test_tbl
     * holo-table:h-abc123xxx::test_db:test_schema:test_tbl</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The usage notes. The rich text format is supported.</p>
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
