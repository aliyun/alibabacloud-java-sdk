// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class ListUserAuthConfigsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>QQBotAccessToken</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connector-88d2c03da8c9410e8a91</p>
     */
    @NameInMap("ConnectorId")
    public String connectorId;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("ConnectorVersion")
    public String connectorVersion;

    @NameInMap("Filter")
    public java.util.List<ListUserAuthConfigsRequestFilter> filter;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAVY3rYiv9VoUJQSiCitgjgQu5rMgGgvUoNWg8LykhA85j8bgHiGAwZWnCMJPepC+WWc0DK5hx1qIycMHVWP2AjQ=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListUserAuthConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserAuthConfigsRequest self = new ListUserAuthConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserAuthConfigsRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public ListUserAuthConfigsRequest setConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    public String getConnectorId() {
        return this.connectorId;
    }

    public ListUserAuthConfigsRequest setConnectorVersion(String connectorVersion) {
        this.connectorVersion = connectorVersion;
        return this;
    }
    public String getConnectorVersion() {
        return this.connectorVersion;
    }

    public ListUserAuthConfigsRequest setFilter(java.util.List<ListUserAuthConfigsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListUserAuthConfigsRequestFilter> getFilter() {
        return this.filter;
    }

    public ListUserAuthConfigsRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListUserAuthConfigsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListUserAuthConfigsRequestFilter extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AuthConfigName</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static ListUserAuthConfigsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListUserAuthConfigsRequestFilter self = new ListUserAuthConfigsRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListUserAuthConfigsRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserAuthConfigsRequestFilter setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

}
