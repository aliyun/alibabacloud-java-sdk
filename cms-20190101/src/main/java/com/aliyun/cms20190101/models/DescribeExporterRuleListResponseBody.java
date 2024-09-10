// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeExporterRuleListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <blockquote>
     * <p>The status code 200 indicates that the request was successful. Other status codes indicate that the request failed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the data export rules.</p>
     */
    @NameInMap("Datapoints")
    public DescribeExporterRuleListResponseBodyDatapoints datapoints;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>susscess</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6BA047CA-8BC6-40BC-BC8F-FBECF35F1993</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeExporterRuleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExporterRuleListResponseBody self = new DescribeExporterRuleListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExporterRuleListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeExporterRuleListResponseBody setDatapoints(DescribeExporterRuleListResponseBodyDatapoints datapoints) {
        this.datapoints = datapoints;
        return this;
    }
    public DescribeExporterRuleListResponseBodyDatapoints getDatapoints() {
        return this.datapoints;
    }

    public DescribeExporterRuleListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeExporterRuleListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeExporterRuleListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExporterRuleListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeExporterRuleListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeExporterRuleListResponseBodyDatapointsDatapointDstName extends TeaModel {
        @NameInMap("DstName")
        public java.util.List<String> dstName;

        public static DescribeExporterRuleListResponseBodyDatapointsDatapointDstName build(java.util.Map<String, ?> map) throws Exception {
            DescribeExporterRuleListResponseBodyDatapointsDatapointDstName self = new DescribeExporterRuleListResponseBodyDatapointsDatapointDstName();
            return TeaModel.build(map, self);
        }

        public DescribeExporterRuleListResponseBodyDatapointsDatapointDstName setDstName(java.util.List<String> dstName) {
            this.dstName = dstName;
            return this;
        }
        public java.util.List<String> getDstName() {
            return this.dstName;
        }

    }

    public static class DescribeExporterRuleListResponseBodyDatapointsDatapoint extends TeaModel {
        /**
         * <p>The time when the rule was created. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1584024616228</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Export monitoring data</p>
         */
        @NameInMap("Describe")
        public String describe;

        /**
         * <p>The associated dimensions.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;instanceId&quot;:&quot;xxxxx&quot;}</p>
         */
        @NameInMap("Dimension")
        public String dimension;

        @NameInMap("DstName")
        public DescribeExporterRuleListResponseBodyDatapointsDatapointDstName dstName;

        /**
         * <p>Indicates whether the rule is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The name of the metric.</p>
         * <blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/28619.html">Appendix 1: Metrics</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The namespace of the service.</p>
         * <blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/28619.html">Appendix 1: Metrics</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The name of the data export rule.</p>
         * 
         * <strong>example:</strong>
         * <p>myRuleName</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The time window of the exported data.\
         * Multiple windows are separated with commas (,).</p>
         * <blockquote>
         * <p>Data in a time window of less than 60 seconds cannot be exported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60,300</p>
         */
        @NameInMap("TargetWindows")
        public String targetWindows;

        public static DescribeExporterRuleListResponseBodyDatapointsDatapoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeExporterRuleListResponseBodyDatapointsDatapoint self = new DescribeExporterRuleListResponseBodyDatapointsDatapoint();
            return TeaModel.build(map, self);
        }

        public DescribeExporterRuleListResponseBodyDatapointsDatapoint setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeExporterRuleListResponseBodyDatapointsDatapoint setDescribe(String describe) {
            this.describe = describe;
            return this;
        }
        public String getDescribe() {
            return this.describe;
        }

        public DescribeExporterRuleListResponseBodyDatapointsDatapoint setDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }
        public String getDimension() {
            return this.dimension;
        }

        public DescribeExporterRuleListResponseBodyDatapointsDatapoint setDstName(DescribeExporterRuleListResponseBodyDatapointsDatapointDstName dstName) {
            this.dstName = dstName;
            return this;
        }
        public DescribeExporterRuleListResponseBodyDatapointsDatapointDstName getDstName() {
            return this.dstName;
        }

        public DescribeExporterRuleListResponseBodyDatapointsDatapoint setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeExporterRuleListResponseBodyDatapointsDatapoint setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeExporterRuleListResponseBodyDatapointsDatapoint setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeExporterRuleListResponseBodyDatapointsDatapoint setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeExporterRuleListResponseBodyDatapointsDatapoint setTargetWindows(String targetWindows) {
            this.targetWindows = targetWindows;
            return this;
        }
        public String getTargetWindows() {
            return this.targetWindows;
        }

    }

    public static class DescribeExporterRuleListResponseBodyDatapoints extends TeaModel {
        @NameInMap("Datapoint")
        public java.util.List<DescribeExporterRuleListResponseBodyDatapointsDatapoint> datapoint;

        public static DescribeExporterRuleListResponseBodyDatapoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeExporterRuleListResponseBodyDatapoints self = new DescribeExporterRuleListResponseBodyDatapoints();
            return TeaModel.build(map, self);
        }

        public DescribeExporterRuleListResponseBodyDatapoints setDatapoint(java.util.List<DescribeExporterRuleListResponseBodyDatapointsDatapoint> datapoint) {
            this.datapoint = datapoint;
            return this;
        }
        public java.util.List<DescribeExporterRuleListResponseBodyDatapointsDatapoint> getDatapoint() {
            return this.datapoint;
        }

    }

}
