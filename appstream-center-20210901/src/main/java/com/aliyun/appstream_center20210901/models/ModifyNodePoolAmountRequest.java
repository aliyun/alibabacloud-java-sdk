// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyNodePoolAmountRequest extends TeaModel {
    /**
     * <p>The ID of the delivery group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The parameters related to the configuration change of the node pool.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodePool")
    public ModifyNodePoolAmountRequestNodePool nodePool;

    /**
     * <p>The product type.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>CloudApp: App Streaming</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static ModifyNodePoolAmountRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodePoolAmountRequest self = new ModifyNodePoolAmountRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNodePoolAmountRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public ModifyNodePoolAmountRequest setNodePool(ModifyNodePoolAmountRequestNodePool nodePool) {
        this.nodePool = nodePool;
        return this;
    }
    public ModifyNodePoolAmountRequestNodePool getNodePool() {
        return this.nodePool;
    }

    public ModifyNodePoolAmountRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public static class ModifyNodePoolAmountRequestNodePool extends TeaModel {
        /**
         * <p>The total number of subscription nodes after the change.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeAmount")
        public Integer nodeAmount;

        /**
         * <p>The change mode of subscription nodes.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>EXPAND_FROM_POST_PAID_EXPLICIT: changes from specified pay-as-you-go nodes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EXPAND_FROM_POST_PAID_EXPLICIT</p>
         */
        @NameInMap("PrePaidNodeAmountModifyMode")
        public String prePaidNodeAmountModifyMode;

        /**
         * <p>The nodes for which you want to change the billing method.</p>
         */
        @NameInMap("PrePaidNodeAmountModifyNodeIds")
        public java.util.List<String> prePaidNodeAmountModifyNodeIds;

        public static ModifyNodePoolAmountRequestNodePool build(java.util.Map<String, ?> map) throws Exception {
            ModifyNodePoolAmountRequestNodePool self = new ModifyNodePoolAmountRequestNodePool();
            return TeaModel.build(map, self);
        }

        public ModifyNodePoolAmountRequestNodePool setNodeAmount(Integer nodeAmount) {
            this.nodeAmount = nodeAmount;
            return this;
        }
        public Integer getNodeAmount() {
            return this.nodeAmount;
        }

        public ModifyNodePoolAmountRequestNodePool setPrePaidNodeAmountModifyMode(String prePaidNodeAmountModifyMode) {
            this.prePaidNodeAmountModifyMode = prePaidNodeAmountModifyMode;
            return this;
        }
        public String getPrePaidNodeAmountModifyMode() {
            return this.prePaidNodeAmountModifyMode;
        }

        public ModifyNodePoolAmountRequestNodePool setPrePaidNodeAmountModifyNodeIds(java.util.List<String> prePaidNodeAmountModifyNodeIds) {
            this.prePaidNodeAmountModifyNodeIds = prePaidNodeAmountModifyNodeIds;
            return this;
        }
        public java.util.List<String> getPrePaidNodeAmountModifyNodeIds() {
            return this.prePaidNodeAmountModifyNodeIds;
        }

    }

}
