// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RemovePersonalNumbersFromUserRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;0101234****&quot;, &quot;0105678****&quot;]</p>
     */
    @NameInMap("NumberList")
    public String numberList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static RemovePersonalNumbersFromUserRequest build(java.util.Map<String, ?> map) throws Exception {
        RemovePersonalNumbersFromUserRequest self = new RemovePersonalNumbersFromUserRequest();
        return TeaModel.build(map, self);
    }

    public RemovePersonalNumbersFromUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemovePersonalNumbersFromUserRequest setNumberList(String numberList) {
        this.numberList = numberList;
        return this;
    }
    public String getNumberList() {
        return this.numberList;
    }

    public RemovePersonalNumbersFromUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
