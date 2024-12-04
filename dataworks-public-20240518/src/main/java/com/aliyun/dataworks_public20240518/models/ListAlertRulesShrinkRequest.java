// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListAlertRulesShrinkRequest extends TeaModel {
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
    public String taskIdsShrink;

    /**
     * <p>The alert triggering condition.</p>
     */
    @NameInMap("Types")
    public String typesShrink;

    public static ListAlertRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlertRulesShrinkRequest self = new ListAlertRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAlertRulesShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListAlertRulesShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListAlertRulesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAlertRulesShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAlertRulesShrinkRequest setReceiver(String receiver) {
        this.receiver = receiver;
        return this;
    }
    public String getReceiver() {
        return this.receiver;
    }

    public ListAlertRulesShrinkRequest setTaskIdsShrink(String taskIdsShrink) {
        this.taskIdsShrink = taskIdsShrink;
        return this;
    }
    public String getTaskIdsShrink() {
        return this.taskIdsShrink;
    }

    public ListAlertRulesShrinkRequest setTypesShrink(String typesShrink) {
        this.typesShrink = typesShrink;
        return this;
    }
    public String getTypesShrink() {
        return this.typesShrink;
    }

}
