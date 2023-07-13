// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeProjectMetaResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <br>
     * <p>> The status code 200 indicates that the request was successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the cloud service.</p>
     */
    @NameInMap("Resources")
    public DescribeProjectMetaResponseBodyResources resources;

    /**
     * <p>Indicates whether the request was successful. Valid values: true: The request was successful. false: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("Total")
    public String total;

    public static DescribeProjectMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectMetaResponseBody self = new DescribeProjectMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProjectMetaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeProjectMetaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeProjectMetaResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeProjectMetaResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeProjectMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProjectMetaResponseBody setResources(DescribeProjectMetaResponseBodyResources resources) {
        this.resources = resources;
        return this;
    }
    public DescribeProjectMetaResponseBodyResources getResources() {
        return this.resources;
    }

    public DescribeProjectMetaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeProjectMetaResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public static class DescribeProjectMetaResponseBodyResourcesResource extends TeaModel {
        /**
         * <p>The description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The tags. Tags are used to filter services.</p>
         * <br>
         * <p>Tags are returned in the following format: `[{"name":"Tag key","value":"Tag value"}, {"name":"Tag key","value":"Tag value"}]`. The following tags are commonly used:</p>
         * <br>
         * <p>*   alertUnit: the unit of the metric value in alerts. If the unit is small, the original metric value may be too large. In this case, you can use the `alertUnit` tag to specify an appropriate unit. This tag is used in CloudMonitor.</p>
         * <p>*   minAlertPeriod: the minimum time interval to report a new alert. The interval is usually set to 1 minute.</p>
         * <p>*   metricCategory: the service specification. Example: kvstore_sharding. An Alibaba Cloud service may have different specifications that are defined in the same namespace. You can use this parameter to distinguish between service specifications.</p>
         * <p>*   is_alarm: specifies whether an alert rule can be set. We recommend that you do not use the special tags in the CloudMonitor console.</p>
         */
        @NameInMap("Labels")
        public String labels;

        /**
         * <p>The namespace of the cloud service. Format: `acs_Service name abbreviation`. For more information about namespaces, see [Appendix 1: Metrics](~~163515~~).</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        public static DescribeProjectMetaResponseBodyResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectMetaResponseBodyResourcesResource self = new DescribeProjectMetaResponseBodyResourcesResource();
            return TeaModel.build(map, self);
        }

        public DescribeProjectMetaResponseBodyResourcesResource setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeProjectMetaResponseBodyResourcesResource setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public DescribeProjectMetaResponseBodyResourcesResource setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

    public static class DescribeProjectMetaResponseBodyResources extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<DescribeProjectMetaResponseBodyResourcesResource> resource;

        public static DescribeProjectMetaResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectMetaResponseBodyResources self = new DescribeProjectMetaResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public DescribeProjectMetaResponseBodyResources setResource(java.util.List<DescribeProjectMetaResponseBodyResourcesResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<DescribeProjectMetaResponseBodyResourcesResource> getResource() {
            return this.resource;
        }

    }

}
