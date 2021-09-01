// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class RemoveEventDataMistakeRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("EventId")
    public String eventId;

    @NameInMap("SourceCreateTime")
    public String sourceCreateTime;

    public static RemoveEventDataMistakeRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveEventDataMistakeRequest self = new RemoveEventDataMistakeRequest();
        return TeaModel.build(map, self);
    }

    public RemoveEventDataMistakeRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public RemoveEventDataMistakeRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public RemoveEventDataMistakeRequest setSourceCreateTime(String sourceCreateTime) {
        this.sourceCreateTime = sourceCreateTime;
        return this;
    }
    public String getSourceCreateTime() {
        return this.sourceCreateTime;
    }

}
