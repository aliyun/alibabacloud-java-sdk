// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeMemberTotalStatInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeMemberTotalStatInfoResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeMemberTotalStatInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMemberTotalStatInfoResponseBody self = new DescribeMemberTotalStatInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMemberTotalStatInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeMemberTotalStatInfoResponseBody setData(DescribeMemberTotalStatInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeMemberTotalStatInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeMemberTotalStatInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeMemberTotalStatInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMemberTotalStatInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMemberTotalStatInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeMemberTotalStatInfoResponseBodyData extends TeaModel {
        @NameInMap("AuthorizedCount")
        public Long authorizedCount;

        @NameInMap("UsedCount")
        public Long usedCount;

        public static DescribeMemberTotalStatInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMemberTotalStatInfoResponseBodyData self = new DescribeMemberTotalStatInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMemberTotalStatInfoResponseBodyData setAuthorizedCount(Long authorizedCount) {
            this.authorizedCount = authorizedCount;
            return this;
        }
        public Long getAuthorizedCount() {
            return this.authorizedCount;
        }

        public DescribeMemberTotalStatInfoResponseBodyData setUsedCount(Long usedCount) {
            this.usedCount = usedCount;
            return this;
        }
        public Long getUsedCount() {
            return this.usedCount;
        }

    }

}
