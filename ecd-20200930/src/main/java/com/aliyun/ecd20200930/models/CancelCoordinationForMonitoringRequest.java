// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CancelCoordinationForMonitoringRequest extends TeaModel {
    /**
     * <p>The IDs of stream collaboration tasks.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CoIds")
    public java.util.List<String> coIds;

    /**
     * <p>The ID of the end user that initiates stream collaboration. If the initiator is the administrator, skip this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
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
     * <p>The type of the user.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>TENANT_ADMIN: administrator.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TENANT_ADMIN</p>
     */
    @NameInMap("UserType")
    public String userType;

    public static CancelCoordinationForMonitoringRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelCoordinationForMonitoringRequest self = new CancelCoordinationForMonitoringRequest();
        return TeaModel.build(map, self);
    }

    public CancelCoordinationForMonitoringRequest setCoIds(java.util.List<String> coIds) {
        this.coIds = coIds;
        return this;
    }
    public java.util.List<String> getCoIds() {
        return this.coIds;
    }

    public CancelCoordinationForMonitoringRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public CancelCoordinationForMonitoringRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CancelCoordinationForMonitoringRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
