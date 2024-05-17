// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateOpenGlobalDataRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppMaxVersion")
    public String appMaxVersion;

    @NameInMap("AppMinVersion")
    public String appMinVersion;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("ExtAttrStr")
    public String extAttrStr;

    @NameInMap("MaxUid")
    public Long maxUid;

    @NameInMap("MinUid")
    public Long minUid;

    @NameInMap("OsType")
    public String osType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Payload")
    public String payload;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ThirdMsgId")
    public String thirdMsgId;

    @NameInMap("Uids")
    public String uids;

    @NameInMap("ValidTimeEnd")
    public Long validTimeEnd;

    @NameInMap("ValidTimeStart")
    public Long validTimeStart;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateOpenGlobalDataRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOpenGlobalDataRequest self = new CreateOpenGlobalDataRequest();
        return TeaModel.build(map, self);
    }

    public CreateOpenGlobalDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateOpenGlobalDataRequest setAppMaxVersion(String appMaxVersion) {
        this.appMaxVersion = appMaxVersion;
        return this;
    }
    public String getAppMaxVersion() {
        return this.appMaxVersion;
    }

    public CreateOpenGlobalDataRequest setAppMinVersion(String appMinVersion) {
        this.appMinVersion = appMinVersion;
        return this;
    }
    public String getAppMinVersion() {
        return this.appMinVersion;
    }

    public CreateOpenGlobalDataRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateOpenGlobalDataRequest setExtAttrStr(String extAttrStr) {
        this.extAttrStr = extAttrStr;
        return this;
    }
    public String getExtAttrStr() {
        return this.extAttrStr;
    }

    public CreateOpenGlobalDataRequest setMaxUid(Long maxUid) {
        this.maxUid = maxUid;
        return this;
    }
    public Long getMaxUid() {
        return this.maxUid;
    }

    public CreateOpenGlobalDataRequest setMinUid(Long minUid) {
        this.minUid = minUid;
        return this;
    }
    public Long getMinUid() {
        return this.minUid;
    }

    public CreateOpenGlobalDataRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public CreateOpenGlobalDataRequest setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public CreateOpenGlobalDataRequest setThirdMsgId(String thirdMsgId) {
        this.thirdMsgId = thirdMsgId;
        return this;
    }
    public String getThirdMsgId() {
        return this.thirdMsgId;
    }

    public CreateOpenGlobalDataRequest setUids(String uids) {
        this.uids = uids;
        return this;
    }
    public String getUids() {
        return this.uids;
    }

    public CreateOpenGlobalDataRequest setValidTimeEnd(Long validTimeEnd) {
        this.validTimeEnd = validTimeEnd;
        return this;
    }
    public Long getValidTimeEnd() {
        return this.validTimeEnd;
    }

    public CreateOpenGlobalDataRequest setValidTimeStart(Long validTimeStart) {
        this.validTimeStart = validTimeStart;
        return this;
    }
    public Long getValidTimeStart() {
        return this.validTimeStart;
    }

    public CreateOpenGlobalDataRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
