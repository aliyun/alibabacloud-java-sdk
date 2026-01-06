// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDingtalkMeetingMetricDataRequest extends TeaModel {
    @NameInMap("TenantContext")
    public GetDingtalkMeetingMetricDataRequestTenantContext tenantContext;

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
     * <p>audio</p>
     */
    @NameInMap("typeName")
    public String typeName;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("workNo")
    public String workNo;

    public static GetDingtalkMeetingMetricDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDingtalkMeetingMetricDataRequest self = new GetDingtalkMeetingMetricDataRequest();
        return TeaModel.build(map, self);
    }

    public GetDingtalkMeetingMetricDataRequest setTenantContext(GetDingtalkMeetingMetricDataRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetDingtalkMeetingMetricDataRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public GetDingtalkMeetingMetricDataRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetDingtalkMeetingMetricDataRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public GetDingtalkMeetingMetricDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetDingtalkMeetingMetricDataRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public GetDingtalkMeetingMetricDataRequest setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
    public String getTypeName() {
        return this.typeName;
    }

    public GetDingtalkMeetingMetricDataRequest setWorkNo(String workNo) {
        this.workNo = workNo;
        return this;
    }
    public String getWorkNo() {
        return this.workNo;
    }

    public static class GetDingtalkMeetingMetricDataRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetDingtalkMeetingMetricDataRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetDingtalkMeetingMetricDataRequestTenantContext self = new GetDingtalkMeetingMetricDataRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetDingtalkMeetingMetricDataRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
