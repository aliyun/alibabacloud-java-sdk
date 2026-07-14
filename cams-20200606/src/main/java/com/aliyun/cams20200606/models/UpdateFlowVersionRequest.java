// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateFlowVersionRequest extends TeaModel {
    /**
     * <p>The tenant code. Default value: ALICOM_OPAAS.</p>
     * 
     * <strong>example:</strong>
     * <p>ALICOM_OPAAS</p>
     */
    @NameInMap("BizCode")
    public String bizCode;

    /**
     * <p>The extended business information. The default value is an empty collection.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("BizExtend")
    public java.util.Map<String, ?> bizExtend;

    /**
     * <p>The code of the flow. View the flow code in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>9ccc41**************************</p>
     */
    @NameInMap("FlowCode")
    public String flowCode;

    /**
     * <p>The version of the flow. In the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a>, click the flow name to open the canvas and view the flow version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FlowVersion")
    public String flowVersion;

    /**
     * <p>The DSL data of the flow version, in JSON format. To obtain this data, orchestrate the components on the canvas in the Flow Editor. After you save the flow, click <strong>Settings</strong> &gt; <strong>Export</strong> in the upper-right corner of the canvas to export the flow as a JSON data file.</p>
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
     * <p>The remarks for the version.</p>
     * 
     * <strong>example:</strong>
     * <p>修复发送WhatsApp消息错误</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UpdateFlowVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowVersionRequest self = new UpdateFlowVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlowVersionRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public UpdateFlowVersionRequest setBizExtend(java.util.Map<String, ?> bizExtend) {
        this.bizExtend = bizExtend;
        return this;
    }
    public java.util.Map<String, ?> getBizExtend() {
        return this.bizExtend;
    }

    public UpdateFlowVersionRequest setFlowCode(String flowCode) {
        this.flowCode = flowCode;
        return this;
    }
    public String getFlowCode() {
        return this.flowCode;
    }

    public UpdateFlowVersionRequest setFlowVersion(String flowVersion) {
        this.flowVersion = flowVersion;
        return this;
    }
    public String getFlowVersion() {
        return this.flowVersion;
    }

    public UpdateFlowVersionRequest setFlowViewModel(String flowViewModel) {
        this.flowViewModel = flowViewModel;
        return this;
    }
    public String getFlowViewModel() {
        return this.flowViewModel;
    }

    public UpdateFlowVersionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateFlowVersionRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateFlowVersionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateFlowVersionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
