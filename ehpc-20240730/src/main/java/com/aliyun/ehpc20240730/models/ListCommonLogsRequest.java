// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListCommonLogsRequest extends TeaModel {
    @NameInMap("ActionName")
    public java.util.List<String> actionName;

    /**
     * <strong>example:</strong>
     * <p>Finished</p>
     */
    @NameInMap("ActionStatus")
    public String actionStatus;

    /**
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1703821542</p>
     */
    @NameInMap("From")
    public Long from;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsReverse")
    public Boolean isReverse;

    /**
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
     */
    @NameInMap("LogRequestId")
    public String logRequestId;

    /**
     * <strong>example:</strong>
     * <p>Operation</p>
     */
    @NameInMap("LogType")
    public String logType;

    /**
     * <strong>example:</strong>
     * <p>137***</p>
     */
    @NameInMap("OperatorUid")
    public String operatorUid;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>i-abc***</p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1703821666</p>
     */
    @NameInMap("To")
    public Long to;

    public static ListCommonLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCommonLogsRequest self = new ListCommonLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListCommonLogsRequest setActionName(java.util.List<String> actionName) {
        this.actionName = actionName;
        return this;
    }
    public java.util.List<String> getActionName() {
        return this.actionName;
    }

    public ListCommonLogsRequest setActionStatus(String actionStatus) {
        this.actionStatus = actionStatus;
        return this;
    }
    public String getActionStatus() {
        return this.actionStatus;
    }

    public ListCommonLogsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListCommonLogsRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public ListCommonLogsRequest setIsReverse(Boolean isReverse) {
        this.isReverse = isReverse;
        return this;
    }
    public Boolean getIsReverse() {
        return this.isReverse;
    }

    public ListCommonLogsRequest setLogRequestId(String logRequestId) {
        this.logRequestId = logRequestId;
        return this;
    }
    public String getLogRequestId() {
        return this.logRequestId;
    }

    public ListCommonLogsRequest setLogType(String logType) {
        this.logType = logType;
        return this;
    }
    public String getLogType() {
        return this.logType;
    }

    public ListCommonLogsRequest setOperatorUid(String operatorUid) {
        this.operatorUid = operatorUid;
        return this;
    }
    public String getOperatorUid() {
        return this.operatorUid;
    }

    public ListCommonLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCommonLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCommonLogsRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public ListCommonLogsRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

}
