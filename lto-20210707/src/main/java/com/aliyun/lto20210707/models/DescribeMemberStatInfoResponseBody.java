// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeMemberStatInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<DescribeMemberStatInfoResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeMemberStatInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMemberStatInfoResponseBody self = new DescribeMemberStatInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMemberStatInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeMemberStatInfoResponseBody setData(java.util.List<DescribeMemberStatInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMemberStatInfoResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMemberStatInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeMemberStatInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMemberStatInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMemberStatInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeMemberStatInfoResponseBodyData extends TeaModel {
        @NameInMap("AuthorizedCount")
        public Long authorizedCount;

        @NameInMap("BizChainCount")
        public Integer bizChainCount;

        @NameInMap("MemberId")
        public String memberId;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("UsedCount")
        public Long usedCount;

        public static DescribeMemberStatInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMemberStatInfoResponseBodyData self = new DescribeMemberStatInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMemberStatInfoResponseBodyData setAuthorizedCount(Long authorizedCount) {
            this.authorizedCount = authorizedCount;
            return this;
        }
        public Long getAuthorizedCount() {
            return this.authorizedCount;
        }

        public DescribeMemberStatInfoResponseBodyData setBizChainCount(Integer bizChainCount) {
            this.bizChainCount = bizChainCount;
            return this;
        }
        public Integer getBizChainCount() {
            return this.bizChainCount;
        }

        public DescribeMemberStatInfoResponseBodyData setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public DescribeMemberStatInfoResponseBodyData setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public DescribeMemberStatInfoResponseBodyData setUsedCount(Long usedCount) {
            this.usedCount = usedCount;
            return this;
        }
        public Long getUsedCount() {
            return this.usedCount;
        }

    }

}
