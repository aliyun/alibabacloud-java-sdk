// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDingtalkProjectionListShrinkRequest extends TeaModel {
    @NameInMap("TenantContext")
    public String tenantContextShrink;

    /**
     * <strong>example:</strong>
     * <p>PROJ001</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("orgId")
    public Long orgId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>343242</p>
     */
    @NameInMap("projectorWorkNo")
    public String projectorWorkNo;

    public static GetDingtalkProjectionListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDingtalkProjectionListShrinkRequest self = new GetDingtalkProjectionListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetDingtalkProjectionListShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public GetDingtalkProjectionListShrinkRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDingtalkProjectionListShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetDingtalkProjectionListShrinkRequest setOrgId(Long orgId) {
        this.orgId = orgId;
        return this;
    }
    public Long getOrgId() {
        return this.orgId;
    }

    public GetDingtalkProjectionListShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetDingtalkProjectionListShrinkRequest setProjectorWorkNo(String projectorWorkNo) {
        this.projectorWorkNo = projectorWorkNo;
        return this;
    }
    public String getProjectorWorkNo() {
        return this.projectorWorkNo;
    }

}
