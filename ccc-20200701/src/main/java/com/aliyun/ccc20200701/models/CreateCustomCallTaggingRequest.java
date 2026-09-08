// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateCustomCallTaggingRequest extends TeaModel {
    /**
     * <p>A list of inbound control tags, formatted as a JSON array string. The number of array elements must be between 1 and 10,000. Each element in the array is an object with the following properties: number (must be a numeric string of 4 to 32 characters), description, and callTagNameList. The callTagNameList is an array whose elements are number labels (ensure that these number labels have already been created).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;number&quot;:&quot;1312121****&quot;,&quot;description&quot;:&quot;王先生&quot;,&quot;callTagNameList&quot;:[&quot;TagA&quot;]},{&quot;number&quot;:&quot;1388888****&quot;,&quot;description&quot;:&quot;张先生&quot;,&quot;callTagNameList&quot;:[&quot;TagB&quot;]}]</p>
     */
    @NameInMap("CustomNumberList")
    public String customNumberList;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateCustomCallTaggingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomCallTaggingRequest self = new CreateCustomCallTaggingRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomCallTaggingRequest setCustomNumberList(String customNumberList) {
        this.customNumberList = customNumberList;
        return this;
    }
    public String getCustomNumberList() {
        return this.customNumberList;
    }

    public CreateCustomCallTaggingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
