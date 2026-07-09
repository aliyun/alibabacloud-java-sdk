// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DescribeDeductLogsShrinkRequest extends TeaModel {
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
    public String ecIdAccountIdsShrink;

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
    public String relationAccountIdsShrink;

    public static DescribeDeductLogsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeductLogsShrinkRequest self = new DescribeDeductLogsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeductLogsShrinkRequest setBillInstanceId(String billInstanceId) {
        this.billInstanceId = billInstanceId;
        return this;
    }
    public String getBillInstanceId() {
        return this.billInstanceId;
    }

    public DescribeDeductLogsShrinkRequest setBillingCommodityCode(String billingCommodityCode) {
        this.billingCommodityCode = billingCommodityCode;
        return this;
    }
    public String getBillingCommodityCode() {
        return this.billingCommodityCode;
    }

    public DescribeDeductLogsShrinkRequest setBillingEndTime(Long billingEndTime) {
        this.billingEndTime = billingEndTime;
        return this;
    }
    public Long getBillingEndTime() {
        return this.billingEndTime;
    }

    public DescribeDeductLogsShrinkRequest setBillingStartTime(Long billingStartTime) {
        this.billingStartTime = billingStartTime;
        return this;
    }
    public Long getBillingStartTime() {
        return this.billingStartTime;
    }

    public DescribeDeductLogsShrinkRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribeDeductLogsShrinkRequest setEcIdAccountIdsShrink(String ecIdAccountIdsShrink) {
        this.ecIdAccountIdsShrink = ecIdAccountIdsShrink;
        return this;
    }
    public String getEcIdAccountIdsShrink() {
        return this.ecIdAccountIdsShrink;
    }

    public DescribeDeductLogsShrinkRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public DescribeDeductLogsShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDeductLogsShrinkRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public DescribeDeductLogsShrinkRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeDeductLogsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDeductLogsShrinkRequest setRelationAccountIdsShrink(String relationAccountIdsShrink) {
        this.relationAccountIdsShrink = relationAccountIdsShrink;
        return this;
    }
    public String getRelationAccountIdsShrink() {
        return this.relationAccountIdsShrink;
    }

}
