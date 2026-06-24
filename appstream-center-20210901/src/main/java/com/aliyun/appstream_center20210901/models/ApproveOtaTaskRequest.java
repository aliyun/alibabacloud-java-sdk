// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ApproveOtaTaskRequest extends TeaModel {
    /**
     * <p>The delivery group ID. You can call <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The region ID of the delivery group. You can call <a href="~~ListRegions~~">ListRegions</a> to query the list of regions supported by Wuying Cloud Application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The over-the-air upgrade task type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Fota</p>
     */
    @NameInMap("OtaType")
    public String otaType;

    /**
     * <p>The start time of the over-the-air upgrade task. Specify the time in ISO 8601 format.</p>
     * <p>This parameter is required.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2022-08-04T14:36:00+08:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The over-the-air upgrade task ID. You can call <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> to obtain the ID.</p>
     * <blockquote>
     * <p>Each successful call of <code>ApproveOtaTask</code> causes the <code>TaskId</code> to change. Therefore, before calling this operation again, call <code>ListAppInstanceGroup</code> again to obtain the latest <code>TaskId</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ota-be7jzm29wrrz5****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ApproveOtaTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ApproveOtaTaskRequest self = new ApproveOtaTaskRequest();
        return TeaModel.build(map, self);
    }

    public ApproveOtaTaskRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public ApproveOtaTaskRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public ApproveOtaTaskRequest setOtaType(String otaType) {
        this.otaType = otaType;
        return this;
    }
    public String getOtaType() {
        return this.otaType;
    }

    public ApproveOtaTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ApproveOtaTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
