// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class UnifiedSearchInput extends TeaModel {
    @NameInMap("category")
    public String category;

    @NameInMap("contents")
    public RequestContents contents;

    @NameInMap("engineType")
    public String engineType;

    @NameInMap("query")
    public String query;

    @NameInMap("timeRange")
    public String timeRange;

    public static UnifiedSearchInput build(java.util.Map<String, ?> map) throws Exception {
        UnifiedSearchInput self = new UnifiedSearchInput();
        return TeaModel.build(map, self);
    }

    public UnifiedSearchInput setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public UnifiedSearchInput setContents(RequestContents contents) {
        this.contents = contents;
        return this;
    }
    public RequestContents getContents() {
        return this.contents;
    }

    public UnifiedSearchInput setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public UnifiedSearchInput setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public UnifiedSearchInput setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

}
