// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearchengine20260417.models;

import com.aliyun.tea.*;

public class GetDatasetResourceUrlRequest extends TeaModel {
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

    public static GetDatasetResourceUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetResourceUrlRequest self = new GetDatasetResourceUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetDatasetResourceUrlRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public GetDatasetResourceUrlRequest setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }
    public String getPrimaryKey() {
        return this.primaryKey;
    }

}
