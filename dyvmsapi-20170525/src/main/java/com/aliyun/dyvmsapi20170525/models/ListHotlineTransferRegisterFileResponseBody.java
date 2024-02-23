// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListHotlineTransferRegisterFileResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <br>
     * <p>*   The value OK indicates that the request was successful.</p>
     * <p>*   For more information about other response codes, see [API error codes](~~112502~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public ListHotlineTransferRegisterFileResponseBodyData data;

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

    public static ListHotlineTransferRegisterFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotlineTransferRegisterFileResponseBody self = new ListHotlineTransferRegisterFileResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotlineTransferRegisterFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHotlineTransferRegisterFileResponseBody setData(ListHotlineTransferRegisterFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListHotlineTransferRegisterFileResponseBodyData getData() {
        return this.data;
    }

    public ListHotlineTransferRegisterFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHotlineTransferRegisterFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListHotlineTransferRegisterFileResponseBodyDataValues extends TeaModel {
        /**
         * <p>The authenticity of the commitment.</p>
         */
        @NameInMap("Agree")
        public String agree;

        /**
         * <p>The enterprise name.</p>
         */
        @NameInMap("CorpName")
        public String corpName;

        /**
         * <p>The China 400 number.</p>
         */
        @NameInMap("HotlineNumber")
        public String hotlineNumber;

        /**
         * <p>The ID card number of the handler.</p>
         */
        @NameInMap("MngOpIdentityCard")
        public String mngOpIdentityCard;

        /**
         * <p>The email address of the handler.</p>
         */
        @NameInMap("MngOpMail")
        public String mngOpMail;

        /**
         * <p>The mobile phone number of the handler.</p>
         */
        @NameInMap("MngOpMobile")
        public String mngOpMobile;

        /**
         * <p>The name of the handler.</p>
         */
        @NameInMap("MngOpName")
        public String mngOpName;

        /**
         * <p>The qualification ID.</p>
         */
        @NameInMap("QualificationId")
        public String qualificationId;

        /**
         * <p>The unique code of the query operation.</p>
         */
        @NameInMap("ResUniqueCode")
        public Long resUniqueCode;

        public static ListHotlineTransferRegisterFileResponseBodyDataValues build(java.util.Map<String, ?> map) throws Exception {
            ListHotlineTransferRegisterFileResponseBodyDataValues self = new ListHotlineTransferRegisterFileResponseBodyDataValues();
            return TeaModel.build(map, self);
        }

        public ListHotlineTransferRegisterFileResponseBodyDataValues setAgree(String agree) {
            this.agree = agree;
            return this;
        }
        public String getAgree() {
            return this.agree;
        }

        public ListHotlineTransferRegisterFileResponseBodyDataValues setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public ListHotlineTransferRegisterFileResponseBodyDataValues setHotlineNumber(String hotlineNumber) {
            this.hotlineNumber = hotlineNumber;
            return this;
        }
        public String getHotlineNumber() {
            return this.hotlineNumber;
        }

        public ListHotlineTransferRegisterFileResponseBodyDataValues setMngOpIdentityCard(String mngOpIdentityCard) {
            this.mngOpIdentityCard = mngOpIdentityCard;
            return this;
        }
        public String getMngOpIdentityCard() {
            return this.mngOpIdentityCard;
        }

        public ListHotlineTransferRegisterFileResponseBodyDataValues setMngOpMail(String mngOpMail) {
            this.mngOpMail = mngOpMail;
            return this;
        }
        public String getMngOpMail() {
            return this.mngOpMail;
        }

        public ListHotlineTransferRegisterFileResponseBodyDataValues setMngOpMobile(String mngOpMobile) {
            this.mngOpMobile = mngOpMobile;
            return this;
        }
        public String getMngOpMobile() {
            return this.mngOpMobile;
        }

        public ListHotlineTransferRegisterFileResponseBodyDataValues setMngOpName(String mngOpName) {
            this.mngOpName = mngOpName;
            return this;
        }
        public String getMngOpName() {
            return this.mngOpName;
        }

        public ListHotlineTransferRegisterFileResponseBodyDataValues setQualificationId(String qualificationId) {
            this.qualificationId = qualificationId;
            return this;
        }
        public String getQualificationId() {
            return this.qualificationId;
        }

        public ListHotlineTransferRegisterFileResponseBodyDataValues setResUniqueCode(Long resUniqueCode) {
            this.resUniqueCode = resUniqueCode;
            return this;
        }
        public Long getResUniqueCode() {
            return this.resUniqueCode;
        }

    }

    public static class ListHotlineTransferRegisterFileResponseBodyData extends TeaModel {
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
         * <p>The registration file.</p>
         */
        @NameInMap("Values")
        public java.util.List<ListHotlineTransferRegisterFileResponseBodyDataValues> values;

        public static ListHotlineTransferRegisterFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListHotlineTransferRegisterFileResponseBodyData self = new ListHotlineTransferRegisterFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListHotlineTransferRegisterFileResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListHotlineTransferRegisterFileResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHotlineTransferRegisterFileResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListHotlineTransferRegisterFileResponseBodyData setValues(java.util.List<ListHotlineTransferRegisterFileResponseBodyDataValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<ListHotlineTransferRegisterFileResponseBodyDataValues> getValues() {
            return this.values;
        }

    }

}
