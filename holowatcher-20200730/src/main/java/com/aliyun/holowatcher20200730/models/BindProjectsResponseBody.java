// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BindProjectsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.Map<String, String> data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BindProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindProjectsResponseBody self = new BindProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public BindProjectsResponseBody setData(java.util.Map<String, String> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, String> getData() {
        return this.data;
    }

    public BindProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindProjectsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
