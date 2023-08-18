// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetRawPlanJsonRequest extends TeaModel {
    @NameInMap("AdvisorAction")
    public String advisorAction;

    @NameInMap("autoconfEnable")
    public Boolean autoconfEnable;

    @NameInMap("expectedCore")
    public Float expectedCore;

    @NameInMap("expectedGB")
    public Float expectedGB;

    public static GetRawPlanJsonRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRawPlanJsonRequest self = new GetRawPlanJsonRequest();
        return TeaModel.build(map, self);
    }

    public GetRawPlanJsonRequest setAdvisorAction(String advisorAction) {
        this.advisorAction = advisorAction;
        return this;
    }
    public String getAdvisorAction() {
        return this.advisorAction;
    }

    public GetRawPlanJsonRequest setAutoconfEnable(Boolean autoconfEnable) {
        this.autoconfEnable = autoconfEnable;
        return this;
    }
    public Boolean getAutoconfEnable() {
        return this.autoconfEnable;
    }

    public GetRawPlanJsonRequest setExpectedCore(Float expectedCore) {
        this.expectedCore = expectedCore;
        return this;
    }
    public Float getExpectedCore() {
        return this.expectedCore;
    }

    public GetRawPlanJsonRequest setExpectedGB(Float expectedGB) {
        this.expectedGB = expectedGB;
        return this;
    }
    public Float getExpectedGB() {
        return this.expectedGB;
    }

}
