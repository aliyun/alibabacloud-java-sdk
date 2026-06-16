// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateCustomPrivacyPolicyRequest extends TeaModel {
    /**
     * <p>The details of the custom privacy policy content.</p>
     */
    @NameInMap("CustomPrivacyPolicyContents")
    public java.util.List<UpdateCustomPrivacyPolicyRequestCustomPrivacyPolicyContents> customPrivacyPolicyContents;

    /**
     * <p>The ID of the custom privacy policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pp_neagxpoznsjdtxxxxx</p>
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
     * <p>The default language of the policy. The value is the LanguageCode returned by the ListLanguages operation.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-Hans-CN</p>
     */
    @NameInMap("DefaultLanguageCode")
    public String defaultLanguageCode;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The consent type for the custom privacy policy.</p>
     * 
     * <strong>example:</strong>
     * <p>implied_consent</p>
     */
    @NameInMap("UserConsentType")
    public String userConsentType;

    public static UpdateCustomPrivacyPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomPrivacyPolicyRequest self = new UpdateCustomPrivacyPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomPrivacyPolicyRequest setCustomPrivacyPolicyContents(java.util.List<UpdateCustomPrivacyPolicyRequestCustomPrivacyPolicyContents> customPrivacyPolicyContents) {
        this.customPrivacyPolicyContents = customPrivacyPolicyContents;
        return this;
    }
    public java.util.List<UpdateCustomPrivacyPolicyRequestCustomPrivacyPolicyContents> getCustomPrivacyPolicyContents() {
        return this.customPrivacyPolicyContents;
    }

    public UpdateCustomPrivacyPolicyRequest setCustomPrivacyPolicyId(String customPrivacyPolicyId) {
        this.customPrivacyPolicyId = customPrivacyPolicyId;
        return this;
    }
    public String getCustomPrivacyPolicyId() {
        return this.customPrivacyPolicyId;
    }

    public UpdateCustomPrivacyPolicyRequest setCustomPrivacyPolicyName(String customPrivacyPolicyName) {
        this.customPrivacyPolicyName = customPrivacyPolicyName;
        return this;
    }
    public String getCustomPrivacyPolicyName() {
        return this.customPrivacyPolicyName;
    }

    public UpdateCustomPrivacyPolicyRequest setDefaultLanguageCode(String defaultLanguageCode) {
        this.defaultLanguageCode = defaultLanguageCode;
        return this;
    }
    public String getDefaultLanguageCode() {
        return this.defaultLanguageCode;
    }

    public UpdateCustomPrivacyPolicyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateCustomPrivacyPolicyRequest setUserConsentType(String userConsentType) {
        this.userConsentType = userConsentType;
        return this;
    }
    public String getUserConsentType() {
        return this.userConsentType;
    }

    public static class UpdateCustomPrivacyPolicyRequestCustomPrivacyPolicyContentsCustomPrivacyPolicyItems extends TeaModel {
        /**
         * <p>The name of the custom privacy policy item.</p>
         * 
         * <strong>example:</strong>
         * <p>Item Name</p>
         */
        @NameInMap("CustomPrivacyPolicyItemName")
        public String customPrivacyPolicyItemName;

        /**
         * <p>The endpoint of the custom privacy policy item. The value must start with https\://.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com">https://example.com</a></p>
         */
        @NameInMap("CustomPrivacyPolicyItemUrl")
        public String customPrivacyPolicyItemUrl;

        public static UpdateCustomPrivacyPolicyRequestCustomPrivacyPolicyContentsCustomPrivacyPolicyItems build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomPrivacyPolicyRequestCustomPrivacyPolicyContentsCustomPrivacyPolicyItems self = new UpdateCustomPrivacyPolicyRequestCustomPrivacyPolicyContentsCustomPrivacyPolicyItems();
            return TeaModel.build(map, self);
        }

        public UpdateCustomPrivacyPolicyRequestCustomPrivacyPolicyContentsCustomPrivacyPolicyItems setCustomPrivacyPolicyItemName(String customPrivacyPolicyItemName) {
            this.customPrivacyPolicyItemName = customPrivacyPolicyItemName;
            return this;
        }
        public String getCustomPrivacyPolicyItemName() {
            return this.customPrivacyPolicyItemName;
        }

        public UpdateCustomPrivacyPolicyRequestCustomPrivacyPolicyContentsCustomPrivacyPolicyItems setCustomPrivacyPolicyItemUrl(String customPrivacyPolicyItemUrl) {
            this.customPrivacyPolicyItemUrl = customPrivacyPolicyItemUrl;
            return this;
        }
        public String getCustomPrivacyPolicyItemUrl() {
            return this.customPrivacyPolicyItemUrl;
        }

    }

    public static class UpdateCustomPrivacyPolicyRequestCustomPrivacyPolicyContents extends TeaModel {
        /**
         * <p>The items of the custom privacy policy.</p>
         */
        @NameInMap("CustomPrivacyPolicyItems")
        public java.util.List<UpdateCustomPrivacyPolicyRequestCustomPrivacyPolicyContentsCustomPrivacyPolicyItems> customPrivacyPolicyItems;

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

        public static UpdateCustomPrivacyPolicyRequestCustomPrivacyPolicyContents build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomPrivacyPolicyRequestCustomPrivacyPolicyContents self = new UpdateCustomPrivacyPolicyRequestCustomPrivacyPolicyContents();
            return TeaModel.build(map, self);
        }

        public UpdateCustomPrivacyPolicyRequestCustomPrivacyPolicyContents setCustomPrivacyPolicyItems(java.util.List<UpdateCustomPrivacyPolicyRequestCustomPrivacyPolicyContentsCustomPrivacyPolicyItems> customPrivacyPolicyItems) {
            this.customPrivacyPolicyItems = customPrivacyPolicyItems;
            return this;
        }
        public java.util.List<UpdateCustomPrivacyPolicyRequestCustomPrivacyPolicyContentsCustomPrivacyPolicyItems> getCustomPrivacyPolicyItems() {
            return this.customPrivacyPolicyItems;
        }

        public UpdateCustomPrivacyPolicyRequestCustomPrivacyPolicyContents setCustomPrivacyPolicyTip(String customPrivacyPolicyTip) {
            this.customPrivacyPolicyTip = customPrivacyPolicyTip;
            return this;
        }
        public String getCustomPrivacyPolicyTip() {
            return this.customPrivacyPolicyTip;
        }

        public UpdateCustomPrivacyPolicyRequestCustomPrivacyPolicyContents setLanguageCode(String languageCode) {
            this.languageCode = languageCode;
            return this;
        }
        public String getLanguageCode() {
            return this.languageCode;
        }

    }

}
