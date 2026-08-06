// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class GetNamespaceResponseBody extends TeaModel {
    /**
     * <p>The namespace information.</p>
     */
    @NameInMap("Data")
    public GetNamespaceResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D9E87E66-9EF0-5C10-A5E6-924020A0C9B7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNamespaceResponseBody self = new GetNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNamespaceResponseBody setData(GetNamespaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetNamespaceResponseBodyData getData() {
        return this.data;
    }

    public GetNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetNamespaceResponseBodyData extends TeaModel {
        /**
         * <p>The time when the namespace was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-17T09:57:38+08:00</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The description of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>secret for bbtadmin</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("IpWhitelist")
        public String ipWhitelist;

        /**
         * <p>The namespace name.</p>
         * 
         * <strong>example:</strong>
         * <p>magic:magic-cn-1us4sed5d01</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a2a9310a-9d91-4283-b4e2-844f6d45fe64</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The number of prompts in the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PromptCount")
        public Integer promptCount;

        @NameInMap("PublicAccessEnabled")
        public Boolean publicAccessEnabled;

        @NameInMap("PublicDomain")
        public String publicDomain;

        /**
         * <p>The scan policy.</p>
         * <p>The policy contains two configuration items:</p>
         * <ul>
         * <li>minBlockRiskLevel: the risk level for blocking.<ul>
         * <li>high: blocks high-risk items.</li>
         * <li>medium: blocks medium- and high-risk items.</li>
         * <li>low: blocks all risk levels including high, medium, and low.</li>
         * </ul>
         * </li>
         * <li>maxSkipRatio: the maximum skip ratio. If the scan skip ratio exceeds this value, the scan is considered as failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;minBlockRiskLevel&quot;:&quot;medium&quot;,&quot;maxSkipRatio&quot;:0.2}</p>
         */
        @NameInMap("ScanPolicy")
        public String scanPolicy;

        /**
         * <p>The number of skills in the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SkillCount")
        public Integer skillCount;

        /**
         * <p>The source of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>magic:magic-cn-1us4sed5d01</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The source ordinal number of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SourceIndex")
        public Integer sourceIndex;

        /**
         * <p>The tags of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Tags")
        public String tags;

        public static GetNamespaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNamespaceResponseBodyData self = new GetNamespaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNamespaceResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetNamespaceResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetNamespaceResponseBodyData setIpWhitelist(String ipWhitelist) {
            this.ipWhitelist = ipWhitelist;
            return this;
        }
        public String getIpWhitelist() {
            return this.ipWhitelist;
        }

        public GetNamespaceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetNamespaceResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public GetNamespaceResponseBodyData setPromptCount(Integer promptCount) {
            this.promptCount = promptCount;
            return this;
        }
        public Integer getPromptCount() {
            return this.promptCount;
        }

        public GetNamespaceResponseBodyData setPublicAccessEnabled(Boolean publicAccessEnabled) {
            this.publicAccessEnabled = publicAccessEnabled;
            return this;
        }
        public Boolean getPublicAccessEnabled() {
            return this.publicAccessEnabled;
        }

        public GetNamespaceResponseBodyData setPublicDomain(String publicDomain) {
            this.publicDomain = publicDomain;
            return this;
        }
        public String getPublicDomain() {
            return this.publicDomain;
        }

        public GetNamespaceResponseBodyData setScanPolicy(String scanPolicy) {
            this.scanPolicy = scanPolicy;
            return this;
        }
        public String getScanPolicy() {
            return this.scanPolicy;
        }

        public GetNamespaceResponseBodyData setSkillCount(Integer skillCount) {
            this.skillCount = skillCount;
            return this;
        }
        public Integer getSkillCount() {
            return this.skillCount;
        }

        public GetNamespaceResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetNamespaceResponseBodyData setSourceIndex(Integer sourceIndex) {
            this.sourceIndex = sourceIndex;
            return this;
        }
        public Integer getSourceIndex() {
            return this.sourceIndex;
        }

        public GetNamespaceResponseBodyData setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

}
