// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SendVerifyCodeRequest extends TeaModel {
    @NameInMap("ExtraInfo")
    public String extraInfo;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VerifyCodeAction")
    public String verifyCodeAction;

    public static SendVerifyCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        SendVerifyCodeRequest self = new SendVerifyCodeRequest();
        return TeaModel.build(map, self);
    }

    public SendVerifyCodeRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public SendVerifyCodeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SendVerifyCodeRequest setVerifyCodeAction(String verifyCodeAction) {
        this.verifyCodeAction = verifyCodeAction;
        return this;
    }
    public String getVerifyCodeAction() {
        return this.verifyCodeAction;
    }

}
