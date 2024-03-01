// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeDownloadTaskTypeRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public String currentPage;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public String pageSize;

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
