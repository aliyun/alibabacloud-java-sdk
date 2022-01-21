// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutContactRequest extends TeaModel {
    @NameInMap("Channels")
    public PutContactRequestChannels channels;

    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("Describe")
    public String describe;

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
        @NameInMap("AliIM")
        public String aliIM;

        @NameInMap("DingWebHook")
        public String dingWebHook;

        @NameInMap("Mail")
        public String mail;

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
