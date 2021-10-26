// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListHotlineTransferNumberResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListHotlineTransferNumberResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListHotlineTransferNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotlineTransferNumberResponseBody self = new ListHotlineTransferNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotlineTransferNumberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHotlineTransferNumberResponseBody setData(ListHotlineTransferNumberResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListHotlineTransferNumberResponseBodyData getData() {
        return this.data;
    }

    public ListHotlineTransferNumberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHotlineTransferNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListHotlineTransferNumberResponseBodyDataValues extends TeaModel {
        @NameInMap("HotlineNumber")
        public String hotlineNumber;

        @NameInMap("IdentityCard")
        public String identityCard;

        @NameInMap("NumberOwnerName")
        public String numberOwnerName;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("QualificationId")
        public String qualificationId;

        @NameInMap("ResUniqueCode")
        public String resUniqueCode;

        public static ListHotlineTransferNumberResponseBodyDataValues build(java.util.Map<String, ?> map) throws Exception {
            ListHotlineTransferNumberResponseBodyDataValues self = new ListHotlineTransferNumberResponseBodyDataValues();
            return TeaModel.build(map, self);
        }

        public ListHotlineTransferNumberResponseBodyDataValues setHotlineNumber(String hotlineNumber) {
            this.hotlineNumber = hotlineNumber;
            return this;
        }
        public String getHotlineNumber() {
            return this.hotlineNumber;
        }

        public ListHotlineTransferNumberResponseBodyDataValues setIdentityCard(String identityCard) {
            this.identityCard = identityCard;
            return this;
        }
        public String getIdentityCard() {
            return this.identityCard;
        }

        public ListHotlineTransferNumberResponseBodyDataValues setNumberOwnerName(String numberOwnerName) {
            this.numberOwnerName = numberOwnerName;
            return this;
        }
        public String getNumberOwnerName() {
            return this.numberOwnerName;
        }

        public ListHotlineTransferNumberResponseBodyDataValues setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public ListHotlineTransferNumberResponseBodyDataValues setQualificationId(String qualificationId) {
            this.qualificationId = qualificationId;
            return this;
        }
        public String getQualificationId() {
            return this.qualificationId;
        }

        public ListHotlineTransferNumberResponseBodyDataValues setResUniqueCode(String resUniqueCode) {
            this.resUniqueCode = resUniqueCode;
            return this;
        }
        public String getResUniqueCode() {
            return this.resUniqueCode;
        }

    }

    public static class ListHotlineTransferNumberResponseBodyData extends TeaModel {
        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Values")
        public java.util.List<ListHotlineTransferNumberResponseBodyDataValues> values;

        public static ListHotlineTransferNumberResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListHotlineTransferNumberResponseBodyData self = new ListHotlineTransferNumberResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListHotlineTransferNumberResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListHotlineTransferNumberResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHotlineTransferNumberResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListHotlineTransferNumberResponseBodyData setValues(java.util.List<ListHotlineTransferNumberResponseBodyDataValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<ListHotlineTransferNumberResponseBodyDataValues> getValues() {
            return this.values;
        }

    }

}
