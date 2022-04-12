// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DescribeAppInstanceListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("InstanceList")
    public java.util.List<DescribeAppInstanceListResponseBodyInstanceList> instanceList;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAppInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppInstanceListResponseBody self = new DescribeAppInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppInstanceListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAppInstanceListResponseBody setInstanceList(java.util.List<DescribeAppInstanceListResponseBodyInstanceList> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<DescribeAppInstanceListResponseBodyInstanceList> getInstanceList() {
        return this.instanceList;
    }

    public DescribeAppInstanceListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAppInstanceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAppInstanceListResponseBodyInstanceList extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Canary")
        public Boolean canary;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("NodeLabels")
        public String nodeLabels;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("PodRaw")
        public String podRaw;

        @NameInMap("Version")
        public String version;

        public static DescribeAppInstanceListResponseBodyInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppInstanceListResponseBodyInstanceList self = new DescribeAppInstanceListResponseBodyInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribeAppInstanceListResponseBodyInstanceList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeAppInstanceListResponseBodyInstanceList setCanary(Boolean canary) {
            this.canary = canary;
            return this;
        }
        public Boolean getCanary() {
            return this.canary;
        }

        public DescribeAppInstanceListResponseBodyInstanceList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeAppInstanceListResponseBodyInstanceList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeAppInstanceListResponseBodyInstanceList setNodeLabels(String nodeLabels) {
            this.nodeLabels = nodeLabels;
            return this;
        }
        public String getNodeLabels() {
            return this.nodeLabels;
        }

        public DescribeAppInstanceListResponseBodyInstanceList setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeAppInstanceListResponseBodyInstanceList setPodRaw(String podRaw) {
            this.podRaw = podRaw;
            return this;
        }
        public String getPodRaw() {
            return this.podRaw;
        }

        public DescribeAppInstanceListResponseBodyInstanceList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
