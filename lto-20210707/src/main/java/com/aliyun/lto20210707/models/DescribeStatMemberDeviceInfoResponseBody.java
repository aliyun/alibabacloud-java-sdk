// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeStatMemberDeviceInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<DescribeStatMemberDeviceInfoResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeStatMemberDeviceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStatMemberDeviceInfoResponseBody self = new DescribeStatMemberDeviceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStatMemberDeviceInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeStatMemberDeviceInfoResponseBody setData(java.util.List<DescribeStatMemberDeviceInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeStatMemberDeviceInfoResponseBodyData> getData() {
        return this.data;
    }

    public DescribeStatMemberDeviceInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeStatMemberDeviceInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeStatMemberDeviceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStatMemberDeviceInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeStatMemberDeviceInfoResponseBodyData extends TeaModel {
        @NameInMap("AuthorizedCount")
        public String authorizedCount;

        @NameInMap("BizChainCount")
        public String bizChainCount;

        @NameInMap("MemberId")
        public String memberId;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("UsedCount")
        public String usedCount;

        public static DescribeStatMemberDeviceInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeStatMemberDeviceInfoResponseBodyData self = new DescribeStatMemberDeviceInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeStatMemberDeviceInfoResponseBodyData setAuthorizedCount(String authorizedCount) {
            this.authorizedCount = authorizedCount;
            return this;
        }
        public String getAuthorizedCount() {
            return this.authorizedCount;
        }

        public DescribeStatMemberDeviceInfoResponseBodyData setBizChainCount(String bizChainCount) {
            this.bizChainCount = bizChainCount;
            return this;
        }
        public String getBizChainCount() {
            return this.bizChainCount;
        }

        public DescribeStatMemberDeviceInfoResponseBodyData setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public DescribeStatMemberDeviceInfoResponseBodyData setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public DescribeStatMemberDeviceInfoResponseBodyData setUsedCount(String usedCount) {
            this.usedCount = usedCount;
            return this;
        }
        public String getUsedCount() {
            return this.usedCount;
        }

    }

}
