// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryAskLumaLogResult extends TeaModel {
    /**
     * <p>The log entries returned by the query.</p>
     */
    @NameInMap("Entries")
    public java.util.List<AskLumaLogEntry> entries;

    /**
     * <p>Specifies whether more results are available. The value is <code>true</code> if more results can be retrieved, and <code>false</code> otherwise.</p>
     */
    @NameInMap("HasMore")
    public Boolean hasMore;

    /**
     * <p>The token to use for retrieving the next page of results. If present, pass this value as the <code>LastKey</code> parameter in a subsequent request to fetch more data. This field is omitted when all results have been retrieved.</p>
     */
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
