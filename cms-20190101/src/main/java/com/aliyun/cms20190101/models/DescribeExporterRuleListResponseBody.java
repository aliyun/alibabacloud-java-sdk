// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeExporterRuleListResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <blockquote>
     * <p>A value of 200 indicates success. Any other value indicates failure.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Datapoints")
    public DescribeExporterRuleListResponseBodyDatapoints datapoints;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified resource is not found.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number. Default value: 1.</p>
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
     * <p>Indicates whether the call was successful. Valid values:  </p>
     * <ul>
     * <li><code>true</code>: Successful.</li>
     * <li><code>false</code>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of records.</p>
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
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Describe")
        public String describe;

        @NameInMap("Dimension")
        public String dimension;

        @NameInMap("DstName")
        public DescribeExporterRuleListResponseBodyDatapointsDatapointDstName dstName;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("RuleName")
        public String ruleName;

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
