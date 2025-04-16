// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDynamicDisposalProcessesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("DevTag")
    public String devTag;

    /**
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("DisposalAction")
    public String disposalAction;

    /**
     * <strong>example:</strong>
     * <p>dp-xxxxxxxx</p>
     */
    @NameInMap("DisposalProcessId")
    public String disposalProcessId;

    /**
     * <strong>example:</strong>
     * <p>1743143296</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("RecoveryType")
    public String recoveryType;

    /**
     * <strong>example:</strong>
     * <p>1743143296</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>disposal</p>
     */
    @NameInMap("Status")
    public String status;

    /**
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
