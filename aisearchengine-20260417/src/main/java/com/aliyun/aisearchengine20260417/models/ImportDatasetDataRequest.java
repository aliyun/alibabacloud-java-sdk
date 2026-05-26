// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearchengine20260417.models;

import com.aliyun.tea.*;

public class ImportDatasetDataRequest extends TeaModel {
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

    public static ImportDatasetDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportDatasetDataRequest self = new ImportDatasetDataRequest();
        return TeaModel.build(map, self);
    }

    public ImportDatasetDataRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public ImportDatasetDataRequest setRecords(java.util.List<java.util.Map<String, ?>> records) {
        this.records = records;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getRecords() {
        return this.records;
    }

}
