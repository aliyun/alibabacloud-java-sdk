// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateTableBusinessMetadataRequest extends TeaModel {
    /**
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
     * <strong>example:</strong>
     * <h2>introduction</h2>
     */
    @NameInMap("Readme")
    public String readme;

    public static UpdateTableBusinessMetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableBusinessMetadataRequest self = new UpdateTableBusinessMetadataRequest();
        return TeaModel.build(map, self);
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
