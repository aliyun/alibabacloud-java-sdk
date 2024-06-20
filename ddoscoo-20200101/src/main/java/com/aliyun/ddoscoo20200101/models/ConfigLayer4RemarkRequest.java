// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigLayer4RemarkRequest extends TeaModel {
    /**
     * <p>The port forwarding rule that you want to manage.</p>
     * <p>This parameter is a string that consists of JSON arrays. Each element in a JSON array indicates a port forwarding rule. You can perform this operation only on one port forwarding rule at a time.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/157484.html">DescribeNetworkRules</a> to query existing port forwarding rules.</p>
     * </blockquote>
     * <p>Each port forwarding rule contains the following fields:</p>
     * <ul>
     * <li><strong>InstanceId</strong>: the ID of the instance. This field is required and must be of the STRING type.</li>
     * <li><strong>Protocol</strong>: the forwarding protocol. This field is required and must be of the STRING type. Valid values: <strong>tcp</strong> and <strong>udp</strong>.</li>
     * <li><strong>FrontendPort</strong>: the forwarding port. This field is required and must be of the INTEGER type.</li>
     * <li><strong>Remark</strong>: the remarks of the port forwarding rule. This field is required and must be of the STRING type. The value can contain letters, digits, and some special characters, such as <code>, . + - * / _</code>. The value can be up to 200 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;InstanceId\&quot;:\&quot;ddosDip-sg-4hr2b3l****\&quot;,\&quot;FrontendPort\&quot;:2020,\&quot;Protocol\&quot;:\&quot;udp\&quot;,\&quot;Remark\&quot;:\&quot;test\&quot;}]</p>
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
