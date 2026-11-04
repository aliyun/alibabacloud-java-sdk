// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureSearchJobRequest extends TeaModel {
    /**
     * <p>Instance ID of the image search application instance. You can call the <a href="https://help.aliyun.com/document_detail/206608.html">QueryPictureSearchApps</a> operation to query instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fdc576d03c094faea9fa10fbf48c****</p>
     */
    @NameInMap("AppInstanceId")
    public String appInstanceId;

    /**
     * <p>The page number of the page to return. Pages start from page 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The job status. Valid values:</p>
     * <ul>
     * <li>0: Initialized.</li>
     * <li>1: No data.</li>
     * <li>2: Running.</li>
     * <li>3: Succeeded.</li>
     * <li>4: Failed.</li>
     * </ul>
     * <p>If you do not specify this parameter, jobs in all statuses are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("JobStatus")
    public Integer jobStatus;

    /**
     * <p>The number of entries to return on each page. Minimum value: 1. Maximum value: 50. Default value: 10.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryPictureSearchJobRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureSearchJobRequest self = new QueryPictureSearchJobRequest();
        return TeaModel.build(map, self);
    }

    public QueryPictureSearchJobRequest setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    public QueryPictureSearchJobRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryPictureSearchJobRequest setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public Integer getJobStatus() {
        return this.jobStatus;
    }

    public QueryPictureSearchJobRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
