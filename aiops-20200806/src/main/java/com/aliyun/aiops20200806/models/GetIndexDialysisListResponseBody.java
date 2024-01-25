// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetIndexDialysisListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("PageTotal")
    public Long pageTotal;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static GetIndexDialysisListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIndexDialysisListResponseBody self = new GetIndexDialysisListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIndexDialysisListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetIndexDialysisListResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public GetIndexDialysisListResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetIndexDialysisListResponseBody setPageTotal(Long pageTotal) {
        this.pageTotal = pageTotal;
        return this;
    }
    public Long getPageTotal() {
        return this.pageTotal;
    }

    public GetIndexDialysisListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIndexDialysisListResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
