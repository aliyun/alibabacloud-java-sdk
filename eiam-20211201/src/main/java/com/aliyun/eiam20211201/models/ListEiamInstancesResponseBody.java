// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListEiamInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<ListEiamInstancesResponseBodyInstances> instances;

    @NameInMap("RequestId")
    public String requestId;

    public static ListEiamInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEiamInstancesResponseBody self = new ListEiamInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEiamInstancesResponseBody setInstances(java.util.List<ListEiamInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListEiamInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public ListEiamInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEiamInstancesResponseBodyInstances extends TeaModel {
        /**
         * <p>实例描述信息</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>实例developer私网域名地址</p>
         */
        @NameInMap("DeveloperAPIPrivateDomain")
        public String developerAPIPrivateDomain;

        /**
         * <p>实例developer公网域名地址</p>
         */
        @NameInMap("DeveloperAPIPublicDomain")
        public String developerAPIPublicDomain;

        /**
         * <p>实例id</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>实例状态，Pending(初始状态)、Creating(创建中)、Running(运行中)、Disabled(禁用)、CreateFailed(创建失败)</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>实例版本，EIAM2.0/ EIAM1.0</p>
         */
        @NameInMap("InstanceVersion")
        public String instanceVersion;

        /**
         * <p>实例openApi私网域名地址</p>
         */
        @NameInMap("OpenAPIPrivateDomain")
        public String openAPIPrivateDomain;

        /**
         * <p>实例openApi公网域名地址</p>
         */
        @NameInMap("OpenAPIPublicDomain")
        public String openAPIPublicDomain;

        /**
         * <p>实例域名地址</p>
         */
        @NameInMap("SSODomain")
        public String SSODomain;

        /**
         * <p>实例的创建时间</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static ListEiamInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListEiamInstancesResponseBodyInstances self = new ListEiamInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListEiamInstancesResponseBodyInstances setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEiamInstancesResponseBodyInstances setDeveloperAPIPrivateDomain(String developerAPIPrivateDomain) {
            this.developerAPIPrivateDomain = developerAPIPrivateDomain;
            return this;
        }
        public String getDeveloperAPIPrivateDomain() {
            return this.developerAPIPrivateDomain;
        }

        public ListEiamInstancesResponseBodyInstances setDeveloperAPIPublicDomain(String developerAPIPublicDomain) {
            this.developerAPIPublicDomain = developerAPIPublicDomain;
            return this;
        }
        public String getDeveloperAPIPublicDomain() {
            return this.developerAPIPublicDomain;
        }

        public ListEiamInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListEiamInstancesResponseBodyInstances setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public ListEiamInstancesResponseBodyInstances setInstanceVersion(String instanceVersion) {
            this.instanceVersion = instanceVersion;
            return this;
        }
        public String getInstanceVersion() {
            return this.instanceVersion;
        }

        public ListEiamInstancesResponseBodyInstances setOpenAPIPrivateDomain(String openAPIPrivateDomain) {
            this.openAPIPrivateDomain = openAPIPrivateDomain;
            return this;
        }
        public String getOpenAPIPrivateDomain() {
            return this.openAPIPrivateDomain;
        }

        public ListEiamInstancesResponseBodyInstances setOpenAPIPublicDomain(String openAPIPublicDomain) {
            this.openAPIPublicDomain = openAPIPublicDomain;
            return this;
        }
        public String getOpenAPIPublicDomain() {
            return this.openAPIPublicDomain;
        }

        public ListEiamInstancesResponseBodyInstances setSSODomain(String SSODomain) {
            this.SSODomain = SSODomain;
            return this;
        }
        public String getSSODomain() {
            return this.SSODomain;
        }

        public ListEiamInstancesResponseBodyInstances setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
