// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListCommonLogsShrinkRequest extends TeaModel {
    @NameInMap("ActionName")
    public String actionNameShrink;

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

    public static ListCommonLogsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCommonLogsShrinkRequest self = new ListCommonLogsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListCommonLogsShrinkRequest setActionNameShrink(String actionNameShrink) {
        this.actionNameShrink = actionNameShrink;
        return this;
    }
    public String getActionNameShrink() {
        return this.actionNameShrink;
    }

    public ListCommonLogsShrinkRequest setActionStatus(String actionStatus) {
        this.actionStatus = actionStatus;
        return this;
    }
    public String getActionStatus() {
        return this.actionStatus;
    }

    public ListCommonLogsShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListCommonLogsShrinkRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public ListCommonLogsShrinkRequest setIsReverse(Boolean isReverse) {
        this.isReverse = isReverse;
        return this;
    }
    public Boolean getIsReverse() {
        return this.isReverse;
    }

    public ListCommonLogsShrinkRequest setLogRequestId(String logRequestId) {
        this.logRequestId = logRequestId;
        return this;
    }
    public String getLogRequestId() {
        return this.logRequestId;
    }

    public ListCommonLogsShrinkRequest setLogType(String logType) {
        this.logType = logType;
        return this;
    }
    public String getLogType() {
        return this.logType;
    }

    public ListCommonLogsShrinkRequest setOperatorUid(String operatorUid) {
        this.operatorUid = operatorUid;
        return this;
    }
    public String getOperatorUid() {
        return this.operatorUid;
    }

    public ListCommonLogsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCommonLogsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCommonLogsShrinkRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public ListCommonLogsShrinkRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

}
