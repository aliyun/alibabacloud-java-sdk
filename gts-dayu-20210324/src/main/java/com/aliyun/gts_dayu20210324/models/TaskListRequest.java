// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210324.models;

import com.aliyun.tea.*;

public class TaskListRequest extends TeaModel {
    // prLineId
    @NameInMap("PrLineId")
    public String prLineId;

    // bpId
    @NameInMap("BpId")
    public String bpId;

    // articleSpecCode
    @NameInMap("ArticleSpecCode")
    public String articleSpecCode;

    // pageSize
    @NameInMap("PageSize")
    public Integer pageSize;

    // applyOrderId
    @NameInMap("ApplyOrderId")
    public Integer applyOrderId;

    // prNumber
    @NameInMap("PrNumber")
    public String prNumber;

    // requirementId
    @NameInMap("RequirementId")
    public String requirementId;

    // pageNum
    @NameInMap("PageNum")
    public Integer pageNum;

    // poId
    @NameInMap("PoId")
    public String poId;

    // status
    @NameInMap("Status")
    public String status;

    public static TaskListRequest build(java.util.Map<String, ?> map) throws Exception {
        TaskListRequest self = new TaskListRequest();
        return TeaModel.build(map, self);
    }

    public TaskListRequest setPrLineId(String prLineId) {
        this.prLineId = prLineId;
        return this;
    }
    public String getPrLineId() {
        return this.prLineId;
    }

    public TaskListRequest setBpId(String bpId) {
        this.bpId = bpId;
        return this;
    }
    public String getBpId() {
        return this.bpId;
    }

    public TaskListRequest setArticleSpecCode(String articleSpecCode) {
        this.articleSpecCode = articleSpecCode;
        return this;
    }
    public String getArticleSpecCode() {
        return this.articleSpecCode;
    }

    public TaskListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public TaskListRequest setApplyOrderId(Integer applyOrderId) {
        this.applyOrderId = applyOrderId;
        return this;
    }
    public Integer getApplyOrderId() {
        return this.applyOrderId;
    }

    public TaskListRequest setPrNumber(String prNumber) {
        this.prNumber = prNumber;
        return this;
    }
    public String getPrNumber() {
        return this.prNumber;
    }

    public TaskListRequest setRequirementId(String requirementId) {
        this.requirementId = requirementId;
        return this;
    }
    public String getRequirementId() {
        return this.requirementId;
    }

    public TaskListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public TaskListRequest setPoId(String poId) {
        this.poId = poId;
        return this;
    }
    public String getPoId() {
        return this.poId;
    }

    public TaskListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
