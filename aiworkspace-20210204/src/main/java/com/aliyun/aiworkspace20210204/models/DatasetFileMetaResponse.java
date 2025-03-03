// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DatasetFileMetaResponse extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetFileMetaId")
    public String datasetFileMetaId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Result")
    public String result;

    @NameInMap("Uri")
    public String uri;

    public static DatasetFileMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        DatasetFileMetaResponse self = new DatasetFileMetaResponse();
        return TeaModel.build(map, self);
    }

    public DatasetFileMetaResponse setDatasetFileMetaId(String datasetFileMetaId) {
        this.datasetFileMetaId = datasetFileMetaId;
        return this;
    }
    public String getDatasetFileMetaId() {
        return this.datasetFileMetaId;
    }

    public DatasetFileMetaResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public DatasetFileMetaResponse setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
