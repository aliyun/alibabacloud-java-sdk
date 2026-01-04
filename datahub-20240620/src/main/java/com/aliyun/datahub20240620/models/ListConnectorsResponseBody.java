// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20240620.models;

import com.aliyun.tea.*;

public class ListConnectorsResponseBody extends TeaModel {
    @NameInMap("List")
    public ListConnectorsResponseBodyList list;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>9892074a2a89600ae4b0d5a34fb99a3f</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>A20A7093-8FE0-058C-BE0C-3C8057D5F1A1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListConnectorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConnectorsResponseBody self = new ListConnectorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConnectorsResponseBody setList(ListConnectorsResponseBodyList list) {
        this.list = list;
        return this;
    }
    public ListConnectorsResponseBodyList getList() {
        return this.list;
    }

    public ListConnectorsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListConnectorsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListConnectorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConnectorsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListConnectorsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListConnectorsResponseBodyListConnector extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[\&quot;field1\&quot;,\&quot;field2\&quot;]</p>
         */
        @NameInMap("ColumnFields")
        public String columnFields;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;Table\&quot;:\&quot;r3\&quot;,\&quot;Endpoint\&quot;:\&quot;<a href="https://Device-data.cn-beijing.ots-internal.aliyuncs.com%5C%5C%22,%5C%5C%22Instance%5C%5C%22:%5C%5C%22Device-data%5C%5C%22,%5C%5C%22WriteMode%5C%5C%22:%5C%5C%22PUT%5C%5C%22,%5C%5C%22AuthMode%5C%5C%22:%5C%5C%22STS%5C%5C%22%7D">https://Device-data.cn-beijing.ots-internal.aliyuncs.com\\&quot;,\\&quot;Instance\\&quot;:\\&quot;Device-data\\&quot;,\\&quot;WriteMode\\&quot;:\\&quot;PUT\\&quot;,\\&quot;AuthMode\\&quot;:\\&quot;STS\\&quot;}</a></p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <strong>example:</strong>
         * <p>fa44384c-0ac5-4d3e-8acd-76e18636ab10</p>
         */
        @NameInMap("ConnectorId")
        public String connectorId;

        /**
         * <strong>example:</strong>
         * <p>1724041098000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1696648921408952</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>2025-12-04 16:45:00</p>
         */
        @NameInMap("DoneTime")
        public String doneTime;

        /**
         * <strong>example:</strong>
         * <p>test_project</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>1745824636429WZ2EE</p>
         */
        @NameInMap("SubscriptionId")
        public String subscriptionId;

        /**
         * <strong>example:</strong>
         * <p>test_topic</p>
         */
        @NameInMap("TopicName")
        public String topicName;

        /**
         * <strong>example:</strong>
         * <p>SINK_ODPS</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>1708171905000</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListConnectorsResponseBodyListConnector build(java.util.Map<String, ?> map) throws Exception {
            ListConnectorsResponseBodyListConnector self = new ListConnectorsResponseBodyListConnector();
            return TeaModel.build(map, self);
        }

        public ListConnectorsResponseBodyListConnector setColumnFields(String columnFields) {
            this.columnFields = columnFields;
            return this;
        }
        public String getColumnFields() {
            return this.columnFields;
        }

        public ListConnectorsResponseBodyListConnector setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListConnectorsResponseBodyListConnector setConnectorId(String connectorId) {
            this.connectorId = connectorId;
            return this;
        }
        public String getConnectorId() {
            return this.connectorId;
        }

        public ListConnectorsResponseBodyListConnector setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListConnectorsResponseBodyListConnector setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListConnectorsResponseBodyListConnector setDoneTime(String doneTime) {
            this.doneTime = doneTime;
            return this;
        }
        public String getDoneTime() {
            return this.doneTime;
        }

        public ListConnectorsResponseBodyListConnector setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListConnectorsResponseBodyListConnector setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListConnectorsResponseBodyListConnector setSubscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public String getSubscriptionId() {
            return this.subscriptionId;
        }

        public ListConnectorsResponseBodyListConnector setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public ListConnectorsResponseBodyListConnector setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListConnectorsResponseBodyListConnector setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListConnectorsResponseBodyList extends TeaModel {
        @NameInMap("Connector")
        public java.util.List<ListConnectorsResponseBodyListConnector> connector;

        public static ListConnectorsResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListConnectorsResponseBodyList self = new ListConnectorsResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListConnectorsResponseBodyList setConnector(java.util.List<ListConnectorsResponseBodyListConnector> connector) {
            this.connector = connector;
            return this;
        }
        public java.util.List<ListConnectorsResponseBodyListConnector> getConnector() {
            return this.connector;
        }

    }

}
