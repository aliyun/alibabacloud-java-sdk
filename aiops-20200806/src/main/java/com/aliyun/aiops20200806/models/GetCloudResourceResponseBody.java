// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetCloudResourceResponseBody extends TeaModel {
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

    public static GetCloudResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCloudResourceResponseBody self = new GetCloudResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCloudResourceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetCloudResourceResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public GetCloudResourceResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetCloudResourceResponseBody setPageTotal(Long pageTotal) {
        this.pageTotal = pageTotal;
        return this;
    }
    public Long getPageTotal() {
        return this.pageTotal;
    }

    public GetCloudResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCloudResourceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
