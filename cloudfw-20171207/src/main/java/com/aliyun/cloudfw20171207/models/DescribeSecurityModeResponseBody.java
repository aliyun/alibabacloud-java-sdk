// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSecurityModeResponseBody extends TeaModel {
    /**
     * <p>The application module.</p>
     * 
     * <strong>example:</strong>
     * <p>sg_server</p>
     */
    @NameInMap("Module")
    @Deprecated
    public String module;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C6D68A02-54D5-5F5C-A8AA-6D6C2874****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The security mode. Valid values:</p>
     * <p><strong>0</strong>: disabled.</p>
     * <p><strong>1</strong>: enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SecurityMode")
    public Integer securityMode;

    public static DescribeSecurityModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityModeResponseBody self = new DescribeSecurityModeResponseBody();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public DescribeSecurityModeResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public DescribeSecurityModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityModeResponseBody setSecurityMode(Integer securityMode) {
        this.securityMode = securityMode;
        return this;
    }
    public Integer getSecurityMode() {
        return this.securityMode;
    }

}
