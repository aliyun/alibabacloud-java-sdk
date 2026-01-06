// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDingtalkMeetingMemberListRequest extends TeaModel {
    @NameInMap("TenantContext")
    public GetDingtalkMeetingMemberListRequestTenantContext tenantContext;

    /**
     * <strong>example:</strong>
     * <p>cluster-1</p>
     */
    @NameInMap("clusterName")
    public String clusterName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>61289fxxx</p>
     */
    @NameInMap("conferenceId")
    public String conferenceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>21001</p>
     */
    @NameInMap("orgId")
    public String orgId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static GetDingtalkMeetingMemberListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDingtalkMeetingMemberListRequest self = new GetDingtalkMeetingMemberListRequest();
        return TeaModel.build(map, self);
    }

    public GetDingtalkMeetingMemberListRequest setTenantContext(GetDingtalkMeetingMemberListRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetDingtalkMeetingMemberListRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public GetDingtalkMeetingMemberListRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public GetDingtalkMeetingMemberListRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public GetDingtalkMeetingMemberListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetDingtalkMeetingMemberListRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public GetDingtalkMeetingMemberListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static class GetDingtalkMeetingMemberListRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetDingtalkMeetingMemberListRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetDingtalkMeetingMemberListRequestTenantContext self = new GetDingtalkMeetingMemberListRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetDingtalkMeetingMemberListRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
