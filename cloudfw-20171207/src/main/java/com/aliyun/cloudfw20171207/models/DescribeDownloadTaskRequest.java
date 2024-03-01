// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeDownloadTaskRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public String currentPage;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public String pageSize;

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
