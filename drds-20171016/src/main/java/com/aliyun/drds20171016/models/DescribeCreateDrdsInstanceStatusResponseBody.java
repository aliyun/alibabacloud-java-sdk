// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeCreateDrdsInstanceStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeCreateDrdsInstanceStatusResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeCreateDrdsInstanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCreateDrdsInstanceStatusResponseBody self = new DescribeCreateDrdsInstanceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCreateDrdsInstanceStatusResponseBody setData(DescribeCreateDrdsInstanceStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCreateDrdsInstanceStatusResponseBodyData getData() {
        return this.data;
    }

    public DescribeCreateDrdsInstanceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCreateDrdsInstanceStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCreateDrdsInstanceStatusResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        public static DescribeCreateDrdsInstanceStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCreateDrdsInstanceStatusResponseBodyData self = new DescribeCreateDrdsInstanceStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCreateDrdsInstanceStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
