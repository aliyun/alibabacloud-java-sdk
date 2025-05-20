// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListVscsResponseBody extends TeaModel {
    /**
     * <p>No return. Please use TotalCount</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Indicates the position of the current call return read. An empty value means that the data has been fully read.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3a6b93229825ac667104463b56790c91</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>03668372-18FF-5959-98D9-6B36A4643C7A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total count of data under the current request conditions</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>VSC list</p>
     */
    @NameInMap("Vscs")
    public java.util.List<ListVscsResponseBodyVscs> vscs;

    public static ListVscsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVscsResponseBody self = new ListVscsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVscsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVscsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVscsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVscsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListVscsResponseBody setVscs(java.util.List<ListVscsResponseBodyVscs> vscs) {
        this.vscs = vscs;
        return this;
    }
    public java.util.List<ListVscsResponseBodyVscs> getVscs() {
        return this.vscs;
    }

    public static class ListVscsResponseBodyVscsTags extends TeaModel {
        /**
         * <p>Tag key</p>
         * 
         * <strong>example:</strong>
         * <p>key001</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>Tag value</p>
         * 
         * <strong>example:</strong>
         * <p>value001</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListVscsResponseBodyVscsTags build(java.util.Map<String, ?> map) throws Exception {
            ListVscsResponseBodyVscsTags self = new ListVscsResponseBodyVscsTags();
            return TeaModel.build(map, self);
        }

        public ListVscsResponseBodyVscsTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListVscsResponseBodyVscsTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListVscsResponseBodyVscs extends TeaModel {
        /**
         * <p>Lingjun node ID</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-fzh47xd7u08</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>Resource group ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2zkwhkns57i</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Status of Vsc</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Tags</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListVscsResponseBodyVscsTags> tags;

        /**
         * <p>Vsc ID</p>
         * 
         * <strong>example:</strong>
         * <p>vsc-001</p>
         */
        @NameInMap("VscId")
        public String vscId;

        /**
         * <p>Customized name of Vsc</p>
         * 
         * <strong>example:</strong>
         * <p>test_name</p>
         */
        @NameInMap("VscName")
        public String vscName;

        /**
         * <p>Vsc type, primary/standard</p>
         * 
         * <strong>example:</strong>
         * <p>primary</p>
         */
        @NameInMap("VscType")
        public String vscType;

        public static ListVscsResponseBodyVscs build(java.util.Map<String, ?> map) throws Exception {
            ListVscsResponseBodyVscs self = new ListVscsResponseBodyVscs();
            return TeaModel.build(map, self);
        }

        public ListVscsResponseBodyVscs setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListVscsResponseBodyVscs setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListVscsResponseBodyVscs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListVscsResponseBodyVscs setTags(java.util.List<ListVscsResponseBodyVscsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListVscsResponseBodyVscsTags> getTags() {
            return this.tags;
        }

        public ListVscsResponseBodyVscs setVscId(String vscId) {
            this.vscId = vscId;
            return this;
        }
        public String getVscId() {
            return this.vscId;
        }

        public ListVscsResponseBodyVscs setVscName(String vscName) {
            this.vscName = vscName;
            return this;
        }
        public String getVscName() {
            return this.vscName;
        }

        public ListVscsResponseBodyVscs setVscType(String vscType) {
            this.vscType = vscType;
            return this;
        }
        public String getVscType() {
            return this.vscType;
        }

    }

}
