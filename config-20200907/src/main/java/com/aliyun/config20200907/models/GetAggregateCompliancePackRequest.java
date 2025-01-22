// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateCompliancePackRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>For more information about how to obtain the ID of the account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-f632626622af0079****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the compliance package.</p>
     * <p>For more information about how to obtain the ID of a compliance package, see <a href="https://help.aliyun.com/document_detail/262059.html">ListAggregateCompliancePacks</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cp-fdc8626622af00f9****</p>
     */
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    @NameInMap("Tag")
    public java.util.List<GetAggregateCompliancePackRequestTag> tag;

    public static GetAggregateCompliancePackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateCompliancePackRequest self = new GetAggregateCompliancePackRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregateCompliancePackRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public GetAggregateCompliancePackRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public GetAggregateCompliancePackRequest setTag(java.util.List<GetAggregateCompliancePackRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<GetAggregateCompliancePackRequestTag> getTag() {
        return this.tag;
    }

    public static class GetAggregateCompliancePackRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetAggregateCompliancePackRequestTag build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateCompliancePackRequestTag self = new GetAggregateCompliancePackRequestTag();
            return TeaModel.build(map, self);
        }

        public GetAggregateCompliancePackRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetAggregateCompliancePackRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
