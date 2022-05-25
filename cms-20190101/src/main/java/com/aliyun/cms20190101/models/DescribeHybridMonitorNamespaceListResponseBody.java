// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHybridMonitorNamespaceListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DescribeHybridMonitorNamespace")
    public java.util.List<DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespace> describeHybridMonitorNamespace;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

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
        @NameInMap("List")
        public java.util.List<String> list;

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
        @NameInMap("MetricList")
        public java.util.List<DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricListNamespaceListMetricList> metricList;

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
        @NameInMap("NamespaceList")
        public java.util.List<DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricListNamespaceList> namespaceList;

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
        @NameInMap("Spec")
        public String spec;

        public static DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceDetail self = new DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceDetail();
            return TeaModel.build(map, self);
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
        @NameInMap("AliyunProductMetricList")
        public java.util.List<DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceAliyunProductMetricList> aliyunProductMetricList;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Detail")
        public DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespaceDetail detail;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsDelete")
        public Integer isDelete;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("Namespace")
        public String namespace;

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

        public DescribeHybridMonitorNamespaceListResponseBodyDescribeHybridMonitorNamespace setNotAliyunTaskNumber(Long notAliyunTaskNumber) {
            this.notAliyunTaskNumber = notAliyunTaskNumber;
            return this;
        }
        public Long getNotAliyunTaskNumber() {
            return this.notAliyunTaskNumber;
        }

    }

}
