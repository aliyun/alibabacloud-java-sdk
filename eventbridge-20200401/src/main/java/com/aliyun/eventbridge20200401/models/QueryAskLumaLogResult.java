// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryAskLumaLogResult extends TeaModel {
    @NameInMap("Entries")
    public java.util.List<AskLumaLogEntry> entries;

    @NameInMap("HasMore")
    public Boolean hasMore;

    @NameInMap("LastKey")
    public String lastKey;

    public static QueryAskLumaLogResult build(java.util.Map<String, ?> map) throws Exception {
        QueryAskLumaLogResult self = new QueryAskLumaLogResult();
        return TeaModel.build(map, self);
    }

    public QueryAskLumaLogResult setEntries(java.util.List<AskLumaLogEntry> entries) {
        this.entries = entries;
        return this;
    }
    public java.util.List<AskLumaLogEntry> getEntries() {
        return this.entries;
    }

    public QueryAskLumaLogResult setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public QueryAskLumaLogResult setLastKey(String lastKey) {
        this.lastKey = lastKey;
        return this;
    }
    public String getLastKey() {
        return this.lastKey;
    }

}
