// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateOpenSingleDataRequest extends TeaModel {
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

    @NameInMap("CheckOnline")
    public Boolean checkOnline;

    @NameInMap("ExtAttrStr")
    public String extAttrStr;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LinkToken")
    public String linkToken;

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

    @NameInMap("ValidTimeEnd")
    public Long validTimeEnd;

    @NameInMap("ValidTimeStart")
    public Long validTimeStart;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateOpenSingleDataRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOpenSingleDataRequest self = new CreateOpenSingleDataRequest();
        return TeaModel.build(map, self);
    }

    public CreateOpenSingleDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateOpenSingleDataRequest setAppMaxVersion(String appMaxVersion) {
        this.appMaxVersion = appMaxVersion;
        return this;
    }
    public String getAppMaxVersion() {
        return this.appMaxVersion;
    }

    public CreateOpenSingleDataRequest setAppMinVersion(String appMinVersion) {
        this.appMinVersion = appMinVersion;
        return this;
    }
    public String getAppMinVersion() {
        return this.appMinVersion;
    }

    public CreateOpenSingleDataRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateOpenSingleDataRequest setCheckOnline(Boolean checkOnline) {
        this.checkOnline = checkOnline;
        return this;
    }
    public Boolean getCheckOnline() {
        return this.checkOnline;
    }

    public CreateOpenSingleDataRequest setExtAttrStr(String extAttrStr) {
        this.extAttrStr = extAttrStr;
        return this;
    }
    public String getExtAttrStr() {
        return this.extAttrStr;
    }

    public CreateOpenSingleDataRequest setLinkToken(String linkToken) {
        this.linkToken = linkToken;
        return this;
    }
    public String getLinkToken() {
        return this.linkToken;
    }

    public CreateOpenSingleDataRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public CreateOpenSingleDataRequest setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public CreateOpenSingleDataRequest setThirdMsgId(String thirdMsgId) {
        this.thirdMsgId = thirdMsgId;
        return this;
    }
    public String getThirdMsgId() {
        return this.thirdMsgId;
    }

    public CreateOpenSingleDataRequest setValidTimeEnd(Long validTimeEnd) {
        this.validTimeEnd = validTimeEnd;
        return this;
    }
    public Long getValidTimeEnd() {
        return this.validTimeEnd;
    }

    public CreateOpenSingleDataRequest setValidTimeStart(Long validTimeStart) {
        this.validTimeStart = validTimeStart;
        return this;
    }
    public Long getValidTimeStart() {
        return this.validTimeStart;
    }

    public CreateOpenSingleDataRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
