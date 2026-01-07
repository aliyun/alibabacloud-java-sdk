// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class SendAsyncEmailCaptchaRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ContactInfo")
    public String contactInfo;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ContactorId")
    public String contactorId;

    public static SendAsyncEmailCaptchaRequest build(java.util.Map<String, ?> map) throws Exception {
        SendAsyncEmailCaptchaRequest self = new SendAsyncEmailCaptchaRequest();
        return TeaModel.build(map, self);
    }

    public SendAsyncEmailCaptchaRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SendAsyncEmailCaptchaRequest setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public String getContactInfo() {
        return this.contactInfo;
    }

    public SendAsyncEmailCaptchaRequest setContactorId(String contactorId) {
        this.contactorId = contactorId;
        return this;
    }
    public String getContactorId() {
        return this.contactorId;
    }

}
