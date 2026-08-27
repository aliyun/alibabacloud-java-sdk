// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatFlowByImportShrinkRequest extends TeaModel {
    /**
     * <p>The business tenant code. Default value: ALICOM_OPAAS.</p>
     * 
     * <strong>example:</strong>
     * <p>ALICOM_OPAAS</p>
     */
    @NameInMap("BizCode")
    public String bizCode;

    /**
     * <p>The business extension information. Default value: an empty collection.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("BizExtend")
    public String bizExtendShrink;

    /**
     * <p>The imported flow DSL data, which is a JSON-formatted string. You can arrange flow components on the canvas in the flow orchestration console in advance, save the flow, and then click <strong>Settings</strong> &gt; <strong>Export</strong> in the upper-right corner of the canvas to export a JSON data file for viewing.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;schema&quot;: {
     *     &quot;namespace&quot;: &quot;External&quot;,
     *     &quot;version&quot;: &quot;1.0&quot;,
     *     &quot;copyright&quot;: &quot;Alibaba Cloud&quot;
     *   },
     *   &quot;editor&quot;: &quot;H4sIAAAAAAAAA+1YbU/c***********************&quot;,
     *   &quot;flow&quot;: {
     *     &quot;triggerType&quot;: &quot;TriggeredByWhatsApp&quot;
     *   }
     * }</p>
     */
    @NameInMap("FlowViewModel")
    public String flowViewModel;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The flow remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>Trigger Subscription.</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The flow title.</p>
     * 
     * <strong>example:</strong>
     * <p>WhatsApp Trigger Subscription.</p>
     */
    @NameInMap("Title")
    public String title;

    public static CreateChatFlowByImportShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChatFlowByImportShrinkRequest self = new CreateChatFlowByImportShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateChatFlowByImportShrinkRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public CreateChatFlowByImportShrinkRequest setBizExtendShrink(String bizExtendShrink) {
        this.bizExtendShrink = bizExtendShrink;
        return this;
    }
    public String getBizExtendShrink() {
        return this.bizExtendShrink;
    }

    public CreateChatFlowByImportShrinkRequest setFlowViewModel(String flowViewModel) {
        this.flowViewModel = flowViewModel;
        return this;
    }
    public String getFlowViewModel() {
        return this.flowViewModel;
    }

    public CreateChatFlowByImportShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateChatFlowByImportShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateChatFlowByImportShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateChatFlowByImportShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateChatFlowByImportShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
