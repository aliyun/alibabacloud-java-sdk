// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateLocationDateClusterRequest extends TeaModel {
    /**
     * <p>The custom ID of the cluster. When the cluster is indexed into the dataset, the custom ID is stored as the data attribute. You can map the custom ID to other data in your business system. For example, you can pass the custom ID to map a URI to an ID. We recommend that you specify a globally unique value. The value can be up to 1,024 bytes in size.</p>
     * 
     * <strong>example:</strong>
     * <p>member-id-0001</p>
     */
    @NameInMap("CustomId")
    public String customId;

    /**
     * <p>The custom labels. The parameter stores custom key-value labels, which can be used to filter data. You can specify up to 100 custom labels for a cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;UserScore&quot;: &quot;5&quot;
     * }</p>
     */
    @NameInMap("CustomLabels")
    public java.util.Map<String, ?> customLabels;

    /**
     * <p>The name of the dataset.<a href="~~478160~~"></a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The ID of the cluster that you want to update.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>location-date-cluster-71dd4f32-9597-4085-a2ab-3a7b0fd0aff9</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The name of the project.<a href="~~478153~~"></a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The name of the cluster. The name can be used to search for the cluster. The value can be up to 1,024 bytes in size.</p>
     */
    @NameInMap("Title")
    public String title;

    public static UpdateLocationDateClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLocationDateClusterRequest self = new UpdateLocationDateClusterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLocationDateClusterRequest setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public UpdateLocationDateClusterRequest setCustomLabels(java.util.Map<String, ?> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.Map<String, ?> getCustomLabels() {
        return this.customLabels;
    }

    public UpdateLocationDateClusterRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public UpdateLocationDateClusterRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public UpdateLocationDateClusterRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public UpdateLocationDateClusterRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
