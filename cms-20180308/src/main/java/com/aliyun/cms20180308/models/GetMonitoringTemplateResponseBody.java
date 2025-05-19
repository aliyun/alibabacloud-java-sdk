// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class GetMonitoringTemplateResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resource")
    public GetMonitoringTemplateResponseBodyResource resource;

    @NameInMap("Success")
    public Boolean success;

    public static GetMonitoringTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMonitoringTemplateResponseBody self = new GetMonitoringTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMonitoringTemplateResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public GetMonitoringTemplateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMonitoringTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMonitoringTemplateResponseBody setResource(GetMonitoringTemplateResponseBodyResource resource) {
        this.resource = resource;
        return this;
    }
    public GetMonitoringTemplateResponseBodyResource getResource() {
        return this.resource;
    }

    public GetMonitoringTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMonitoringTemplateResponseBodyResource extends TeaModel {
        @NameInMap("AlertTemplatesJson")
        public String alertTemplatesJson;

        @NameInMap("Description")
        public String description;

        @NameInMap("HostAvailabilityTemplate")
        public String hostAvailabilityTemplate;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("ProcessMonitorTemplates")
        public String processMonitorTemplates;

        @NameInMap("RestVersion")
        public String restVersion;

        @NameInMap("SystemEventTemplates")
        public String systemEventTemplates;

        public static GetMonitoringTemplateResponseBodyResource build(java.util.Map<String, ?> map) throws Exception {
            GetMonitoringTemplateResponseBodyResource self = new GetMonitoringTemplateResponseBodyResource();
            return TeaModel.build(map, self);
        }

        public GetMonitoringTemplateResponseBodyResource setAlertTemplatesJson(String alertTemplatesJson) {
            this.alertTemplatesJson = alertTemplatesJson;
            return this;
        }
        public String getAlertTemplatesJson() {
            return this.alertTemplatesJson;
        }

        public GetMonitoringTemplateResponseBodyResource setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMonitoringTemplateResponseBodyResource setHostAvailabilityTemplate(String hostAvailabilityTemplate) {
            this.hostAvailabilityTemplate = hostAvailabilityTemplate;
            return this;
        }
        public String getHostAvailabilityTemplate() {
            return this.hostAvailabilityTemplate;
        }

        public GetMonitoringTemplateResponseBodyResource setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetMonitoringTemplateResponseBodyResource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMonitoringTemplateResponseBodyResource setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetMonitoringTemplateResponseBodyResource setProcessMonitorTemplates(String processMonitorTemplates) {
            this.processMonitorTemplates = processMonitorTemplates;
            return this;
        }
        public String getProcessMonitorTemplates() {
            return this.processMonitorTemplates;
        }

        public GetMonitoringTemplateResponseBodyResource setRestVersion(String restVersion) {
            this.restVersion = restVersion;
            return this;
        }
        public String getRestVersion() {
            return this.restVersion;
        }

        public GetMonitoringTemplateResponseBodyResource setSystemEventTemplates(String systemEventTemplates) {
            this.systemEventTemplates = systemEventTemplates;
            return this;
        }
        public String getSystemEventTemplates() {
            return this.systemEventTemplates;
        }

    }

}
