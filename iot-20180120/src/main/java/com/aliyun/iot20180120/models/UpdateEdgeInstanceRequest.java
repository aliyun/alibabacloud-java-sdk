// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateEdgeInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the edge instance. Valid values:</p>
     * <br>
     * <p>*   true: enables the edge instance.</p>
     * <p>*   false: disables the edge instance.</p>
     * <br>
     * <p>If you do not set this parameter, this parameter is not updated.</p>
     */
    @NameInMap("BizEnable")
    public Boolean bizEnable;

    /**
     * <p>The ID of the edge instance. To obtain the instance ID, perform the following steps: Log on to the [Link IoT Edge console](https://iot.console.aliyun.com/le/instance/list). On the **Edge Instances** page, move the pointer over the name of the edge instance that you want to update and obtain the instance ID.</p>
     * <br>
     * <p>You can also call the [QueryEdgeInstance](~~135214~~) operation to query the instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the Internet of Things (IoT) service instance. This parameter is not required for the public instance but required for Enterprise Edition instances.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The name of the edge instance.</p>
     * <br>
     * <p>The name can be up to 20 characters in length and can contain letters, digits, underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The specifications of the edge instance. Valid values:</p>
     * <br>
     * <p>*   10: Lite Edition</p>
     * <p>*   20: Standard Edition</p>
     * <p>*   30: Pro Edition</p>
     * <br>
     * <p>If you do not set this parameter, this parameter is not updated.</p>
     */
    @NameInMap("Spec")
    public Integer spec;

    /**
     * <p>The tags of the edge instance. Each tag is a key-value pair. Multiple tags are separated with commas (,). Example: `k1:v1,k2:v2`.</p>
     * <br>
     * <p>*   Take note of the following limits on tag keys:</p>
     * <br>
     * <p>    *   Tag keys cannot be left empty.</p>
     * <p>    *   Tag keys must be unique in the edge instance.</p>
     * <p>    *   Tag keys support only letters.</p>
     * <p>    *   Each tag key can be up to 20 characters in length.</p>
     * <br>
     * <p>*   Take note of the following limits on tag values:</p>
     * <br>
     * <p>    *   Tag values cannot be left empty.</p>
     * <p>    *   A tag value can contain letters, digits, underscores (\_), and hyphens (-).</p>
     * <p>    *   Each tag value can be up to 20 characters in length.</p>
     * <br>
     * <p>If you do not set this parameter, this parameter is not updated.</p>
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
