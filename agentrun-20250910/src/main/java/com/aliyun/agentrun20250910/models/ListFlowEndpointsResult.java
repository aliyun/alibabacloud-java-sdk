// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListFlowEndpointsResult extends TeaModel {
    /**
     * <p>SUCCESS 为成功，失败情况返回对应错误类型</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>工作流端点列表的详细信息</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public ListFlowEndpointsOutput data;

    /**
     * <p>唯一的请求标识符，用于问题追踪</p>
     * 
     * <strong>example:</strong>
     * <p>F8A0F5F3-0C3E-4C82-9D4F-5E4B6A7C8D9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListFlowEndpointsResult build(java.util.Map<String, ?> map) throws Exception {
        ListFlowEndpointsResult self = new ListFlowEndpointsResult();
        return TeaModel.build(map, self);
    }

    public ListFlowEndpointsResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFlowEndpointsResult setData(ListFlowEndpointsOutput data) {
        this.data = data;
        return this;
    }
    public ListFlowEndpointsOutput getData() {
        return this.data;
    }

    public ListFlowEndpointsResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
