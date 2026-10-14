// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteAutoCcWhitelistRequest extends TeaModel {
    /**
     * <p>The ID of the Anti-DDoS Pro or Anti-DDoS Premium instance.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> to query the IDs of all Anti-DDoS Pro or Anti-DDoS Premium instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-mp91j1ao****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The details of the whitelist IP, expressed as a JSON string with the following structure.</p>
     * <ul>
     * <li><strong>src: String</strong> type, required, the whitelist IP.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;src&quot;:&quot;1.1.1.1&quot;},{&quot;src&quot;:&quot;2.2.2.2&quot;}]</p>
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
