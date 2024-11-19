// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetOrgLiveListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>db4d318xxxxx</p>
     */
    @NameInMap("CorpId")
    public String corpId;

    /**
     * <strong>example:</strong>
     * <p>1720211800000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>1719211800000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TenantContext")
    public GetOrgLiveListRequestTenantContext tenantContext;

    /**
     * <strong>example:</strong>
     * <p>012345</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GetOrgLiveListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOrgLiveListRequest self = new GetOrgLiveListRequest();
        return TeaModel.build(map, self);
    }

    public GetOrgLiveListRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetOrgLiveListRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetOrgLiveListRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetOrgLiveListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetOrgLiveListRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetOrgLiveListRequest setTenantContext(GetOrgLiveListRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetOrgLiveListRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public GetOrgLiveListRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class GetOrgLiveListRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetOrgLiveListRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetOrgLiveListRequestTenantContext self = new GetOrgLiveListRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetOrgLiveListRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
