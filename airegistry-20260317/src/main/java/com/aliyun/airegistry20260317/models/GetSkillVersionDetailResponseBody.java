// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class GetSkillVersionDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetSkillVersionDetailResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSkillVersionDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillVersionDetailResponseBody self = new GetSkillVersionDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillVersionDetailResponseBody setData(GetSkillVersionDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSkillVersionDetailResponseBodyData getData() {
        return this.data;
    }

    public GetSkillVersionDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSkillVersionDetailResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("Resource")
        public java.util.Map<String, DataResourceValue> resource;

        @NameInMap("SkillMd")
        public String skillMd;

        public static GetSkillVersionDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSkillVersionDetailResponseBodyData self = new GetSkillVersionDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSkillVersionDetailResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSkillVersionDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSkillVersionDetailResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public GetSkillVersionDetailResponseBodyData setResource(java.util.Map<String, DataResourceValue> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.Map<String, DataResourceValue> getResource() {
            return this.resource;
        }

        public GetSkillVersionDetailResponseBodyData setSkillMd(String skillMd) {
            this.skillMd = skillMd;
            return this;
        }
        public String getSkillMd() {
            return this.skillMd;
        }

    }

}
