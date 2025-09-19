// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DescribeDifyEditionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeDifyEditionsResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDifyEditionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDifyEditionsResponseBody self = new DescribeDifyEditionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDifyEditionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDifyEditionsResponseBody setData(DescribeDifyEditionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDifyEditionsResponseBodyData getData() {
        return this.data;
    }

    public DescribeDifyEditionsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeDifyEditionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDifyEditionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDifyEditionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDifyEditionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDifyEditionsResponseBodyData extends TeaModel {
        @NameInMap("Community")
        public java.util.List<String> community;

        @NameInMap("Enterprise")
        public java.util.List<String> enterprise;

        @NameInMap("OpenCommunity")
        public java.util.List<String> openCommunity;

        public static DescribeDifyEditionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDifyEditionsResponseBodyData self = new DescribeDifyEditionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDifyEditionsResponseBodyData setCommunity(java.util.List<String> community) {
            this.community = community;
            return this;
        }
        public java.util.List<String> getCommunity() {
            return this.community;
        }

        public DescribeDifyEditionsResponseBodyData setEnterprise(java.util.List<String> enterprise) {
            this.enterprise = enterprise;
            return this;
        }
        public java.util.List<String> getEnterprise() {
            return this.enterprise;
        }

        public DescribeDifyEditionsResponseBodyData setOpenCommunity(java.util.List<String> openCommunity) {
            this.openCommunity = openCommunity;
            return this;
        }
        public java.util.List<String> getOpenCommunity() {
            return this.openCommunity;
        }

    }

}
