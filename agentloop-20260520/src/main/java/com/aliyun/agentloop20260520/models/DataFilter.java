// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class DataFilter extends TeaModel {
    /**
     * <p>The maximum number of evaluation records. This takes effect for both backfill and continuous runs. If not specified, the backend does not write a default value.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxRecords")
    public Integer maxRecords;

    /**
     * <p>The one-time temporary evaluation input content, primarily used for oneshot tasks. The value is stored as a string. Object or array values are serialized to a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;input&quot;:&quot;用户查询订单状态&quot;,&quot;output&quot;:&quot;已查询到订单状态&quot;}</p>
     */
    @NameInMap("provided")
    public java.util.Map<String, ?> provided;

    /**
     * <p>The data query filter condition. This takes effect together with the evaluator-level filters.query. In Trace scenarios, you can specify filter expressions such as service name, environment, or labels.</p>
     * 
     * <strong>example:</strong>
     * <p>serviceName=\&quot;checkout-service\&quot;</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The sampling rate percentage. Valid values: 0 to 100. A value of 0 or not specified indicates no sampling. A value of 100 indicates full data. If the value is less than 100, random sampling is applied first, and then the maxRecords limit is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("samplingRate")
    public Integer samplingRate;

    @NameInMap("serviceNames")
    public java.util.List<String> serviceNames;

    public static DataFilter build(java.util.Map<String, ?> map) throws Exception {
        DataFilter self = new DataFilter();
        return TeaModel.build(map, self);
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

    public DataFilter setServiceNames(java.util.List<String> serviceNames) {
        this.serviceNames = serviceNames;
        return this;
    }
    public java.util.List<String> getServiceNames() {
        return this.serviceNames;
    }

}
