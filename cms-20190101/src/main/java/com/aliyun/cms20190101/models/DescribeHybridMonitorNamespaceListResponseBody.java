// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHybridMonitorNamespaceListResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the namespaces.</p>
     */
    @NameInMap("DescribeHybridMonitorNamespace")
    public java.util.List<DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespace> describeHybridMonitorNamespace;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Specified parameter PageSize is not valid.</p>
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
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1EC450A4-3221-5148-B77E-2827576CFE48</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li><p>true: The operation was successful.</p>
     * </li>
     * <li><p>false: The operation failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeHybridMonitorNamespaceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridMonitorNamespaceListResponseBody self = new DescribeHybridMonitorNamespaceListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHybridMonitorNamespaceListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeHybridMonitorNamespaceListResponseBody setDescribeHybridMonitorNamespace(java.util.List<DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespace> describeHybridMonitorNamespace) {
        this.describeHybridMonitorNamespace = describeHybridMonitorNamespace;
        return this;
    }
    public java.util.List<DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespace> getDescribeHybridMonitorNamespace() {
        return this.describeHybridMonitorNamespace;
    }

    public DescribeHybridMonitorNamespaceListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeHybridMonitorNamespaceListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHybridMonitorNamespaceListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHybridMonitorNamespaceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHybridMonitorNamespaceListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeHybridMonitorNamespaceListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricListNamespaceListMetricList extends TeaModel {
        /**
         * <p>The list of metrics.</p>
         */
        @NameInMap("List")
        public java.util.List<String> list;

        /**
         * <p>The collection period of the metric.</p>
         * <p>Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Period")
        public Long period;

        public static DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricListNamespaceListMetricList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricListNamespaceListMetricList self = new DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricListNamespaceListMetricList();
            return TeaModel.build(map, self);
        }

        public DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricListNamespaceListMetricList setList(java.util.List<String> list) {
            this.list = list;
            return this;
        }
        public java.util.List<String> getList() {
            return this.list;
        }

        public DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricListNamespaceListMetricList setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

    }

    public static class DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricListNamespaceList extends TeaModel {
        /**
         * <p>The list of metrics for the Alibaba Cloud service.</p>
         */
        @NameInMap("MetricList")
        public java.util.List<DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricListNamespaceListMetricList> metricList;

        /**
         * <p>The data namespace of the Alibaba Cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        public static DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricListNamespaceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricListNamespaceList self = new DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricListNamespaceList();
            return TeaModel.build(map, self);
        }

        public DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricListNamespaceList setMetricList(java.util.List<DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricListNamespaceListMetricList> metricList) {
            this.metricList = metricList;
            return this;
        }
        public java.util.List<DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricListNamespaceListMetricList> getMetricList() {
            return this.metricList;
        }

        public DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricListNamespaceList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

    public static class DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricList extends TeaModel {
        /**
         * <p>The list of namespaces.</p>
         */
        @NameInMap("NamespaceList")
        public java.util.List<DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricListNamespaceList> namespaceList;

        /**
         * <p>The account that is used to create the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>120886317861****</p>
         */
        @NameInMap("UserId")
        public Long userId;

        /**
         * <p>The configuration file for the Alibaba Cloud service that is connected to Hybrid Cloud Monitoring.</p>
         * <ul>
         * <li><p>namespace: the namespace of the Alibaba Cloud service.</p>
         * </li>
         * <li><p>metric_list: the metrics of the Alibaba Cloud service.</p>
         * </li>
         * <li><p>dimension: the resources of the Alibaba Cloud service that can be queried in Hybrid Cloud Monitoring. If this parameter is empty, all resources are monitored.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>products:- namespace: acs_ecs_dashboard metric_info: - metric_list: - cpu_total dimension: \&quot;\&quot;</p>
         */
        @NameInMap("YAMLConfig")
        public String YAMLConfig;

        public static DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricList self = new DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricList();
            return TeaModel.build(map, self);
        }

        public DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricList setNamespaceList(java.util.List<DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricListNamespaceList> namespaceList) {
            this.namespaceList = namespaceList;
            return this;
        }
        public java.util.List<DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricListNamespaceList> getNamespaceList() {
            return this.namespaceList;
        }

        public DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricList setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricList setYAMLConfig(String YAMLConfig) {
            this.YAMLConfig = YAMLConfig;
            return this;
        }
        public String getYAMLConfig() {
            return this.YAMLConfig;
        }

    }

    public static class DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceDetail extends TeaModel {
        /**
         * <p>The region where the monitoring data is stored.</p>
         * <blockquote>
         * <p>This parameter is returned if you set <code>NamespaceType</code> to <code>m_prom_user</code> when you create the namespace.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("NamespaceRegion")
        public String namespaceRegion;

        /**
         * <p>The Prometheus instance where the monitoring data is stored.</p>
         * <blockquote>
         * <p>This parameter is returned if you set <code>NamespaceType</code> to <code>aliyun_prometheus</code> when you create the namespace.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rw-57******************7f</p>
         */
        @NameInMap("PrometheusInstanceId")
        public String prometheusInstanceId;

        /**
         * <p>The Simple Log Service (SLS) project where the monitoring data is stored.</p>
         * <blockquote>
         * <p>This parameter is returned if you set <code>NamespaceType</code> to <code>m_prom_user</code> when you create the namespace.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cms-hybrid-120886317861****-cn-hangzhou-a83d</p>
         */
        @NameInMap("SLSProject")
        public String SLSProject;

        /**
         * <p>The data storage duration. Valid values:</p>
         * <ul>
         * <li><p>cms.s1.large: 15 days.</p>
         * </li>
         * <li><p>cms.s1.xlarge: 32 days.</p>
         * </li>
         * <li><p>cms.s1.2xlarge: 63 days.</p>
         * </li>
         * <li><p>cms.s1.3xlarge: 93 days.</p>
         * </li>
         * <li><p>cms.s1.6xlarge: 185 days.</p>
         * </li>
         * <li><p>cms.s1.12xlarge: 376 days.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cms.s1.3xlarge</p>
         */
        @NameInMap("Spec")
        public String spec;

        public static DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceDetail self = new DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceDetail();
            return TeaModel.build(map, self);
        }

        public DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceDetail setNamespaceRegion(String namespaceRegion) {
            this.namespaceRegion = namespaceRegion;
            return this;
        }
        public String getNamespaceRegion() {
            return this.namespaceRegion;
        }

        public DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceDetail setPrometheusInstanceId(String prometheusInstanceId) {
            this.prometheusInstanceId = prometheusInstanceId;
            return this;
        }
        public String getPrometheusInstanceId() {
            return this.prometheusInstanceId;
        }

        public DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceDetail setSLSProject(String SLSProject) {
            this.SLSProject = SLSProject;
            return this;
        }
        public String getSLSProject() {
            return this.SLSProject;
        }

        public DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceDetail setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespace extends TeaModel {
        /**
         * <p>The configuration details of data import tasks for Alibaba Cloud services.</p>
         */
        @NameInMap("AliyunProductMetricList")
        public java.util.List<DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricList> aliyunProductMetricList;

        /**
         * <p>The timestamp when the namespace was created.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652682744000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The details of the data storage duration.</p>
         */
        @NameInMap("Detail")
        public DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceDetail detail;

        /**
         * <p>The namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Indicates whether the namespace is deleted. Valid values:</p>
         * <ul>
         * <li><p>0: The namespace is not deleted.</p>
         * </li>
         * <li><p>1: The namespace is deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsDelete")
        public Integer isDelete;

        /**
         * <p>The timestamp when the namespace was last modified. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652682744000</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The name of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-test</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The storage solution for monitoring data. Valid values:</p>
         * <ul>
         * <li><p>m_prom_user: The monitoring data is stored in SLS.</p>
         * </li>
         * <li><p>m_prom_pool: The monitoring data is stored in the storage space provided by Cloud Monitor.</p>
         * </li>
         * <li><p>aliyun_prometheus: The monitoring data is stored in a Prometheus instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aliyun_prometheus</p>
         */
        @NameInMap("NamespaceType")
        public String namespaceType;

        /**
         * <p>The number of data import tasks for non-Alibaba Cloud services.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NotAliyunTaskNumber")
        public Long notAliyunTaskNumber;

        public static DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespace build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespace self = new DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespace();
            return TeaModel.build(map, self);
        }

        public DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespace setAliyunProductMetricList(java.util.List<DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricList> aliyunProductMetricList) {
            this.aliyunProductMetricList = aliyunProductMetricList;
            return this;
        }
        public java.util.List<DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricList> getAliyunProductMetricList() {
            return this.aliyunProductMetricList;
        }

        public DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespace setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespace setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespace setDetail(DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceDetail detail) {
            this.detail = detail;
            return this;
        }
        public DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceDetail getDetail() {
            return this.detail;
        }

        public DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespace setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespace setIsDelete(Integer isDelete) {
            this.isDelete = isDelete;
            return this;
        }
        public Integer getIsDelete() {
            return this.isDelete;
        }

        public DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespace setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespace setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespace setNamespaceType(String namespaceType) {
            this.namespaceType = namespaceType;
            return this;
        }
        public String getNamespaceType() {
            return this.namespaceType;
        }

        public DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespace setNotAliyunTaskNumber(Long notAliyunTaskNumber) {
            this.notAliyunTaskNumber = notAliyunTaskNumber;
            return this;
        }
        public Long getNotAliyunTaskNumber() {
            return this.notAliyunTaskNumber;
        }

    }

}
