// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAlertInstanceResponseBody extends TeaModel {
    @NameInMap("AlertInstances")
    public java.util.List<DescribeAlertInstanceResponseBodyAlertInstances> alertInstances;

    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAlertInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertInstanceResponseBody self = new DescribeAlertInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertInstanceResponseBody setAlertInstances(java.util.List<DescribeAlertInstanceResponseBodyAlertInstances> alertInstances) {
        this.alertInstances = alertInstances;
        return this;
    }
    public java.util.List<DescribeAlertInstanceResponseBodyAlertInstances> getAlertInstances() {
        return this.alertInstances;
    }

    public DescribeAlertInstanceResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeAlertInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlertInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlertInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAlertInstanceResponseBodyAlertInstances extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceParams")
        public String instanceParams;

        @NameInMap("PluginId")
        public Integer pluginId;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeAlertInstanceResponseBodyAlertInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertInstanceResponseBodyAlertInstances self = new DescribeAlertInstanceResponseBodyAlertInstances();
            return TeaModel.build(map, self);
        }

        public DescribeAlertInstanceResponseBodyAlertInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAlertInstanceResponseBodyAlertInstances setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public DescribeAlertInstanceResponseBodyAlertInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeAlertInstanceResponseBodyAlertInstances setInstanceParams(String instanceParams) {
            this.instanceParams = instanceParams;
            return this;
        }
        public String getInstanceParams() {
            return this.instanceParams;
        }

        public DescribeAlertInstanceResponseBodyAlertInstances setPluginId(Integer pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public Integer getPluginId() {
            return this.pluginId;
        }

        public DescribeAlertInstanceResponseBodyAlertInstances setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
