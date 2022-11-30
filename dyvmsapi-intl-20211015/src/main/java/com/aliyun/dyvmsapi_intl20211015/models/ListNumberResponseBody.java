// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class ListNumberResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("List")
    public java.util.List<ListNumberResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static ListNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNumberResponseBody self = new ListNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNumberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListNumberResponseBody setList(java.util.List<ListNumberResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListNumberResponseBodyList> getList() {
        return this.list;
    }

    public ListNumberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNumberResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListNumberResponseBodyList extends TeaModel {
        @NameInMap("ApplyId")
        public String applyId;

        @NameInMap("CountryId")
        public String countryId;

        @NameInMap("DisableTs")
        public String disableTs;

        @NameInMap("InboundConcurrency")
        public Long inboundConcurrency;

        @NameInMap("Number")
        public String number;

        @NameInMap("NumberName")
        public String numberName;

        @NameInMap("OutboundConcurrency")
        public Long outboundConcurrency;

        @NameInMap("PhoneType")
        public Long phoneType;

        @NameInMap("QualificationId")
        public String qualificationId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("Status")
        public Long status;

        @NameInMap("SupplierId")
        public String supplierId;

        @NameInMap("Support")
        public Long support;

        @NameInMap("UpdateTs")
        public String updateTs;

        public static ListNumberResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListNumberResponseBodyList self = new ListNumberResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListNumberResponseBodyList setApplyId(String applyId) {
            this.applyId = applyId;
            return this;
        }
        public String getApplyId() {
            return this.applyId;
        }

        public ListNumberResponseBodyList setCountryId(String countryId) {
            this.countryId = countryId;
            return this;
        }
        public String getCountryId() {
            return this.countryId;
        }

        public ListNumberResponseBodyList setDisableTs(String disableTs) {
            this.disableTs = disableTs;
            return this;
        }
        public String getDisableTs() {
            return this.disableTs;
        }

        public ListNumberResponseBodyList setInboundConcurrency(Long inboundConcurrency) {
            this.inboundConcurrency = inboundConcurrency;
            return this;
        }
        public Long getInboundConcurrency() {
            return this.inboundConcurrency;
        }

        public ListNumberResponseBodyList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListNumberResponseBodyList setNumberName(String numberName) {
            this.numberName = numberName;
            return this;
        }
        public String getNumberName() {
            return this.numberName;
        }

        public ListNumberResponseBodyList setOutboundConcurrency(Long outboundConcurrency) {
            this.outboundConcurrency = outboundConcurrency;
            return this;
        }
        public Long getOutboundConcurrency() {
            return this.outboundConcurrency;
        }

        public ListNumberResponseBodyList setPhoneType(Long phoneType) {
            this.phoneType = phoneType;
            return this;
        }
        public Long getPhoneType() {
            return this.phoneType;
        }

        public ListNumberResponseBodyList setQualificationId(String qualificationId) {
            this.qualificationId = qualificationId;
            return this;
        }
        public String getQualificationId() {
            return this.qualificationId;
        }

        public ListNumberResponseBodyList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListNumberResponseBodyList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ListNumberResponseBodyList setSupplierId(String supplierId) {
            this.supplierId = supplierId;
            return this;
        }
        public String getSupplierId() {
            return this.supplierId;
        }

        public ListNumberResponseBodyList setSupport(Long support) {
            this.support = support;
            return this;
        }
        public Long getSupport() {
            return this.support;
        }

        public ListNumberResponseBodyList setUpdateTs(String updateTs) {
            this.updateTs = updateTs;
            return this;
        }
        public String getUpdateTs() {
            return this.updateTs;
        }

    }

}
