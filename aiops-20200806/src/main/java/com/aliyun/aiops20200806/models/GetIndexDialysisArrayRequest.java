// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetIndexDialysisArrayRequest extends TeaModel {
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

    public static GetIndexDialysisArrayRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIndexDialysisArrayRequest self = new GetIndexDialysisArrayRequest();
        return TeaModel.build(map, self);
    }

    public GetIndexDialysisArrayRequest setBusinessGroupId(String businessGroupId) {
        this.businessGroupId = businessGroupId;
        return this;
    }
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    public GetIndexDialysisArrayRequest setCloudResourceId(String cloudResourceId) {
        this.cloudResourceId = cloudResourceId;
        return this;
    }
    public String getCloudResourceId() {
        return this.cloudResourceId;
    }

    public GetIndexDialysisArrayRequest setCloudTypeName(String cloudTypeName) {
        this.cloudTypeName = cloudTypeName;
        return this;
    }
    public String getCloudTypeName() {
        return this.cloudTypeName;
    }

    public GetIndexDialysisArrayRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetIndexDialysisArrayRequest setIndexCode(String indexCode) {
        this.indexCode = indexCode;
        return this;
    }
    public String getIndexCode() {
        return this.indexCode;
    }

    public GetIndexDialysisArrayRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetIndexDialysisArrayRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
