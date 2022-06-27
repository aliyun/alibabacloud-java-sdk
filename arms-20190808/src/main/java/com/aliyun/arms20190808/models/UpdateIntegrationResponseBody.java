// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateIntegrationResponseBody extends TeaModel {
    @NameInMap("Integration")
    public UpdateIntegrationResponseBodyIntegration integration;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateIntegrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIntegrationResponseBody self = new UpdateIntegrationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIntegrationResponseBody setIntegration(UpdateIntegrationResponseBodyIntegration integration) {
        this.integration = integration;
        return this;
    }
    public UpdateIntegrationResponseBodyIntegration getIntegration() {
        return this.integration;
    }

    public UpdateIntegrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateIntegrationResponseBodyIntegration extends TeaModel {
        @NameInMap("ApiEndpoint")
        public String apiEndpoint;

        @NameInMap("AutoRecover")
        public Boolean autoRecover;

        @NameInMap("Description")
        public String description;

        @NameInMap("DuplicateKey")
        public String duplicateKey;

        @NameInMap("ExtendedFieldRedefineRules")
        public java.util.List<java.util.Map<String, ?>> extendedFieldRedefineRules;

        @NameInMap("FieldRedefineRules")
        public java.util.List<java.util.Map<String, ?>> fieldRedefineRules;

        @NameInMap("IntegrationId")
        public Long integrationId;

        @NameInMap("IntegrationName")
        public String integrationName;

        @NameInMap("IntegrationProductType")
        public String integrationProductType;

        @NameInMap("Liveness")
        public String liveness;

        @NameInMap("RecoverTime")
        public Long recoverTime;

        @NameInMap("ShortToken")
        public String shortToken;

        @NameInMap("Stat")
        public java.util.List<Long> stat;

        @NameInMap("State")
        public Boolean state;

        public static UpdateIntegrationResponseBodyIntegration build(java.util.Map<String, ?> map) throws Exception {
            UpdateIntegrationResponseBodyIntegration self = new UpdateIntegrationResponseBodyIntegration();
            return TeaModel.build(map, self);
        }

        public UpdateIntegrationResponseBodyIntegration setApiEndpoint(String apiEndpoint) {
            this.apiEndpoint = apiEndpoint;
            return this;
        }
        public String getApiEndpoint() {
            return this.apiEndpoint;
        }

        public UpdateIntegrationResponseBodyIntegration setAutoRecover(Boolean autoRecover) {
            this.autoRecover = autoRecover;
            return this;
        }
        public Boolean getAutoRecover() {
            return this.autoRecover;
        }

        public UpdateIntegrationResponseBodyIntegration setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateIntegrationResponseBodyIntegration setDuplicateKey(String duplicateKey) {
            this.duplicateKey = duplicateKey;
            return this;
        }
        public String getDuplicateKey() {
            return this.duplicateKey;
        }

        public UpdateIntegrationResponseBodyIntegration setExtendedFieldRedefineRules(java.util.List<java.util.Map<String, ?>> extendedFieldRedefineRules) {
            this.extendedFieldRedefineRules = extendedFieldRedefineRules;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getExtendedFieldRedefineRules() {
            return this.extendedFieldRedefineRules;
        }

        public UpdateIntegrationResponseBodyIntegration setFieldRedefineRules(java.util.List<java.util.Map<String, ?>> fieldRedefineRules) {
            this.fieldRedefineRules = fieldRedefineRules;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getFieldRedefineRules() {
            return this.fieldRedefineRules;
        }

        public UpdateIntegrationResponseBodyIntegration setIntegrationId(Long integrationId) {
            this.integrationId = integrationId;
            return this;
        }
        public Long getIntegrationId() {
            return this.integrationId;
        }

        public UpdateIntegrationResponseBodyIntegration setIntegrationName(String integrationName) {
            this.integrationName = integrationName;
            return this;
        }
        public String getIntegrationName() {
            return this.integrationName;
        }

        public UpdateIntegrationResponseBodyIntegration setIntegrationProductType(String integrationProductType) {
            this.integrationProductType = integrationProductType;
            return this;
        }
        public String getIntegrationProductType() {
            return this.integrationProductType;
        }

        public UpdateIntegrationResponseBodyIntegration setLiveness(String liveness) {
            this.liveness = liveness;
            return this;
        }
        public String getLiveness() {
            return this.liveness;
        }

        public UpdateIntegrationResponseBodyIntegration setRecoverTime(Long recoverTime) {
            this.recoverTime = recoverTime;
            return this;
        }
        public Long getRecoverTime() {
            return this.recoverTime;
        }

        public UpdateIntegrationResponseBodyIntegration setShortToken(String shortToken) {
            this.shortToken = shortToken;
            return this;
        }
        public String getShortToken() {
            return this.shortToken;
        }

        public UpdateIntegrationResponseBodyIntegration setStat(java.util.List<Long> stat) {
            this.stat = stat;
            return this;
        }
        public java.util.List<Long> getStat() {
            return this.stat;
        }

        public UpdateIntegrationResponseBodyIntegration setState(Boolean state) {
            this.state = state;
            return this;
        }
        public Boolean getState() {
            return this.state;
        }

    }

}
