// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateCapacityReservationRequest extends TeaModel {
    // 应用ID
    @NameInMap("AppId")
    public String appId;

    // 应用版本ID，如果不填，采用控制台设置的默认版本
    @NameInMap("AppVersion")
    public String appVersion;

    // 客户端 token，保持幂等性。
    @NameInMap("ClientToken")
    public String clientToken;

    // 大区 id
    @NameInMap("DistrictId")
    public String districtId;

    // 预期资源ready可服务时间 时间格式 yyyy-mm-dd HH:MM:SS 比如
    @NameInMap("ExpectResourceReadyTime")
    public String expectResourceReadyTime;

    // 预期创建出的容器能支持的 session 数量。GCS 内部会根据适配自动计算出所需要的资源量，以及多种机型的配比。
    @NameInMap("ExpectSessionCapacity")
    public Integer expectSessionCapacity;

    // 项目ID
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
