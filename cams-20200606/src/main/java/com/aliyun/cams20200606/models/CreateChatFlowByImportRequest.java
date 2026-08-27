// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatFlowByImportRequest extends TeaModel {
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
    public java.util.Map<String, ?> bizExtend;

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

    public static CreateChatFlowByImportRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChatFlowByImportRequest self = new CreateChatFlowByImportRequest();
        return TeaModel.build(map, self);
    }

    public CreateChatFlowByImportRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public CreateChatFlowByImportRequest setBizExtend(java.util.Map<String, ?> bizExtend) {
        this.bizExtend = bizExtend;
        return this;
    }
    public java.util.Map<String, ?> getBizExtend() {
        return this.bizExtend;
    }

    public CreateChatFlowByImportRequest setFlowViewModel(String flowViewModel) {
        this.flowViewModel = flowViewModel;
        return this;
    }
    public String getFlowViewModel() {
        return this.flowViewModel;
    }

    public CreateChatFlowByImportRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateChatFlowByImportRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateChatFlowByImportRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateChatFlowByImportRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateChatFlowByImportRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
