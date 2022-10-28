// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DatasetItemVO extends TeaModel {
    @NameInMap("AsyncTaskList")
    public java.util.List<AsyncTaskVO> asyncTaskList;

    @NameInMap("DatasetStatus")
    public Integer datasetStatus;

    @NameInMap("DatasetType")
    public Integer datasetType;

    @NameInMap("FileSystem")
    public String fileSystem;

    @NameInMap("Id")
    public String id;

    @NameInMap("KeyName")
    public String keyName;

    @NameInMap("MoreInfo")
    public String moreInfo;

    @NameInMap("Path")
    public String path;

    @NameInMap("ProjectsLinked")
    public java.util.List<ProjectDetailsLiteVO> projectsLinked;

    @NameInMap("RecentTaskStatus")
    public Integer recentTaskStatus;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("Schema")
    public String schema;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("Url")
    public String url;

    public static DatasetItemVO build(java.util.Map<String, ?> map) throws Exception {
        DatasetItemVO self = new DatasetItemVO();
        return TeaModel.build(map, self);
    }

    public DatasetItemVO setAsyncTaskList(java.util.List<AsyncTaskVO> asyncTaskList) {
        this.asyncTaskList = asyncTaskList;
        return this;
    }
    public java.util.List<AsyncTaskVO> getAsyncTaskList() {
        return this.asyncTaskList;
    }

    public DatasetItemVO setDatasetStatus(Integer datasetStatus) {
        this.datasetStatus = datasetStatus;
        return this;
    }
    public Integer getDatasetStatus() {
        return this.datasetStatus;
    }

    public DatasetItemVO setDatasetType(Integer datasetType) {
        this.datasetType = datasetType;
        return this;
    }
    public Integer getDatasetType() {
        return this.datasetType;
    }

    public DatasetItemVO setFileSystem(String fileSystem) {
        this.fileSystem = fileSystem;
        return this;
    }
    public String getFileSystem() {
        return this.fileSystem;
    }

    public DatasetItemVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DatasetItemVO setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    public String getKeyName() {
        return this.keyName;
    }

    public DatasetItemVO setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
        return this;
    }
    public String getMoreInfo() {
        return this.moreInfo;
    }

    public DatasetItemVO setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public DatasetItemVO setProjectsLinked(java.util.List<ProjectDetailsLiteVO> projectsLinked) {
        this.projectsLinked = projectsLinked;
        return this;
    }
    public java.util.List<ProjectDetailsLiteVO> getProjectsLinked() {
        return this.projectsLinked;
    }

    public DatasetItemVO setRecentTaskStatus(Integer recentTaskStatus) {
        this.recentTaskStatus = recentTaskStatus;
        return this;
    }
    public Integer getRecentTaskStatus() {
        return this.recentTaskStatus;
    }

    public DatasetItemVO setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DatasetItemVO setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public DatasetItemVO setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public DatasetItemVO setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
