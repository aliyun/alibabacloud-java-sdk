// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigLayer4RemarkRequest extends TeaModel {
    /**
     * <p>The port forwarding rule that you want to manage.</p>
     * <br>
     * <p>This parameter is a string that consists of JSON arrays. Each element in a JSON array indicates a port forwarding rule. You can perform this operation only on one port forwarding rule at a time.</p>
     * <br>
     * <p>> You can call the [DescribeNetworkRules](https://help.aliyun.com/document_detail/157484.html) to query existing port forwarding rules.</p>
     * <br>
     * <p>Each port forwarding rule contains the following fields:</p>
     * <br>
     * <p>*   **InstanceId**: the ID of the instance. This field is required and must be of the STRING type.</p>
     * <p>*   **Protocol**: the forwarding protocol. This field is required and must be of the STRING type. Valid values: **tcp** and **udp**.</p>
     * <p>*   **FrontendPort**: the forwarding port. This field is required and must be of the INTEGER type.</p>
     * <p>*   **Remark**: the remarks of the port forwarding rule. This field is required and must be of the STRING type. The value can contain letters, digits, and some special characters, such as `, . + - * / _`. The value can be up to 200 characters in length.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Listeners")
    public String listeners;

    public static ConfigLayer4RemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer4RemarkRequest self = new ConfigLayer4RemarkRequest();
        return TeaModel.build(map, self);
    }

    public ConfigLayer4RemarkRequest setListeners(String listeners) {
        this.listeners = listeners;
        return this;
    }
    public String getListeners() {
        return this.listeners;
    }

}
