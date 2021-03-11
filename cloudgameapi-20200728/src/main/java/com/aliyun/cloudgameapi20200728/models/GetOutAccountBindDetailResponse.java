// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetOutAccountBindDetailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetOutAccountBindDetailResponseData data;

    public static GetOutAccountBindDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOutAccountBindDetailResponse self = new GetOutAccountBindDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetOutAccountBindDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOutAccountBindDetailResponse setData(GetOutAccountBindDetailResponseData data) {
        this.data = data;
        return this;
    }
    public GetOutAccountBindDetailResponseData getData() {
        return this.data;
    }

    public static class GetOutAccountBindDetailResponseData extends TeaModel {
        @NameInMap("BindStatus")
        @Validation(required = true)
        public Integer bindStatus;

        @NameInMap("OutAccountType")
        @Validation(required = true)
        public String outAccountType;

        @NameInMap("OutAccountId")
        @Validation(required = true)
        public String outAccountId;

        @NameInMap("Token")
        @Validation(required = true)
        public String token;

        @NameInMap("TokenExpireTime")
        @Validation(required = true)
        public Long tokenExpireTime;

        public static GetOutAccountBindDetailResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetOutAccountBindDetailResponseData self = new GetOutAccountBindDetailResponseData();
            return TeaModel.build(map, self);
        }

        public GetOutAccountBindDetailResponseData setBindStatus(Integer bindStatus) {
            this.bindStatus = bindStatus;
            return this;
        }
        public Integer getBindStatus() {
            return this.bindStatus;
        }

        public GetOutAccountBindDetailResponseData setOutAccountType(String outAccountType) {
            this.outAccountType = outAccountType;
            return this;
        }
        public String getOutAccountType() {
            return this.outAccountType;
        }

        public GetOutAccountBindDetailResponseData setOutAccountId(String outAccountId) {
            this.outAccountId = outAccountId;
            return this;
        }
        public String getOutAccountId() {
            return this.outAccountId;
        }

        public GetOutAccountBindDetailResponseData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public GetOutAccountBindDetailResponseData setTokenExpireTime(Long tokenExpireTime) {
            this.tokenExpireTime = tokenExpireTime;
            return this;
        }
        public Long getTokenExpireTime() {
            return this.tokenExpireTime;
        }

    }

}
