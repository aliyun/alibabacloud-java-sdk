// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateAggregateConfigRulesReportResponseBody extends TeaModel {
    @NameInMap("AggregatorId")
    public String aggregatorId;

    @NameInMap("RequestId")
    public String requestId;

    public static GenerateAggregateConfigRulesReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateAggregateConfigRulesReportResponseBody self = new GenerateAggregateConfigRulesReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateAggregateConfigRulesReportResponseBody setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public GenerateAggregateConfigRulesReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
