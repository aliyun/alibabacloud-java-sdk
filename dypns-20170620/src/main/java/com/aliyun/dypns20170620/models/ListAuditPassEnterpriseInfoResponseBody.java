// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class ListAuditPassEnterpriseInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAuditPassEnterpriseInfoResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAuditPassEnterpriseInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuditPassEnterpriseInfoResponseBody self = new ListAuditPassEnterpriseInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuditPassEnterpriseInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAuditPassEnterpriseInfoResponseBody setData(java.util.List<ListAuditPassEnterpriseInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAuditPassEnterpriseInfoResponseBodyData> getData() {
        return this.data;
    }

    public ListAuditPassEnterpriseInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAuditPassEnterpriseInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAuditPassEnterpriseInfoResponseBodyData extends TeaModel {
        @NameInMap("EnterpriseId")
        public Long enterpriseId;

        @NameInMap("EnterpriseName")
        public String enterpriseName;

        public static ListAuditPassEnterpriseInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAuditPassEnterpriseInfoResponseBodyData self = new ListAuditPassEnterpriseInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAuditPassEnterpriseInfoResponseBodyData setEnterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        public ListAuditPassEnterpriseInfoResponseBodyData setEnterpriseName(String enterpriseName) {
            this.enterpriseName = enterpriseName;
            return this;
        }
        public String getEnterpriseName() {
            return this.enterpriseName;
        }

    }

}
