// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetTableRequest extends TeaModel {
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
     * <p>true</p>
     */
    @NameInMap("IncludeBusinessMetadata")
    public Boolean includeBusinessMetadata;

    public static GetTableRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableRequest self = new GetTableRequest();
        return TeaModel.build(map, self);
    }

    public GetTableRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetTableRequest setIncludeBusinessMetadata(Boolean includeBusinessMetadata) {
        this.includeBusinessMetadata = includeBusinessMetadata;
        return this;
    }
    public Boolean getIncludeBusinessMetadata() {
        return this.includeBusinessMetadata;
    }

}
