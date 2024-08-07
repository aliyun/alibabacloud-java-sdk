// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetCoordinateTicketRequest extends TeaModel {
    /**
     * <p>The ID of the stream collaboration. You can obtain the value of this parameter based on the value of <code>Coid</code> that is returned by the <code>ApplyCoordinationForMonitoring</code> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>co-0sot77uale3****</p>
     */
    @NameInMap("CoId")
    public String coId;

    /**
     * <p>The name of the convenience user account. If you initiate the request as an administrator, you do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/436773.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the cloud computer connection task. The first time you initiate the request, you do not need to specify the ID of the cloud computer connection task. If no ticket is returned after you initiate the first request, you must specify the value of taskId that is returned for the first request in the subsequent request.</p>
     * 
     * <strong>example:</strong>
     * <p>39cc15e5-6998-4b9f-9b2c-7a4cc3e2****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The type of the user.</p>
     * <p>Set the value to TENANT_ADMIN.</p>
     * <ul>
     * <li><p>The value of</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <p>TENANT_ADMIN</p>
     * <!-- -->
     * 
     * <p>specifies an administrator.</p>
     * </li>
     * </ul>
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
