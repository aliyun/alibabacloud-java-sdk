// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class SendUnifyNoticeMessageRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("Bid")
    public String bid;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Params")
    public String params;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Uuid")
    public String uuid;

    public static SendUnifyNoticeMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendUnifyNoticeMessageRequest self = new SendUnifyNoticeMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendUnifyNoticeMessageRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public SendUnifyNoticeMessageRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public SendUnifyNoticeMessageRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public SendUnifyNoticeMessageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SendUnifyNoticeMessageRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public SendUnifyNoticeMessageRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendUnifyNoticeMessageRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
