// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetCompliancePackRequest extends TeaModel {
    /**
     * <p>The compliance package ID.</p>
     * <p>For more information about how to obtain the compliance package ID, see <a href="https://help.aliyun.com/document_detail/263332.html">ListCompliancePacks</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cp-a8a8626622af0082****</p>
     */
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    /**
     * <p>The tags of the resource. This parameter is deprecated and takes no effect if it is specified.</p>
     * <p>You can add up to 20 tags.</p>
     */
    @NameInMap("Tag")
    @Deprecated
    public java.util.List<GetCompliancePackRequestTag> tag;

    public static GetCompliancePackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCompliancePackRequest self = new GetCompliancePackRequest();
        return TeaModel.build(map, self);
    }

    public GetCompliancePackRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    @Deprecated
    public GetCompliancePackRequest setTag(java.util.List<GetCompliancePackRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<GetCompliancePackRequestTag> getTag() {
        return this.tag;
    }

    public static class GetCompliancePackRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource.</p>
         * <p>The tag key cannot be an empty string. The tag key can be up to 64 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify up to 20 tag keys at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource.</p>
         * <p>The tag value can be an empty string or a string of up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>Each tag key must have a corresponding tag value. You can specify up to 20 tag values at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>value-1</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetCompliancePackRequestTag build(java.util.Map<String, ?> map) throws Exception {
            GetCompliancePackRequestTag self = new GetCompliancePackRequestTag();
            return TeaModel.build(map, self);
        }

        public GetCompliancePackRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetCompliancePackRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
