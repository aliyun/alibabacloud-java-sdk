// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.captcha20230305.models;

import com.aliyun.tea.*;

public class VerifyIntelligentCaptchaRequest extends TeaModel {
    @NameInMap("CaptchaVerifyParam")
    public String captchaVerifyParam;

    public static VerifyIntelligentCaptchaRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyIntelligentCaptchaRequest self = new VerifyIntelligentCaptchaRequest();
        return TeaModel.build(map, self);
    }

    public VerifyIntelligentCaptchaRequest setCaptchaVerifyParam(String captchaVerifyParam) {
        this.captchaVerifyParam = captchaVerifyParam;
        return this;
    }
    public String getCaptchaVerifyParam() {
        return this.captchaVerifyParam;
    }

}
