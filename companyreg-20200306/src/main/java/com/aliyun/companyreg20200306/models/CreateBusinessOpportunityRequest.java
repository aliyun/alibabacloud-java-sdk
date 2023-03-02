// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class CreateBusinessOpportunityRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("Source")
    public Integer source;

    @NameInMap("VCode")
    public String VCode;

    public static CreateBusinessOpportunityRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessOpportunityRequest self = new CreateBusinessOpportunityRequest();
        return TeaModel.build(map, self);
    }

    public CreateBusinessOpportunityRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateBusinessOpportunityRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public CreateBusinessOpportunityRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public CreateBusinessOpportunityRequest setSource(Integer source) {
        this.source = source;
        return this;
    }
    public Integer getSource() {
        return this.source;
    }

    public CreateBusinessOpportunityRequest setVCode(String VCode) {
        this.VCode = VCode;
        return this;
    }
    public String getVCode() {
        return this.VCode;
    }

}
