// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class DataFilter extends TeaModel {
    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("maxRecords")
    public Integer maxRecords;

    @NameInMap("provided")
    public java.util.Map<String, ?> provided;

    @NameInMap("query")
    public String query;

    @NameInMap("samplingRate")
    public Integer samplingRate;

    @NameInMap("startTime")
    public Long startTime;

    public static DataFilter build(java.util.Map<String, ?> map) throws Exception {
        DataFilter self = new DataFilter();
        return TeaModel.build(map, self);
    }

    public DataFilter setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DataFilter setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }
    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    public DataFilter setProvided(java.util.Map<String, ?> provided) {
        this.provided = provided;
        return this;
    }
    public java.util.Map<String, ?> getProvided() {
        return this.provided;
    }

    public DataFilter setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public DataFilter setSamplingRate(Integer samplingRate) {
        this.samplingRate = samplingRate;
        return this;
    }
    public Integer getSamplingRate() {
        return this.samplingRate;
    }

    public DataFilter setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
