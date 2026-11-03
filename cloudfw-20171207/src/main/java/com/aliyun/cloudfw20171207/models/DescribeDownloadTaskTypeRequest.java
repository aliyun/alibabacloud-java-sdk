// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeDownloadTaskTypeRequest extends TeaModel {
    /**
     * <p>The page number of the page to return in a paged query.
     * Default value: <strong>1</strong>, which indicates the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The language in which messages are received. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries to return on each page in a paged query. Default value: 10. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The task type.</p>
     * 
     * <strong>example:</strong>
     * <p>InternetFirewallAsset</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DescribeDownloadTaskTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadTaskTypeRequest self = new DescribeDownloadTaskTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadTaskTypeRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDownloadTaskTypeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDownloadTaskTypeRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeDownloadTaskTypeRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
