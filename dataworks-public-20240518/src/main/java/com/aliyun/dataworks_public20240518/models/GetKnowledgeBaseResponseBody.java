// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetKnowledgeBaseResponseBody extends TeaModel {
    /**
     * <p>The business error code. This field may be omitted if the request succeeds. If the request fails, the common error response protocol applies.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The public configuration information of the target knowledge base.</p>
     */
    @NameInMap("Data")
    public GetKnowledgeBaseResponseBodyData data;

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

    public static GetKnowledgeBaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeBaseResponseBody self = new GetKnowledgeBaseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeBaseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetKnowledgeBaseResponseBody setData(GetKnowledgeBaseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetKnowledgeBaseResponseBodyData getData() {
        return this.data;
    }

    public GetKnowledgeBaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetKnowledgeBaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKnowledgeBaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetKnowledgeBaseResponseBodyData extends TeaModel {
        /**
         * <p>The read-only access role of the current caller for the knowledge base. Valid values: OWNER (owner), ADMIN (administrator), and VIEWER (viewer).</p>
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
         * <p>The description of the knowledge base. This field can be empty if it is not set.</p>
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
         * <p>The public status of the knowledge base. This list returns only normal and visible knowledge bases. The value is ACTIVE.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the knowledge base. Valid values: PERSONAL (personal knowledge base) and ENTERPRISE (enterprise knowledge base).</p>
         * 
         * <strong>example:</strong>
         * <p>PERSONAL</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetKnowledgeBaseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseResponseBodyData self = new GetKnowledgeBaseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseResponseBodyData setAccessRole(String accessRole) {
            this.accessRole = accessRole;
            return this;
        }
        public String getAccessRole() {
            return this.accessRole;
        }

        public GetKnowledgeBaseResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetKnowledgeBaseResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetKnowledgeBaseResponseBodyData setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public GetKnowledgeBaseResponseBodyData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetKnowledgeBaseResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetKnowledgeBaseResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetKnowledgeBaseResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetKnowledgeBaseResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
