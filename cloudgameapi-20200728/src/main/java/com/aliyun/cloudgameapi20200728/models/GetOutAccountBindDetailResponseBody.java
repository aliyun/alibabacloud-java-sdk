// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetOutAccountBindDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetOutAccountBindDetailResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetOutAccountBindDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOutAccountBindDetailResponseBody self = new GetOutAccountBindDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOutAccountBindDetailResponseBody setData(GetOutAccountBindDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOutAccountBindDetailResponseBodyData getData() {
        return this.data;
    }

    public GetOutAccountBindDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetOutAccountBindDetailResponseBodyData extends TeaModel {
        @NameInMap("BindStatus")
        public Integer bindStatus;

        @NameInMap("OutAccountId")
        public String outAccountId;

        @NameInMap("OutAccountType")
        public String outAccountType;

        @NameInMap("Token")
        public String token;

        @NameInMap("TokenExpireTime")
        public Long tokenExpireTime;

        public static GetOutAccountBindDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOutAccountBindDetailResponseBodyData self = new GetOutAccountBindDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOutAccountBindDetailResponseBodyData setBindStatus(Integer bindStatus) {
            this.bindStatus = bindStatus;
            return this;
        }
        public Integer getBindStatus() {
            return this.bindStatus;
        }

        public GetOutAccountBindDetailResponseBodyData setOutAccountId(String outAccountId) {
            this.outAccountId = outAccountId;
            return this;
        }
        public String getOutAccountId() {
            return this.outAccountId;
        }

        public GetOutAccountBindDetailResponseBodyData setOutAccountType(String outAccountType) {
            this.outAccountType = outAccountType;
            return this;
        }
        public String getOutAccountType() {
            return this.outAccountType;
        }

        public GetOutAccountBindDetailResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public GetOutAccountBindDetailResponseBodyData setTokenExpireTime(Long tokenExpireTime) {
            this.tokenExpireTime = tokenExpireTime;
            return this;
        }
        public Long getTokenExpireTime() {
            return this.tokenExpireTime;
        }

    }

}
