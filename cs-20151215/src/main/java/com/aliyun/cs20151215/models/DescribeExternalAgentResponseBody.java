// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeExternalAgentResponseBody extends TeaModel {
    /**
     * <p>The agent configurations in YAML format.</p>
     */
    @NameInMap("config")
    public String config;

    public static DescribeExternalAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExternalAgentResponseBody self = new DescribeExternalAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExternalAgentResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

}
