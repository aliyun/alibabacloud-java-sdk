// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateSDGRequest extends TeaModel {
    /**
     * <p>The description of the SDG.</p>
     * <br>
     * <p>>  We recommend that you specify this parameter in details for subsequent queries.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the SDG from which you want to create an SDG.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   The first time you create an SDG, the **FromSDGId** parameter is empty.</p>
     * <br>
     * <p>*   If the value of the **FromSDGId** parameter is invalid or does not correspond to an original disk, an error is reported.</p>
     * <p>*   If the value of the **FromSDGId** parameter is not empty, you have created an SDG, and the operation is performed on the existing SDG.</p>
     */
    @NameInMap("FromSDGId")
    public String fromSDGId;

    /**
     * <p>The ID of the device.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum capacity of the SDG. Unit: GB.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   To save costs, we recommend that you specify this parameter based on your business requirements.</p>
     * <br>
     * <p>*   The first time that you create an SDG, the **Size** parameter is required.</p>
     * <br>
     * <p>*   When the amount of data increases, you can pass a new **Size** parameter for resizing.</p>
     * <br>
     * <p>    *   If the value of the **Size** parameter is not empty and is greater than the value of the **Size** parameter of the original SDG, the original disk corresponding to the SDG is scaled out to the size that is specified by the current **Size** parameter.</p>
     * <p>    *   If the value of the **Size** parameter is not empty, or the value of the **Size** parameter is smaller than the value of the **Size** parameter of the original SDG, no operation is performed.</p>
     */
    @NameInMap("Size")
    public String size;

    public static CreateSDGRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSDGRequest self = new CreateSDGRequest();
        return TeaModel.build(map, self);
    }

    public CreateSDGRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSDGRequest setFromSDGId(String fromSDGId) {
        this.fromSDGId = fromSDGId;
        return this;
    }
    public String getFromSDGId() {
        return this.fromSDGId;
    }

    public CreateSDGRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSDGRequest setSize(String size) {
        this.size = size;
        return this;
    }
    public String getSize() {
        return this.size;
    }

}
