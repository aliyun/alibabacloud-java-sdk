// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ListFlowAliasesResponseBody extends TeaModel {
    @NameInMap("Aliases")
    public java.util.List<ListFlowAliasesResponseBodyAliases> aliases;

    /**
     * <p>list token</p>
     * 
     * <strong>example:</strong>
     * <p>testNextToken</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3A44E113-9962-5B0B-AB92-14060EFE3164</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListFlowAliasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowAliasesResponseBody self = new ListFlowAliasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowAliasesResponseBody setAliases(java.util.List<ListFlowAliasesResponseBodyAliases> aliases) {
        this.aliases = aliases;
        return this;
    }
    public java.util.List<ListFlowAliasesResponseBodyAliases> getAliases() {
        return this.aliases;
    }

    public ListFlowAliasesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFlowAliasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFlowAliasesResponseBodyAliasesRoutingConfigurations extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Weight")
        public String weight;

        public static ListFlowAliasesResponseBodyAliasesRoutingConfigurations build(java.util.Map<String, ?> map) throws Exception {
            ListFlowAliasesResponseBodyAliasesRoutingConfigurations self = new ListFlowAliasesResponseBodyAliasesRoutingConfigurations();
            return TeaModel.build(map, self);
        }

        public ListFlowAliasesResponseBodyAliasesRoutingConfigurations setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListFlowAliasesResponseBodyAliasesRoutingConfigurations setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

    public static class ListFlowAliasesResponseBodyAliases extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-10-24T14:11:26+08:00</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <strong>example:</strong>
         * <p>my alias description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>my-alias-name</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("RoutingConfigurations")
        public java.util.List<ListFlowAliasesResponseBodyAliasesRoutingConfigurations> routingConfigurations;

        public static ListFlowAliasesResponseBodyAliases build(java.util.Map<String, ?> map) throws Exception {
            ListFlowAliasesResponseBodyAliases self = new ListFlowAliasesResponseBodyAliases();
            return TeaModel.build(map, self);
        }

        public ListFlowAliasesResponseBodyAliases setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListFlowAliasesResponseBodyAliases setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFlowAliasesResponseBodyAliases setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFlowAliasesResponseBodyAliases setRoutingConfigurations(java.util.List<ListFlowAliasesResponseBodyAliasesRoutingConfigurations> routingConfigurations) {
            this.routingConfigurations = routingConfigurations;
            return this;
        }
        public java.util.List<ListFlowAliasesResponseBodyAliasesRoutingConfigurations> getRoutingConfigurations() {
            return this.routingConfigurations;
        }

    }

}
