// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticMetricSetsResponseBody extends TeaModel {
    @NameInMap("MetricSets")
    public java.util.List<DescribeDiagnosticMetricSetsResponseBodyMetricSets> metricSets;

    @NameInMap("NextToken")
    public String nextToken;

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
        @NameInMap("Description")
        public String description;

        @NameInMap("MetricIds")
        public java.util.List<String> metricIds;

        @NameInMap("MetricSetId")
        public String metricSetId;

        @NameInMap("MetricSetName")
        public String metricSetName;

        @NameInMap("ResourceType")
        public String resourceType;

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
