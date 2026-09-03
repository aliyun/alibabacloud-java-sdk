// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetAttributePassingSettingResponseBody extends TeaModel {
    /**
     * <p>The attribute passing settings.</p>
     */
    @NameInMap("AttributePassingSetting")
    public GetAttributePassingSettingResponseBodyAttributePassingSetting attributePassingSetting;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F6F90F3D-4502-5877-B80B-97476F6AE2CC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAttributePassingSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAttributePassingSettingResponseBody self = new GetAttributePassingSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAttributePassingSettingResponseBody setAttributePassingSetting(GetAttributePassingSettingResponseBodyAttributePassingSetting attributePassingSetting) {
        this.attributePassingSetting = attributePassingSetting;
        return this;
    }
    public GetAttributePassingSettingResponseBodyAttributePassingSetting getAttributePassingSetting() {
        return this.attributePassingSetting;
    }

    public GetAttributePassingSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAttributePassingSettingResponseBodyAttributePassingSetting extends TeaModel {
        /**
         * <p>The SourceIdentity pass-through mode. If not configured, Disabled is returned by default. Valid values:</p>
         * <ul>
         * <li>IdP: Uses the SourceIdentity attribute value carried in the SAML assertion from the external identity provider (IdP). The attribute value must be 2 to 64 characters in length and can contain only letters, digits, and the following special characters: =,.@-_.</li>
         * <li>UserName: Uses the CloudSSO username as the SourceIdentity. The system automatically adds a reserved prefix, resulting in the format acs:sso:<username>. The total length cannot exceed 64 characters.</li>
         * <li>Disabled: Does not pass through the SourceIdentity.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        @NameInMap("SourceIdentityPassing")
        public String sourceIdentityPassing;

        public static GetAttributePassingSettingResponseBodyAttributePassingSetting build(java.util.Map<String, ?> map) throws Exception {
            GetAttributePassingSettingResponseBodyAttributePassingSetting self = new GetAttributePassingSettingResponseBodyAttributePassingSetting();
            return TeaModel.build(map, self);
        }

        public GetAttributePassingSettingResponseBodyAttributePassingSetting setSourceIdentityPassing(String sourceIdentityPassing) {
            this.sourceIdentityPassing = sourceIdentityPassing;
            return this;
        }
        public String getSourceIdentityPassing() {
            return this.sourceIdentityPassing;
        }

    }

}
