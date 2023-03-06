// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListSearchLogRequest extends TeaModel {
    /**
     * <p>1531910852074</p>
     */
    @NameInMap("beginTime")
    public Long beginTime;

    /**
     * <p>1531910852074</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>host:172.16.\*\*.\*\* AND content:netty</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>20</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
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
