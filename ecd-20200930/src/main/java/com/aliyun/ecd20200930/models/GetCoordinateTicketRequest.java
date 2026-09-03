// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetCoordinateTicketRequest extends TeaModel {
    /**
     * <p>The coordination flow ID. This value is the <code>Coid</code> returned by the <a href="~~ApplyCoordinationForMonitoring~~">ApplyCoordinationForMonitoring</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>co-0sot77uale3****</p>
     */
    @NameInMap("CoId")
    public String coId;

    /**
     * <p>The username of the end user. This parameter is not required on the administrator side.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The cloud computer connection task ID. This parameter is not required for the first request. If the first request does not return a Ticket, specify the <code>TaskId</code> returned by the first request in subsequent requests.</p>
     * 
     * <strong>example:</strong>
     * <p>39cc15e5-6998-4b9f-9b2c-7a4cc3e2****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The user type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TENANT_ADMIN</p>
     */
    @NameInMap("UserType")
    public String userType;

    public static GetCoordinateTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCoordinateTicketRequest self = new GetCoordinateTicketRequest();
        return TeaModel.build(map, self);
    }

    public GetCoordinateTicketRequest setCoId(String coId) {
        this.coId = coId;
        return this;
    }
    public String getCoId() {
        return this.coId;
    }

    public GetCoordinateTicketRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public GetCoordinateTicketRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetCoordinateTicketRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetCoordinateTicketRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
