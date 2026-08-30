// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDomainAccessLogsRequest extends TeaModel {
    /**
     * <p>The action taken upon a rule hit. Exact match is used. Valid values:</p>
     * <ul>
     * <li>Audit: Audit.</li>
     * <li>Observe: Observe only.</li>
     * <li>WhiteList: Allowed by whitelist.</li>
     * <li>Block: Blocked.</li>
     * <li>Redirect: Redirected to a prompt page.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Block</p>
     */
    @NameInMap("BlockAction")
    public String blockAction;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The department. Exact match is used.</p>
     * 
     * <strong>example:</strong>
     * <p>IT department</p>
     */
    @NameInMap("Department")
    public String department;

    /**
     * <p>The end time of the query. This value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1754956800</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The number of entries per page in paging. Valid values: 1 to 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The policy type used to filter results.</p>
     * 
     * <strong>example:</strong>
     * <p>la_domain_white</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>The destination domain name accessed. Exact match is used.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("RemoteHost")
    public String remoteHost;

    /**
     * <p>The start time of the query. This value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1754870400</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The username. Exact match is used.</p>
     * 
     * <strong>example:</strong>
     * <p>zhangsan</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static ListDomainAccessLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDomainAccessLogsRequest self = new ListDomainAccessLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListDomainAccessLogsRequest setBlockAction(String blockAction) {
        this.blockAction = blockAction;
        return this;
    }
    public String getBlockAction() {
        return this.blockAction;
    }

    public ListDomainAccessLogsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDomainAccessLogsRequest setDepartment(String department) {
        this.department = department;
        return this;
    }
    public String getDepartment() {
        return this.department;
    }

    public ListDomainAccessLogsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListDomainAccessLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDomainAccessLogsRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public ListDomainAccessLogsRequest setRemoteHost(String remoteHost) {
        this.remoteHost = remoteHost;
        return this;
    }
    public String getRemoteHost() {
        return this.remoteHost;
    }

    public ListDomainAccessLogsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListDomainAccessLogsRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
