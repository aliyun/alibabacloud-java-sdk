// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDingtalkMeetingMemberEventRequest extends TeaModel {
    @NameInMap("TenantContext")
    public GetDingtalkMeetingMemberEventRequestTenantContext tenantContext;

    /**
     * <strong>example:</strong>
     * <p>1638360000000</p>
     */
    @NameInMap("beginTime")
    public Long beginTime;

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
     * <p>1638363600000</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>21001</p>
     */
    @NameInMap("orgId")
    public String orgId;

    /**
     * <strong>example:</strong>
     * <p>34242</p>
     */
    @NameInMap("workNo")
    public String workNo;

    public static GetDingtalkMeetingMemberEventRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDingtalkMeetingMemberEventRequest self = new GetDingtalkMeetingMemberEventRequest();
        return TeaModel.build(map, self);
    }

    public GetDingtalkMeetingMemberEventRequest setTenantContext(GetDingtalkMeetingMemberEventRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetDingtalkMeetingMemberEventRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public GetDingtalkMeetingMemberEventRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetDingtalkMeetingMemberEventRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public GetDingtalkMeetingMemberEventRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetDingtalkMeetingMemberEventRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public GetDingtalkMeetingMemberEventRequest setWorkNo(String workNo) {
        this.workNo = workNo;
        return this;
    }
    public String getWorkNo() {
        return this.workNo;
    }

    public static class GetDingtalkMeetingMemberEventRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetDingtalkMeetingMemberEventRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetDingtalkMeetingMemberEventRequestTenantContext self = new GetDingtalkMeetingMemberEventRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetDingtalkMeetingMemberEventRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
