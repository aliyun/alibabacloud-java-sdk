// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutContactRequest extends TeaModel {
    @NameInMap("ContactName")
    @Validation(required = true)
    public String contactName;

    @NameInMap("Describe")
    @Validation(required = true)
    public String describe;

    @NameInMap("Channels")
    @Validation(required = true)
    public PutContactRequestChannels channels;

    public static PutContactRequest build(java.util.Map<String, ?> map) throws Exception {
        PutContactRequest self = new PutContactRequest();
        return TeaModel.build(map, self);
    }

    public static class PutContactRequestChannels extends TeaModel {
        @NameInMap("SMS")
        public String SMS;

        @NameInMap("Mail")
        public String mail;

        @NameInMap("AliIM")
        public String aliIM;

        @NameInMap("DingWebHook")
        public String dingWebHook;

        public static PutContactRequestChannels build(java.util.Map<String, ?> map) throws Exception {
            PutContactRequestChannels self = new PutContactRequestChannels();
            return TeaModel.build(map, self);
        }

    }

}
