// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryTaskDetailHistoryRequest extends TeaModel {
    /**
     * <p>Domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Domain name cursor.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainNameCursor")
    public String domainNameCursor;

    /**
     * <p>Language of error messages returned by the API. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
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
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Task detail cursor.</p>
     * 
     * <strong>example:</strong>
     * <p>75addb07-28a3-450e-b5ec</p>
     */
    @NameInMap("TaskDetailNoCursor")
    public String taskDetailNoCursor;

    /**
     * <p>Job number.</p>
     * <blockquote>
     * <p>You can obtain the job number by calling the <a href="https://help.aliyun.com/document_detail/67709.html">QueryTaskList</a> API.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>75addb07-28a3-450e-b5ec-test</p>
     */
    @NameInMap("TaskNo")
    public String taskNo;

    /**
     * <p>Job status. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Waiting to execute.</li>
     * <li><strong>1</strong>: Executing.</li>
     * <li><strong>2</strong>: Succeeded.</li>
     * <li><strong>3</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TaskStatus")
    public Integer taskStatus;

    /**
     * <p>User IP address.</p>
     * 
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
