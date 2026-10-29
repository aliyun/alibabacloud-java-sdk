// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryAskLumaLogResult extends TeaModel {
    /**
     * <p>The list of log records returned by the query.</p>
     */
    @NameInMap("Entries")
    public java.util.List<AskLumaLogEntry> entries;

    /**
     * <p>Indicates whether more query results are available. Valid values:</p>
     * <ul>
     * <li>true: More results are available.</li>
     * <li>false: No more results are available.</li>
     * </ul>
     */
    @NameInMap("HasMore")
    public Boolean hasMore;

    /**
     * <p>The token used to retrieve the next page of query results. Pass this value as LastKey in subsequent requests to continue the query. This field is not returned when all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJ0cyI6MTcxN...</p>
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
