// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class GetNamespaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetNamespaceResponseBodyData data;

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
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("PromptCount")
        public Integer promptCount;

        @NameInMap("ScanPolicy")
        public String scanPolicy;

        @NameInMap("SkillCount")
        public Integer skillCount;

        @NameInMap("Source")
        public String source;

        @NameInMap("SourceIndex")
        public Integer sourceIndex;

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
