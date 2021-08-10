// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetUserPatentStatisticsStatusResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetUserPatentStatisticsStatusResponseBodyData> data;

    public static GetUserPatentStatisticsStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserPatentStatisticsStatusResponseBody self = new GetUserPatentStatisticsStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserPatentStatisticsStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetUserPatentStatisticsStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserPatentStatisticsStatusResponseBody setData(java.util.List<GetUserPatentStatisticsStatusResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetUserPatentStatisticsStatusResponseBodyData> getData() {
        return this.data;
    }

    public static class GetUserPatentStatisticsStatusResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        public static GetUserPatentStatisticsStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUserPatentStatisticsStatusResponseBodyData self = new GetUserPatentStatisticsStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUserPatentStatisticsStatusResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
