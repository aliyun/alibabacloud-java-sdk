// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DescribeNodeStatusResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StatusList")
    public DescribeNodeStatusResponseBodyStatusList statusList;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeNodeStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeStatusResponseBody self = new DescribeNodeStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNodeStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeNodeStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNodeStatusResponseBody setStatusList(DescribeNodeStatusResponseBodyStatusList statusList) {
        this.statusList = statusList;
        return this;
    }
    public DescribeNodeStatusResponseBodyStatusList getStatusList() {
        return this.statusList;
    }

    public DescribeNodeStatusResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeNodeStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeNodeStatusResponseBodyStatusList extends TeaModel {
        @NameInMap("Status")
        public java.util.List<String> status;

        public static DescribeNodeStatusResponseBodyStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeNodeStatusResponseBodyStatusList self = new DescribeNodeStatusResponseBodyStatusList();
            return TeaModel.build(map, self);
        }

        public DescribeNodeStatusResponseBodyStatusList setStatus(java.util.List<String> status) {
            this.status = status;
            return this;
        }
        public java.util.List<String> getStatus() {
            return this.status;
        }

    }

}
