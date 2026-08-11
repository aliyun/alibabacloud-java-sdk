// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetParameterSetResponseBody extends TeaModel {
    /**
     * <p>The parameter set details.</p>
     */
    @NameInMap("parameterSet")
    public GetParameterSetResponseBodyParameterSet parameterSet;

    /**
     * <p>The request ID.</p>
     * 
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
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>region</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Specifies whether the parameter is secret. Secret parameters are hidden in API responses and console displays, and are stored with encryption.</p>
         */
        @NameInMap("secret")
        public Boolean secret;

        /**
         * <p>The parameter set status. Valid values:</p>
         * <ul>
         * <li>HAS_VALUE (default): A specific value is defined.</li>
         * <li>EXPLICIT_NULL: Explicitly set to null.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HAS_VALUE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The type of the parameter (string/number/bool/map(string)/list(string)).</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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

        public GetParameterSetResponseBodyParameterSetParameters setSecret(Boolean secret) {
            this.secret = secret;
            return this;
        }
        public Boolean getSecret() {
            return this.secret;
        }

        public GetParameterSetResponseBodyParameterSetParameters setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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
         * <p>The creation time in UTC, in the ISO 8601 format of YYYY-MM-DDTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-24T22:58:50Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The resource ID. When the resource type is ModuleVersion, the ID is composed of <moduleId>-<moduleversion>, such as mod-34535345df123fr-v3.</p>
         * 
         * <strong>example:</strong>
         * <p>mod-433aead756057101546eb5d50c1</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>The resource type. Valid values:</p>
         * <ul>
         * <li>Module: template.</li>
         * <li>ModuleVersion: template version.</li>
         * <li>Task: task.</li>
         * </ul>
         * 
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
         * <p>The creation time in UTC, in the ISO 8601 format of YYYY-MM-DDTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-30T02:14:16Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

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
         * <p>The parameter set ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pts-3b6cb9fa4751afff9c5e4e01624b9</p>
         */
        @NameInMap("parameterSetId")
        public String parameterSetId;

        /**
         * <p>The parameters in the parameter set.</p>
         */
        @NameInMap("parameters")
        public java.util.List<GetParameterSetResponseBodyParameterSetParameters> parameters;

        /**
         * <p>The association relationships.</p>
         */
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
