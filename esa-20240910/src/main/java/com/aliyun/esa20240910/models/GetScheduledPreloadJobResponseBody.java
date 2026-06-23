// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetScheduledPreloadJobResponseBody extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15685865xxx14622</p>
     */
    @NameInMap("AliUid")
    public String aliUid;

    /**
     * <p>The time when the task was created, in ISO 8601 format (for example, 2024-01-01T00:00:00+Z).</p>
     * 
     * <strong>example:</strong>
     * <p>2024-06-02T02:23:26Z</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    /**
     * <p>The list of domain names for prefetch.</p>
     * 
     * <strong>example:</strong>
     * <p>testurl.com</p>
     */
    @NameInMap("Domains")
    public String domains;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>invalid domain:test.com</p>
     */
    @NameInMap("ErrorInfo")
    public String errorInfo;

    /**
     * <p>The OSS address of the failed file.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxxobject.oss-cn-reginon.aliyuncs.com/9d91_xxxxxxxxxxx_158bb6e0f97c477791209bb46bd599f7">https://xxxobject.oss-cn-reginon.aliyuncs.com/9d91_xxxxxxxxxxx_158bb6e0f97c477791209bb46bd599f7</a></p>
     */
    @NameInMap("FailedFileOss")
    public String failedFileOss;

    /**
     * <p>The ID of the URL list file, used for downloading.</p>
     * 
     * <strong>example:</strong>
     * <p>665d3b48621bccf3fe29e1a7</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>665d3af3621bccf3fe29e1a4</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The URL insertion method.</p>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("InsertWay")
    public String insertWay;

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The site ID.</p>
     * 
     * <strong>example:</strong>
     * <p>190007158391808</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The number of URLs that have been submitted to the system for prefetch.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TaskSubmitted")
    public Integer taskSubmitted;

    /**
     * <p>The task type (refresh or prefetch).</p>
     * 
     * <strong>example:</strong>
     * <p>preload</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The total number of URLs.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("UrlCount")
    public Integer urlCount;

    /**
     * <p>The number of submitted URLs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UrlSubmitted")
    public Integer urlSubmitted;

    public static GetScheduledPreloadJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledPreloadJobResponseBody self = new GetScheduledPreloadJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScheduledPreloadJobResponseBody setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public GetScheduledPreloadJobResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public GetScheduledPreloadJobResponseBody setDomains(String domains) {
        this.domains = domains;
        return this;
    }
    public String getDomains() {
        return this.domains;
    }

    public GetScheduledPreloadJobResponseBody setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }
    public String getErrorInfo() {
        return this.errorInfo;
    }

    public GetScheduledPreloadJobResponseBody setFailedFileOss(String failedFileOss) {
        this.failedFileOss = failedFileOss;
        return this;
    }
    public String getFailedFileOss() {
        return this.failedFileOss;
    }

    public GetScheduledPreloadJobResponseBody setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public GetScheduledPreloadJobResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetScheduledPreloadJobResponseBody setInsertWay(String insertWay) {
        this.insertWay = insertWay;
        return this;
    }
    public String getInsertWay() {
        return this.insertWay;
    }

    public GetScheduledPreloadJobResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetScheduledPreloadJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScheduledPreloadJobResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public GetScheduledPreloadJobResponseBody setTaskSubmitted(Integer taskSubmitted) {
        this.taskSubmitted = taskSubmitted;
        return this;
    }
    public Integer getTaskSubmitted() {
        return this.taskSubmitted;
    }

    public GetScheduledPreloadJobResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public GetScheduledPreloadJobResponseBody setUrlCount(Integer urlCount) {
        this.urlCount = urlCount;
        return this;
    }
    public Integer getUrlCount() {
        return this.urlCount;
    }

    public GetScheduledPreloadJobResponseBody setUrlSubmitted(Integer urlSubmitted) {
        this.urlSubmitted = urlSubmitted;
        return this;
    }
    public Integer getUrlSubmitted() {
        return this.urlSubmitted;
    }

}
