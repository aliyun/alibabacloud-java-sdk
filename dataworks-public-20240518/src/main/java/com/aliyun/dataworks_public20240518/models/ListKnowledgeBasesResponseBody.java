// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListKnowledgeBasesResponseBody extends TeaModel {
    /**
     * <p>The business error code. This field may be omitted if the request succeeds. If the request fails, the common error response protocol applies.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of knowledge bases on the current page and the cursor for the next page.</p>
     */
    @NameInMap("Data")
    public ListKnowledgeBasesResponseBodyData data;

    /**
     * <p>The maximum number of knowledge bases to return per page. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A human-readable description of the business error. This field may be omitted if the request succeeds. Provide the RequestId when troubleshooting failures.</p>
     * 
     * <strong>example:</strong>
     * <p>The request parameters are invalid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request, which can be used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-4000-8000-000000000001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListKnowledgeBasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeBasesResponseBody self = new ListKnowledgeBasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeBasesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListKnowledgeBasesResponseBody setData(ListKnowledgeBasesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListKnowledgeBasesResponseBodyData getData() {
        return this.data;
    }

    public ListKnowledgeBasesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListKnowledgeBasesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListKnowledgeBasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKnowledgeBasesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListKnowledgeBasesResponseBodyDataKnowledgeBases extends TeaModel {
        /**
         * <p>The read-only access role of the current caller for the knowledge base. Valid values:</p>
         * <ul>
         * <li>OWNER: owner</li>
         * <li>ADMIN: administrator</li>
         * <li>VIEWER: viewer</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OWNER</p>
         */
        @NameInMap("AccessRole")
        public String accessRole;

        /**
         * <p>The creation time of the knowledge base. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1794369600000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the knowledge base. This field can be empty if no description is set.</p>
         * 
         * <strong>example:</strong>
         * <p>Knowledge about sales metrics, orders, and business policies</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The stable ID of the knowledge base, which can be used to limit the search scope.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The last modification time of the knowledge base. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1794373200000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The name of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales knowledge base</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The DataWorks user ID of the knowledge base owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000000000000</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The public status of the knowledge base. This list returns only normally visible knowledge bases, and the value is ACTIVE.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the knowledge base. Valid values:</p>
         * <ul>
         * <li>PERSONAL: personal knowledge base</li>
         * <li>ENTERPRISE: enterprise knowledge base</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PERSONAL</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListKnowledgeBasesResponseBodyDataKnowledgeBases build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBasesResponseBodyDataKnowledgeBases self = new ListKnowledgeBasesResponseBodyDataKnowledgeBases();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBasesResponseBodyDataKnowledgeBases setAccessRole(String accessRole) {
            this.accessRole = accessRole;
            return this;
        }
        public String getAccessRole() {
            return this.accessRole;
        }

        public ListKnowledgeBasesResponseBodyDataKnowledgeBases setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListKnowledgeBasesResponseBodyDataKnowledgeBases setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListKnowledgeBasesResponseBodyDataKnowledgeBases setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public ListKnowledgeBasesResponseBodyDataKnowledgeBases setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListKnowledgeBasesResponseBodyDataKnowledgeBases setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListKnowledgeBasesResponseBodyDataKnowledgeBases setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListKnowledgeBasesResponseBodyDataKnowledgeBases setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListKnowledgeBasesResponseBodyDataKnowledgeBases setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListKnowledgeBasesResponseBodyData extends TeaModel {
        /**
         * <p>The list of knowledge bases that the current caller has permission to view in the current region.</p>
         */
        @NameInMap("KnowledgeBases")
        public java.util.List<ListKnowledgeBasesResponseBodyDataKnowledgeBases> knowledgeBases;

        /**
         * <p>The pagination cursor. Do not specify this parameter when you request the first page. For subsequent pages, use the NextToken value returned in the previous response as is. An empty response indicates that no more pages are available. If the current page is empty but the cursor is not empty, continue pagination. Keep the same MaxResults value during pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJvZmZzZXQiOjIwfQ</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        public static ListKnowledgeBasesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBasesResponseBodyData self = new ListKnowledgeBasesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBasesResponseBodyData setKnowledgeBases(java.util.List<ListKnowledgeBasesResponseBodyDataKnowledgeBases> knowledgeBases) {
            this.knowledgeBases = knowledgeBases;
            return this;
        }
        public java.util.List<ListKnowledgeBasesResponseBodyDataKnowledgeBases> getKnowledgeBases() {
            return this.knowledgeBases;
        }

        public ListKnowledgeBasesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
