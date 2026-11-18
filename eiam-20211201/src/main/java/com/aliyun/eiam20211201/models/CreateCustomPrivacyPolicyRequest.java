// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateCustomPrivacyPolicyRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The details of the custom privacy policy content.</p>
     */
    @NameInMap("CustomPrivacyPolicyContents")
    public java.util.List<CreateCustomPrivacyPolicyRequestCustomPrivacyPolicyContents> customPrivacyPolicyContents;

    /**
     * <p>The name of the custom privacy policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom Privacy Policy Name</p>
     */
    @NameInMap("CustomPrivacyPolicyName")
    public String customPrivacyPolicyName;

    /**
     * <p>The default language code of the custom privacy policy.</p>
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
     * <p>The status of the custom privacy policy.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The user consent type.</p>
     * 
     * <strong>example:</strong>
     * <p>implied_consent</p>
     */
    @NameInMap("UserConsentType")
    public String userConsentType;

    public static CreateCustomPrivacyPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomPrivacyPolicyRequest self = new CreateCustomPrivacyPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomPrivacyPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCustomPrivacyPolicyRequest setCustomPrivacyPolicyContents(java.util.List<CreateCustomPrivacyPolicyRequestCustomPrivacyPolicyContents> customPrivacyPolicyContents) {
        this.customPrivacyPolicyContents = customPrivacyPolicyContents;
        return this;
    }
    public java.util.List<CreateCustomPrivacyPolicyRequestCustomPrivacyPolicyContents> getCustomPrivacyPolicyContents() {
        return this.customPrivacyPolicyContents;
    }

    public CreateCustomPrivacyPolicyRequest setCustomPrivacyPolicyName(String customPrivacyPolicyName) {
        this.customPrivacyPolicyName = customPrivacyPolicyName;
        return this;
    }
    public String getCustomPrivacyPolicyName() {
        return this.customPrivacyPolicyName;
    }

    public CreateCustomPrivacyPolicyRequest setDefaultLanguageCode(String defaultLanguageCode) {
        this.defaultLanguageCode = defaultLanguageCode;
        return this;
    }
    public String getDefaultLanguageCode() {
        return this.defaultLanguageCode;
    }

    public CreateCustomPrivacyPolicyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateCustomPrivacyPolicyRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateCustomPrivacyPolicyRequest setUserConsentType(String userConsentType) {
        this.userConsentType = userConsentType;
        return this;
    }
    public String getUserConsentType() {
        return this.userConsentType;
    }

    public static class CreateCustomPrivacyPolicyRequestCustomPrivacyPolicyContentsCustomPrivacyPolicyItems extends TeaModel {
        /**
         * <p>The name of the custom privacy policy item.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom Privacy Policy Name</p>
         */
        @NameInMap("CustomPrivacyPolicyItemName")
        public String customPrivacyPolicyItemName;

        /**
         * <p>The URL of the custom privacy policy item.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.xxxx.com">http://www.xxxx.com</a></p>
         */
        @NameInMap("CustomPrivacyPolicyItemUrl")
        public String customPrivacyPolicyItemUrl;

        public static CreateCustomPrivacyPolicyRequestCustomPrivacyPolicyContentsCustomPrivacyPolicyItems build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomPrivacyPolicyRequestCustomPrivacyPolicyContentsCustomPrivacyPolicyItems self = new CreateCustomPrivacyPolicyRequestCustomPrivacyPolicyContentsCustomPrivacyPolicyItems();
            return TeaModel.build(map, self);
        }

        public CreateCustomPrivacyPolicyRequestCustomPrivacyPolicyContentsCustomPrivacyPolicyItems setCustomPrivacyPolicyItemName(String customPrivacyPolicyItemName) {
            this.customPrivacyPolicyItemName = customPrivacyPolicyItemName;
            return this;
        }
        public String getCustomPrivacyPolicyItemName() {
            return this.customPrivacyPolicyItemName;
        }

        public CreateCustomPrivacyPolicyRequestCustomPrivacyPolicyContentsCustomPrivacyPolicyItems setCustomPrivacyPolicyItemUrl(String customPrivacyPolicyItemUrl) {
            this.customPrivacyPolicyItemUrl = customPrivacyPolicyItemUrl;
            return this;
        }
        public String getCustomPrivacyPolicyItemUrl() {
            return this.customPrivacyPolicyItemUrl;
        }

    }

    public static class CreateCustomPrivacyPolicyRequestCustomPrivacyPolicyContents extends TeaModel {
        /**
         * <p>The custom privacy policy items.</p>
         */
        @NameInMap("CustomPrivacyPolicyItems")
        public java.util.List<CreateCustomPrivacyPolicyRequestCustomPrivacyPolicyContentsCustomPrivacyPolicyItems> customPrivacyPolicyItems;

        /**
         * <p>The custom privacy policy tip.</p>
         * 
         * <strong>example:</strong>
         * <p>Please read and agree：</p>
         */
        @NameInMap("CustomPrivacyPolicyTip")
        public String customPrivacyPolicyTip;

        /**
         * <p>The language code of the custom privacy policy. The value is obtained from the LanguageCode parameter returned by the ListLanguages operation.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-Hans-CN</p>
         */
        @NameInMap("LanguageCode")
        public String languageCode;

        public static CreateCustomPrivacyPolicyRequestCustomPrivacyPolicyContents build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomPrivacyPolicyRequestCustomPrivacyPolicyContents self = new CreateCustomPrivacyPolicyRequestCustomPrivacyPolicyContents();
            return TeaModel.build(map, self);
        }

        public CreateCustomPrivacyPolicyRequestCustomPrivacyPolicyContents setCustomPrivacyPolicyItems(java.util.List<CreateCustomPrivacyPolicyRequestCustomPrivacyPolicyContentsCustomPrivacyPolicyItems> customPrivacyPolicyItems) {
            this.customPrivacyPolicyItems = customPrivacyPolicyItems;
            return this;
        }
        public java.util.List<CreateCustomPrivacyPolicyRequestCustomPrivacyPolicyContentsCustomPrivacyPolicyItems> getCustomPrivacyPolicyItems() {
            return this.customPrivacyPolicyItems;
        }

        public CreateCustomPrivacyPolicyRequestCustomPrivacyPolicyContents setCustomPrivacyPolicyTip(String customPrivacyPolicyTip) {
            this.customPrivacyPolicyTip = customPrivacyPolicyTip;
            return this;
        }
        public String getCustomPrivacyPolicyTip() {
            return this.customPrivacyPolicyTip;
        }

        public CreateCustomPrivacyPolicyRequestCustomPrivacyPolicyContents setLanguageCode(String languageCode) {
            this.languageCode = languageCode;
            return this;
        }
        public String getLanguageCode() {
            return this.languageCode;
        }

    }

}
