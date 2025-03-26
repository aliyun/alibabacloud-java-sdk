// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class CreateAccessWarrantRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>a123</p>
     */
    @NameInMap("appId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>e32fac43df0b0b0be32fac43df0b0b0b</p>
     */
    @NameInMap("requestSign")
    public String requestSign;

    /**
     * <strong>example:</strong>
     * <p>1701000000</p>
     */
    @NameInMap("timestamp")
    public String timestamp;

    /**
     * <strong>example:</strong>
     * <p>110.25.23.12</p>
     */
    @NameInMap("userClientIp")
    public String userClientIp;

    /**
     * <strong>example:</strong>
     * <p>sn123</p>
     */
    @NameInMap("userId")
    public String userId;

    /**
     * <strong>example:</strong>
     * <p>7200</p>
     */
    @NameInMap("warrantAvailable")
    public Integer warrantAvailable;

    public static CreateAccessWarrantRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessWarrantRequest self = new CreateAccessWarrantRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccessWarrantRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateAccessWarrantRequest setRequestSign(String requestSign) {
        this.requestSign = requestSign;
        return this;
    }
    public String getRequestSign() {
        return this.requestSign;
    }

    public CreateAccessWarrantRequest setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public CreateAccessWarrantRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public CreateAccessWarrantRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateAccessWarrantRequest setWarrantAvailable(Integer warrantAvailable) {
        this.warrantAvailable = warrantAvailable;
        return this;
    }
    public Integer getWarrantAvailable() {
        return this.warrantAvailable;
    }

}
