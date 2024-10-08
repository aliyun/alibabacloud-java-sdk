// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ResetScheduledPreloadJobResponseBody extends TeaModel {
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("Domains")
    public String domains;

    @NameInMap("ErrorInfo")
    public String errorInfo;

    @NameInMap("FailedFileOss")
    public String failedFileOss;

    @NameInMap("FileId")
    public String fileId;

    @NameInMap("Id")
    public String id;

    @NameInMap("InsertWay")
    public String insertWay;

    @NameInMap("Name")
    public String name;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SiteId")
    public Long siteId;

    @NameInMap("TaskSubmitted")
    public Integer taskSubmitted;

    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("UrlCount")
    public Integer urlCount;

    @NameInMap("UrlSubmitted")
    public Integer urlSubmitted;

    public static ResetScheduledPreloadJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetScheduledPreloadJobResponseBody self = new ResetScheduledPreloadJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetScheduledPreloadJobResponseBody setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public ResetScheduledPreloadJobResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public ResetScheduledPreloadJobResponseBody setDomains(String domains) {
        this.domains = domains;
        return this;
    }
    public String getDomains() {
        return this.domains;
    }

    public ResetScheduledPreloadJobResponseBody setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }
    public String getErrorInfo() {
        return this.errorInfo;
    }

    public ResetScheduledPreloadJobResponseBody setFailedFileOss(String failedFileOss) {
        this.failedFileOss = failedFileOss;
        return this;
    }
    public String getFailedFileOss() {
        return this.failedFileOss;
    }

    public ResetScheduledPreloadJobResponseBody setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ResetScheduledPreloadJobResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ResetScheduledPreloadJobResponseBody setInsertWay(String insertWay) {
        this.insertWay = insertWay;
        return this;
    }
    public String getInsertWay() {
        return this.insertWay;
    }

    public ResetScheduledPreloadJobResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ResetScheduledPreloadJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetScheduledPreloadJobResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public ResetScheduledPreloadJobResponseBody setTaskSubmitted(Integer taskSubmitted) {
        this.taskSubmitted = taskSubmitted;
        return this;
    }
    public Integer getTaskSubmitted() {
        return this.taskSubmitted;
    }

    public ResetScheduledPreloadJobResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public ResetScheduledPreloadJobResponseBody setUrlCount(Integer urlCount) {
        this.urlCount = urlCount;
        return this;
    }
    public Integer getUrlCount() {
        return this.urlCount;
    }

    public ResetScheduledPreloadJobResponseBody setUrlSubmitted(Integer urlSubmitted) {
        this.urlSubmitted = urlSubmitted;
        return this;
    }
    public Integer getUrlSubmitted() {
        return this.urlSubmitted;
    }

}
