// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListRemindsRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account that is used to receive alert notifications.</p>
     */
    @NameInMap("AlertTarget")
    public String alertTarget;

    /**
     * <p>The ID of the Alibaba Cloud account that is used to create the custom alert rules.</p>
     */
    @NameInMap("Founder")
    public String founder;

    /**
     * <p>The ID of the node to which the custom alert rules are applied. You can use the ID to search for the custom alert rules that are applied to the node.</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <p>The number of the page to return. Valid values: 1 to 30. Default value: 1.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The conditions that trigger an alert for the node. Valid values: FINISHED, UNFINISHED, ERROR, CYCLE_UNFINISHED, and TIMEOUT. The value FINISHED indicates that the node finishes running. The value UNFINISHED indicates that the node is still running at the specified point in time. The value ERROR indicates that an error occurs when the node is running. The value CYCLE_UNFINISHED indicates that the node does not finish running in the specified scheduling cycle. The value TIMEOUT indicates that the node times out. You can specify multiple conditions for a custom alert rule. If you specify multiple condition, separate them with commas (,).</p>
     */
    @NameInMap("RemindTypes")
    public String remindTypes;

    /**
     * <p>The keyword in a rule name that is used to search for the rule. Fuzzy search is supported.</p>
     */
    @NameInMap("SearchText")
    public String searchText;

    public static ListRemindsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRemindsRequest self = new ListRemindsRequest();
        return TeaModel.build(map, self);
    }

    public ListRemindsRequest setAlertTarget(String alertTarget) {
        this.alertTarget = alertTarget;
        return this;
    }
    public String getAlertTarget() {
        return this.alertTarget;
    }

    public ListRemindsRequest setFounder(String founder) {
        this.founder = founder;
        return this;
    }
    public String getFounder() {
        return this.founder;
    }

    public ListRemindsRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public ListRemindsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRemindsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRemindsRequest setRemindTypes(String remindTypes) {
        this.remindTypes = remindTypes;
        return this;
    }
    public String getRemindTypes() {
        return this.remindTypes;
    }

    public ListRemindsRequest setSearchText(String searchText) {
        this.searchText = searchText;
        return this;
    }
    public String getSearchText() {
        return this.searchText;
    }

}
