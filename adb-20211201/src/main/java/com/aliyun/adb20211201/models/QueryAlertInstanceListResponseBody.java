// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class QueryAlertInstanceListResponseBody extends TeaModel {
    @NameInMap("AlertInstances")
    public java.util.List<QueryAlertInstanceListResponseBodyAlertInstances> alertInstances;

    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryAlertInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAlertInstanceListResponseBody self = new QueryAlertInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAlertInstanceListResponseBody setAlertInstances(java.util.List<QueryAlertInstanceListResponseBodyAlertInstances> alertInstances) {
        this.alertInstances = alertInstances;
        return this;
    }
    public java.util.List<QueryAlertInstanceListResponseBodyAlertInstances> getAlertInstances() {
        return this.alertInstances;
    }

    public QueryAlertInstanceListResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryAlertInstanceListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAlertInstanceListResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryAlertInstanceListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAlertInstanceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAlertInstanceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAlertInstanceListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryAlertInstanceListResponseBodyAlertInstances extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("PluginId")
        public Integer pluginId;

        @NameInMap("PluginName")
        public String pluginName;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static QueryAlertInstanceListResponseBodyAlertInstances build(java.util.Map<String, ?> map) throws Exception {
            QueryAlertInstanceListResponseBodyAlertInstances self = new QueryAlertInstanceListResponseBodyAlertInstances();
            return TeaModel.build(map, self);
        }

        public QueryAlertInstanceListResponseBodyAlertInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryAlertInstanceListResponseBodyAlertInstances setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public QueryAlertInstanceListResponseBodyAlertInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public QueryAlertInstanceListResponseBodyAlertInstances setPluginId(Integer pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public Integer getPluginId() {
            return this.pluginId;
        }

        public QueryAlertInstanceListResponseBodyAlertInstances setPluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        public String getPluginName() {
            return this.pluginName;
        }

        public QueryAlertInstanceListResponseBodyAlertInstances setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
