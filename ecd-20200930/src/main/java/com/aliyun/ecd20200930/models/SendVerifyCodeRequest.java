// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SendVerifyCodeRequest extends TeaModel {
    /**
     * <p>The information that is required to send the verification code, in JSON format. When you verify the CEN instance of another Alibaba Cloud account, you must provide the ID of the CEN instance and the ID of the Alibaba Cloud account to which the instance belongs.</p>
     * <ul>
     * <li>CenId: the ID of the CEN instance.</li>
     * <li>CenOwnerId: the ID of the Alibaba Cloud account to which the CEN instance belongs.</li>
     * </ul>
     * <blockquote>
     * <p> If you own the CEN instance, skip this parameter. If you do not own the CEN instance, specify the ID of the Alibaba Cloud account that owns the CEN instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;cenOwnerId&quot;: 1234567890******,&quot;cenId&quot;: &quot;cen-3weq30r6t0s7t4****&quot;}</p>
     */
    @NameInMap("ExtraInfo")
    public String extraInfo;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The action that you want to perform by using the verification code.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>eds_cenID_securityverification: Use the verification code to verify the CEN instance.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eds_cenID_securityverification</p>
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
