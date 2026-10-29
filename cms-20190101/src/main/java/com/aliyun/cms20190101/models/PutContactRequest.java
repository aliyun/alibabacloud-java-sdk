// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutContactRequest extends TeaModel {
    @NameInMap("Channels")
    public PutContactRequestChannels channels;

    /**
     * <p>The name of the alert contact.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Alice</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <p>The description of the alert contact.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_Instance</p>
     */
    @NameInMap("Describe")
    public String describe;

    /**
     * <p>The language in which alert notifications are sent. Valid values:</p>
     * <ul>
     * <li>zh-cn: simplified Chinese.</li>
     * <li>en: English.</li>
     * </ul>
     * <blockquote>
     * <p>If you do not set this parameter, the language is automatically determined based on the region of the account.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>zh-cn</p>
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
         * <p>&lt;props=&quot;china&quot;&gt;Specify at least one of the following contact methods: phone number, email address, DingTalk chatbot, or TradeManager.
         * &lt;props=&quot;intl&quot;&gt;Specify at least one of the following contact methods: email address or DingTalk chatbot.
         * &lt;props=&quot;partner&quot;&gt;Specify at least one of the following contact methods: email address or DingTalk chatbot..</p>
         * 
         * <strong>example:</strong>
         * <p>Jim</p>
         */
        @NameInMap("AliIM")
        public String aliIM;

        /**
         * <p>The webhook URL of the DingTalk chatbot.</p>
         * <p>&lt;props=&quot;china&quot;&gt;Specify at least one of the following contact methods: phone number, email address, DingTalk chatbot, or TradeManager.
         * &lt;props=&quot;intl&quot;&gt;Specify at least one of the following contact methods: email address or DingTalk chatbot.
         * &lt;props=&quot;partner&quot;&gt;Specify at least one of the following contact methods: email address or DingTalk chatbot..</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=7d49515e8ebf21106a80a9cc4bb3d247771305d52fb15d6201234565">https://oapi.dingtalk.com/robot/send?access_token=7d49515e8ebf21106a80a9cc4bb3d247771305d52fb15d6201234565</a>****</p>
         */
        @NameInMap("DingWebHook")
        public String dingWebHook;

        /**
         * <p>The email address of the alert contact. An activation link is sent to the email address. The alert contact is added only after the link is activated.</p>
         * <p>&lt;props=&quot;china&quot;&gt;Specify at least one of the following contact methods: phone number, email address, DingTalk chatbot, or TradeManager.
         * &lt;props=&quot;intl&quot;&gt;Specify at least one of the following contact methods: email address or DingTalk chatbot.
         * &lt;props=&quot;partner&quot;&gt;Specify at least one of the following contact methods: email address or DingTalk chatbot..</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@aliyun.com">test@aliyun.com</a></p>
         */
        @NameInMap("Mail")
        public String mail;

        /**
         * <p>The phone number of the alert contact. An activation link is sent to the phone number. The alert contact is added only after the link is activated.</p>
         * <p>&lt;props=&quot;china&quot;&gt;Specify at least one of the following contact methods: phone number, email address, DingTalk chatbot, or TradeManager.
         * &lt;props=&quot;intl&quot;&gt;Specify at least one of the following contact methods: email address or DingTalk chatbot.
         * &lt;props=&quot;partner&quot;&gt;Specify at least one of the following contact methods: email address or DingTalk chatbot..</p>
         * 
         * <strong>example:</strong>
         * <p>1333333****</p>
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
