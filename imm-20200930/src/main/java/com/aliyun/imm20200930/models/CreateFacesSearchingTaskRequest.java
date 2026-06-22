// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateFacesSearchingTaskRequest extends TeaModel {
    /**
     * <p>The name of the dataset. For more information, see <a href="https://help.aliyun.com/document_detail/478160.html">Create a dataset</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The number of most similar faces to return. Valid values: 0 to 100. Default value: 5.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResult")
    public Long maxResult;

    /**
     * <p>The notification configuration. For more information about the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>.</p>
     */
    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>The name of the project. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>A list of images.</p>
     */
    @NameInMap("Sources")
    public java.util.List<CreateFacesSearchingTaskRequestSources> sources;

    /**
     * <p>Custom user information. This information is returned in the asynchronous notification message to help you associate the message with your system. The maximum length is 2048 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ID&quot;: &quot;testuid&quot;,&quot;Name&quot;: &quot;test-user&quot;,&quot;Avatar&quot;: &quot;<a href="http://test.com/testuid%22%7D">http://test.com/testuid&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static CreateFacesSearchingTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFacesSearchingTaskRequest self = new CreateFacesSearchingTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateFacesSearchingTaskRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public CreateFacesSearchingTaskRequest setMaxResult(Long maxResult) {
        this.maxResult = maxResult;
        return this;
    }
    public Long getMaxResult() {
        return this.maxResult;
    }

    public CreateFacesSearchingTaskRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
    }

    public CreateFacesSearchingTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateFacesSearchingTaskRequest setSources(java.util.List<CreateFacesSearchingTaskRequestSources> sources) {
        this.sources = sources;
        return this;
    }
    public java.util.List<CreateFacesSearchingTaskRequestSources> getSources() {
        return this.sources;
    }

    public CreateFacesSearchingTaskRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class CreateFacesSearchingTaskRequestSources extends TeaModel {
        /**
         * <p>The OSS URI of the image.</p>
         * <p>The OSS URI must follow the format oss\://${Bucket}/${Object}. <code>${Bucket}</code> is the name of the OSS bucket in the same region as the current project. <code>${Object}</code> is the full path of the file, including the file name extension.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object</p>
         */
        @NameInMap("URI")
        public String URI;

        public static CreateFacesSearchingTaskRequestSources build(java.util.Map<String, ?> map) throws Exception {
            CreateFacesSearchingTaskRequestSources self = new CreateFacesSearchingTaskRequestSources();
            return TeaModel.build(map, self);
        }

        public CreateFacesSearchingTaskRequestSources setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

}
