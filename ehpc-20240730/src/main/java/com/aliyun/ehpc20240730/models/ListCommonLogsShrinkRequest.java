// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListCommonLogsShrinkRequest extends TeaModel {
    /**
     * <p>The action types.</p>
     */
    @NameInMap("ActionName")
    public String actionNameShrink;

    /**
     * <p>The action status. Logs associated with the specific action status are returned.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Finished: The action is completed.</li>
     * <li>Failed: The action failed.</li>
     * <li>InProgress: The action is being performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Finished</p>
     */
    @NameInMap("ActionStatus")
    public String actionStatus;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The start time of the time range. The time is a timestamp. This value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1703821542</p>
     */
    @NameInMap("From")
    public Long from;

    /**
     * <p>Specifies whether to display results in reverse order.</p>
     * <p>Default value: true</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsReverse")
    public Boolean isReverse;

    /**
     * <p>The request ID of the action. Logs associated with the specific request ID are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
     */
    @NameInMap("LogRequestId")
    public String logRequestId;

    /**
     * <p>The log type. Logs of the specific type are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Operation</p>
     */
    @NameInMap("LogType")
    public String logType;

    /**
     * <p>The ID of the user who performed the action.</p>
     * 
     * <strong>example:</strong>
     * <p>137***</p>
     */
    @NameInMap("OperatorUid")
    public String operatorUid;

    /**
     * <p>The page number of the page to return.</p>
     * <p>Pages start from page 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     * <p>Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the resource involved in the action. Logs associated with the specific resource are returned. This parameter is not recommended.</p>
     * 
     * <strong>example:</strong>
     * <p>i-abc***</p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>The end time of the time range. The time is a timestamp. This value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
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
