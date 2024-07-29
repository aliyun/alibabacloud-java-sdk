// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class FinishCurrentProjectNodeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4****89</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1924</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    @NameInMap("Remark")
    public String remark;

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
