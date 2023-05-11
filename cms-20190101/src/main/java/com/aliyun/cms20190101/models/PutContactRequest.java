// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutContactRequest extends TeaModel {
    @NameInMap("Channels")
    public PutContactRequestChannels channels;

    /**
     * <p>The name of the alert contact.</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <p>The description of the alert contact.</p>
     */
    @NameInMap("Describe")
    public String describe;

    /**
     * <p>The language in which the alert information is displayed. Valid values:</p>
     * <br>
     * <p>*   zh-cn: simplified Chinese</p>
     * <p>*   en: English</p>
     * <br>
     * <p>>  If you do not specify a value for this parameter, Cloud Monitor identifies the language of the alert information based on the region of your Alibaba Cloud account.</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static PutContactRequest build(java.util.Map<String, ?> map) throws Exception {
        PutContactRequest self = new PutContactRequest();
        return TeaModel.build(map, self);
    }

    public PutContactRequest setChannels(PutContactRequestChannels channels) {
        this.channels = channels;
        return this;
    }
    public PutContactRequestChannels getChannels() {
        return this.channels;
    }

    public PutContactRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public PutContactRequest setDescribe(String describe) {
        this.describe = describe;
        return this;
    }
    public String getDescribe() {
        return this.describe;
    }

    public PutContactRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public static class PutContactRequestChannels extends TeaModel {
        /**
         * <p>The TradeManager ID of the alert contact.</p>
         * <br>
         * <p>Specify at least one of the following alert notification targets: email address or webhook URL of the DingTalk chatbot.</p>
         */
        @NameInMap("AliIM")
        public String aliIM;

        /**
         * <p>The webhook URL of the DingTalk chatbot.</p>
         * <br>
         * <p>Specify at least one of the following alert notification targets: email address or webhook URL of the DingTalk chatbot.</p>
         */
        @NameInMap("DingWebHook")
        public String dingWebHook;

        /**
         * <p>The email address of the alert contact. After you add or modify an email address, the recipient receives an email that contains an activation link. The system adds the recipient to the list of alert contacts only after the recipient activates the email address.</p>
         * <br>
         * <p>Specify at least one of the following alert notification targets: email address or webhook URL of the DingTalk chatbot.</p>
         */
        @NameInMap("Mail")
        public String mail;

        /**
         * <p>The phone number of the alert contact. After you add or modify a phone number, the recipient receives a text message that contains an activation link. The system adds the recipient to the list of alert contacts only after the recipient activates the phone number.</p>
         * <br>
         * <p>Specify at least one of the following alert notification targets: email address or webhook URL of the DingTalk chatbot.</p>
         */
        @NameInMap("SMS")
        public String SMS;

        public static PutContactRequestChannels build(java.util.Map<String, ?> map) throws Exception {
            PutContactRequestChannels self = new PutContactRequestChannels();
            return TeaModel.build(map, self);
        }

        public PutContactRequestChannels setAliIM(String aliIM) {
            this.aliIM = aliIM;
            return this;
        }
        public String getAliIM() {
            return this.aliIM;
        }

        public PutContactRequestChannels setDingWebHook(String dingWebHook) {
            this.dingWebHook = dingWebHook;
            return this;
        }
        public String getDingWebHook() {
            return this.dingWebHook;
        }

        public PutContactRequestChannels setMail(String mail) {
            this.mail = mail;
            return this;
        }
        public String getMail() {
            return this.mail;
        }

        public PutContactRequestChannels setSMS(String SMS) {
            this.SMS = SMS;
            return this;
        }
        public String getSMS() {
            return this.SMS;
        }

    }

}
