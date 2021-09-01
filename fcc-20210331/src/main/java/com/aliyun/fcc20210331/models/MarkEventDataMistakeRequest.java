// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class MarkEventDataMistakeRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("EventId")
    public String eventId;

    @NameInMap("SourceCreateTime")
    public String sourceCreateTime;

    public static MarkEventDataMistakeRequest build(java.util.Map<String, ?> map) throws Exception {
        MarkEventDataMistakeRequest self = new MarkEventDataMistakeRequest();
        return TeaModel.build(map, self);
    }

    public MarkEventDataMistakeRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public MarkEventDataMistakeRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public MarkEventDataMistakeRequest setSourceCreateTime(String sourceCreateTime) {
        this.sourceCreateTime = sourceCreateTime;
        return this;
    }
    public String getSourceCreateTime() {
        return this.sourceCreateTime;
    }

}
