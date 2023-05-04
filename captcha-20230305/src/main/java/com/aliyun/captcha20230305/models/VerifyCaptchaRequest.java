// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.captcha20230305.models;

import com.aliyun.tea.*;

public class VerifyCaptchaRequest extends TeaModel {
    @NameInMap("CaptchaVerifyParam")
    public String captchaVerifyParam;

    public static VerifyCaptchaRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyCaptchaRequest self = new VerifyCaptchaRequest();
        return TeaModel.build(map, self);
    }

    public VerifyCaptchaRequest setCaptchaVerifyParam(String captchaVerifyParam) {
        this.captchaVerifyParam = captchaVerifyParam;
        return this;
    }
    public String getCaptchaVerifyParam() {
        return this.captchaVerifyParam;
    }

}
