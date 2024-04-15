// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SendVerifyCodeRequest extends TeaModel {
    /**
     * <p>The information that is required to send the verification code, in JSON format. When you verify the CEN instance of another Alibaba Cloud account, you must provide the ID of the CEN instance and the ID of the Alibaba Cloud account to which the instance belongs.</p>
     * <br>
     * <p>*   CenId: the ID of the CEN instance.</p>
     * <p>*   CenOwnerId: the ID of the Alibaba Cloud account to which the CEN instance belongs.</p>
     * <br>
     * <p>>  If you own the CEN instance, skip this parameter. If you do not own the CEN instance, specify the ID of the Alibaba Cloud account that owns the CEN instance.</p>
     */
    @NameInMap("ExtraInfo")
    public String extraInfo;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The action that you want to perform by using the verification code.</p>
     * <br>
     * <p>Valid value:</p>
     * <br>
     * <p>*   eds_cenID_securityverification: Use the verification code to verify the CEN instance.</p>
     */
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
