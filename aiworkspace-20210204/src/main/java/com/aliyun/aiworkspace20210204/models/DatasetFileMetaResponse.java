// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DatasetFileMetaResponse extends TeaModel {
    /**
     * <p>The metadata ID of the dataset file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>07914c9534586e4e7aa6e9dbca5009082df*******8a0d857b33296c59bf6</p>
     */
    @NameInMap("DatasetFileMetaId")
    public String datasetFileMetaId;

    /**
     * <p>The description of the reason why the metadata operation failed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Not Found</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <p>The file URI.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://l*****-test/dataset/1653421.jpg</p>
     */
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
