// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHybridMonitorNamespaceListResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
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
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   true: The call was successful.</p>
     * <p>*   false: The call failed.</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The total number of returned entries.</p>
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
         * <p>The metrics.</p>
         */
        @NameInMap("List")
        public java.util.List<String> list;

        /**
         * <p>The interval at which metrics are collected.</p>
         * <br>
         * <p>Unit: seconds.</p>
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
         * <p>The namespace for the Alibaba Cloud service.</p>
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
         */
        @NameInMap("UserId")
        public Long userId;

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
        @NameInMap("NamespaceRegion")
        public String namespaceRegion;

        @NameInMap("SLSProject")
        public String SLSProject;

        /**
         * <p>The data retention period. Valid values:</p>
         * <br>
         * <p>*   cms.s1.large: Data is stored for 15 days.</p>
         * <p>*   cms.s1.xlarge: Data is stored for 32 days.</p>
         * <p>*   cms.s1.2xlarge: Data is stored for 63 days.</p>
         * <p>*   cms.s1.3xlarge: Data is stored for 93 days.</p>
         * <p>*   cms.s1.6xlarge: Data is stored for 185 days.</p>
         * <p>*   cms.s1.12xlarge: Data is stored for 376 days.</p>
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
         * <p>The configuration details of metric import tasks for Alibaba Cloud services.</p>
         */
        @NameInMap("AliyunProductMetricList")
        public java.util.List<DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricList> aliyunProductMetricList;

        /**
         * <p>The timestamp that was generated when the namespace was created.</p>
         * <br>
         * <p>Unit: milliseconds.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the namespace.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The details of the data retention period.</p>
         */
        @NameInMap("Detail")
        public DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceDetail detail;

        /**
         * <p>The ID of the namespace.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Indicates whether the namespace is deleted. Valid values:</p>
         * <br>
         * <p>*   0: The namespace is not deleted.</p>
         * <p>*   1: The namespace is deleted.</p>
         */
        @NameInMap("IsDelete")
        public Integer isDelete;

        /**
         * <p>The timestamp that was generated when the namespace was last modified.</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The name of the namespace.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("NamespaceType")
        public String namespaceType;

        /**
         * <p>The number of metric import tasks for third-party services.</p>
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
