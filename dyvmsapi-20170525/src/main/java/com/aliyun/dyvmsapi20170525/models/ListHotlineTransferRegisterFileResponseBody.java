// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListHotlineTransferRegisterFileResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListHotlineTransferRegisterFileResponseBodyData data;

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

    public ListHotlineTransferRegisterFileResponseBody setData(ListHotlineTransferRegisterFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListHotlineTransferRegisterFileResponseBodyData getData() {
        return this.data;
    }

    public static class ListHotlineTransferRegisterFileResponseBodyDataValues extends TeaModel {
        @NameInMap("MngOpMail")
        public String mngOpMail;

        @NameInMap("MngOpName")
        public String mngOpName;

        @NameInMap("CorpName")
        public String corpName;

        @NameInMap("Agree")
        public String agree;

        @NameInMap("MngOpMobile")
        public String mngOpMobile;

        @NameInMap("MngOpIdentityCard")
        public String mngOpIdentityCard;

        @NameInMap("HotlineNumber")
        public String hotlineNumber;

        @NameInMap("QualificationId")
        public String qualificationId;

        @NameInMap("ResUniqueCode")
        public Long resUniqueCode;

        public static ListHotlineTransferRegisterFileResponseBodyDataValues build(java.util.Map<String, ?> map) throws Exception {
            ListHotlineTransferRegisterFileResponseBodyDataValues self = new ListHotlineTransferRegisterFileResponseBodyDataValues();
            return TeaModel.build(map, self);
        }

        public ListHotlineTransferRegisterFileResponseBodyDataValues setMngOpMail(String mngOpMail) {
            this.mngOpMail = mngOpMail;
            return this;
        }
        public String getMngOpMail() {
            return this.mngOpMail;
        }

        public ListHotlineTransferRegisterFileResponseBodyDataValues setMngOpName(String mngOpName) {
            this.mngOpName = mngOpName;
            return this;
        }
        public String getMngOpName() {
            return this.mngOpName;
        }

        public ListHotlineTransferRegisterFileResponseBodyDataValues setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public ListHotlineTransferRegisterFileResponseBodyDataValues setAgree(String agree) {
            this.agree = agree;
            return this;
        }
        public String getAgree() {
            return this.agree;
        }

        public ListHotlineTransferRegisterFileResponseBodyDataValues setMngOpMobile(String mngOpMobile) {
            this.mngOpMobile = mngOpMobile;
            return this;
        }
        public String getMngOpMobile() {
            return this.mngOpMobile;
        }

        public ListHotlineTransferRegisterFileResponseBodyDataValues setMngOpIdentityCard(String mngOpIdentityCard) {
            this.mngOpIdentityCard = mngOpIdentityCard;
            return this;
        }
        public String getMngOpIdentityCard() {
            return this.mngOpIdentityCard;
        }

        public ListHotlineTransferRegisterFileResponseBodyDataValues setHotlineNumber(String hotlineNumber) {
            this.hotlineNumber = hotlineNumber;
            return this;
        }
        public String getHotlineNumber() {
            return this.hotlineNumber;
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
        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Long total;

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
