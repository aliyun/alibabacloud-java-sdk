// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAllBusinessGroupInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<DescribeAllBusinessGroupInfoResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static DescribeAllBusinessGroupInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllBusinessGroupInfoResponseBody self = new DescribeAllBusinessGroupInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAllBusinessGroupInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAllBusinessGroupInfoResponseBody setData(java.util.List<DescribeAllBusinessGroupInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAllBusinessGroupInfoResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAllBusinessGroupInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAllBusinessGroupInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAllBusinessGroupInfoResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribeAllBusinessGroupInfoResponseBodyData extends TeaModel {
        @NameInMap("BusinessGroupId")
        public String businessGroupId;

        @NameInMap("BusinessGroupName")
        public String businessGroupName;

        public static DescribeAllBusinessGroupInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllBusinessGroupInfoResponseBodyData self = new DescribeAllBusinessGroupInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAllBusinessGroupInfoResponseBodyData setBusinessGroupId(String businessGroupId) {
            this.businessGroupId = businessGroupId;
            return this;
        }
        public String getBusinessGroupId() {
            return this.businessGroupId;
        }

        public DescribeAllBusinessGroupInfoResponseBodyData setBusinessGroupName(String businessGroupName) {
            this.businessGroupName = businessGroupName;
            return this;
        }
        public String getBusinessGroupName() {
            return this.businessGroupName;
        }

    }

}
