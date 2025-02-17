// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticMetricSetsResponseBody extends TeaModel {
    /**
     * <p>The diagnostic metric sets.</p>
     */
    @NameInMap("MetricSets")
    public java.util.List<DescribeDiagnosticMetricSetsResponseBodyMetricSets> metricSets;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE*****</p>
     */
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
        /**
         * <p>The description of the diagnostic metric set.</p>
         * 
         * <strong>example:</strong>
         * <p>connection issue diagnostics</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The IDs of the diagnostic metrics.</p>
         */
        @NameInMap("MetricIds")
        public java.util.List<String> metricIds;

        /**
         * <p>The ID of the diagnostic metric set.</p>
         * 
         * <strong>example:</strong>
         * <p>dms-bp17p0qwtr72zmu*****</p>
         */
        @NameInMap("MetricSetId")
        public String metricSetId;

        /**
         * <p>The name of the diagnostic metric set.</p>
         * 
         * <strong>example:</strong>
         * <p>connection issue diagnostics</p>
         */
        @NameInMap("MetricSetName")
        public String metricSetName;

        /**
         * <p>The resource type supported by the diagnostic metric set.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The type of the diagnostic metric set. Valid values:</p>
         * <ul>
         * <li>User: user-defined diagnostic metric set</li>
         * <li>Common: common diagnostic metric set</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
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
