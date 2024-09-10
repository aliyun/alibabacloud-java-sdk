// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeProjectMetaResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <blockquote>
     * <p>The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The Request is not authorization.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4C2061B2-3B1B-43BF-A4A4-C53426F479C0</p>
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
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
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
         * 
         * <strong>example:</strong>
         * <p>CDN</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The tags. Tags are used to filter services.</p>
         * <p>Tags are returned in the following format: <code>[{&quot;name&quot;:&quot;Tag key&quot;,&quot;value&quot;:&quot;Tag value&quot;}, {&quot;name&quot;:&quot;Tag key&quot;,&quot;value&quot;:&quot;Tag value&quot;}]</code>. The following tags are commonly used:</p>
         * <ul>
         * <li>alertUnit: the unit of the metric value in alerts. If the unit is small, the original metric value may be too large. In this case, you can use the <code>alertUnit</code> tag to specify an appropriate unit. This tag is used in CloudMonitor.</li>
         * <li>minAlertPeriod: the minimum time interval to report a new alert. The interval at which monitoring data is reported. The value is usually 1 minute.</li>
         * <li>metricCategory: the service specification. Example: kvstore_sharding. Some Alibaba Cloud services have multiple specifications that are defined in the same namespace. This parameter is used to identify the specifications.</li>
         * <li>is_alarm: indicates whether an alert rule can be configured. We recommend that you do not use the special tags in the CloudMonitor console.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;groupFlag&quot;:true}]</p>
         */
        @NameInMap("Labels")
        public String labels;

        /**
         * <p>The namespace of the cloud service. Format: <code>acs_Service name abbreviation</code>. For more information about namespaces, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_cdn</p>
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
