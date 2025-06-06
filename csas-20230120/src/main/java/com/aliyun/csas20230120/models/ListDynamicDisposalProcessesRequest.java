// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDynamicDisposalProcessesRequest extends TeaModel {
    /**
     * <p>The page number to display in the paginated query. Range: 1~10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>Terminal device ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E7798391-2554-FE83-E0B7-045DDED629A8</p>
     */
    @NameInMap("DevTag")
    public String devTag;

    /**
     * <p>Disposal action.</p>
     * <ul>
     * <li><strong>ztna_connect</strong>: Prohibit connection to the zero-trust intranet.</li>
     * <li><strong>nac_connect</strong>: Prohibit connection to the office network access.</li>
     * <li><strong>none</strong>: No disposal action.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("DisposalAction")
    public String disposalAction;

    /**
     * <p>Disposal process ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dp-xxxxxxxx</p>
     */
    @NameInMap("DisposalProcessId")
    public String disposalProcessId;

    /**
     * <p>The end time for querying dynamic disposal processes. Format: Unix timestamp (in seconds).</p>
     * 
     * <strong>example:</strong>
     * <p>1743143296</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The number of items per page in the paginated query. Range: 1~1000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>Recovery type.</p>
     * <ul>
     * <li><strong>auto</strong>: Automatic recovery.</li>
     * <li><strong>console</strong>: Console recovery.</li>
     * <li><strong>auth</strong>: Recovery by authentication and reporting.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("RecoveryType")
    public String recoveryType;

    /**
     * <p>The start time for querying dynamic disposal processes. Format: Unix timestamp (in seconds).</p>
     * 
     * <strong>example:</strong>
     * <p>1743143296</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>Disposal status. Values:</p>
     * <ul>
     * <li><strong>disposal</strong>: In the disposal state.</li>
     * <li><strong>finished</strong>: Already automatically recovered.</li>
     * <li><strong>recovery</strong>: Recovered by authentication and reporting or console recovery.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>disposal</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Username.</p>
     * 
     * <strong>example:</strong>
     * <p>xiaoming</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static ListDynamicDisposalProcessesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDynamicDisposalProcessesRequest self = new ListDynamicDisposalProcessesRequest();
        return TeaModel.build(map, self);
    }

    public ListDynamicDisposalProcessesRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListDynamicDisposalProcessesRequest setDevTag(String devTag) {
        this.devTag = devTag;
        return this;
    }
    public String getDevTag() {
        return this.devTag;
    }

    public ListDynamicDisposalProcessesRequest setDisposalAction(String disposalAction) {
        this.disposalAction = disposalAction;
        return this;
    }
    public String getDisposalAction() {
        return this.disposalAction;
    }

    public ListDynamicDisposalProcessesRequest setDisposalProcessId(String disposalProcessId) {
        this.disposalProcessId = disposalProcessId;
        return this;
    }
    public String getDisposalProcessId() {
        return this.disposalProcessId;
    }

    public ListDynamicDisposalProcessesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListDynamicDisposalProcessesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDynamicDisposalProcessesRequest setRecoveryType(String recoveryType) {
        this.recoveryType = recoveryType;
        return this;
    }
    public String getRecoveryType() {
        return this.recoveryType;
    }

    public ListDynamicDisposalProcessesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListDynamicDisposalProcessesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListDynamicDisposalProcessesRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
