// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteAutoCcBlacklistRequest extends TeaModel {
    /**
     * <p>The IP addresses that you want to manage. This parameter is a JSON string. The string contains the following fields:</p>
     * <ul>
     * <li><strong>src</strong>: the IP address. This field is required and must be of the STRING type.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;src&quot;:&quot;198.51.XX.XX&quot;},{&quot;src&quot;:&quot;198.52.XX.XX&quot;}]</p>
     */
    @NameInMap("Blacklist")
    public String blacklist;

    /**
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> operation to query the IDs of all instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-mp91j1ao****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteAutoCcBlacklistRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoCcBlacklistRequest self = new DeleteAutoCcBlacklistRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAutoCcBlacklistRequest setBlacklist(String blacklist) {
        this.blacklist = blacklist;
        return this;
    }
    public String getBlacklist() {
        return this.blacklist;
    }

    public DeleteAutoCcBlacklistRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
