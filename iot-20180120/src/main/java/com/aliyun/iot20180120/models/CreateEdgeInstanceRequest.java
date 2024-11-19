// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the Internet of Things (IoT) service instance. This parameter is not required for public instances. However, this parameter is required for the instances that you have purchased.</p>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The name of the edge instance.</p>
     * <p>An instance name cannot exceed 20 characters in length and can contain uppercase letters, lowercase letters, digits, underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LinkIoTEdge_Node</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The specification of the edge instance.</p>
     * <ul>
     * <li>10: Lite Edition.</li>
     * <li>20: Standard Edition.</li>
     * <li>30: Pro Edition.</li>
     * </ul>
     * <p>Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Spec")
    public Integer spec;

    /**
     * <p>The tags of the edge instance. Syntax of a tag: <code>key:value</code>. Multiple tags are separated with commas (,), for example, <code>k1:v1,k2:v2</code>.</p>
     * <ul>
     * <li><p>Note the following limits on tag keys:</p>
     * <ul>
     * <li>Tag values cannot be left empty.</li>
     * <li>Tag keys must be unique in the edge instance.</li>
     * <li>Tag keys only support letters.</li>
     * <li>Each tag key cannot exceed 20 characters in length.</li>
     * </ul>
     * </li>
     * <li><p>Note the following limits on tag values:</p>
     * <ul>
     * <li>Tag values cannot be left empty.</li>
     * <li>A tag value can contain uppercase letters, lowercase letters, digits, underscores (_), and hyphens (-).</li>
     * <li>Each tag value cannot exceed 20 characters in length.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>k1:v1,k2:v2</p>
     */
    @NameInMap("Tags")
    public String tags;

    public static CreateEdgeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeInstanceRequest self = new CreateEdgeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateEdgeInstanceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateEdgeInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateEdgeInstanceRequest setSpec(Integer spec) {
        this.spec = spec;
        return this;
    }
    public Integer getSpec() {
        return this.spec;
    }

    public CreateEdgeInstanceRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
