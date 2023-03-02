// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class UpdateMPCoSAuthorizedInfoShrinkRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("AuthorizedPhaseList")
    public String authorizedPhaseListShrink;

    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("MemberId")
    public String memberId;

    @NameInMap("PhaseGroupId")
    public String phaseGroupId;

    public static UpdateMPCoSAuthorizedInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMPCoSAuthorizedInfoShrinkRequest self = new UpdateMPCoSAuthorizedInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMPCoSAuthorizedInfoShrinkRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public UpdateMPCoSAuthorizedInfoShrinkRequest setAuthorizedPhaseListShrink(String authorizedPhaseListShrink) {
        this.authorizedPhaseListShrink = authorizedPhaseListShrink;
        return this;
    }
    public String getAuthorizedPhaseListShrink() {
        return this.authorizedPhaseListShrink;
    }

    public UpdateMPCoSAuthorizedInfoShrinkRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public UpdateMPCoSAuthorizedInfoShrinkRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public UpdateMPCoSAuthorizedInfoShrinkRequest setPhaseGroupId(String phaseGroupId) {
        this.phaseGroupId = phaseGroupId;
        return this;
    }
    public String getPhaseGroupId() {
        return this.phaseGroupId;
    }

}
