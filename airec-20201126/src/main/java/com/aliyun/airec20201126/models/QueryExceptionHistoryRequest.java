// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class QueryExceptionHistoryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1586673466</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1586673466</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

    public static QueryExceptionHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryExceptionHistoryRequest self = new QueryExceptionHistoryRequest();
        return TeaModel.build(map, self);
    }

    public QueryExceptionHistoryRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryExceptionHistoryRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryExceptionHistoryRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
