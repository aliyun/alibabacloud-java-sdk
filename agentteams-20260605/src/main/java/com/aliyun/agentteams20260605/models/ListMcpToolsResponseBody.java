// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ListMcpToolsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Items")
    public java.util.List<ListMcpToolsResponseBodyItems> items;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListMcpToolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMcpToolsResponseBody self = new ListMcpToolsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMcpToolsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMcpToolsResponseBody setItems(java.util.List<ListMcpToolsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListMcpToolsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListMcpToolsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMcpToolsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMcpToolsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMcpToolsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMcpToolsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMcpToolsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListMcpToolsResponseBodyItems extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("InputSchema")
        public String inputSchema;

        @NameInMap("Name")
        public String name;

        @NameInMap("Title")
        public String title;

        public static ListMcpToolsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListMcpToolsResponseBodyItems self = new ListMcpToolsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListMcpToolsResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMcpToolsResponseBodyItems setInputSchema(String inputSchema) {
            this.inputSchema = inputSchema;
            return this;
        }
        public String getInputSchema() {
            return this.inputSchema;
        }

        public ListMcpToolsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMcpToolsResponseBodyItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
