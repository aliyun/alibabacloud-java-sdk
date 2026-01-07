// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class SendAsyncMobileCaptchaRequest extends TeaModel {
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

    public static SendAsyncMobileCaptchaRequest build(java.util.Map<String, ?> map) throws Exception {
        SendAsyncMobileCaptchaRequest self = new SendAsyncMobileCaptchaRequest();
        return TeaModel.build(map, self);
    }

    public SendAsyncMobileCaptchaRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SendAsyncMobileCaptchaRequest setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public String getContactInfo() {
        return this.contactInfo;
    }

    public SendAsyncMobileCaptchaRequest setContactorId(String contactorId) {
        this.contactorId = contactorId;
        return this;
    }
    public String getContactorId() {
        return this.contactorId;
    }

}
