// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryTaskInfoHistoryRequest extends TeaModel {
    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("BeginCreateTime")
    public Long beginCreateTime;

    @NameInMap("EndCreateTime")
    public Long endCreateTime;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CreateTimeCursor")
    public Long createTimeCursor;

    @NameInMap("TaskNoCursor")
    public String taskNoCursor;

    public static QueryTaskInfoHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskInfoHistoryRequest self = new QueryTaskInfoHistoryRequest();
        return TeaModel.build(map, self);
    }

    public QueryTaskInfoHistoryRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public QueryTaskInfoHistoryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryTaskInfoHistoryRequest setBeginCreateTime(Long beginCreateTime) {
        this.beginCreateTime = beginCreateTime;
        return this;
    }
    public Long getBeginCreateTime() {
        return this.beginCreateTime;
    }

    public QueryTaskInfoHistoryRequest setEndCreateTime(Long endCreateTime) {
        this.endCreateTime = endCreateTime;
        return this;
    }
    public Long getEndCreateTime() {
        return this.endCreateTime;
    }

    public QueryTaskInfoHistoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTaskInfoHistoryRequest setCreateTimeCursor(Long createTimeCursor) {
        this.createTimeCursor = createTimeCursor;
        return this;
    }
    public Long getCreateTimeCursor() {
        return this.createTimeCursor;
    }

    public QueryTaskInfoHistoryRequest setTaskNoCursor(String taskNoCursor) {
        this.taskNoCursor = taskNoCursor;
        return this;
    }
    public String getTaskNoCursor() {
        return this.taskNoCursor;
    }

}
