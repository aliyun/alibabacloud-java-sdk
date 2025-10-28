// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DescribeAppInstanceListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The application instances.</p>
     */
    @NameInMap("InstanceList")
    public java.util.List<DescribeAppInstanceListResponseBodyInstanceList> instanceList;

    /**
     * <p>The message that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>03FD1520-0FD6-436A-<strong><strong>-265318D7</strong></strong></p>
     */
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
        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>93fdd228-*****-ed2ae98de18d</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>Indicates whether the application was released in canary release mode.</p>
         * <ul>
         * <li><code>true</code>: The application was released in canary release mode.</li>
         * <li><code>false</code>: The application was not released in canary release mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Canary")
        public Boolean canary;

        /**
         * <p>The ID of the instance group to which the application is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>93fdd228-*****-ed2ae98de18d</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the instance group to which the application is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>_DEFAULT_GROUP</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The labels of the node. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;alibabacloud.com/nodepool-id&quot;:&quot;np0<em>5b9377fa907&quot;,&quot;beta.kubernetes.io/arch&quot;:&quot;amd64&quot;,&quot;beta.kubernetes.io/instance-type&quot;:&quot;ecs.</em>&quot;,&quot;beta.kubernetes.io/os&quot;:&quot;linux&quot;,&quot;failure-domain.beta.kubernetes.io/region&quot;:&quot;cn-hangzhou&quot;,&quot;failure-domain.beta.kubernetes.io/zone&quot;:&quot;cn-hangzhou-b&quot;,&quot;kubernetes.io/arch&quot;:&quot;amd64&quot;,&quot;kubernetes.io/hostname&quot;:&quot;cn-hangzhou*&quot;,&quot;kubernetes.io/os&quot;:&quot;linux&quot;,&quot;node.kubernetes.io/instance-type&quot;:&quot;ecs.*&quot;,&quot;topology.diskplugin.csi.alibabacloud.com/zone&quot;:&quot;cn-hangzhou-b&quot;,&quot;topology.kubernetes.io/region&quot;:&quot;cn-hangzhou&quot;,&quot;topology.kubernetes.io/zone&quot;:&quot;cn-hangzhou-b&quot;}</p>
         */
        @NameInMap("NodeLabels")
        public String nodeLabels;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou.192.168.0.*</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The information about the pod. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;metadata&quot;:{&quot;name&quot;:&quot;oambuild-group-1-<em>4xthz&quot;,&quot;generateName&quot;:&quot;oambuild-group-<em>96-&quot;,&quot;namespace&quot;:&quot;default&quot;,&quot;selfLink&quot;:&quot;/api/v1/namespaces/default/pods/oambuild-grou</em>96-4xthz&quot;,&quot;uid&quot;:&quot;7a23399c-<em>fe7ff4018&quot;,&quot;resourceVersion&quot;:&quot;969614830&quot;,&quot;creationTimestamp&quot;:&quot;2021-04-06T11:38:46Z&quot;,&quot;labels&quot;:{&quot;ARMSApmAppId&quot;:&quot;</em>&quot;,&quot;ARMSApmLicenseKey&quot;:&quot;</em>&quot;...</p>
         */
        @NameInMap("PodRaw")
        public String podRaw;

        /**
         * <p>The deployment package version of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-06 19:37:42</p>
         */
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
