// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeDownloadTaskRequest extends TeaModel {
    /**
     * <p>The Settings for the page number of the current page when paging in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>When paging, specifies the maximum number of entries to display on each page for a paged query. Default value: 10. Settings: The maximum value is 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The task type. For valid values, see the API operation for querying file download task types. If you do not specify this parameter, all files are queried by default.</p>
     * 
     * <strong>example:</strong>
     * <p>InternetFirewallAsset</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DescribeDownloadTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadTaskRequest self = new DescribeDownloadTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadTaskRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDownloadTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDownloadTaskRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeDownloadTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
