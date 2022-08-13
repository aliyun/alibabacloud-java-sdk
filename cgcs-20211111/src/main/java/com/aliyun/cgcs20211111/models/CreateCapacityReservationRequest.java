// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateCapacityReservationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DistrictId")
    public String districtId;

    @NameInMap("ExpectResourceReadyTime")
    public String expectResourceReadyTime;

    @NameInMap("ExpectSessionCapacity")
    public Integer expectSessionCapacity;

    @NameInMap("ProjectId")
    public String projectId;

    public static CreateCapacityReservationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCapacityReservationRequest self = new CreateCapacityReservationRequest();
        return TeaModel.build(map, self);
    }

    public CreateCapacityReservationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateCapacityReservationRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public CreateCapacityReservationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCapacityReservationRequest setDistrictId(String districtId) {
        this.districtId = districtId;
        return this;
    }
    public String getDistrictId() {
        return this.districtId;
    }

    public CreateCapacityReservationRequest setExpectResourceReadyTime(String expectResourceReadyTime) {
        this.expectResourceReadyTime = expectResourceReadyTime;
        return this;
    }
    public String getExpectResourceReadyTime() {
        return this.expectResourceReadyTime;
    }

    public CreateCapacityReservationRequest setExpectSessionCapacity(Integer expectSessionCapacity) {
        this.expectSessionCapacity = expectSessionCapacity;
        return this;
    }
    public Integer getExpectSessionCapacity() {
        return this.expectSessionCapacity;
    }

    public CreateCapacityReservationRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
