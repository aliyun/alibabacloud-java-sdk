// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetInstancesRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("ApprovedResult")
    public String approvedResult;

    @NameInMap("CreateFromTimeGMT")
    public String createFromTimeGMT;

    @NameInMap("CreateToTimeGMT")
    public String createToTimeGMT;

    @NameInMap("FormUuid")
    public String formUuid;

    @NameInMap("InstanceStatus")
    public String instanceStatus;

    @NameInMap("Language")
    public String language;

    @NameInMap("ModifiedFromTimeGMT")
    public String modifiedFromTimeGMT;

    @NameInMap("ModifiedToTimeGMT")
    public String modifiedToTimeGMT;

    @NameInMap("OrderConfigJson")
    public String orderConfigJson;

    @NameInMap("OriginatorId")
    public String originatorId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchFieldJson")
    public String searchFieldJson;

    @NameInMap("SystemToken")
    public String systemToken;

    @NameInMap("TaskId")
    public String taskId;

    public static GetInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstancesRequest self = new GetInstancesRequest();
        return TeaModel.build(map, self);
    }

    public GetInstancesRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public GetInstancesRequest setApprovedResult(String approvedResult) {
        this.approvedResult = approvedResult;
        return this;
    }
    public String getApprovedResult() {
        return this.approvedResult;
    }

    public GetInstancesRequest setCreateFromTimeGMT(String createFromTimeGMT) {
        this.createFromTimeGMT = createFromTimeGMT;
        return this;
    }
    public String getCreateFromTimeGMT() {
        return this.createFromTimeGMT;
    }

    public GetInstancesRequest setCreateToTimeGMT(String createToTimeGMT) {
        this.createToTimeGMT = createToTimeGMT;
        return this;
    }
    public String getCreateToTimeGMT() {
        return this.createToTimeGMT;
    }

    public GetInstancesRequest setFormUuid(String formUuid) {
        this.formUuid = formUuid;
        return this;
    }
    public String getFormUuid() {
        return this.formUuid;
    }

    public GetInstancesRequest setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public GetInstancesRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetInstancesRequest setModifiedFromTimeGMT(String modifiedFromTimeGMT) {
        this.modifiedFromTimeGMT = modifiedFromTimeGMT;
        return this;
    }
    public String getModifiedFromTimeGMT() {
        return this.modifiedFromTimeGMT;
    }

    public GetInstancesRequest setModifiedToTimeGMT(String modifiedToTimeGMT) {
        this.modifiedToTimeGMT = modifiedToTimeGMT;
        return this;
    }
    public String getModifiedToTimeGMT() {
        return this.modifiedToTimeGMT;
    }

    public GetInstancesRequest setOrderConfigJson(String orderConfigJson) {
        this.orderConfigJson = orderConfigJson;
        return this;
    }
    public String getOrderConfigJson() {
        return this.orderConfigJson;
    }

    public GetInstancesRequest setOriginatorId(String originatorId) {
        this.originatorId = originatorId;
        return this;
    }
    public String getOriginatorId() {
        return this.originatorId;
    }

    public GetInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetInstancesRequest setSearchFieldJson(String searchFieldJson) {
        this.searchFieldJson = searchFieldJson;
        return this;
    }
    public String getSearchFieldJson() {
        return this.searchFieldJson;
    }

    public GetInstancesRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

    public GetInstancesRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
