// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasaisearchproxy20260424.models;

import com.aliyun.tea.*;

public class OpenDatasetImportDataRequest extends TeaModel {
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
     */
    @NameInMap("records")
    public java.util.List<java.util.Map<String, ?>> records;

    public static OpenDatasetImportDataRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenDatasetImportDataRequest self = new OpenDatasetImportDataRequest();
        return TeaModel.build(map, self);
    }

    public OpenDatasetImportDataRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public OpenDatasetImportDataRequest setRecords(java.util.List<java.util.Map<String, ?>> records) {
        this.records = records;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getRecords() {
        return this.records;
    }

}
