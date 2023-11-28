// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListLogstashLogRequest extends TeaModel {
    /**
     * <p>20</p>
     */
    @NameInMap("beginTime")
    public Long beginTime;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>1</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The severity level of the log entry. Including trace, debug, info, warn, error, etc. (GC logs have no level).</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>1531910852074</p>
     */
    @NameInMap("type")
    public String type;

    public static ListLogstashLogRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLogstashLogRequest self = new ListLogstashLogRequest();
        return TeaModel.build(map, self);
    }

    public ListLogstashLogRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public ListLogstashLogRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListLogstashLogRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListLogstashLogRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListLogstashLogRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListLogstashLogRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
