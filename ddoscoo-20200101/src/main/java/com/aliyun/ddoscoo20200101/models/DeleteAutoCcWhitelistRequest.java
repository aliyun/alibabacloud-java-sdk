// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteAutoCcWhitelistRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>> You can call the [DescribeInstanceIds](https://help.aliyun.com/document_detail/157459.html) operation to query the IDs of all instances.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IP addresses that you want to manage. This parameter is a JSON string. This parameter is a JSON string. The string contains the following field:</p>
     * <br>
     * <p>*   **src**: the IP address. This field is required and must be of the string type.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Whitelist")
    public String whitelist;

    public static DeleteAutoCcWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoCcWhitelistRequest self = new DeleteAutoCcWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAutoCcWhitelistRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteAutoCcWhitelistRequest setWhitelist(String whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public String getWhitelist() {
        return this.whitelist;
    }

}
