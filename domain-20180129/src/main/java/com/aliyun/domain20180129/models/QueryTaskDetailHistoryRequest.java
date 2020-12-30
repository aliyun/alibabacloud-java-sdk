// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryTaskDetailHistoryRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("TaskNo")
    public String taskNo;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DomainNameCursor")
    public String domainNameCursor;

    @NameInMap("TaskStatus")
    public Integer taskStatus;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TaskDetailNoCursor")
    public String taskDetailNoCursor;

    public static QueryTaskDetailHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskDetailHistoryRequest self = new QueryTaskDetailHistoryRequest();
        return TeaModel.build(map, self);
    }

    public QueryTaskDetailHistoryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryTaskDetailHistoryRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public QueryTaskDetailHistoryRequest setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

    public QueryTaskDetailHistoryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryTaskDetailHistoryRequest setDomainNameCursor(String domainNameCursor) {
        this.domainNameCursor = domainNameCursor;
        return this;
    }
    public String getDomainNameCursor() {
        return this.domainNameCursor;
    }

    public QueryTaskDetailHistoryRequest setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    public QueryTaskDetailHistoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTaskDetailHistoryRequest setTaskDetailNoCursor(String taskDetailNoCursor) {
        this.taskDetailNoCursor = taskDetailNoCursor;
        return this;
    }
    public String getTaskDetailNoCursor() {
        return this.taskDetailNoCursor;
    }

}
