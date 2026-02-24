// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateCompliancePacksRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>For more information about how to obtain the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-f632626622af0079****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The page number.</p>
     * <p>Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Valid values: 1 to 100. Minimum value: 1. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The risk level of the compliance pack. Valid values:</p>
     * <ul>
     * <li><p>1: high</p>
     * </li>
     * <li><p>2: medium</p>
     * </li>
     * <li><p>3: low</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskLevel")
    public Integer riskLevel;

    /**
     * <p>The status of the compliance pack. Valid values:</p>
     * <ul>
     * <li><p>ACTIVE: The compliance pack is active.</p>
     * </li>
     * <li><p>CREATING: The compliance pack is being created.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags of the resource.</p>
     * <p>You can add up to 20 tags to a resource.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListAggregateCompliancePacksRequestTag> tag;

    public static ListAggregateCompliancePacksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateCompliancePacksRequest self = new ListAggregateCompliancePacksRequest();
        return TeaModel.build(map, self);
    }

    public ListAggregateCompliancePacksRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public ListAggregateCompliancePacksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAggregateCompliancePacksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAggregateCompliancePacksRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    public ListAggregateCompliancePacksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListAggregateCompliancePacksRequest setTag(java.util.List<ListAggregateCompliancePacksRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListAggregateCompliancePacksRequestTag> getTag() {
        return this.tag;
    }

    public static class ListAggregateCompliancePacksRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value-1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAggregateCompliancePacksRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateCompliancePacksRequestTag self = new ListAggregateCompliancePacksRequestTag();
            return TeaModel.build(map, self);
        }

        public ListAggregateCompliancePacksRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAggregateCompliancePacksRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
