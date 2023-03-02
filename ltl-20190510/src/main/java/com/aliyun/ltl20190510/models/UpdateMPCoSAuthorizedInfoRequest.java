// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class UpdateMPCoSAuthorizedInfoRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("AuthorizedPhaseList")
    public java.util.Map<String, ?> authorizedPhaseList;

    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("MemberId")
    public String memberId;

    @NameInMap("PhaseGroupId")
    public String phaseGroupId;

    public static UpdateMPCoSAuthorizedInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMPCoSAuthorizedInfoRequest self = new UpdateMPCoSAuthorizedInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMPCoSAuthorizedInfoRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public UpdateMPCoSAuthorizedInfoRequest setAuthorizedPhaseList(java.util.Map<String, ?> authorizedPhaseList) {
        this.authorizedPhaseList = authorizedPhaseList;
        return this;
    }
    public java.util.Map<String, ?> getAuthorizedPhaseList() {
        return this.authorizedPhaseList;
    }

    public UpdateMPCoSAuthorizedInfoRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public UpdateMPCoSAuthorizedInfoRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public UpdateMPCoSAuthorizedInfoRequest setPhaseGroupId(String phaseGroupId) {
        this.phaseGroupId = phaseGroupId;
        return this;
    }
    public String getPhaseGroupId() {
        return this.phaseGroupId;
    }

}
