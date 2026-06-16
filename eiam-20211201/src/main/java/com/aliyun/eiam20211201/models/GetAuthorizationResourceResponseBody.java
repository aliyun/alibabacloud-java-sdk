// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetAuthorizationResourceResponseBody extends TeaModel {
    /**
     * <p>The authorized resource.</p>
     */
    @NameInMap("AuthorizationResource")
    public GetAuthorizationResourceResponseBodyAuthorizationResource authorizationResource;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAuthorizationResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationResourceResponseBody self = new GetAuthorizationResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationResourceResponseBody setAuthorizationResource(GetAuthorizationResourceResponseBodyAuthorizationResource authorizationResource) {
        this.authorizationResource = authorizationResource;
        return this;
    }
    public GetAuthorizationResourceResponseBodyAuthorizationResource getAuthorizationResource() {
        return this.authorizationResource;
    }

    public GetAuthorizationResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAuthorizationResourceResponseBodyAuthorizationResource extends TeaModel {
        /**
         * <p>The ID of the resource entity that is associated with the authorized resource.</p>
         * 
         * <strong>example:</strong>
         * <p>carole_01kmek49aqxxxx</p>
         */
        @NameInMap("AuthorizationResourceEntityId")
        public String authorizationResourceEntityId;

        /**
         * <p>The type of the resource entity that is associated with the authorized resource. Valid value:</p>
         * <ul>
         * <li>cloud_account_role: a cloud role</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_account_role</p>
         */
        @NameInMap("AuthorizationResourceEntityType")
        public String authorizationResourceEntityType;

        /**
         * <p>The authorization resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>arres_01kgh3jvt7pk093rv6giu0c0qxxxx</p>
         */
        @NameInMap("AuthorizationResourceId")
        public String authorizationResourceId;

        /**
         * <p>The authorization rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
         */
        @NameInMap("AuthorizationRuleId")
        public String authorizationRuleId;

        /**
         * <p>The ID of the Alibaba Cloud account to which the resource entity that is associated with the authorized resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ca_01kmegjc11qa1txxxxx</p>
         */
        @NameInMap("CloudAccountId")
        public String cloudAccountId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static GetAuthorizationResourceResponseBodyAuthorizationResource build(java.util.Map<String, ?> map) throws Exception {
            GetAuthorizationResourceResponseBodyAuthorizationResource self = new GetAuthorizationResourceResponseBodyAuthorizationResource();
            return TeaModel.build(map, self);
        }

        public GetAuthorizationResourceResponseBodyAuthorizationResource setAuthorizationResourceEntityId(String authorizationResourceEntityId) {
            this.authorizationResourceEntityId = authorizationResourceEntityId;
            return this;
        }
        public String getAuthorizationResourceEntityId() {
            return this.authorizationResourceEntityId;
        }

        public GetAuthorizationResourceResponseBodyAuthorizationResource setAuthorizationResourceEntityType(String authorizationResourceEntityType) {
            this.authorizationResourceEntityType = authorizationResourceEntityType;
            return this;
        }
        public String getAuthorizationResourceEntityType() {
            return this.authorizationResourceEntityType;
        }

        public GetAuthorizationResourceResponseBodyAuthorizationResource setAuthorizationResourceId(String authorizationResourceId) {
            this.authorizationResourceId = authorizationResourceId;
            return this;
        }
        public String getAuthorizationResourceId() {
            return this.authorizationResourceId;
        }

        public GetAuthorizationResourceResponseBodyAuthorizationResource setAuthorizationRuleId(String authorizationRuleId) {
            this.authorizationRuleId = authorizationRuleId;
            return this;
        }
        public String getAuthorizationRuleId() {
            return this.authorizationRuleId;
        }

        public GetAuthorizationResourceResponseBodyAuthorizationResource setCloudAccountId(String cloudAccountId) {
            this.cloudAccountId = cloudAccountId;
            return this;
        }
        public String getCloudAccountId() {
            return this.cloudAccountId;
        }

        public GetAuthorizationResourceResponseBodyAuthorizationResource setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
