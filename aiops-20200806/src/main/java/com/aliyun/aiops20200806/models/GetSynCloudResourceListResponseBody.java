// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetSynCloudResourceListResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("Status")
    public String status;

    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("PageTotal")
    public Integer pageTotal;

    public static GetSynCloudResourceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSynCloudResourceListResponseBody self = new GetSynCloudResourceListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSynCloudResourceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSynCloudResourceListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetSynCloudResourceListResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetSynCloudResourceListResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetSynCloudResourceListResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public GetSynCloudResourceListResponseBody setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
        return this;
    }
    public Integer getPageTotal() {
        return this.pageTotal;
    }

}
