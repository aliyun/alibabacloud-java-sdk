// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListEiamInstancesResponseBody extends TeaModel {
    /**
     * <p>The instance list.</p>
     */
    @NameInMap("Instances")
    public java.util.List<ListEiamInstancesResponseBodyInstances> instances;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
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
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>instance test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The private domain name of the instance Developer API.</p>
         * 
         * <strong>example:</strong>
         * <p>eiam-developerapi-cn.vpc-proxy.aliyuncs.com</p>
         */
        @NameInMap("DeveloperAPIPrivateDomain")
        public String developerAPIPrivateDomain;

        /**
         * <p>The public domain of the instance Developer API.</p>
         * 
         * <strong>example:</strong>
         * <p>eiam-developerapi.cn-hangzhou.aliyuncs.com</p>
         */
        @NameInMap("DeveloperAPIPublicDomain")
        public String developerAPIPublicDomain;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_eypq6ljgyeuwmlw672sulxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>The instance version.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>EIAM 2.0</li>
         * <li>EIAM 1.0</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EIAM 2.0</p>
         */
        @NameInMap("InstanceVersion")
        public String instanceVersion;

        /**
         * <p>The private domain of the instance OpenAPI.</p>
         * 
         * <strong>example:</strong>
         * <p>eiam-cn.vpc-proxy.aliyuncs.com</p>
         */
        @NameInMap("OpenAPIPrivateDomain")
        public String openAPIPrivateDomain;

        /**
         * <p>The public domain of the instance OpenAPI.</p>
         * 
         * <strong>example:</strong>
         * <p>eiam.cn-hangzhou.aliyuncs.com</p>
         */
        @NameInMap("OpenAPIPublicDomain")
        public String openAPIPublicDomain;

        /**
         * <p>The single sign-on (SSO) domain  of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx.aliyunidaas.com</p>
         */
        @NameInMap("SSODomain")
        public String SSODomain;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1677810869300</p>
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
