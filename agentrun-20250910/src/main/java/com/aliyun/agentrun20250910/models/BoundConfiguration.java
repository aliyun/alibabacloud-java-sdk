// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class BoundConfiguration extends TeaModel {
    /**
     * <p>绑定的工具配置列表，每个配置项定义一个工具与特定 HTTP 路径和方法的绑定关系</p>
     */
    @NameInMap("boundTools")
    public java.util.List<BoundTool> boundTools;

    public static BoundConfiguration build(java.util.Map<String, ?> map) throws Exception {
        BoundConfiguration self = new BoundConfiguration();
        return TeaModel.build(map, self);
    }

    public BoundConfiguration setBoundTools(java.util.List<BoundTool> boundTools) {
        this.boundTools = boundTools;
        return this;
    }
    public java.util.List<BoundTool> getBoundTools() {
        return this.boundTools;
    }

}
