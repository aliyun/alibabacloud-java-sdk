// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDingtalkProjectionListRequest extends TeaModel {
    @NameInMap("TenantContext")
    public GetDingtalkProjectionListRequestTenantContext tenantContext;

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

    public static GetDingtalkProjectionListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDingtalkProjectionListRequest self = new GetDingtalkProjectionListRequest();
        return TeaModel.build(map, self);
    }

    public GetDingtalkProjectionListRequest setTenantContext(GetDingtalkProjectionListRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetDingtalkProjectionListRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public GetDingtalkProjectionListRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDingtalkProjectionListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetDingtalkProjectionListRequest setOrgId(Long orgId) {
        this.orgId = orgId;
        return this;
    }
    public Long getOrgId() {
        return this.orgId;
    }

    public GetDingtalkProjectionListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetDingtalkProjectionListRequest setProjectorWorkNo(String projectorWorkNo) {
        this.projectorWorkNo = projectorWorkNo;
        return this;
    }
    public String getProjectorWorkNo() {
        return this.projectorWorkNo;
    }

    public static class GetDingtalkProjectionListRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetDingtalkProjectionListRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetDingtalkProjectionListRequestTenantContext self = new GetDingtalkProjectionListRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetDingtalkProjectionListRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
