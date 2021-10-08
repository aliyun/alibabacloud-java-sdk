// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessGroupOverviewListResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Status")
    public Boolean status;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("PageTotal")
    public Integer pageTotal;

    public static GetBusinessGroupOverviewListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessGroupOverviewListResponseBody self = new GetBusinessGroupOverviewListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBusinessGroupOverviewListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBusinessGroupOverviewListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetBusinessGroupOverviewListResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public GetBusinessGroupOverviewListResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetBusinessGroupOverviewListResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public GetBusinessGroupOverviewListResponseBody setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
        return this;
    }
    public Integer getPageTotal() {
        return this.pageTotal;
    }

}
