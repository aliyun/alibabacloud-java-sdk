// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class CreateMPCoSPhaseGroupRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Remark")
    public String remark;

    public static CreateMPCoSPhaseGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMPCoSPhaseGroupRequest self = new CreateMPCoSPhaseGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateMPCoSPhaseGroupRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public CreateMPCoSPhaseGroupRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public CreateMPCoSPhaseGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMPCoSPhaseGroupRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
