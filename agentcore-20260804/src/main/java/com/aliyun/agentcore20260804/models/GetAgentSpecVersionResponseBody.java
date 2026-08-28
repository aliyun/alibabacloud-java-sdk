// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetAgentSpecVersionResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public GetAgentSpecVersionResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-47A8-90AB-CDEF12345678</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetAgentSpecVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentSpecVersionResponseBody self = new GetAgentSpecVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentSpecVersionResponseBody setData(GetAgentSpecVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentSpecVersionResponseBodyData getData() {
        return this.data;
    }

    public GetAgentSpecVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAgentSpecVersionResponseBodyData extends TeaModel {
        /**
         * <p>The business tags.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample property value</p>
         */
        @NameInMap("bizTags")
        public String bizTags;

        /**
         * <p>The content.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample content</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>A sample description that explains the purpose of the resource</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>agentspec-example</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The resource file mapping.</p>
         */
        @NameInMap("resource")
        public java.util.Map<String, DataResourceValue> resource;

        public static GetAgentSpecVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentSpecVersionResponseBodyData self = new GetAgentSpecVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentSpecVersionResponseBodyData setBizTags(String bizTags) {
            this.bizTags = bizTags;
            return this;
        }
        public String getBizTags() {
            return this.bizTags;
        }

        public GetAgentSpecVersionResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetAgentSpecVersionResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAgentSpecVersionResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAgentSpecVersionResponseBodyData setResource(java.util.Map<String, DataResourceValue> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.Map<String, DataResourceValue> getResource() {
            return this.resource;
        }

    }

}
