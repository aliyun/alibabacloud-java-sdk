// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class ListSupportedConnectorsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<ListSupportedConnectorsResponseBodyData> data;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListSupportedConnectorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSupportedConnectorsResponseBody self = new ListSupportedConnectorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSupportedConnectorsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListSupportedConnectorsResponseBody setData(java.util.List<ListSupportedConnectorsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSupportedConnectorsResponseBodyData> getData() {
        return this.data;
    }

    public ListSupportedConnectorsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSupportedConnectorsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSupportedConnectorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSupportedConnectorsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSupportedConnectorsResponseBodyData extends TeaModel {
        @NameInMap("Connector")
        public String connector;

        @NameInMap("Description")
        public String description;

        @NameInMap("IconUrl")
        public String iconUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("SinkSql")
        public String sinkSql;

        @NameInMap("SourceSql")
        public String sourceSql;

        public static ListSupportedConnectorsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSupportedConnectorsResponseBodyData self = new ListSupportedConnectorsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSupportedConnectorsResponseBodyData setConnector(String connector) {
            this.connector = connector;
            return this;
        }
        public String getConnector() {
            return this.connector;
        }

        public ListSupportedConnectorsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSupportedConnectorsResponseBodyData setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public ListSupportedConnectorsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSupportedConnectorsResponseBodyData setSinkSql(String sinkSql) {
            this.sinkSql = sinkSql;
            return this;
        }
        public String getSinkSql() {
            return this.sinkSql;
        }

        public ListSupportedConnectorsResponseBodyData setSourceSql(String sourceSql) {
            this.sourceSql = sourceSql;
            return this;
        }
        public String getSourceSql() {
            return this.sourceSql;
        }

    }

}
