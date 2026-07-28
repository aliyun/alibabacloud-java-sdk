// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListParameterSetsResponseBody extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of results per page. Default value: 20. Minimum value: 1. Maximum value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The parameter sets.</p>
     */
    @NameInMap("parameterSets")
    public java.util.List<ListParameterSetsResponseBodyParameterSets> parameterSets;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4E188A8C-D77A-53F2-9578-E9AD8ABF2FA9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
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
        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>region</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("secret")
        public Boolean secret;

        /**
         * <p>The parameter set status. Valid values:</p>
         * <p>HAS_VALUE (default): A specific value is defined.</p>
         * <p>EXPLICIT_NULL: The value is explicitly set to null.</p>
         * 
         * <strong>example:</strong>
         * <p>HAS_VALUE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The parameter type (string/number/bool/map(string)/list(string)).</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
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

        public ListParameterSetsResponseBodyParameterSetsParameters setSecret(Boolean secret) {
            this.secret = secret;
            return this;
        }
        public Boolean getSecret() {
            return this.secret;
        }

        public ListParameterSetsResponseBodyParameterSetsParameters setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-06-09T03:46:18Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The resource ID. When the resource type is ModuleVersion, the value is a concatenation of <moduleId>-<moduleversion>, such as mod-34535345df123fr-v3.</p>
         * 
         * <strong>example:</strong>
         * <p>task-433aead756057ffdf5326bf1e12ed</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>The resource type. Valid values:</p>
         * <ul>
         * <li>Module: template</li>
         * <li>ModuleVersion: template version</li>
         * <li>Task: task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Module</p>
         */
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
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-14T10:05:19Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>Indicates whether deletion protection is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("deletionProtection")
        public Boolean deletionProtection;

        /**
         * <p>The description of the parameter set.</p>
         * 
         * <strong>example:</strong>
         * <p>This is parameterSet</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The name of the parameter set.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the parameter set.</p>
         * 
         * <strong>example:</strong>
         * <p>pts-433aead756057ea135b21e89c</p>
         */
        @NameInMap("parameterSetId")
        public String parameterSetId;

        /**
         * <p>The parameters in the parameter set.</p>
         */
        @NameInMap("parameters")
        public java.util.List<ListParameterSetsResponseBodyParameterSetsParameters> parameters;

        /**
         * <p>The relationships associated with the parameter set.</p>
         */
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

        public ListParameterSetsResponseBodyParameterSets setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
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
