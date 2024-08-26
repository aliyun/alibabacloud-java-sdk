// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryTaskInfoHistoryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1522080000000</p>
     */
    @NameInMap("BeginCreateTime")
    public Long beginCreateTime;

    /**
     * <strong>example:</strong>
     * <p>1522080000000</p>
     */
    @NameInMap("CreateTimeCursor")
    public Long createTimeCursor;

    /**
     * <strong>example:</strong>
     * <p>1522080000000</p>
     */
    @NameInMap("EndCreateTime")
    public Long endCreateTime;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>aa634d3f-927e-4d17-9d2c-test</p>
     */
    @NameInMap("TaskNoCursor")
    public String taskNoCursor;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static QueryTaskInfoHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskInfoHistoryRequest self = new QueryTaskInfoHistoryRequest();
        return TeaModel.build(map, self);
    }

    public QueryTaskInfoHistoryRequest setBeginCreateTime(Long beginCreateTime) {
        this.beginCreateTime = beginCreateTime;
        return this;
    }
    public Long getBeginCreateTime() {
        return this.beginCreateTime;
    }

    public QueryTaskInfoHistoryRequest setCreateTimeCursor(Long createTimeCursor) {
        this.createTimeCursor = createTimeCursor;
        return this;
    }
    public Long getCreateTimeCursor() {
        return this.createTimeCursor;
    }

    public QueryTaskInfoHistoryRequest setEndCreateTime(Long endCreateTime) {
        this.endCreateTime = endCreateTime;
        return this;
    }
    public Long getEndCreateTime() {
        return this.endCreateTime;
    }

    public QueryTaskInfoHistoryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryTaskInfoHistoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTaskInfoHistoryRequest setTaskNoCursor(String taskNoCursor) {
        this.taskNoCursor = taskNoCursor;
        return this;
    }
    public String getTaskNoCursor() {
        return this.taskNoCursor;
    }

    public QueryTaskInfoHistoryRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
