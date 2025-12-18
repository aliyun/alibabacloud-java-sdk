// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetCompliancePackRequest extends TeaModel {
    /**
     * <p>The ID of the compliance package.</p>
     * <p>For more information about how to obtain the ID of a compliance package, see <a href="https://help.aliyun.com/document_detail/263332.html">ListCompliancePacks</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cp-a8a8626622af0082****</p>
     */
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    /**
     * <p>The tags of the resource.</p>
     * <p>You can add up to 20 tags to a resource.</p>
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
         * <p>The tag key.</p>
         * <p>The tag key cannot be an empty string. The tag key can be up to 64 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify at most 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 256 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
