// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasaisearchproxy20260424.models;

import com.aliyun.tea.*;

public class OpenDatasetResourceUrlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>730</p>
     */
    @NameInMap("datasetId")
    public Long datasetId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>01KQCJBPM9JVDTXWV50G2AKXXX</p>
     */
    @NameInMap("primaryKey")
    public String primaryKey;

    public static OpenDatasetResourceUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenDatasetResourceUrlRequest self = new OpenDatasetResourceUrlRequest();
        return TeaModel.build(map, self);
    }

    public OpenDatasetResourceUrlRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public OpenDatasetResourceUrlRequest setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }
    public String getPrimaryKey() {
        return this.primaryKey;
    }

}
