// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DetachEndUserRequest extends TeaModel {
    @NameInMap("AdDomain")
    public String adDomain;

    @NameInMap("ClientType")
    public String clientType;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("Region")
    public String region;

    public static DetachEndUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachEndUserRequest self = new DetachEndUserRequest();
        return TeaModel.build(map, self);
    }

    public DetachEndUserRequest setAdDomain(String adDomain) {
        this.adDomain = adDomain;
        return this;
    }
    public String getAdDomain() {
        return this.adDomain;
    }

    public DetachEndUserRequest setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

    public DetachEndUserRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public DetachEndUserRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public DetachEndUserRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public DetachEndUserRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
