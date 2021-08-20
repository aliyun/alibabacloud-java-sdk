// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListRemindsRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Founder")
    public String founder;

    @NameInMap("NodeId")
    public Long nodeId;

    @NameInMap("RemindTypes")
    public String remindTypes;

    @NameInMap("AlertTarget")
    public String alertTarget;

    @NameInMap("SearchText")
    public String searchText;

    public static ListRemindsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRemindsRequest self = new ListRemindsRequest();
        return TeaModel.build(map, self);
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

    public ListRemindsRequest setRemindTypes(String remindTypes) {
        this.remindTypes = remindTypes;
        return this;
    }
    public String getRemindTypes() {
        return this.remindTypes;
    }

    public ListRemindsRequest setAlertTarget(String alertTarget) {
        this.alertTarget = alertTarget;
        return this;
    }
    public String getAlertTarget() {
        return this.alertTarget;
    }

    public ListRemindsRequest setSearchText(String searchText) {
        this.searchText = searchText;
        return this;
    }
    public String getSearchText() {
        return this.searchText;
    }

}
