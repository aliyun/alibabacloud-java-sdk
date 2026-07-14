// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatFlowByImportShrinkRequest extends TeaModel {
    /**
     * <p>The business tenant code. The default value is ALICOM_OPAAS.</p>
     * 
     * <strong>example:</strong>
     * <p>ALICOM_OPAAS</p>
     */
    @NameInMap("BizCode")
    public String bizCode;

    /**
     * <p>The business extension information. The default value is an empty collection.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("BizExtend")
    public String bizExtendShrink;

    /**
     * <p>The flow DSL data to import. This is a block of data in JSON format. To obtain this data, arrange the components on the canvas in the Flow Editor, save the flow, and then click <strong>Settings</strong> &gt; <strong>Export</strong> in the upper-right corner of the canvas. The flow is exported as a JSON data file.</p>
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
     * <p>The remarks for the flow.</p>
     * 
     * <strong>example:</strong>
     * <p>触发订阅</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The title of the flow.</p>
     * 
     * <strong>example:</strong>
     * <p>WhatsApp触发订阅</p>
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
