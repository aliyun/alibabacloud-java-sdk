// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryTaskDetailListRequest extends TeaModel {
    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The domain name instance ID.</p>
     * <blockquote>
     * <p>You can call &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/442021.html">QueryDomainByDomainName</a>&lt;props=&quot;intl&quot;&gt;<a href="https://help.aliyun.com/document_detail/121704.html">QueryDomainByDomainName</a> to query the domain name instance ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>S20179H1BBI9test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the error message returned by the operation. Valid values:</p>
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
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Maximum value: <strong>1000</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The task number. This is the TaskNo value returned by a successfully executed task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>75addb07-28a3-450e-b5ec-test</p>
     */
    @NameInMap("TaskNo")
    public String taskNo;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Waiting to be executed.</li>
     * <li><strong>1</strong>: Executing.</li>
     * <li><strong>2</strong>: Successful.</li>
     * <li><strong>3</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TaskStatus")
    public Integer taskStatus;

    /**
     * <p>The user IP address. You can set this parameter to <strong>127.0.0.1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.0</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static QueryTaskDetailListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskDetailListRequest self = new QueryTaskDetailListRequest();
        return TeaModel.build(map, self);
    }

    public QueryTaskDetailListRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryTaskDetailListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTaskDetailListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryTaskDetailListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryTaskDetailListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTaskDetailListRequest setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

    public QueryTaskDetailListRequest setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    public QueryTaskDetailListRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
