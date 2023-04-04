// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateFacesSearchingTaskRequest extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("MaxResult")
    public String maxResult;

    @NameInMap("Notification")
    public Notification notification;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Sources")
    public java.util.List<CreateFacesSearchingTaskRequestSources> sources;

    @NameInMap("TopK")
    public Long topK;

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

    public CreateFacesSearchingTaskRequest setMaxResult(String maxResult) {
        this.maxResult = maxResult;
        return this;
    }
    public String getMaxResult() {
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

    public CreateFacesSearchingTaskRequest setTopK(Long topK) {
        this.topK = topK;
        return this;
    }
    public Long getTopK() {
        return this.topK;
    }

    public CreateFacesSearchingTaskRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class CreateFacesSearchingTaskRequestSources extends TeaModel {
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
