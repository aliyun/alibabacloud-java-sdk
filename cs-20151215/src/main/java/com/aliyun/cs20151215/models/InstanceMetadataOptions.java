// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class InstanceMetadataOptions extends TeaModel {
    /**
     * <p>The ECS instance metadata access mode configuration. Valid values:</p>
     * <ul>
     * <li><code>optional</code>: Compatible with both normal mode and hardened mode.</li>
     * <li><code>required</code>: Enables hardened mode only (IMDSv2). After this mode is enabled, applications in the node cannot access ECS instance metadata in normal mode.</li>
     * </ul>
     * <p>Default value: <code>optional</code>.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <ul>
     * <li>This parameter is currently available only by whitelist. To use this parameter, submit a ticket.</li>
     * <li>Only ACK managed clusters of version 1.28 and later support this parameter.</li>
     * </ul>
     * <blockquote>
     * <p>For more information about instance metadata access modes, see <a href="https://help.aliyun.com/document_detail/108460.html">Instance metadata access modes</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>optional</p>
     */
    @NameInMap("http_tokens")
    public String httpTokens;

    public static InstanceMetadataOptions build(java.util.Map<String, ?> map) throws Exception {
        InstanceMetadataOptions self = new InstanceMetadataOptions();
        return TeaModel.build(map, self);
    }

    public InstanceMetadataOptions setHttpTokens(String httpTokens) {
        this.httpTokens = httpTokens;
        return this;
    }
    public String getHttpTokens() {
        return this.httpTokens;
    }

}
