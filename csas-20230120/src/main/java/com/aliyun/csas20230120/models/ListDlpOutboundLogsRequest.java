// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDlpOutboundLogsRequest extends TeaModel {
    /**
     * <p>The current page number. Pages start from 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end time of the query. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1754956800</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The log ID.</p>
     * 
     * <strong>example:</strong>
     * <p>da817m4mfrcs6xxxx3hg</p>
     */
    @NameInMap("LogId")
    public String logId;

    /**
     * <p>The number of entries per page. Maximum value: 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The policy action. Exact match for a single value is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>block_and_hint</p>
     */
    @NameInMap("PolicyAction")
    public String policyAction;

    /**
     * <p>The original file name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>TestFile</p>
     */
    @NameInMap("SrcFileName")
    public String srcFileName;

    /**
     * <p>The start time of the query. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1754870400</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The secondary channel ID. Format: primary channel ID.secondary channel ID. Multiple values are separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p>3.1,3.2</p>
     */
    @NameInMap("SubChannelType")
    public String subChannelType;

    /**
     * <p>The username. Exact match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>zhangsan</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static ListDlpOutboundLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDlpOutboundLogsRequest self = new ListDlpOutboundLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListDlpOutboundLogsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDlpOutboundLogsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListDlpOutboundLogsRequest setLogId(String logId) {
        this.logId = logId;
        return this;
    }
    public String getLogId() {
        return this.logId;
    }

    public ListDlpOutboundLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDlpOutboundLogsRequest setPolicyAction(String policyAction) {
        this.policyAction = policyAction;
        return this;
    }
    public String getPolicyAction() {
        return this.policyAction;
    }

    public ListDlpOutboundLogsRequest setSrcFileName(String srcFileName) {
        this.srcFileName = srcFileName;
        return this;
    }
    public String getSrcFileName() {
        return this.srcFileName;
    }

    public ListDlpOutboundLogsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListDlpOutboundLogsRequest setSubChannelType(String subChannelType) {
        this.subChannelType = subChannelType;
        return this;
    }
    public String getSubChannelType() {
        return this.subChannelType;
    }

    public ListDlpOutboundLogsRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
