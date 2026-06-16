// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetCustomPrivacyPolicyResponseBody extends TeaModel {
    /**
     * <p>The custom privacy policy.</p>
     */
    @NameInMap("CustomPrivacyPolicy")
    public GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicy customPrivacyPolicy;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCustomPrivacyPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomPrivacyPolicyResponseBody self = new GetCustomPrivacyPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomPrivacyPolicyResponseBody setCustomPrivacyPolicy(GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicy customPrivacyPolicy) {
        this.customPrivacyPolicy = customPrivacyPolicy;
        return this;
    }
    public GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicy getCustomPrivacyPolicy() {
        return this.customPrivacyPolicy;
    }

    public GetCustomPrivacyPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicyCustomPrivacyPolicyContentsCustomPrivacyPolicyItems extends TeaModel {
        /**
         * <p>The name of the custom privacy policy item.</p>
         * 
         * <strong>example:</strong>
         * <p>item name</p>
         */
        @NameInMap("CustomPrivacyPolicyItemName")
        public String customPrivacyPolicyItemName;

        /**
         * <p>The URL of the custom privacy policy item. The URL must start with https\://.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com">https://example.com</a></p>
         */
        @NameInMap("CustomPrivacyPolicyItemUrl")
        public String customPrivacyPolicyItemUrl;

        public static GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicyCustomPrivacyPolicyContentsCustomPrivacyPolicyItems build(java.util.Map<String, ?> map) throws Exception {
            GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicyCustomPrivacyPolicyContentsCustomPrivacyPolicyItems self = new GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicyCustomPrivacyPolicyContentsCustomPrivacyPolicyItems();
            return TeaModel.build(map, self);
        }

        public GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicyCustomPrivacyPolicyContentsCustomPrivacyPolicyItems setCustomPrivacyPolicyItemName(String customPrivacyPolicyItemName) {
            this.customPrivacyPolicyItemName = customPrivacyPolicyItemName;
            return this;
        }
        public String getCustomPrivacyPolicyItemName() {
            return this.customPrivacyPolicyItemName;
        }

        public GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicyCustomPrivacyPolicyContentsCustomPrivacyPolicyItems setCustomPrivacyPolicyItemUrl(String customPrivacyPolicyItemUrl) {
            this.customPrivacyPolicyItemUrl = customPrivacyPolicyItemUrl;
            return this;
        }
        public String getCustomPrivacyPolicyItemUrl() {
            return this.customPrivacyPolicyItemUrl;
        }

    }

    public static class GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicyCustomPrivacyPolicyContents extends TeaModel {
        /**
         * <p>The items of the custom privacy policy.</p>
         */
        @NameInMap("CustomPrivacyPolicyItems")
        public java.util.List<GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicyCustomPrivacyPolicyContentsCustomPrivacyPolicyItems> customPrivacyPolicyItems;

        /**
         * <p>The prompt for the custom privacy policy content.</p>
         * 
         * <strong>example:</strong>
         * <p>Please read and agree：</p>
         */
        @NameInMap("CustomPrivacyPolicyTip")
        public String customPrivacyPolicyTip;

        /**
         * <p>The language of the custom privacy policy. The value is the LanguageCode returned by the ListLanguages operation.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-Hans-CN</p>
         */
        @NameInMap("LanguageCode")
        public String languageCode;

        public static GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicyCustomPrivacyPolicyContents build(java.util.Map<String, ?> map) throws Exception {
            GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicyCustomPrivacyPolicyContents self = new GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicyCustomPrivacyPolicyContents();
            return TeaModel.build(map, self);
        }

        public GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicyCustomPrivacyPolicyContents setCustomPrivacyPolicyItems(java.util.List<GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicyCustomPrivacyPolicyContentsCustomPrivacyPolicyItems> customPrivacyPolicyItems) {
            this.customPrivacyPolicyItems = customPrivacyPolicyItems;
            return this;
        }
        public java.util.List<GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicyCustomPrivacyPolicyContentsCustomPrivacyPolicyItems> getCustomPrivacyPolicyItems() {
            return this.customPrivacyPolicyItems;
        }

        public GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicyCustomPrivacyPolicyContents setCustomPrivacyPolicyTip(String customPrivacyPolicyTip) {
            this.customPrivacyPolicyTip = customPrivacyPolicyTip;
            return this;
        }
        public String getCustomPrivacyPolicyTip() {
            return this.customPrivacyPolicyTip;
        }

        public GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicyCustomPrivacyPolicyContents setLanguageCode(String languageCode) {
            this.languageCode = languageCode;
            return this;
        }
        public String getLanguageCode() {
            return this.languageCode;
        }

    }

    public static class GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicy extends TeaModel {
        /**
         * <p>The details of the custom privacy policy content.</p>
         */
        @NameInMap("CustomPrivacyPolicyContents")
        public java.util.List<GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicyCustomPrivacyPolicyContents> customPrivacyPolicyContents;

        /**
         * <p>The ID of the custom privacy policy.</p>
         * 
         * <strong>example:</strong>
         * <p>pp_xxxxx</p>
         */
        @NameInMap("CustomPrivacyPolicyId")
        public String customPrivacyPolicyId;

        /**
         * <p>The name of the custom privacy policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom Privacy Policy Name</p>
         */
        @NameInMap("CustomPrivacyPolicyName")
        public String customPrivacyPolicyName;

        /**
         * <p>The language of the custom privacy policy. The value is the LanguageCode returned by the ListLanguages operation.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-Hans-CN</p>
         */
        @NameInMap("DefaultLanguageCode")
        public String defaultLanguageCode;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The valid values for the account status are:</p>
         * <ul>
         * <li><p>enabled: Enabled.</p>
         * </li>
         * <li><p>disabled: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Agreement Type.</p>
         * 
         * <strong>example:</strong>
         * <p>implied_consent</p>
         */
        @NameInMap("UserConsentType")
        public String userConsentType;

        public static GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicy self = new GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicy();
            return TeaModel.build(map, self);
        }

        public GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicy setCustomPrivacyPolicyContents(java.util.List<GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicyCustomPrivacyPolicyContents> customPrivacyPolicyContents) {
            this.customPrivacyPolicyContents = customPrivacyPolicyContents;
            return this;
        }
        public java.util.List<GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicyCustomPrivacyPolicyContents> getCustomPrivacyPolicyContents() {
            return this.customPrivacyPolicyContents;
        }

        public GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicy setCustomPrivacyPolicyId(String customPrivacyPolicyId) {
            this.customPrivacyPolicyId = customPrivacyPolicyId;
            return this;
        }
        public String getCustomPrivacyPolicyId() {
            return this.customPrivacyPolicyId;
        }

        public GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicy setCustomPrivacyPolicyName(String customPrivacyPolicyName) {
            this.customPrivacyPolicyName = customPrivacyPolicyName;
            return this;
        }
        public String getCustomPrivacyPolicyName() {
            return this.customPrivacyPolicyName;
        }

        public GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicy setDefaultLanguageCode(String defaultLanguageCode) {
            this.defaultLanguageCode = defaultLanguageCode;
            return this;
        }
        public String getDefaultLanguageCode() {
            return this.defaultLanguageCode;
        }

        public GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicy setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicy setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCustomPrivacyPolicyResponseBodyCustomPrivacyPolicy setUserConsentType(String userConsentType) {
            this.userConsentType = userConsentType;
            return this;
        }
        public String getUserConsentType() {
            return this.userConsentType;
        }

    }

}
