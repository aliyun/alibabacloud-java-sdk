// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearchengine20260417.models;

import com.aliyun.tea.*;

public class ImportDatasetDataRequest extends TeaModel {
    /**
     * <p>The dataset ID. You can view this ID in the dataset list in the console.</p>
     * 
     * <strong>example:</strong>
     * <p>730</p>
     */
    @NameInMap("datasetId")
    public String datasetId;

    /**
     * <p>The list of data records to add or update. A maximum of 100 records can be included in a single batch operation.</p>
     * <p>Note: The records must strictly follow the schema configured for the target dataset in the console. The add or update logic depends on the primary key type of the target dataset. For detailed example requests, see the Request Description section below.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("records")
    public java.util.List<java.util.Map<String, ?>> records;

    public static ImportDatasetDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportDatasetDataRequest self = new ImportDatasetDataRequest();
        return TeaModel.build(map, self);
    }

    public ImportDatasetDataRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
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
