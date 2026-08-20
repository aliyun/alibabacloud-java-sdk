// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class FinishCurrentProjectNodeRequest extends TeaModel {
    /**
     * <p>The instance ID of the Alibaba Cloud Marketplace order.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4****89</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the process node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1924</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>收货地址已提交，请尽快安排发货。</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The form content to submit, in JSON format. Example: {&quot;TFD0&quot;:&quot;mr.go&quot;,&quot;TFD1&quot;:&quot;1330010xxxx&quot;,&quot;TFD2&quot;:&quot;Chaoyang District, Wangjing Street, Block x, No. y&quot;}.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;TFD0&quot;: &quot;Mr.Go&quot;,&quot;TFD1&quot;: &quot;1330010xxxx&quot;,&quot;TFD2&quot;: &quot;北京市朝阳区望京街道X区Y号&quot; }</p>
     */
    @NameInMap("TemplateForm")
    public String templateForm;

    public static FinishCurrentProjectNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishCurrentProjectNodeRequest self = new FinishCurrentProjectNodeRequest();
        return TeaModel.build(map, self);
    }

    public FinishCurrentProjectNodeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public FinishCurrentProjectNodeRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public FinishCurrentProjectNodeRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public FinishCurrentProjectNodeRequest setTemplateForm(String templateForm) {
        this.templateForm = templateForm;
        return this;
    }
    public String getTemplateForm() {
        return this.templateForm;
    }

}
