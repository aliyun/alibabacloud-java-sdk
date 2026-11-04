// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class DeletePhoneTagsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PhoneNumberList")
    public java.util.List<String> phoneNumberList;

    public static DeletePhoneTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePhoneTagsRequest self = new DeletePhoneTagsRequest();
        return TeaModel.build(map, self);
    }

    public DeletePhoneTagsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeletePhoneTagsRequest setPhoneNumberList(java.util.List<String> phoneNumberList) {
        this.phoneNumberList = phoneNumberList;
        return this;
    }
    public java.util.List<String> getPhoneNumberList() {
        return this.phoneNumberList;
    }

}
