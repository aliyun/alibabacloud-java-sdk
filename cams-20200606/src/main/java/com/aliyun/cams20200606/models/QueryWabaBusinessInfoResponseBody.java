// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class QueryWabaBusinessInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryWabaBusinessInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryWabaBusinessInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryWabaBusinessInfoResponseBody self = new QueryWabaBusinessInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryWabaBusinessInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryWabaBusinessInfoResponseBody setData(QueryWabaBusinessInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryWabaBusinessInfoResponseBodyData getData() {
        return this.data;
    }

    public QueryWabaBusinessInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryWabaBusinessInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryWabaBusinessInfoResponseBodyData extends TeaModel {
        @NameInMap("BusinessId")
        public String businessId;

        @NameInMap("BusinessName")
        public String businessName;

        @NameInMap("VerificationStatus")
        public String verificationStatus;

        @NameInMap("Vertical")
        public String vertical;

        public static QueryWabaBusinessInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryWabaBusinessInfoResponseBodyData self = new QueryWabaBusinessInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryWabaBusinessInfoResponseBodyData setBusinessId(String businessId) {
            this.businessId = businessId;
            return this;
        }
        public String getBusinessId() {
            return this.businessId;
        }

        public QueryWabaBusinessInfoResponseBodyData setBusinessName(String businessName) {
            this.businessName = businessName;
            return this;
        }
        public String getBusinessName() {
            return this.businessName;
        }

        public QueryWabaBusinessInfoResponseBodyData setVerificationStatus(String verificationStatus) {
            this.verificationStatus = verificationStatus;
            return this;
        }
        public String getVerificationStatus() {
            return this.verificationStatus;
        }

        public QueryWabaBusinessInfoResponseBodyData setVertical(String vertical) {
            this.vertical = vertical;
            return this;
        }
        public String getVertical() {
            return this.vertical;
        }

    }

}
