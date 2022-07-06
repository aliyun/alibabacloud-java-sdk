// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20200324.models;

import com.aliyun.tea.*;

public class CreateBpmsRecordRequest extends TeaModel {
    @NameInMap("BpmsParamJson")
    public String bpmsParamJson;

    @NameInMap("BpmsType")
    public String bpmsType;

    @NameInMap("PartnerId")
    public Long partnerId;

    @NameInMap("Remark")
    public String remark;

    public static CreateBpmsRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBpmsRecordRequest self = new CreateBpmsRecordRequest();
        return TeaModel.build(map, self);
    }

    public CreateBpmsRecordRequest setBpmsParamJson(String bpmsParamJson) {
        this.bpmsParamJson = bpmsParamJson;
        return this;
    }
    public String getBpmsParamJson() {
        return this.bpmsParamJson;
    }

    public CreateBpmsRecordRequest setBpmsType(String bpmsType) {
        this.bpmsType = bpmsType;
        return this;
    }
    public String getBpmsType() {
        return this.bpmsType;
    }

    public CreateBpmsRecordRequest setPartnerId(Long partnerId) {
        this.partnerId = partnerId;
        return this;
    }
    public Long getPartnerId() {
        return this.partnerId;
    }

    public CreateBpmsRecordRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
