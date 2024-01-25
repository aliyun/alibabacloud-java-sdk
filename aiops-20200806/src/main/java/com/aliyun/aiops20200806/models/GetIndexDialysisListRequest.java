// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetIndexDialysisListRequest extends TeaModel {
    @NameInMap("BusinessGroupId")
    public String businessGroupId;

    @NameInMap("CloudResourceId")
    public String cloudResourceId;

    @NameInMap("CloudTypeName")
    public String cloudTypeName;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("IndexCode")
    public String indexCode;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetIndexDialysisListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIndexDialysisListRequest self = new GetIndexDialysisListRequest();
        return TeaModel.build(map, self);
    }

    public GetIndexDialysisListRequest setBusinessGroupId(String businessGroupId) {
        this.businessGroupId = businessGroupId;
        return this;
    }
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    public GetIndexDialysisListRequest setCloudResourceId(String cloudResourceId) {
        this.cloudResourceId = cloudResourceId;
        return this;
    }
    public String getCloudResourceId() {
        return this.cloudResourceId;
    }

    public GetIndexDialysisListRequest setCloudTypeName(String cloudTypeName) {
        this.cloudTypeName = cloudTypeName;
        return this;
    }
    public String getCloudTypeName() {
        return this.cloudTypeName;
    }

    public GetIndexDialysisListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetIndexDialysisListRequest setIndexCode(String indexCode) {
        this.indexCode = indexCode;
        return this;
    }
    public String getIndexCode() {
        return this.indexCode;
    }

    public GetIndexDialysisListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetIndexDialysisListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
