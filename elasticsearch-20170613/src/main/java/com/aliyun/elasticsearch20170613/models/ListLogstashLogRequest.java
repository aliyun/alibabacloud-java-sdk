// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListLogstashLogRequest extends TeaModel {
    /**
     * <p>The beginning of the time range to query logs. This value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1531910852074</p>
     */
    @NameInMap("beginTime")
    public Long beginTime;

    /**
     * <p>The end of the time range to query logs. This value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1531910852074</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The page number of the instance list. Default value: 1. Minimum value: 1. Maximum value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The keyword to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>host:10.7.xx.xx AND level:info AND content:opening</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The number of entries per page for a paged query. Default value: 20. Minimum value: 1. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>The log type. Valid values:</p>
     * <ul>
     * <li>LOGSTASH_INSTANCE_LOG: main log.</li>
     * <li>SEARCHSLOW: searching slow log.</li>
     * <li>INDEXINGSLOW: indexing slow log.</li>
     * <li>JVMLOG: GC log.</li>
     * <li>LOGSTASH_DEBUG_LOG: debug log.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LOGSTASH_INSTANCE_LOG</p>
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
