// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListParameterSetsResponseBody extends TeaModel {
    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("parameterSets")
    public java.util.List<ListParameterSetsResponseBodyParameterSets> parameterSets;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListParameterSetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListParameterSetsResponseBody self = new ListParameterSetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListParameterSetsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListParameterSetsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListParameterSetsResponseBody setParameterSets(java.util.List<ListParameterSetsResponseBodyParameterSets> parameterSets) {
        this.parameterSets = parameterSets;
        return this;
    }
    public java.util.List<ListParameterSetsResponseBodyParameterSets> getParameterSets() {
        return this.parameterSets;
    }

    public ListParameterSetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListParameterSetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListParameterSetsResponseBodyParameterSetsParameters extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

        @NameInMap("value")
        public Object value;

        public static ListParameterSetsResponseBodyParameterSetsParameters build(java.util.Map<String, ?> map) throws Exception {
            ListParameterSetsResponseBodyParameterSetsParameters self = new ListParameterSetsResponseBodyParameterSetsParameters();
            return TeaModel.build(map, self);
        }

        public ListParameterSetsResponseBodyParameterSetsParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListParameterSetsResponseBodyParameterSetsParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListParameterSetsResponseBodyParameterSetsParameters setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class ListParameterSetsResponseBodyParameterSetsRelationList extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("resourceId")
        public String resourceId;

        @NameInMap("resourceType")
        public String resourceType;

        public static ListParameterSetsResponseBodyParameterSetsRelationList build(java.util.Map<String, ?> map) throws Exception {
            ListParameterSetsResponseBodyParameterSetsRelationList self = new ListParameterSetsResponseBodyParameterSetsRelationList();
            return TeaModel.build(map, self);
        }

        public ListParameterSetsResponseBodyParameterSetsRelationList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListParameterSetsResponseBodyParameterSetsRelationList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListParameterSetsResponseBodyParameterSetsRelationList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class ListParameterSetsResponseBodyParameterSets extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

        @NameInMap("parameterSetId")
        public String parameterSetId;

        @NameInMap("parameters")
        public java.util.List<ListParameterSetsResponseBodyParameterSetsParameters> parameters;

        @NameInMap("relationList")
        public java.util.List<ListParameterSetsResponseBodyParameterSetsRelationList> relationList;

        public static ListParameterSetsResponseBodyParameterSets build(java.util.Map<String, ?> map) throws Exception {
            ListParameterSetsResponseBodyParameterSets self = new ListParameterSetsResponseBodyParameterSets();
            return TeaModel.build(map, self);
        }

        public ListParameterSetsResponseBodyParameterSets setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListParameterSetsResponseBodyParameterSets setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListParameterSetsResponseBodyParameterSets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListParameterSetsResponseBodyParameterSets setParameterSetId(String parameterSetId) {
            this.parameterSetId = parameterSetId;
            return this;
        }
        public String getParameterSetId() {
            return this.parameterSetId;
        }

        public ListParameterSetsResponseBodyParameterSets setParameters(java.util.List<ListParameterSetsResponseBodyParameterSetsParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<ListParameterSetsResponseBodyParameterSetsParameters> getParameters() {
            return this.parameters;
        }

        public ListParameterSetsResponseBodyParameterSets setRelationList(java.util.List<ListParameterSetsResponseBodyParameterSetsRelationList> relationList) {
            this.relationList = relationList;
            return this;
        }
        public java.util.List<ListParameterSetsResponseBodyParameterSetsRelationList> getRelationList() {
            return this.relationList;
        }

    }

}
