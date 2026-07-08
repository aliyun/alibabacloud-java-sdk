// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class ListUserAuthConfigsResponseBody extends TeaModel {
    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAVY3rYiv9VoUJQSiCitgjgRBp055u+7M/ZFoi7I0NZHJj8bgHiGAwZWnCMJPepC+WQbLSjoLewJIqkMQqvaJO7M=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>35A48818-81F2-506C-891C-2296BE8DD667</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The user authentication credentials.</p>
     */
    @NameInMap("UserAuthConfigs")
    public java.util.List<ListUserAuthConfigsResponseBodyUserAuthConfigs> userAuthConfigs;

    public static ListUserAuthConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserAuthConfigsResponseBody self = new ListUserAuthConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserAuthConfigsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserAuthConfigsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserAuthConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserAuthConfigsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListUserAuthConfigsResponseBody setUserAuthConfigs(java.util.List<ListUserAuthConfigsResponseBodyUserAuthConfigs> userAuthConfigs) {
        this.userAuthConfigs = userAuthConfigs;
        return this;
    }
    public java.util.List<ListUserAuthConfigsResponseBodyUserAuthConfigs> getUserAuthConfigs() {
        return this.userAuthConfigs;
    }

    public static class ListUserAuthConfigsResponseBodyUserAuthConfigs extends TeaModel {
        /**
         * <p>The credential ID.</p>
         * 
         * <strong>example:</strong>
         * <p>uac-xxxxxxxx</p>
         */
        @NameInMap("AuthConfigId")
        public String authConfigId;

        /**
         * <p>The credential name.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("AuthConfigName")
        public String authConfigName;

        /**
         * <p>The authentication type.</p>
         * 
         * <strong>example:</strong>
         * <p>ApiKey</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The ID of the connector.</p>
         * 
         * <strong>example:</strong>
         * <p>connector-xxxxxxxxx</p>
         */
        @NameInMap("ConnectorId")
        public String connectorId;

        /**
         * <p>The version of the connector.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ConnectorVersion")
        public String connectorVersion;

        /**
         * <p>The number of connection flows that use this credential.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FlowCount")
        public Integer flowCount;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-01 14:22:33</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-01 14:22:33</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        public static ListUserAuthConfigsResponseBodyUserAuthConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListUserAuthConfigsResponseBodyUserAuthConfigs self = new ListUserAuthConfigsResponseBodyUserAuthConfigs();
            return TeaModel.build(map, self);
        }

        public ListUserAuthConfigsResponseBodyUserAuthConfigs setAuthConfigId(String authConfigId) {
            this.authConfigId = authConfigId;
            return this;
        }
        public String getAuthConfigId() {
            return this.authConfigId;
        }

        public ListUserAuthConfigsResponseBodyUserAuthConfigs setAuthConfigName(String authConfigName) {
            this.authConfigName = authConfigName;
            return this;
        }
        public String getAuthConfigName() {
            return this.authConfigName;
        }

        public ListUserAuthConfigsResponseBodyUserAuthConfigs setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public ListUserAuthConfigsResponseBodyUserAuthConfigs setConnectorId(String connectorId) {
            this.connectorId = connectorId;
            return this;
        }
        public String getConnectorId() {
            return this.connectorId;
        }

        public ListUserAuthConfigsResponseBodyUserAuthConfigs setConnectorVersion(String connectorVersion) {
            this.connectorVersion = connectorVersion;
            return this;
        }
        public String getConnectorVersion() {
            return this.connectorVersion;
        }

        public ListUserAuthConfigsResponseBodyUserAuthConfigs setFlowCount(Integer flowCount) {
            this.flowCount = flowCount;
            return this;
        }
        public Integer getFlowCount() {
            return this.flowCount;
        }

        public ListUserAuthConfigsResponseBodyUserAuthConfigs setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListUserAuthConfigsResponseBodyUserAuthConfigs setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

    }

}
