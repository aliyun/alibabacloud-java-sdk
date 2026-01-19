// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetResourceServerScopeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceServerScope")
    public GetResourceServerScopeResponseBodyResourceServerScope resourceServerScope;

    public static GetResourceServerScopeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceServerScopeResponseBody self = new GetResourceServerScopeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceServerScopeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceServerScopeResponseBody setResourceServerScope(GetResourceServerScopeResponseBodyResourceServerScope resourceServerScope) {
        this.resourceServerScope = resourceServerScope;
        return this;
    }
    public GetResourceServerScopeResponseBodyResourceServerScope getResourceServerScope() {
        return this.resourceServerScope;
    }

    public static class GetResourceServerScopeResponseBodyResourceServerScope extends TeaModel {
        /**
         * <p>IDaaS EIAM 应用Id</p>
         * 
         * <strong>example:</strong>
         * <p>app_xxxxxxxxxxx</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <strong>example:</strong>
         * <p>authorize_required</p>
         */
        @NameInMap("AuthorizationType")
        public String authorizationType;

        /**
         * <p>IDaaS EIAM 实例Id</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_xxxxxxxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>IDaaS EIAM ResourceServer下权限Id</p>
         * 
         * <strong>example:</strong>
         * <p>rss_xxxxxxxxxxx</p>
         */
        @NameInMap("ResourceServerScopeId")
        public String resourceServerScopeId;

        /**
         * <p>IDaaS EIAM ResourceServer下权限名称</p>
         * 
         * <strong>example:</strong>
         * <p>读取全部用户</p>
         */
        @NameInMap("ResourceServerScopeName")
        public String resourceServerScopeName;

        /**
         * <p>IDaaS EIAM ResourceServer下权限类型</p>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:resourceserver:scope:delegated</p>
         */
        @NameInMap("ResourceServerScopeType")
        public String resourceServerScopeType;

        /**
         * <p>IDaaS EIAM ResourceServer下权限值</p>
         * 
         * <strong>example:</strong>
         * <p>User:Read:ALL</p>
         */
        @NameInMap("ResourceServerScopeValue")
        public String resourceServerScopeValue;

        public static GetResourceServerScopeResponseBodyResourceServerScope build(java.util.Map<String, ?> map) throws Exception {
            GetResourceServerScopeResponseBodyResourceServerScope self = new GetResourceServerScopeResponseBodyResourceServerScope();
            return TeaModel.build(map, self);
        }

        public GetResourceServerScopeResponseBodyResourceServerScope setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public GetResourceServerScopeResponseBodyResourceServerScope setAuthorizationType(String authorizationType) {
            this.authorizationType = authorizationType;
            return this;
        }
        public String getAuthorizationType() {
            return this.authorizationType;
        }

        public GetResourceServerScopeResponseBodyResourceServerScope setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetResourceServerScopeResponseBodyResourceServerScope setResourceServerScopeId(String resourceServerScopeId) {
            this.resourceServerScopeId = resourceServerScopeId;
            return this;
        }
        public String getResourceServerScopeId() {
            return this.resourceServerScopeId;
        }

        public GetResourceServerScopeResponseBodyResourceServerScope setResourceServerScopeName(String resourceServerScopeName) {
            this.resourceServerScopeName = resourceServerScopeName;
            return this;
        }
        public String getResourceServerScopeName() {
            return this.resourceServerScopeName;
        }

        public GetResourceServerScopeResponseBodyResourceServerScope setResourceServerScopeType(String resourceServerScopeType) {
            this.resourceServerScopeType = resourceServerScopeType;
            return this;
        }
        public String getResourceServerScopeType() {
            return this.resourceServerScopeType;
        }

        public GetResourceServerScopeResponseBodyResourceServerScope setResourceServerScopeValue(String resourceServerScopeValue) {
            this.resourceServerScopeValue = resourceServerScopeValue;
            return this;
        }
        public String getResourceServerScopeValue() {
            return this.resourceServerScopeValue;
        }

    }

}
