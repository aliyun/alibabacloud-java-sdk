// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateColumnBusinessMetadataRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-column:11075xxxx::test_project:test_schema:test_table:test_column</p>
     */
    @NameInMap("Id")
    public String id;

    public static UpdateColumnBusinessMetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateColumnBusinessMetadataRequest self = new UpdateColumnBusinessMetadataRequest();
        return TeaModel.build(map, self);
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
