// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryTaskInfoHistoryRequest extends TeaModel {
    /**
     * <p>Start time of the creation date range for the query, expressed as the number of milliseconds since 00:00 UTC on January 1, 1970. Currently supports queries by day only.</p>
     * 
     * <strong>example:</strong>
     * <p>1522080000000</p>
     */
    @NameInMap("BeginCreateTime")
    public Long beginCreateTime;

    /**
     * <p>Cursor for creation date (technical parameter).</p>
     * 
     * <strong>example:</strong>
     * <p>1522080000000</p>
     */
    @NameInMap("CreateTimeCursor")
    public Long createTimeCursor;

    /**
     * <p>End time of the creation date range for the query, expressed as the number of milliseconds since 00:00 UTC on January 1, 1970. Currently supports queries by day only.</p>
     * 
     * <strong>example:</strong>
     * <p>1522080000000</p>
     */
    @NameInMap("EndCreateTime")
    public Long endCreateTime;

    /**
     * <p>Language for API error messages. Valid values:  </p>
     * <ul>
     * <li><strong>zh</strong>: Chinese  </li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * <p>Default value is <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Page size.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Job cursor; pass in the job number from the corresponding page cursor during pagination (technical parameter).</p>
     * 
     * <strong>example:</strong>
     * <p>aa634d3f-927e-4d17-9d2c-test</p>
     */
    @NameInMap("TaskNoCursor")
    public String taskNoCursor;

    /**
     * <p>User IP address, which can be set to <strong>127.0.0.1</strong>.</p>
     * 
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
