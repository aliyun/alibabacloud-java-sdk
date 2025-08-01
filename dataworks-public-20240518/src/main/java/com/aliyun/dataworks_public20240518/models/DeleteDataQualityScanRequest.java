// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteDataQualityScanRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DeleteDataQualityScanRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataQualityScanRequest self = new DeleteDataQualityScanRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataQualityScanRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DeleteDataQualityScanRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
