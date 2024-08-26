// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryTaskDetailHistoryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainNameCursor")
    public String domainNameCursor;

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
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>75addb07-28a3-450e-b5ec</p>
     */
    @NameInMap("TaskDetailNoCursor")
    public String taskDetailNoCursor;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>75addb07-28a3-450e-b5ec-test</p>
     */
    @NameInMap("TaskNo")
    public String taskNo;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TaskStatus")
    public Integer taskStatus;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static QueryTaskDetailHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskDetailHistoryRequest self = new QueryTaskDetailHistoryRequest();
        return TeaModel.build(map, self);
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

    public QueryTaskDetailHistoryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
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

    public QueryTaskDetailHistoryRequest setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

    public QueryTaskDetailHistoryRequest setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    public QueryTaskDetailHistoryRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
