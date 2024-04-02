// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class SendWebsiteFeedbackRequest extends TeaModel {
    @NameInMap("Feedback")
    public String feedback;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Urls")
    public String urls;

    public static SendWebsiteFeedbackRequest build(java.util.Map<String, ?> map) throws Exception {
        SendWebsiteFeedbackRequest self = new SendWebsiteFeedbackRequest();
        return TeaModel.build(map, self);
    }

    public SendWebsiteFeedbackRequest setFeedback(String feedback) {
        this.feedback = feedback;
        return this;
    }
    public String getFeedback() {
        return this.feedback;
    }

    public SendWebsiteFeedbackRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SendWebsiteFeedbackRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public SendWebsiteFeedbackRequest setUrls(String urls) {
        this.urls = urls;
        return this;
    }
    public String getUrls() {
        return this.urls;
    }

}
