// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListHotlineTransferNumberResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <br>
     * <p>*   The value OK indicates that the request was successful.</p>
     * <p>*   For more information about other response codes, see [API error codes](~~112502~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the registered phone number.</p>
     */
    @NameInMap("Data")
    public ListHotlineTransferNumberResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The China 400 number.</p>
         */
        @NameInMap("HotlineNumber")
        public String hotlineNumber;

        /**
         * <p>The ID card number of the number owner.</p>
         */
        @NameInMap("IdentityCard")
        public String identityCard;

        /**
         * <p>The real name of the number owner or the company name.</p>
         */
        @NameInMap("NumberOwnerName")
        public String numberOwnerName;

        /**
         * <p>The registered phone number.</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>The qualification ID.</p>
         */
        @NameInMap("QualificationId")
        public String qualificationId;

        /**
         * <p>The resource code.</p>
         */
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
        /**
         * <p>The page number.</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("Total")
        public Long total;

        /**
         * <p>The phone numbers.</p>
         */
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
