// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetAssistantCapabilityResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>助理描述</p>
     */
    @NameInMap("assistantDescription")
    public String assistantDescription;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("canHandle")
    public Boolean canHandle;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("capabilityAssessment")
    public GetAssistantCapabilityResponseBodyCapabilityAssessment capabilityAssessment;

    /**
     * <strong>example:</strong>
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetAssistantCapabilityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAssistantCapabilityResponseBody self = new GetAssistantCapabilityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAssistantCapabilityResponseBody setAssistantDescription(String assistantDescription) {
        this.assistantDescription = assistantDescription;
        return this;
    }
    public String getAssistantDescription() {
        return this.assistantDescription;
    }

    public GetAssistantCapabilityResponseBody setCanHandle(Boolean canHandle) {
        this.canHandle = canHandle;
        return this;
    }
    public Boolean getCanHandle() {
        return this.canHandle;
    }

    public GetAssistantCapabilityResponseBody setCapabilityAssessment(GetAssistantCapabilityResponseBodyCapabilityAssessment capabilityAssessment) {
        this.capabilityAssessment = capabilityAssessment;
        return this;
    }
    public GetAssistantCapabilityResponseBodyCapabilityAssessment getCapabilityAssessment() {
        return this.capabilityAssessment;
    }

    public GetAssistantCapabilityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAssistantCapabilityResponseBodyCapabilityAssessmentCapabilityList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>能力概览</p>
         */
        @NameInMap("capabilityOverview")
        public String capabilityOverview;

        /**
         * <strong>example:</strong>
         * <p>能力描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>能力名称</p>
         */
        @NameInMap("name")
        public String name;

        public static GetAssistantCapabilityResponseBodyCapabilityAssessmentCapabilityList build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityResponseBodyCapabilityAssessmentCapabilityList self = new GetAssistantCapabilityResponseBodyCapabilityAssessmentCapabilityList();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityResponseBodyCapabilityAssessmentCapabilityList setCapabilityOverview(String capabilityOverview) {
            this.capabilityOverview = capabilityOverview;
            return this;
        }
        public String getCapabilityOverview() {
            return this.capabilityOverview;
        }

        public GetAssistantCapabilityResponseBodyCapabilityAssessmentCapabilityList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAssistantCapabilityResponseBodyCapabilityAssessmentCapabilityList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetAssistantCapabilityResponseBodyCapabilityAssessment extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>能力概览</p>
         */
        @NameInMap("briefCapability")
        public String briefCapability;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("capabilityList")
        public java.util.List<GetAssistantCapabilityResponseBodyCapabilityAssessmentCapabilityList> capabilityList;

        public static GetAssistantCapabilityResponseBodyCapabilityAssessment build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityResponseBodyCapabilityAssessment self = new GetAssistantCapabilityResponseBodyCapabilityAssessment();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityResponseBodyCapabilityAssessment setBriefCapability(String briefCapability) {
            this.briefCapability = briefCapability;
            return this;
        }
        public String getBriefCapability() {
            return this.briefCapability;
        }

        public GetAssistantCapabilityResponseBodyCapabilityAssessment setCapabilityList(java.util.List<GetAssistantCapabilityResponseBodyCapabilityAssessmentCapabilityList> capabilityList) {
            this.capabilityList = capabilityList;
            return this;
        }
        public java.util.List<GetAssistantCapabilityResponseBodyCapabilityAssessmentCapabilityList> getCapabilityList() {
            return this.capabilityList;
        }

    }

}
