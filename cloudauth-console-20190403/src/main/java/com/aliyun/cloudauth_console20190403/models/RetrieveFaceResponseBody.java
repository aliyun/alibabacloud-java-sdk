// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190403.models;

import com.aliyun.tea.*;

public class RetrieveFaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public RetrieveFaceResponseBodyData data;

    @NameInMap("Success")
    public Boolean success;

    public static RetrieveFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetrieveFaceResponseBody self = new RetrieveFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public RetrieveFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RetrieveFaceResponseBody setData(RetrieveFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RetrieveFaceResponseBodyData getData() {
        return this.data;
    }

    public RetrieveFaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RetrieveFaceResponseBodyDataData extends TeaModel {
        @NameInMap("UserId")
        public Long userId;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("Rate")
        public String rate;

        public static RetrieveFaceResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            RetrieveFaceResponseBodyDataData self = new RetrieveFaceResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public RetrieveFaceResponseBodyDataData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public RetrieveFaceResponseBodyDataData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public RetrieveFaceResponseBodyDataData setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

    }

    public static class RetrieveFaceResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<RetrieveFaceResponseBodyDataData> data;

        public static RetrieveFaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RetrieveFaceResponseBodyData self = new RetrieveFaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RetrieveFaceResponseBodyData setData(java.util.List<RetrieveFaceResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<RetrieveFaceResponseBodyDataData> getData() {
            return this.data;
        }

    }

}
