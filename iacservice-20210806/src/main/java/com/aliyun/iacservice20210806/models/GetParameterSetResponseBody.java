// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetParameterSetResponseBody extends TeaModel {
    @NameInMap("parameterSet")
    public GetParameterSetResponseBodyParameterSet parameterSet;

    /**
     * <strong>example:</strong>
     * <p>99905C7C-1320-5E7F-A798-3071482EB08E</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>test1121</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>vpc-2ze83xrka9ktxy0pnaxn5</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>2022-04-24T22:58:50Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>mod-433aead756057101546eb5d50c1</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>Module</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>2022-01-30T02:14:16Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>pts-3b6cb9fa4751afff9c5e4e01624b9</p>
         */
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
