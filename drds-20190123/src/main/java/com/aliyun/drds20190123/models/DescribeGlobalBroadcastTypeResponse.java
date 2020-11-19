// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeGlobalBroadcastTypeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeGlobalBroadcastTypeResponseData data;

    public static DescribeGlobalBroadcastTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalBroadcastTypeResponse self = new DescribeGlobalBroadcastTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalBroadcastTypeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGlobalBroadcastTypeResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeGlobalBroadcastTypeResponse setData(DescribeGlobalBroadcastTypeResponseData data) {
        this.data = data;
        return this;
    }
    public DescribeGlobalBroadcastTypeResponseData getData() {
        return this.data;
    }

    public static class DescribeGlobalBroadcastTypeResponseData extends TeaModel {
        @NameInMap("IsSyncType")
        @Validation(required = true)
        public Boolean isSyncType;

        public static DescribeGlobalBroadcastTypeResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalBroadcastTypeResponseData self = new DescribeGlobalBroadcastTypeResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalBroadcastTypeResponseData setIsSyncType(Boolean isSyncType) {
            this.isSyncType = isSyncType;
            return this;
        }
        public Boolean getIsSyncType() {
            return this.isSyncType;
        }

    }

}
