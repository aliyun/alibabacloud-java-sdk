// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetParameterSetResponseBody extends TeaModel {
    @NameInMap("parameterSet")
    public GetParameterSetResponseBodyParameterSet parameterSet;

    @NameInMap("requestId")
    public String requestId;

    public static GetParameterSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetParameterSetResponseBody self = new GetParameterSetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetParameterSetResponseBody setParameterSet(GetParameterSetResponseBodyParameterSet parameterSet) {
        this.parameterSet = parameterSet;
        return this;
    }
    public GetParameterSetResponseBodyParameterSet getParameterSet() {
        return this.parameterSet;
    }

    public GetParameterSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetParameterSetResponseBodyParameterSetParameters extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

        @NameInMap("value")
        public Object value;

        public static GetParameterSetResponseBodyParameterSetParameters build(java.util.Map<String, ?> map) throws Exception {
            GetParameterSetResponseBodyParameterSetParameters self = new GetParameterSetResponseBodyParameterSetParameters();
            return TeaModel.build(map, self);
        }

        public GetParameterSetResponseBodyParameterSetParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetParameterSetResponseBodyParameterSetParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetParameterSetResponseBodyParameterSetParameters setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class GetParameterSetResponseBodyParameterSetRelationList extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("resourceId")
        public String resourceId;

        @NameInMap("resourceType")
        public String resourceType;

        public static GetParameterSetResponseBodyParameterSetRelationList build(java.util.Map<String, ?> map) throws Exception {
            GetParameterSetResponseBodyParameterSetRelationList self = new GetParameterSetResponseBodyParameterSetRelationList();
            return TeaModel.build(map, self);
        }

        public GetParameterSetResponseBodyParameterSetRelationList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetParameterSetResponseBodyParameterSetRelationList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetParameterSetResponseBodyParameterSetRelationList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class GetParameterSetResponseBodyParameterSet extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

        @NameInMap("parameterSetId")
        public String parameterSetId;

        @NameInMap("parameters")
        public java.util.List<GetParameterSetResponseBodyParameterSetParameters> parameters;

        @NameInMap("relationList")
        public java.util.List<GetParameterSetResponseBodyParameterSetRelationList> relationList;

        public static GetParameterSetResponseBodyParameterSet build(java.util.Map<String, ?> map) throws Exception {
            GetParameterSetResponseBodyParameterSet self = new GetParameterSetResponseBodyParameterSet();
            return TeaModel.build(map, self);
        }

        public GetParameterSetResponseBodyParameterSet setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetParameterSetResponseBodyParameterSet setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetParameterSetResponseBodyParameterSet setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetParameterSetResponseBodyParameterSet setParameterSetId(String parameterSetId) {
            this.parameterSetId = parameterSetId;
            return this;
        }
        public String getParameterSetId() {
            return this.parameterSetId;
        }

        public GetParameterSetResponseBodyParameterSet setParameters(java.util.List<GetParameterSetResponseBodyParameterSetParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<GetParameterSetResponseBodyParameterSetParameters> getParameters() {
            return this.parameters;
        }

        public GetParameterSetResponseBodyParameterSet setRelationList(java.util.List<GetParameterSetResponseBodyParameterSetRelationList> relationList) {
            this.relationList = relationList;
            return this;
        }
        public java.util.List<GetParameterSetResponseBodyParameterSetRelationList> getRelationList() {
            return this.relationList;
        }

    }

}
