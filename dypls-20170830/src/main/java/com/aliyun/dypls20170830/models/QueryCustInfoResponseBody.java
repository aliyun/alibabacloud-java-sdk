// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryCustInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public QueryCustInfoResponseBodyData data;

    public static QueryCustInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCustInfoResponseBody self = new QueryCustInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCustInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCustInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCustInfoResponseBody setData(QueryCustInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCustInfoResponseBodyData getData() {
        return this.data;
    }

    public static class QueryCustInfoResponseBodyData extends TeaModel {
        @NameInMap("CertifyType")
        public Integer certifyType;

        @NameInMap("ContactPhone")
        public String contactPhone;

        @NameInMap("CustId")
        public Long custId;

        @NameInMap("CustName")
        public String custName;

        @NameInMap("IsDayuCustomer")
        public Boolean isDayuCustomer;

        @NameInMap("OsStatus")
        public Integer osStatus;

        @NameInMap("PartnerId")
        public Long partnerId;

        @NameInMap("UserTag")
        public Long userTag;

        @NameInMap("UserTag2")
        public Long userTag2;

        public static QueryCustInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCustInfoResponseBodyData self = new QueryCustInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCustInfoResponseBodyData setCertifyType(Integer certifyType) {
            this.certifyType = certifyType;
            return this;
        }
        public Integer getCertifyType() {
            return this.certifyType;
        }

        public QueryCustInfoResponseBodyData setContactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            return this;
        }
        public String getContactPhone() {
            return this.contactPhone;
        }

        public QueryCustInfoResponseBodyData setCustId(Long custId) {
            this.custId = custId;
            return this;
        }
        public Long getCustId() {
            return this.custId;
        }

        public QueryCustInfoResponseBodyData setCustName(String custName) {
            this.custName = custName;
            return this;
        }
        public String getCustName() {
            return this.custName;
        }

        public QueryCustInfoResponseBodyData setIsDayuCustomer(Boolean isDayuCustomer) {
            this.isDayuCustomer = isDayuCustomer;
            return this;
        }
        public Boolean getIsDayuCustomer() {
            return this.isDayuCustomer;
        }

        public QueryCustInfoResponseBodyData setOsStatus(Integer osStatus) {
            this.osStatus = osStatus;
            return this;
        }
        public Integer getOsStatus() {
            return this.osStatus;
        }

        public QueryCustInfoResponseBodyData setPartnerId(Long partnerId) {
            this.partnerId = partnerId;
            return this;
        }
        public Long getPartnerId() {
            return this.partnerId;
        }

        public QueryCustInfoResponseBodyData setUserTag(Long userTag) {
            this.userTag = userTag;
            return this;
        }
        public Long getUserTag() {
            return this.userTag;
        }

        public QueryCustInfoResponseBodyData setUserTag2(Long userTag2) {
            this.userTag2 = userTag2;
            return this;
        }
        public Long getUserTag2() {
            return this.userTag2;
        }

    }

}
