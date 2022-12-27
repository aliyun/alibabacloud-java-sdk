// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticMetricSetsResponseBody extends TeaModel {
    @NameInMap("MetricSets")
    public java.util.List<DescribeDiagnosticMetricSetsResponseBodyMetricSets> metricSets;

    // The query token returned in this call.
    @NameInMap("NextToken")
    public String nextToken;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDiagnosticMetricSetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosticMetricSetsResponseBody self = new DescribeDiagnosticMetricSetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosticMetricSetsResponseBody setMetricSets(java.util.List<DescribeDiagnosticMetricSetsResponseBodyMetricSets> metricSets) {
        this.metricSets = metricSets;
        return this;
    }
    public java.util.List<DescribeDiagnosticMetricSetsResponseBodyMetricSets> getMetricSets() {
        return this.metricSets;
    }

    public DescribeDiagnosticMetricSetsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDiagnosticMetricSetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDiagnosticMetricSetsResponseBodyMetricSets extends TeaModel {
        // The description of the diagnostic metric set.
        @NameInMap("Description")
        public String description;

        // The IDs of the diagnostic metrics.
        @NameInMap("MetricIds")
        public java.util.List<String> metricIds;

        // The ID of the diagnostic metric set.
        @NameInMap("MetricSetId")
        public String metricSetId;

        // The name of the diagnostic metric set.
        @NameInMap("MetricSetName")
        public String metricSetName;

        // The resource type supported by the diagnostic metric set.
        @NameInMap("ResourceType")
        public String resourceType;

        // The type of the diagnostic metric set. Valid values:
        // 
        // *   User: user-defined diagnostic metric set
        // *   Common: common diagnostic metric set
        @NameInMap("Type")
        public String type;

        public static DescribeDiagnosticMetricSetsResponseBodyMetricSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnosticMetricSetsResponseBodyMetricSets self = new DescribeDiagnosticMetricSetsResponseBodyMetricSets();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnosticMetricSetsResponseBodyMetricSets setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDiagnosticMetricSetsResponseBodyMetricSets setMetricIds(java.util.List<String> metricIds) {
            this.metricIds = metricIds;
            return this;
        }
        public java.util.List<String> getMetricIds() {
            return this.metricIds;
        }

        public DescribeDiagnosticMetricSetsResponseBodyMetricSets setMetricSetId(String metricSetId) {
            this.metricSetId = metricSetId;
            return this;
        }
        public String getMetricSetId() {
            return this.metricSetId;
        }

        public DescribeDiagnosticMetricSetsResponseBodyMetricSets setMetricSetName(String metricSetName) {
            this.metricSetName = metricSetName;
            return this;
        }
        public String getMetricSetName() {
            return this.metricSetName;
        }

        public DescribeDiagnosticMetricSetsResponseBodyMetricSets setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeDiagnosticMetricSetsResponseBodyMetricSets setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
