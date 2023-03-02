// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class DescribeResourceInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeResourceInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeResourceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceInfoResponseBody self = new DescribeResourceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeResourceInfoResponseBody setData(DescribeResourceInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeResourceInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeResourceInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeResourceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeResourceInfoResponseBodyData extends TeaModel {
        @NameInMap("AuthorizeType")
        public String authorizeType;

        @NameInMap("EffectiveTime")
        public Long effectiveTime;

        @NameInMap("ExpiredTime")
        public Long expiredTime;

        @NameInMap("Region")
        public String region;

        @NameInMap("Status")
        public String status;

        public static DescribeResourceInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceInfoResponseBodyData self = new DescribeResourceInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeResourceInfoResponseBodyData setAuthorizeType(String authorizeType) {
            this.authorizeType = authorizeType;
            return this;
        }
        public String getAuthorizeType() {
            return this.authorizeType;
        }

        public DescribeResourceInfoResponseBodyData setEffectiveTime(Long effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public Long getEffectiveTime() {
            return this.effectiveTime;
        }

        public DescribeResourceInfoResponseBodyData setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeResourceInfoResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeResourceInfoResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
