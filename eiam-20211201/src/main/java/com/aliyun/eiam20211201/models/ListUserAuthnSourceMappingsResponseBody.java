// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListUserAuthnSourceMappingsResponseBody extends TeaModel {
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
     * <p>本次调用返回的查询凭证（Token）值，用于上一次翻页查询。</p>
     * 
     * <strong>example:</strong>
     * <p>PTxxxexample</p>
     */
    @NameInMap("PreviousToken")
    public String previousToken;

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
    public Integer totalCount;

    @NameInMap("UserAuthnSourceMappings")
    public java.util.List<ListUserAuthnSourceMappingsResponseBodyUserAuthnSourceMappings> userAuthnSourceMappings;

    public static ListUserAuthnSourceMappingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserAuthnSourceMappingsResponseBody self = new ListUserAuthnSourceMappingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserAuthnSourceMappingsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserAuthnSourceMappingsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserAuthnSourceMappingsResponseBody setPreviousToken(String previousToken) {
        this.previousToken = previousToken;
        return this;
    }
    public String getPreviousToken() {
        return this.previousToken;
    }

    public ListUserAuthnSourceMappingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserAuthnSourceMappingsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListUserAuthnSourceMappingsResponseBody setUserAuthnSourceMappings(java.util.List<ListUserAuthnSourceMappingsResponseBodyUserAuthnSourceMappings> userAuthnSourceMappings) {
        this.userAuthnSourceMappings = userAuthnSourceMappings;
        return this;
    }
    public java.util.List<ListUserAuthnSourceMappingsResponseBodyUserAuthnSourceMappings> getUserAuthnSourceMappings() {
        return this.userAuthnSourceMappings;
    }

    public static class ListUserAuthnSourceMappingsResponseBodyUserAuthnSourceMappings extends TeaModel {
        /**
         * <p>来源Idp类型</p>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:authntype:oidc</p>
         */
        @NameInMap("AuthnSourceType")
        public String authnSourceType;

        /**
         * <p>创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>1762309642177</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ExternalData")
        public String externalData;

        /**
         * <p>来源Idp Id</p>
         * 
         * <strong>example:</strong>
         * <p>idp_my664lwkhpicbyzirog3xxxxx</p>
         */
        @NameInMap("IdentityProviderId")
        public String identityProviderId;

        /**
         * <p>实例Id</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>最近一次更新时间</p>
         * 
         * <strong>example:</strong>
         * <p>1762309642177</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>外部ID</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("UserExternalId")
        public String userExternalId;

        /**
         * <p>用户ID</p>
         * 
         * <strong>example:</strong>
         * <p>user_ue2jvisn35exxxxx</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListUserAuthnSourceMappingsResponseBodyUserAuthnSourceMappings build(java.util.Map<String, ?> map) throws Exception {
            ListUserAuthnSourceMappingsResponseBodyUserAuthnSourceMappings self = new ListUserAuthnSourceMappingsResponseBodyUserAuthnSourceMappings();
            return TeaModel.build(map, self);
        }

        public ListUserAuthnSourceMappingsResponseBodyUserAuthnSourceMappings setAuthnSourceType(String authnSourceType) {
            this.authnSourceType = authnSourceType;
            return this;
        }
        public String getAuthnSourceType() {
            return this.authnSourceType;
        }

        public ListUserAuthnSourceMappingsResponseBodyUserAuthnSourceMappings setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListUserAuthnSourceMappingsResponseBodyUserAuthnSourceMappings setExternalData(String externalData) {
            this.externalData = externalData;
            return this;
        }
        public String getExternalData() {
            return this.externalData;
        }

        public ListUserAuthnSourceMappingsResponseBodyUserAuthnSourceMappings setIdentityProviderId(String identityProviderId) {
            this.identityProviderId = identityProviderId;
            return this;
        }
        public String getIdentityProviderId() {
            return this.identityProviderId;
        }

        public ListUserAuthnSourceMappingsResponseBodyUserAuthnSourceMappings setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListUserAuthnSourceMappingsResponseBodyUserAuthnSourceMappings setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListUserAuthnSourceMappingsResponseBodyUserAuthnSourceMappings setUserExternalId(String userExternalId) {
            this.userExternalId = userExternalId;
            return this;
        }
        public String getUserExternalId() {
            return this.userExternalId;
        }

        public ListUserAuthnSourceMappingsResponseBodyUserAuthnSourceMappings setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
