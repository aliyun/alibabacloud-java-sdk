// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDingtalkMeetingInfoRequest extends TeaModel {
    @NameInMap("TenantContext")
    public GetDingtalkMeetingInfoRequestTenantContext tenantContext;

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
     * <p>21001</p>
     */
    @NameInMap("orgId")
    public String orgId;

    public static GetDingtalkMeetingInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDingtalkMeetingInfoRequest self = new GetDingtalkMeetingInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDingtalkMeetingInfoRequest setTenantContext(GetDingtalkMeetingInfoRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetDingtalkMeetingInfoRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public GetDingtalkMeetingInfoRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public GetDingtalkMeetingInfoRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public static class GetDingtalkMeetingInfoRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetDingtalkMeetingInfoRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetDingtalkMeetingInfoRequestTenantContext self = new GetDingtalkMeetingInfoRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetDingtalkMeetingInfoRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
