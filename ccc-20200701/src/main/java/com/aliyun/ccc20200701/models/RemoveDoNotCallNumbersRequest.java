// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RemoveDoNotCallNumbersRequest extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>List of Do Not Call numbers to be deleted, formatted as a JSON array string. The array length must be between 1 and 300.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;1900000****&quot;,&quot;1312211****&quot;]</p>
     */
    @NameInMap("NumberList")
    public String numberList;

    public static RemoveDoNotCallNumbersRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveDoNotCallNumbersRequest self = new RemoveDoNotCallNumbersRequest();
        return TeaModel.build(map, self);
    }

    public RemoveDoNotCallNumbersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemoveDoNotCallNumbersRequest setNumberList(String numberList) {
        this.numberList = numberList;
        return this;
    }
    public String getNumberList() {
        return this.numberList;
    }

}
