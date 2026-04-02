// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateDatasetRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test dataset</p>
     */
    @NameInMap("description")
    public String description;

    public static UpdateDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasetRequest self = new UpdateDatasetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDatasetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
