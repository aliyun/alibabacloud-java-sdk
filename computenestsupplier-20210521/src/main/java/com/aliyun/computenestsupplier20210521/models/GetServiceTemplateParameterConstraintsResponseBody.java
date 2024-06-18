// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceTemplateParameterConstraintsResponseBody extends TeaModel {
    @NameInMap("FamilyConstraints")
    public java.util.List<String> familyConstraints;

    @NameInMap("ParameterConstraints")
    public java.util.List<GetServiceTemplateParameterConstraintsResponseBodyParameterConstraints> parameterConstraints;

    /**
     * <strong>example:</strong>
     * <p>C81C0732-DEBC-559C-B563-7EB2BEB21088</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetServiceTemplateParameterConstraintsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceTemplateParameterConstraintsResponseBody self = new GetServiceTemplateParameterConstraintsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceTemplateParameterConstraintsResponseBody setFamilyConstraints(java.util.List<String> familyConstraints) {
        this.familyConstraints = familyConstraints;
        return this;
    }
    public java.util.List<String> getFamilyConstraints() {
        return this.familyConstraints;
    }

    public GetServiceTemplateParameterConstraintsResponseBody setParameterConstraints(java.util.List<GetServiceTemplateParameterConstraintsResponseBodyParameterConstraints> parameterConstraints) {
        this.parameterConstraints = parameterConstraints;
        return this;
    }
    public java.util.List<GetServiceTemplateParameterConstraintsResponseBodyParameterConstraints> getParameterConstraints() {
        return this.parameterConstraints;
    }

    public GetServiceTemplateParameterConstraintsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetServiceTemplateParameterConstraintsResponseBodyParameterConstraintsOriginalConstraints extends TeaModel {
        @NameInMap("AllowedValues")
        public java.util.List<String> allowedValues;

        /**
         * <strong>example:</strong>
         * <p>lnch_Source</p>
         */
        @NameInMap("PropertyName")
        public String propertyName;

        /**
         * <strong>example:</strong>
         * <p>i-8vb0smn1lf6g77md****</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <strong>example:</strong>
         * <p>serviceinstance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static GetServiceTemplateParameterConstraintsResponseBodyParameterConstraintsOriginalConstraints build(java.util.Map<String, ?> map) throws Exception {
            GetServiceTemplateParameterConstraintsResponseBodyParameterConstraintsOriginalConstraints self = new GetServiceTemplateParameterConstraintsResponseBodyParameterConstraintsOriginalConstraints();
            return TeaModel.build(map, self);
        }

        public GetServiceTemplateParameterConstraintsResponseBodyParameterConstraintsOriginalConstraints setAllowedValues(java.util.List<String> allowedValues) {
            this.allowedValues = allowedValues;
            return this;
        }
        public java.util.List<String> getAllowedValues() {
            return this.allowedValues;
        }

        public GetServiceTemplateParameterConstraintsResponseBodyParameterConstraintsOriginalConstraints setPropertyName(String propertyName) {
            this.propertyName = propertyName;
            return this;
        }
        public String getPropertyName() {
            return this.propertyName;
        }

        public GetServiceTemplateParameterConstraintsResponseBodyParameterConstraintsOriginalConstraints setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetServiceTemplateParameterConstraintsResponseBodyParameterConstraintsOriginalConstraints setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class GetServiceTemplateParameterConstraintsResponseBodyParameterConstraints extends TeaModel {
        @NameInMap("AllowedValues")
        public java.util.List<String> allowedValues;

        @NameInMap("AssociationParameterNames")
        public java.util.List<String> associationParameterNames;

        /**
         * <strong>example:</strong>
         * <p>NoLimit</p>
         */
        @NameInMap("Behavior")
        public String behavior;

        /**
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("BehaviorReason")
        public String behaviorReason;

        @NameInMap("OriginalConstraints")
        public java.util.List<GetServiceTemplateParameterConstraintsResponseBodyParameterConstraintsOriginalConstraints> originalConstraints;

        /**
         * <strong>example:</strong>
         * <p>PayType</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <strong>example:</strong>
         * <p>String</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetServiceTemplateParameterConstraintsResponseBodyParameterConstraints build(java.util.Map<String, ?> map) throws Exception {
            GetServiceTemplateParameterConstraintsResponseBodyParameterConstraints self = new GetServiceTemplateParameterConstraintsResponseBodyParameterConstraints();
            return TeaModel.build(map, self);
        }

        public GetServiceTemplateParameterConstraintsResponseBodyParameterConstraints setAllowedValues(java.util.List<String> allowedValues) {
            this.allowedValues = allowedValues;
            return this;
        }
        public java.util.List<String> getAllowedValues() {
            return this.allowedValues;
        }

        public GetServiceTemplateParameterConstraintsResponseBodyParameterConstraints setAssociationParameterNames(java.util.List<String> associationParameterNames) {
            this.associationParameterNames = associationParameterNames;
            return this;
        }
        public java.util.List<String> getAssociationParameterNames() {
            return this.associationParameterNames;
        }

        public GetServiceTemplateParameterConstraintsResponseBodyParameterConstraints setBehavior(String behavior) {
            this.behavior = behavior;
            return this;
        }
        public String getBehavior() {
            return this.behavior;
        }

        public GetServiceTemplateParameterConstraintsResponseBodyParameterConstraints setBehaviorReason(String behaviorReason) {
            this.behaviorReason = behaviorReason;
            return this;
        }
        public String getBehaviorReason() {
            return this.behaviorReason;
        }

        public GetServiceTemplateParameterConstraintsResponseBodyParameterConstraints setOriginalConstraints(java.util.List<GetServiceTemplateParameterConstraintsResponseBodyParameterConstraintsOriginalConstraints> originalConstraints) {
            this.originalConstraints = originalConstraints;
            return this;
        }
        public java.util.List<GetServiceTemplateParameterConstraintsResponseBodyParameterConstraintsOriginalConstraints> getOriginalConstraints() {
            return this.originalConstraints;
        }

        public GetServiceTemplateParameterConstraintsResponseBodyParameterConstraints setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public GetServiceTemplateParameterConstraintsResponseBodyParameterConstraints setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
