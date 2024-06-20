// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RemovePhoneNumbersRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Force")
    public Boolean force;

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
     * <p>[&quot;0101234****&quot;,&quot;0105678****&quot;]</p>
     */
    @NameInMap("NumberList")
    public String numberList;

    public static RemovePhoneNumbersRequest build(java.util.Map<String, ?> map) throws Exception {
        RemovePhoneNumbersRequest self = new RemovePhoneNumbersRequest();
        return TeaModel.build(map, self);
    }

    public RemovePhoneNumbersRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public RemovePhoneNumbersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemovePhoneNumbersRequest setNumberList(String numberList) {
        this.numberList = numberList;
        return this;
    }
    public String getNumberList() {
        return this.numberList;
    }

}
