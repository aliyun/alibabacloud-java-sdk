// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DescribeFrInstancesRequest extends TeaModel {
    /**
     * <p>The capacity type.</p>
     * 
     * <strong>example:</strong>
     * <p>deadlineAcc</p>
     */
    @NameInMap("CapacityType")
    public String capacityType;

    /**
     * <p>The commodity code.</p>
     * 
     * <strong>example:</strong>
     * <p>slb_albcubag_dp_cn</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The cycle type.</p>
     * 
     * <strong>example:</strong>
     * <p>dynamicMonth</p>
     */
    @NameInMap("CycleType")
    public String cycleType;

    /**
     * <p>The enterprise and account list. If this parameter is empty, the current account is queried.</p>
     */
    @NameInMap("EcIdAccountIds")
    public java.util.List<DescribeFrInstancesRequestEcIdAccountIds> ecIdAccountIds;

    /**
     * <p>The end time.</p>
     * 
     * <strong>example:</strong>
     * <p>1710604800000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The resource dimension to query.</p>
     * 
     * <strong>example:</strong>
     * <p>cu</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>alb_cubag*******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance label value of the resource plan.</p>
     * 
     * <strong>example:</strong>
     * <p>FR-***</p>
     */
    @NameInMap("InstanceTag")
    public String instanceTag;

    /**
     * <p>The primary marketplace ID. If this parameter is empty, the marketplace ID of the current user is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>2684202000018</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product code.</p>
     * 
     * <strong>example:</strong>
     * <p>slb</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The sort field.</p>
     * 
     * <strong>example:</strong>
     * <p>startTime</p>
     */
    @NameInMap("SortField")
    public String sortField;

    /**
     * <p>The sorting rule.</p>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("SortRule")
    public String sortRule;

    /**
     * <p>The specification.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1678939035000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The resource status.</p>
     * 
     * <strong>example:</strong>
     * <p>valid</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The template code.</p>
     * 
     * <strong>example:</strong>
     * <p>slb_albcubag*******</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    public static DescribeFrInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFrInstancesRequest self = new DescribeFrInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFrInstancesRequest setCapacityType(String capacityType) {
        this.capacityType = capacityType;
        return this;
    }
    public String getCapacityType() {
        return this.capacityType;
    }

    public DescribeFrInstancesRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribeFrInstancesRequest setCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }
    public String getCycleType() {
        return this.cycleType;
    }

    public DescribeFrInstancesRequest setEcIdAccountIds(java.util.List<DescribeFrInstancesRequestEcIdAccountIds> ecIdAccountIds) {
        this.ecIdAccountIds = ecIdAccountIds;
        return this;
    }
    public java.util.List<DescribeFrInstancesRequestEcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    public DescribeFrInstancesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeFrInstancesRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public DescribeFrInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeFrInstancesRequest setInstanceTag(String instanceTag) {
        this.instanceTag = instanceTag;
        return this;
    }
    public String getInstanceTag() {
        return this.instanceTag;
    }

    public DescribeFrInstancesRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public DescribeFrInstancesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeFrInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFrInstancesRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeFrInstancesRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public DescribeFrInstancesRequest setSortRule(String sortRule) {
        this.sortRule = sortRule;
        return this;
    }
    public String getSortRule() {
        return this.sortRule;
    }

    public DescribeFrInstancesRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public DescribeFrInstancesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeFrInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeFrInstancesRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public static class DescribeFrInstancesRequestEcIdAccountIds extends TeaModel {
        /**
         * <p>The list of accounts to access. If this parameter is empty, all accounts under the current entity ID are selected.</p>
         */
        @NameInMap("AccountIds")
        public java.util.List<Long> accountIds;

        /**
         * <p>The enterprise entity ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1004064243473974</p>
         */
        @NameInMap("EcId")
        public String ecId;

        public static DescribeFrInstancesRequestEcIdAccountIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeFrInstancesRequestEcIdAccountIds self = new DescribeFrInstancesRequestEcIdAccountIds();
            return TeaModel.build(map, self);
        }

        public DescribeFrInstancesRequestEcIdAccountIds setAccountIds(java.util.List<Long> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        public DescribeFrInstancesRequestEcIdAccountIds setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

    }

}
