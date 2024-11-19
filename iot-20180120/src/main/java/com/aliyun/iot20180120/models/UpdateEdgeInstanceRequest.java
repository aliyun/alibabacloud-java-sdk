// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateEdgeInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the edge instance. Valid values:</p>
     * <ul>
     * <li>true: enables the edge instance.</li>
     * <li>false: disables the edge instance.</li>
     * </ul>
     * <p>If you do not set this parameter, this parameter is not updated.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("BizEnable")
    public Boolean bizEnable;

    /**
     * <p>The ID of the edge instance. To obtain the instance ID, perform the following steps: Log on to the <a href="https://iot.console.aliyun.com/le/instance/list">Link IoT Edge console</a>. On the <strong>Edge Instances</strong> page, move the pointer over the name of the edge instance that you want to update and obtain the instance ID.</p>
     * <p>You can also call the <a href="https://help.aliyun.com/document_detail/135214.html">QueryEdgeInstance</a> operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>F3APY0tPLhmgGtx0****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the Internet of Things (IoT) service instance. This parameter is not required for the public instance but required for Enterprise Edition instances.</p>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The name of the edge instance.</p>
     * <p>The name can be up to 20 characters in length and can contain letters, digits, underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LinkIoTEdge_Node</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The specifications of the edge instance. Valid values:</p>
     * <ul>
     * <li>10: Lite Edition</li>
     * <li>20: Standard Edition</li>
     * <li>30: Pro Edition</li>
     * </ul>
     * <p>If you do not set this parameter, this parameter is not updated.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Spec")
    public Integer spec;

    /**
     * <p>The tags of the edge instance. Each tag is a key-value pair. Multiple tags are separated with commas (,). Example: <code>k1:v1,k2:v2</code>.</p>
     * <ul>
     * <li><p>Take note of the following limits on tag keys:</p>
     * <ul>
     * <li>Tag keys cannot be left empty.</li>
     * <li>Tag keys must be unique in the edge instance.</li>
     * <li>Tag keys support only letters.</li>
     * <li>Each tag key can be up to 20 characters in length.</li>
     * </ul>
     * </li>
     * <li><p>Take note of the following limits on tag values:</p>
     * <ul>
     * <li>Tag values cannot be left empty.</li>
     * <li>A tag value can contain letters, digits, underscores (_), and hyphens (-).</li>
     * <li>Each tag value can be up to 20 characters in length.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>If you do not set this parameter, this parameter is not updated.</p>
     * 
     * <strong>example:</strong>
     * <p>k1:v1,k2:v2</p>
     */
    @NameInMap("Tags")
    public String tags;

    public static UpdateEdgeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeInstanceRequest self = new UpdateEdgeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeInstanceRequest setBizEnable(Boolean bizEnable) {
        this.bizEnable = bizEnable;
        return this;
    }
    public Boolean getBizEnable() {
        return this.bizEnable;
    }

    public UpdateEdgeInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateEdgeInstanceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateEdgeInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateEdgeInstanceRequest setSpec(Integer spec) {
        this.spec = spec;
        return this;
    }
    public Integer getSpec() {
        return this.spec;
    }

    public UpdateEdgeInstanceRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
