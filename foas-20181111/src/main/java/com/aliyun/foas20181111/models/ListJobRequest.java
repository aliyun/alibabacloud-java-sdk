// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListJobRequest extends TeaModel {
    @NameInMap("apiType")
    public String apiType;

    @NameInMap("clusterId")
    public String clusterId;

    @NameInMap("engineVersion")
    public String engineVersion;

    @NameInMap("folderId")
    public Long folderId;

    @NameInMap("isShowFullField")
    public Boolean isShowFullField;

    @NameInMap("jobName")
    public String jobName;

    @NameInMap("jobType")
    public String jobType;

    @NameInMap("pageIndex")
    public Integer pageIndex;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("queueName")
    public String queueName;

    public static ListJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobRequest self = new ListJobRequest();
        return TeaModel.build(map, self);
    }

    public ListJobRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public ListJobRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListJobRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public ListJobRequest setFolderId(Long folderId) {
        this.folderId = folderId;
        return this;
    }
    public Long getFolderId() {
        return this.folderId;
    }

    public ListJobRequest setIsShowFullField(Boolean isShowFullField) {
        this.isShowFullField = isShowFullField;
        return this;
    }
    public Boolean getIsShowFullField() {
        return this.isShowFullField;
    }

    public ListJobRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public ListJobRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public ListJobRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListJobRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

}
