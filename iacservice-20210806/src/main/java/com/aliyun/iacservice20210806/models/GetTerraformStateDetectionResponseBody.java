// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetTerraformStateDetectionResponseBody extends TeaModel {
    @NameInMap("job")
    public GetTerraformStateDetectionResponseBodyJob job;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B6ED9F71-7FA8-598E-B64D-4606FB3FCCC9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetTerraformStateDetectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTerraformStateDetectionResponseBody self = new GetTerraformStateDetectionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTerraformStateDetectionResponseBody setJob(GetTerraformStateDetectionResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public GetTerraformStateDetectionResponseBodyJob getJob() {
        return this.job;
    }

    public GetTerraformStateDetectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTerraformStateDetectionResponseBodyJobChangedResourcesAttributeChanges extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>vpc_name</p>
         */
        @NameInMap("attributePath")
        public String attributePath;

        /**
         * <strong>example:</strong>
         * <p>test_remote</p>
         */
        @NameInMap("remoteValue")
        public String remoteValue;

        /**
         * <strong>example:</strong>
         * <p>test_hcl</p>
         */
        @NameInMap("templateValue")
        public String templateValue;

        public static GetTerraformStateDetectionResponseBodyJobChangedResourcesAttributeChanges build(java.util.Map<String, ?> map) throws Exception {
            GetTerraformStateDetectionResponseBodyJobChangedResourcesAttributeChanges self = new GetTerraformStateDetectionResponseBodyJobChangedResourcesAttributeChanges();
            return TeaModel.build(map, self);
        }

        public GetTerraformStateDetectionResponseBodyJobChangedResourcesAttributeChanges setAttributePath(String attributePath) {
            this.attributePath = attributePath;
            return this;
        }
        public String getAttributePath() {
            return this.attributePath;
        }

        public GetTerraformStateDetectionResponseBodyJobChangedResourcesAttributeChanges setRemoteValue(String remoteValue) {
            this.remoteValue = remoteValue;
            return this;
        }
        public String getRemoteValue() {
            return this.remoteValue;
        }

        public GetTerraformStateDetectionResponseBodyJobChangedResourcesAttributeChanges setTemplateValue(String templateValue) {
            this.templateValue = templateValue;
            return this;
        }
        public String getTemplateValue() {
            return this.templateValue;
        }

    }

    public static class GetTerraformStateDetectionResponseBodyJobChangedResources extends TeaModel {
        @NameInMap("attributeChanges")
        public java.util.List<GetTerraformStateDetectionResponseBodyJobChangedResourcesAttributeChanges> attributeChanges;

        /**
         * <strong>example:</strong>
         * <p>create</p>
         */
        @NameInMap("changedType")
        public String changedType;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("hasDrift")
        public Boolean hasDrift;

        /**
         * <strong>example:</strong>
         * <p>vpc-axxxxx</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>vpc:alicloud_vpc.default</p>
         */
        @NameInMap("resourceIdentifier")
        public String resourceIdentifier;

        public static GetTerraformStateDetectionResponseBodyJobChangedResources build(java.util.Map<String, ?> map) throws Exception {
            GetTerraformStateDetectionResponseBodyJobChangedResources self = new GetTerraformStateDetectionResponseBodyJobChangedResources();
            return TeaModel.build(map, self);
        }

        public GetTerraformStateDetectionResponseBodyJobChangedResources setAttributeChanges(java.util.List<GetTerraformStateDetectionResponseBodyJobChangedResourcesAttributeChanges> attributeChanges) {
            this.attributeChanges = attributeChanges;
            return this;
        }
        public java.util.List<GetTerraformStateDetectionResponseBodyJobChangedResourcesAttributeChanges> getAttributeChanges() {
            return this.attributeChanges;
        }

        public GetTerraformStateDetectionResponseBodyJobChangedResources setChangedType(String changedType) {
            this.changedType = changedType;
            return this;
        }
        public String getChangedType() {
            return this.changedType;
        }

        public GetTerraformStateDetectionResponseBodyJobChangedResources setHasDrift(Boolean hasDrift) {
            this.hasDrift = hasDrift;
            return this;
        }
        public Boolean getHasDrift() {
            return this.hasDrift;
        }

        public GetTerraformStateDetectionResponseBodyJobChangedResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetTerraformStateDetectionResponseBodyJobChangedResources setResourceIdentifier(String resourceIdentifier) {
            this.resourceIdentifier = resourceIdentifier;
            return this;
        }
        public String getResourceIdentifier() {
            return this.resourceIdentifier;
        }

    }

    public static class GetTerraformStateDetectionResponseBodyJobDriftedResourcesAttributeDrifts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>vpc_name</p>
         */
        @NameInMap("attributePath")
        public String attributePath;

        /**
         * <strong>example:</strong>
         * <p>test_remote</p>
         */
        @NameInMap("remoteValue")
        public String remoteValue;

        /**
         * <strong>example:</strong>
         * <p>test_state</p>
         */
        @NameInMap("stateValue")
        public String stateValue;

        public static GetTerraformStateDetectionResponseBodyJobDriftedResourcesAttributeDrifts build(java.util.Map<String, ?> map) throws Exception {
            GetTerraformStateDetectionResponseBodyJobDriftedResourcesAttributeDrifts self = new GetTerraformStateDetectionResponseBodyJobDriftedResourcesAttributeDrifts();
            return TeaModel.build(map, self);
        }

        public GetTerraformStateDetectionResponseBodyJobDriftedResourcesAttributeDrifts setAttributePath(String attributePath) {
            this.attributePath = attributePath;
            return this;
        }
        public String getAttributePath() {
            return this.attributePath;
        }

        public GetTerraformStateDetectionResponseBodyJobDriftedResourcesAttributeDrifts setRemoteValue(String remoteValue) {
            this.remoteValue = remoteValue;
            return this;
        }
        public String getRemoteValue() {
            return this.remoteValue;
        }

        public GetTerraformStateDetectionResponseBodyJobDriftedResourcesAttributeDrifts setStateValue(String stateValue) {
            this.stateValue = stateValue;
            return this;
        }
        public String getStateValue() {
            return this.stateValue;
        }

    }

    public static class GetTerraformStateDetectionResponseBodyJobDriftedResources extends TeaModel {
        @NameInMap("attributeDrifts")
        public java.util.List<GetTerraformStateDetectionResponseBodyJobDriftedResourcesAttributeDrifts> attributeDrifts;

        /**
         * <strong>example:</strong>
         * <p>update</p>
         */
        @NameInMap("driftedType")
        public String driftedType;

        /**
         * <strong>example:</strong>
         * <p>vpc-bxxxxx</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>vpc:alicloud_vpc.default2</p>
         */
        @NameInMap("resourceIdentifier")
        public String resourceIdentifier;

        public static GetTerraformStateDetectionResponseBodyJobDriftedResources build(java.util.Map<String, ?> map) throws Exception {
            GetTerraformStateDetectionResponseBodyJobDriftedResources self = new GetTerraformStateDetectionResponseBodyJobDriftedResources();
            return TeaModel.build(map, self);
        }

        public GetTerraformStateDetectionResponseBodyJobDriftedResources setAttributeDrifts(java.util.List<GetTerraformStateDetectionResponseBodyJobDriftedResourcesAttributeDrifts> attributeDrifts) {
            this.attributeDrifts = attributeDrifts;
            return this;
        }
        public java.util.List<GetTerraformStateDetectionResponseBodyJobDriftedResourcesAttributeDrifts> getAttributeDrifts() {
            return this.attributeDrifts;
        }

        public GetTerraformStateDetectionResponseBodyJobDriftedResources setDriftedType(String driftedType) {
            this.driftedType = driftedType;
            return this;
        }
        public String getDriftedType() {
            return this.driftedType;
        }

        public GetTerraformStateDetectionResponseBodyJobDriftedResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetTerraformStateDetectionResponseBodyJobDriftedResources setResourceIdentifier(String resourceIdentifier) {
            this.resourceIdentifier = resourceIdentifier;
            return this;
        }
        public String getResourceIdentifier() {
            return this.resourceIdentifier;
        }

    }

    public static class GetTerraformStateDetectionResponseBodyJob extends TeaModel {
        @NameInMap("changedResources")
        public java.util.List<GetTerraformStateDetectionResponseBodyJobChangedResources> changedResources;

        @NameInMap("driftedResources")
        public java.util.List<GetTerraformStateDetectionResponseBodyJobDriftedResources> driftedResources;

        /**
         * <strong>example:</strong>
         * <p>planned failed</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>stack-as181axxxxxx:development_xxxx</p>
         */
        @NameInMap("identifier")
        public String identifier;

        /**
         * <strong>example:</strong>
         * <p>Errored</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>Stack</p>
         */
        @NameInMap("type")
        public String type;

        public static GetTerraformStateDetectionResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            GetTerraformStateDetectionResponseBodyJob self = new GetTerraformStateDetectionResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public GetTerraformStateDetectionResponseBodyJob setChangedResources(java.util.List<GetTerraformStateDetectionResponseBodyJobChangedResources> changedResources) {
            this.changedResources = changedResources;
            return this;
        }
        public java.util.List<GetTerraformStateDetectionResponseBodyJobChangedResources> getChangedResources() {
            return this.changedResources;
        }

        public GetTerraformStateDetectionResponseBodyJob setDriftedResources(java.util.List<GetTerraformStateDetectionResponseBodyJobDriftedResources> driftedResources) {
            this.driftedResources = driftedResources;
            return this;
        }
        public java.util.List<GetTerraformStateDetectionResponseBodyJobDriftedResources> getDriftedResources() {
            return this.driftedResources;
        }

        public GetTerraformStateDetectionResponseBodyJob setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetTerraformStateDetectionResponseBodyJob setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetTerraformStateDetectionResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTerraformStateDetectionResponseBodyJob setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
