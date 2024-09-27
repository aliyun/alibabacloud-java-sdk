// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmGlobalAlertShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh-CN: Chinese</li>
     * <li>en-US: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The alert configurations.</p>
     */
    @NameInMap("AlertConfig")
    public String alertConfigShrink;

    /**
     * <p>The alert contact groups.</p>
     */
    @NameInMap("AlertGroup")
    public String alertGroupShrink;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can specify a custom value for this parameter, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    public static UpdateCloudGtmGlobalAlertShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmGlobalAlertShrinkRequest self = new UpdateCloudGtmGlobalAlertShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmGlobalAlertShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateCloudGtmGlobalAlertShrinkRequest setAlertConfigShrink(String alertConfigShrink) {
        this.alertConfigShrink = alertConfigShrink;
        return this;
    }
    public String getAlertConfigShrink() {
        return this.alertConfigShrink;
    }

    public UpdateCloudGtmGlobalAlertShrinkRequest setAlertGroupShrink(String alertGroupShrink) {
        this.alertGroupShrink = alertGroupShrink;
        return this;
    }
    public String getAlertGroupShrink() {
        return this.alertGroupShrink;
    }

    public UpdateCloudGtmGlobalAlertShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
