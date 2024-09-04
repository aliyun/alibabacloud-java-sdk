// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ReferenceFile extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <strong>example:</strong>
     * <p>75d5de2c50754e3dadd5c35dbca5f9949369e37eb342a73821f690c94c36c7f7</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object.jpg</p>
     */
    @NameInMap("URI")
    public String URI;

    public static ReferenceFile build(java.util.Map<String, ?> map) throws Exception {
        ReferenceFile self = new ReferenceFile();
        return TeaModel.build(map, self);
    }

    public ReferenceFile setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public ReferenceFile setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public ReferenceFile setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ReferenceFile setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

}
