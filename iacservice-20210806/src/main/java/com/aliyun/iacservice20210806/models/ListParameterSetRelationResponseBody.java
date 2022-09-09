// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListParameterSetRelationResponseBody extends TeaModel {
    @NameInMap("parameterSets")
    public java.util.List<ListParameterSetRelationResponseBodyParameterSets> parameterSets;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListParameterSetRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListParameterSetRelationResponseBody self = new ListParameterSetRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListParameterSetRelationResponseBody setParameterSets(java.util.List<ListParameterSetRelationResponseBodyParameterSets> parameterSets) {
        this.parameterSets = parameterSets;
        return this;
    }
    public java.util.List<ListParameterSetRelationResponseBodyParameterSets> getParameterSets() {
        return this.parameterSets;
    }

    public ListParameterSetRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListParameterSetRelationResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListParameterSetRelationResponseBodyParameterSets extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

        @NameInMap("parameterSetId")
        public String parameterSetId;

        @NameInMap("parameters")
        public java.util.Map<String, String> parameters;

        public static ListParameterSetRelationResponseBodyParameterSets build(java.util.Map<String, ?> map) throws Exception {
            ListParameterSetRelationResponseBodyParameterSets self = new ListParameterSetRelationResponseBodyParameterSets();
            return TeaModel.build(map, self);
        }

        public ListParameterSetRelationResponseBodyParameterSets setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListParameterSetRelationResponseBodyParameterSets setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListParameterSetRelationResponseBodyParameterSets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListParameterSetRelationResponseBodyParameterSets setParameterSetId(String parameterSetId) {
            this.parameterSetId = parameterSetId;
            return this;
        }
        public String getParameterSetId() {
            return this.parameterSetId;
        }

        public ListParameterSetRelationResponseBodyParameterSets setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

    }

}
