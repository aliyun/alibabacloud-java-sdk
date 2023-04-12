// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListPreManagedRulesResponseBody extends TeaModel {
    /**
     * <p>The evaluation rules.</p>
     */
    @NameInMap("ManagedRules")
    public java.util.List<ListPreManagedRulesResponseBodyManagedRules> managedRules;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPreManagedRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPreManagedRulesResponseBody self = new ListPreManagedRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPreManagedRulesResponseBody setManagedRules(java.util.List<ListPreManagedRulesResponseBodyManagedRules> managedRules) {
        this.managedRules = managedRules;
        return this;
    }
    public java.util.List<ListPreManagedRulesResponseBodyManagedRules> getManagedRules() {
        return this.managedRules;
    }

    public ListPreManagedRulesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListPreManagedRulesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListPreManagedRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPreManagedRulesResponseBodyManagedRules extends TeaModel {
        /**
         * <p>The required input parameters of the evaluation rule.</p>
         */
        @NameInMap("CompulsoryInputParameterDetails")
        public java.util.Map<String, ?> compulsoryInputParameterDetails;

        /**
         * <p>The name of the evaluation rule.</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        /**
         * <p>The description of the evaluation rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The URL of the topic that describes how the managed rule remediates the incompliant configurations.</p>
         */
        @NameInMap("HelpUrls")
        public String helpUrls;

        /**
         * <p>The identifier of the evaluation rule.</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The details of the optional input parameters of the evaluation rule.</p>
         */
        @NameInMap("OptionalInputParameterDetails")
        public java.util.Map<String, ?> optionalInputParameterDetails;

        /**
         * <p>The type of the resource.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static ListPreManagedRulesResponseBodyManagedRules build(java.util.Map<String, ?> map) throws Exception {
            ListPreManagedRulesResponseBodyManagedRules self = new ListPreManagedRulesResponseBodyManagedRules();
            return TeaModel.build(map, self);
        }

        public ListPreManagedRulesResponseBodyManagedRules setCompulsoryInputParameterDetails(java.util.Map<String, ?> compulsoryInputParameterDetails) {
            this.compulsoryInputParameterDetails = compulsoryInputParameterDetails;
            return this;
        }
        public java.util.Map<String, ?> getCompulsoryInputParameterDetails() {
            return this.compulsoryInputParameterDetails;
        }

        public ListPreManagedRulesResponseBodyManagedRules setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public ListPreManagedRulesResponseBodyManagedRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPreManagedRulesResponseBodyManagedRules setHelpUrls(String helpUrls) {
            this.helpUrls = helpUrls;
            return this;
        }
        public String getHelpUrls() {
            return this.helpUrls;
        }

        public ListPreManagedRulesResponseBodyManagedRules setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListPreManagedRulesResponseBodyManagedRules setOptionalInputParameterDetails(java.util.Map<String, ?> optionalInputParameterDetails) {
            this.optionalInputParameterDetails = optionalInputParameterDetails;
            return this;
        }
        public java.util.Map<String, ?> getOptionalInputParameterDetails() {
            return this.optionalInputParameterDetails;
        }

        public ListPreManagedRulesResponseBodyManagedRules setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
