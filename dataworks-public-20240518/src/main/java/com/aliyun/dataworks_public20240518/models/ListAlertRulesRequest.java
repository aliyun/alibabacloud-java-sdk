// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListAlertRulesRequest extends TeaModel {
    /**
     * <p>The name of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>error_rule</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the Alibaba Cloud account used by the owner of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>1933790683****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the Alibaba Cloud account used by the alert recipient.</p>
     * 
     * <strong>example:</strong>
     * <p>1933790683****</p>
     */
    @NameInMap("Receiver")
    public String receiver;

    /**
     * <p>The IDs of the scheduling tasks.</p>
     */
    @NameInMap("TaskIds")
    public java.util.List<Long> taskIds;

    /**
     * <p>The alert triggering condition.</p>
     */
    @NameInMap("Types")
    public java.util.List<String> types;

    public static ListAlertRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlertRulesRequest self = new ListAlertRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListAlertRulesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListAlertRulesRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListAlertRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAlertRulesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAlertRulesRequest setReceiver(String receiver) {
        this.receiver = receiver;
        return this;
    }
    public String getReceiver() {
        return this.receiver;
    }

    public ListAlertRulesRequest setTaskIds(java.util.List<Long> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<Long> getTaskIds() {
        return this.taskIds;
    }

    public ListAlertRulesRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

}
