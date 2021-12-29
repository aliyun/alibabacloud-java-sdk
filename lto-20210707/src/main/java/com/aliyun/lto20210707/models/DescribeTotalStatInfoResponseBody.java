// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeTotalStatInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeTotalStatInfoResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeTotalStatInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTotalStatInfoResponseBody self = new DescribeTotalStatInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTotalStatInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeTotalStatInfoResponseBody setData(DescribeTotalStatInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeTotalStatInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeTotalStatInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeTotalStatInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeTotalStatInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTotalStatInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeTotalStatInfoResponseBodyData extends TeaModel {
        @NameInMap("AuthorizedCount")
        public Long authorizedCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("UsedCount")
        public Long usedCount;

        public static DescribeTotalStatInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeTotalStatInfoResponseBodyData self = new DescribeTotalStatInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeTotalStatInfoResponseBodyData setAuthorizedCount(Long authorizedCount) {
            this.authorizedCount = authorizedCount;
            return this;
        }
        public Long getAuthorizedCount() {
            return this.authorizedCount;
        }

        public DescribeTotalStatInfoResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeTotalStatInfoResponseBodyData setUsedCount(Long usedCount) {
            this.usedCount = usedCount;
            return this;
        }
        public Long getUsedCount() {
            return this.usedCount;
        }

    }

}
