// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListAuthorizationResourcesResponseBody extends TeaModel {
    @NameInMap("AuthorizationResources")
    public java.util.List<ListAuthorizationResourcesResponseBodyAuthorizationResources> authorizationResources;

    /**
     * <p>分页查询时每页行数。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>本次调用返回的查询凭证（Token）值，用于下一次翻页查询。</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAuthorizationResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationResourcesResponseBody self = new ListAuthorizationResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationResourcesResponseBody setAuthorizationResources(java.util.List<ListAuthorizationResourcesResponseBodyAuthorizationResources> authorizationResources) {
        this.authorizationResources = authorizationResources;
        return this;
    }
    public java.util.List<ListAuthorizationResourcesResponseBodyAuthorizationResources> getAuthorizationResources() {
        return this.authorizationResources;
    }

    public ListAuthorizationResourcesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAuthorizationResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAuthorizationResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthorizationResourcesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAuthorizationResourcesResponseBodyAuthorizationResources extends TeaModel {
        /**
         * <p>资源实体标识</p>
         * 
         * <strong>example:</strong>
         * <p>carole_01kmek49aqxxxx</p>
         */
        @NameInMap("AuthorizationResourceEntityId")
        public String authorizationResourceEntityId;

        /**
         * <p>资源实体类型，枚举类型：asset（资产）、credential（凭据）、cloud_identity_role（云账号角色）</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_account_role</p>
         */
        @NameInMap("AuthorizationResourceEntityType")
        public String authorizationResourceEntityType;

        /**
         * <p>授权资源标识</p>
         * 
         * <strong>example:</strong>
         * <p>arres_01kgh3jvt7pk093rv6giu0c0qxxxx</p>
         */
        @NameInMap("AuthorizationResourceId")
        public String authorizationResourceId;

        /**
         * <p>授权规则标识</p>
         * 
         * <strong>example:</strong>
         * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
         */
        @NameInMap("AuthorizationRuleId")
        public String authorizationRuleId;

        /**
         * <p>云账号ID。</p>
         * 
         * <strong>example:</strong>
         * <p>ca_01kmegjc11qa1txxxxx</p>
         */
        @NameInMap("CloudAccountId")
        public String cloudAccountId;

        /**
         * <p>实例ID</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static ListAuthorizationResourcesResponseBodyAuthorizationResources build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizationResourcesResponseBodyAuthorizationResources self = new ListAuthorizationResourcesResponseBodyAuthorizationResources();
            return TeaModel.build(map, self);
        }

        public ListAuthorizationResourcesResponseBodyAuthorizationResources setAuthorizationResourceEntityId(String authorizationResourceEntityId) {
            this.authorizationResourceEntityId = authorizationResourceEntityId;
            return this;
        }
        public String getAuthorizationResourceEntityId() {
            return this.authorizationResourceEntityId;
        }

        public ListAuthorizationResourcesResponseBodyAuthorizationResources setAuthorizationResourceEntityType(String authorizationResourceEntityType) {
            this.authorizationResourceEntityType = authorizationResourceEntityType;
            return this;
        }
        public String getAuthorizationResourceEntityType() {
            return this.authorizationResourceEntityType;
        }

        public ListAuthorizationResourcesResponseBodyAuthorizationResources setAuthorizationResourceId(String authorizationResourceId) {
            this.authorizationResourceId = authorizationResourceId;
            return this;
        }
        public String getAuthorizationResourceId() {
            return this.authorizationResourceId;
        }

        public ListAuthorizationResourcesResponseBodyAuthorizationResources setAuthorizationRuleId(String authorizationRuleId) {
            this.authorizationRuleId = authorizationRuleId;
            return this;
        }
        public String getAuthorizationRuleId() {
            return this.authorizationRuleId;
        }

        public ListAuthorizationResourcesResponseBodyAuthorizationResources setCloudAccountId(String cloudAccountId) {
            this.cloudAccountId = cloudAccountId;
            return this;
        }
        public String getCloudAccountId() {
            return this.cloudAccountId;
        }

        public ListAuthorizationResourcesResponseBodyAuthorizationResources setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
