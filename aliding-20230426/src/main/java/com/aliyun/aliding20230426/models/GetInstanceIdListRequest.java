// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetInstanceIdListRequest extends TeaModel {
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

    public static GetInstanceIdListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceIdListRequest self = new GetInstanceIdListRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceIdListRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public GetInstanceIdListRequest setApprovedResult(String approvedResult) {
        this.approvedResult = approvedResult;
        return this;
    }
    public String getApprovedResult() {
        return this.approvedResult;
    }

    public GetInstanceIdListRequest setCreateFromTimeGMT(String createFromTimeGMT) {
        this.createFromTimeGMT = createFromTimeGMT;
        return this;
    }
    public String getCreateFromTimeGMT() {
        return this.createFromTimeGMT;
    }

    public GetInstanceIdListRequest setCreateToTimeGMT(String createToTimeGMT) {
        this.createToTimeGMT = createToTimeGMT;
        return this;
    }
    public String getCreateToTimeGMT() {
        return this.createToTimeGMT;
    }

    public GetInstanceIdListRequest setFormUuid(String formUuid) {
        this.formUuid = formUuid;
        return this;
    }
    public String getFormUuid() {
        return this.formUuid;
    }

    public GetInstanceIdListRequest setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public GetInstanceIdListRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetInstanceIdListRequest setModifiedFromTimeGMT(String modifiedFromTimeGMT) {
        this.modifiedFromTimeGMT = modifiedFromTimeGMT;
        return this;
    }
    public String getModifiedFromTimeGMT() {
        return this.modifiedFromTimeGMT;
    }

    public GetInstanceIdListRequest setModifiedToTimeGMT(String modifiedToTimeGMT) {
        this.modifiedToTimeGMT = modifiedToTimeGMT;
        return this;
    }
    public String getModifiedToTimeGMT() {
        return this.modifiedToTimeGMT;
    }

    public GetInstanceIdListRequest setOriginatorId(String originatorId) {
        this.originatorId = originatorId;
        return this;
    }
    public String getOriginatorId() {
        return this.originatorId;
    }

    public GetInstanceIdListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetInstanceIdListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetInstanceIdListRequest setSearchFieldJson(String searchFieldJson) {
        this.searchFieldJson = searchFieldJson;
        return this;
    }
    public String getSearchFieldJson() {
        return this.searchFieldJson;
    }

    public GetInstanceIdListRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

    public GetInstanceIdListRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
