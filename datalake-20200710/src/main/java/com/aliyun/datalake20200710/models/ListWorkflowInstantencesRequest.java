// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListWorkflowInstantencesRequest extends TeaModel {
    @NameInMap("BlueprintInstanceId")
    public String blueprintInstanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StatusList")
    public java.util.Map<String, ?> statusList;

    public static ListWorkflowInstantencesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowInstantencesRequest self = new ListWorkflowInstantencesRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkflowInstantencesRequest setBlueprintInstanceId(String blueprintInstanceId) {
        this.blueprintInstanceId = blueprintInstanceId;
        return this;
    }
    public String getBlueprintInstanceId() {
        return this.blueprintInstanceId;
    }

    public ListWorkflowInstantencesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListWorkflowInstantencesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWorkflowInstantencesRequest setStatusList(java.util.Map<String, ?> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.Map<String, ?> getStatusList() {
        return this.statusList;
    }

}
