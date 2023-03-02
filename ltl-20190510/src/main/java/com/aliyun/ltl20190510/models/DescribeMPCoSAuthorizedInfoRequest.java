// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class DescribeMPCoSAuthorizedInfoRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("MemberId")
    public String memberId;

    @NameInMap("PhaseGroupId")
    public String phaseGroupId;

    public static DescribeMPCoSAuthorizedInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMPCoSAuthorizedInfoRequest self = new DescribeMPCoSAuthorizedInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMPCoSAuthorizedInfoRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public DescribeMPCoSAuthorizedInfoRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public DescribeMPCoSAuthorizedInfoRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public DescribeMPCoSAuthorizedInfoRequest setPhaseGroupId(String phaseGroupId) {
        this.phaseGroupId = phaseGroupId;
        return this;
    }
    public String getPhaseGroupId() {
        return this.phaseGroupId;
    }

}
