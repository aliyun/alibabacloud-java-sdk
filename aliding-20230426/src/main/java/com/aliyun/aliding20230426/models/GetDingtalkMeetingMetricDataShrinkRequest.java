// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDingtalkMeetingMetricDataShrinkRequest extends TeaModel {
    @NameInMap("TenantContext")
    public String tenantContextShrink;

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

    public static GetDingtalkMeetingMetricDataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDingtalkMeetingMetricDataShrinkRequest self = new GetDingtalkMeetingMetricDataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetDingtalkMeetingMetricDataShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public GetDingtalkMeetingMetricDataShrinkRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetDingtalkMeetingMetricDataShrinkRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public GetDingtalkMeetingMetricDataShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetDingtalkMeetingMetricDataShrinkRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public GetDingtalkMeetingMetricDataShrinkRequest setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
    public String getTypeName() {
        return this.typeName;
    }

    public GetDingtalkMeetingMetricDataShrinkRequest setWorkNo(String workNo) {
        this.workNo = workNo;
        return this;
    }
    public String getWorkNo() {
        return this.workNo;
    }

}
