// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DescribeDeductLogsRequest extends TeaModel {
    /**
     * <p>The instance ID for billing deduction.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs-******</p>
     */
    @NameInMap("BillInstanceId")
    public String billInstanceId;

    /**
     * <p>The commodity code of the deducted item.</p>
     * 
     * <strong>example:</strong>
     * <p>snapshot</p>
     */
    @NameInMap("BillingCommodityCode")
    public String billingCommodityCode;

    /**
     * <p>The billing end time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1679068799999</p>
     */
    @NameInMap("BillingEndTime")
    public Long billingEndTime;

    /**
     * <p>The billing start time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1647446400000</p>
     */
    @NameInMap("BillingStartTime")
    public Long billingStartTime;

    /**
     * <p>The commodity code.</p>
     * 
     * <strong>example:</strong>
     * <p>ossbag</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The enterprise and account list. If this parameter is empty, the current account is queried.</p>
     */
    @NameInMap("EcIdAccountIds")
    public java.util.List<DescribeDeductLogsRequestEcIdAccountIds> ecIdAccountIds;

    /**
     * <p>The resource dimension for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>oss_rc</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>OSSBAG-cn******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The primary marketplace ID. If this parameter is empty, the marketplace ID of the current user is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>2684201000001</p>
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
     * <p>The list of deduction accounts.</p>
     */
    @NameInMap("RelationAccountIds")
    public java.util.List<Long> relationAccountIds;

    public static DescribeDeductLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeductLogsRequest self = new DescribeDeductLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeductLogsRequest setBillInstanceId(String billInstanceId) {
        this.billInstanceId = billInstanceId;
        return this;
    }
    public String getBillInstanceId() {
        return this.billInstanceId;
    }

    public DescribeDeductLogsRequest setBillingCommodityCode(String billingCommodityCode) {
        this.billingCommodityCode = billingCommodityCode;
        return this;
    }
    public String getBillingCommodityCode() {
        return this.billingCommodityCode;
    }

    public DescribeDeductLogsRequest setBillingEndTime(Long billingEndTime) {
        this.billingEndTime = billingEndTime;
        return this;
    }
    public Long getBillingEndTime() {
        return this.billingEndTime;
    }

    public DescribeDeductLogsRequest setBillingStartTime(Long billingStartTime) {
        this.billingStartTime = billingStartTime;
        return this;
    }
    public Long getBillingStartTime() {
        return this.billingStartTime;
    }

    public DescribeDeductLogsRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribeDeductLogsRequest setEcIdAccountIds(java.util.List<DescribeDeductLogsRequestEcIdAccountIds> ecIdAccountIds) {
        this.ecIdAccountIds = ecIdAccountIds;
        return this;
    }
    public java.util.List<DescribeDeductLogsRequestEcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    public DescribeDeductLogsRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public DescribeDeductLogsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDeductLogsRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public DescribeDeductLogsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeDeductLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDeductLogsRequest setRelationAccountIds(java.util.List<Long> relationAccountIds) {
        this.relationAccountIds = relationAccountIds;
        return this;
    }
    public java.util.List<Long> getRelationAccountIds() {
        return this.relationAccountIds;
    }

    public static class DescribeDeductLogsRequestEcIdAccountIds extends TeaModel {
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

        public static DescribeDeductLogsRequestEcIdAccountIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeductLogsRequestEcIdAccountIds self = new DescribeDeductLogsRequestEcIdAccountIds();
            return TeaModel.build(map, self);
        }

        public DescribeDeductLogsRequestEcIdAccountIds setAccountIds(java.util.List<Long> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        public DescribeDeductLogsRequestEcIdAccountIds setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

    }

}
