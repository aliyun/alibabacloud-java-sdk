// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the Internet of Things (IoT) service instance. This parameter is not required for public instances. However, this parameter is required for the instances that you have purchased.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The name of the edge instance.</p>
     * <br>
     * <p>An instance name cannot exceed 20 characters in length and can contain uppercase letters, lowercase letters, digits, underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The specification of the edge instance.</p>
     * <br>
     * <p>*   10: Lite Edition.</p>
     * <p>*   20: Standard Edition.</p>
     * <p>*   30: Pro Edition.</p>
     * <br>
     * <p>Default value: 20.</p>
     */
    @NameInMap("Spec")
    public Integer spec;

    /**
     * <p>The tags of the edge instance. Syntax of a tag: `key:value`. Multiple tags are separated with commas (,), for example, `k1:v1,k2:v2`.</p>
     * <br>
     * <p>*   Note the following limits on tag keys:</p>
     * <br>
     * <p>    *   Tag values cannot be left empty.</p>
     * <p>    *   Tag keys must be unique in the edge instance.</p>
     * <p>    *   Tag keys only support letters.</p>
     * <p>    *   Each tag key cannot exceed 20 characters in length.</p>
     * <br>
     * <p>*   Note the following limits on tag values:</p>
     * <br>
     * <p>    *   Tag values cannot be left empty.</p>
     * <p>    *   A tag value can contain uppercase letters, lowercase letters, digits, underscores (\_), and hyphens (-).</p>
     * <p>    *   Each tag value cannot exceed 20 characters in length.</p>
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
