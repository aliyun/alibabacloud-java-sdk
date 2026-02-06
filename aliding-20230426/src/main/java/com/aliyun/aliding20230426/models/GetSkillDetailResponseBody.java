// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetSkillDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public Object data;

    /**
     * <p>RequestId</p>
     * 
     * <strong>example:</strong>
     * <p>A348BA5D-FFD4-57E4-9450-23A14D72F331</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSkillDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillDetailResponseBody self = new GetSkillDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillDetailResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public GetSkillDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
