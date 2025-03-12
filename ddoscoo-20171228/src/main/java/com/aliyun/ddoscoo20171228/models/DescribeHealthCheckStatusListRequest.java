// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeHealthCheckStatusListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;InstanceId&quot;:&quot;ddoscoo-cn-XXXXX&quot;,&quot;Protocol&quot;:&quot;tcp&quot;,&quot;FrontendPort&quot;:80}]</p>
     */
    @NameInMap("Listeners")
    public String listeners;

    /**
     * <strong>example:</strong>
     * <p>1.1.1.1</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeHealthCheckStatusListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthCheckStatusListRequest self = new DescribeHealthCheckStatusListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHealthCheckStatusListRequest setListeners(String listeners) {
        this.listeners = listeners;
        return this;
    }
    public String getListeners() {
        return this.listeners;
    }

    public DescribeHealthCheckStatusListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
