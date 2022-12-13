// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SendVerifyCodeRequest extends TeaModel {
    // The information in JSON format that is required for sending the verification code. To verify the security of CEN, you must provide the ID of the CEN instance and the ID of the Alibaba Cloud account to which the instance belongs. Example: `{"cenOwnerId": 1234567890******,"cenId": "cen-3weq30r6t0s7t4****"}`.
    @NameInMap("ExtraInfo")
    public String extraInfo;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The action that indicates what the verification code is used for. The parameter is only used to verify the security of CEN. The value is eds_cenID_securityverification.
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
