// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAiopsEventListRequest extends TeaModel {
    @NameInMap("Uid")
    public Long uid;

    @NameInMap("Name")
    public String name;

    @NameInMap("PredictionState")
    public Integer predictionState;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Severity")
    public Integer severity;

    @NameInMap("BusinessGroupId")
    public String businessGroupId;

    @NameInMap("BusinessGroupName")
    public String businessGroupName;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetAiopsEventListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAiopsEventListRequest self = new GetAiopsEventListRequest();
        return TeaModel.build(map, self);
    }

    public GetAiopsEventListRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

    public GetAiopsEventListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetAiopsEventListRequest setPredictionState(Integer predictionState) {
        this.predictionState = predictionState;
        return this;
    }
    public Integer getPredictionState() {
        return this.predictionState;
    }

    public GetAiopsEventListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public GetAiopsEventListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetAiopsEventListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAiopsEventListRequest setSeverity(Integer severity) {
        this.severity = severity;
        return this;
    }
    public Integer getSeverity() {
        return this.severity;
    }

    public GetAiopsEventListRequest setBusinessGroupId(String businessGroupId) {
        this.businessGroupId = businessGroupId;
        return this;
    }
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    public GetAiopsEventListRequest setBusinessGroupName(String businessGroupName) {
        this.businessGroupName = businessGroupName;
        return this;
    }
    public String getBusinessGroupName() {
        return this.businessGroupName;
    }

    public GetAiopsEventListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
