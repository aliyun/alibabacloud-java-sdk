// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListSearchLogRequest extends TeaModel {
    /**
     * <p>The start timestamp of the log, in milliseconds. The value must be within the last 7 days. If this parameter is not specified, all logs within the [current time - 7 days, endTime\] range are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1531910852074</p>
     */
    @NameInMap("beginTime")
    public Long beginTime;

    /**
     * <p>The end timestamp of the log, in milliseconds. The value must be within the last 7 days. Specify this parameter. If this parameter is not specified, an empty result is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1531910852074</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The page number of the plug-in list. Minimum value: 1. Default value: 1.</p>
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
     * <p>host:<code>172.16.**.**</code> AND content:netty</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The number of entries per page for a paged query. Default value: 20. Minimum value: 1. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>The log type. Valid values:</p>
     * <ul>
     * <li>INSTANCELOG: primary log.</li>
     * <li>SEARCHSLOW: searching slow log.</li>
     * <li>INDEXINGSLOW: indexing slow log.</li>
     * <li>JVMLOG: GC log.</li>
     * <li>ES_SEARCH_ACCESS_LOG: Elasticsearch access log.</li>
     * <li>AUDIT: audit log.</li>
     * </ul>
     * <p>For limits on viewing logs, see <a href="https://help.aliyun.com/document_detail/72026.html">Query logs</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>INSTANCELOG</p>
     */
    @NameInMap("type")
    public String type;

    public static ListSearchLogRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSearchLogRequest self = new ListSearchLogRequest();
        return TeaModel.build(map, self);
    }

    public ListSearchLogRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public ListSearchLogRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListSearchLogRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListSearchLogRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListSearchLogRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListSearchLogRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
