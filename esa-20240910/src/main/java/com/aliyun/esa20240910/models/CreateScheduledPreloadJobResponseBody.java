// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateScheduledPreloadJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>15685865xxx14622</p>
     */
    @NameInMap("AliUid")
    public String aliUid;

    /**
     * <p>The time when the task was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-05T10:04:20+0800</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    /**
     * <p>The domain names to be prefetched.</p>
     * 
     * <strong>example:</strong>
     * <p>testurl.com</p>
     */
    @NameInMap("Domains")
    public String domains;

    /**
     * <p>The error message. Multiple error messages are separated by commas (,). Valid values:</p>
     * <ul>
     * <li><strong>InvalidUrl</strong>: The URL format is invalid.</li>
     * <li><strong>InvalidDomain</strong>: The domain name fails the domain ownership verification.</li>
     * <li><strong>QuotaExcess</strong>: the quota limit has been reached.</li>
     * <li><strong>OtherErrors</strong>: other errors.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InvalidDomain</p>
     */
    @NameInMap("ErrorInfo")
    public String errorInfo;

    /**
     * <p>The URL of the OSS object that stores a list of URLs that failed the conditional check for prefetching.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxxobject.oss-cn-reginon.aliyuncs.com/9d91_xxxxxxxxxxx_158bb6e0f97c477791209bb46bd599f7">https://xxxobject.oss-cn-reginon.aliyuncs.com/9d91_xxxxxxxxxxx_158bb6e0f97c477791209bb46bd599f7</a></p>
     */
    @NameInMap("FailedFileOss")
    public String failedFileOss;

    /**
     * <p>The ID of the URL list file, which can be used during downloads.</p>
     * 
     * <strong>example:</strong>
     * <p>665d3b48621bccf3fe29e1a7</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The ID of the scheduled prefetch task.</p>
     * 
     * <strong>example:</strong>
     * <p>665d3af3621bccf3fe29e1a4</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The method to submit the URLs to be prefetched.</p>
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
     * <p>15C66C7B-671A-4297-9187-2C4477247B78</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The website ID.</p>
     * 
     * <strong>example:</strong>
     * <p>190007158391808</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The number of submitted prefetch tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TaskSubmitted")
    public Integer taskSubmitted;

    /**
     * <p>The task type (refresh or preload).</p>
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

    public static CreateScheduledPreloadJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduledPreloadJobResponseBody self = new CreateScheduledPreloadJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScheduledPreloadJobResponseBody setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public CreateScheduledPreloadJobResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateScheduledPreloadJobResponseBody setDomains(String domains) {
        this.domains = domains;
        return this;
    }
    public String getDomains() {
        return this.domains;
    }

    public CreateScheduledPreloadJobResponseBody setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }
    public String getErrorInfo() {
        return this.errorInfo;
    }

    public CreateScheduledPreloadJobResponseBody setFailedFileOss(String failedFileOss) {
        this.failedFileOss = failedFileOss;
        return this;
    }
    public String getFailedFileOss() {
        return this.failedFileOss;
    }

    public CreateScheduledPreloadJobResponseBody setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CreateScheduledPreloadJobResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateScheduledPreloadJobResponseBody setInsertWay(String insertWay) {
        this.insertWay = insertWay;
        return this;
    }
    public String getInsertWay() {
        return this.insertWay;
    }

    public CreateScheduledPreloadJobResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateScheduledPreloadJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScheduledPreloadJobResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateScheduledPreloadJobResponseBody setTaskSubmitted(Integer taskSubmitted) {
        this.taskSubmitted = taskSubmitted;
        return this;
    }
    public Integer getTaskSubmitted() {
        return this.taskSubmitted;
    }

    public CreateScheduledPreloadJobResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public CreateScheduledPreloadJobResponseBody setUrlCount(Integer urlCount) {
        this.urlCount = urlCount;
        return this;
    }
    public Integer getUrlCount() {
        return this.urlCount;
    }

    public CreateScheduledPreloadJobResponseBody setUrlSubmitted(Integer urlSubmitted) {
        this.urlSubmitted = urlSubmitted;
        return this;
    }
    public Integer getUrlSubmitted() {
        return this.urlSubmitted;
    }

}
