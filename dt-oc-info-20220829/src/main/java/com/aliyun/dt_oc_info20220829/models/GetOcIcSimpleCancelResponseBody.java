// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcSimpleCancelResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcIcSimpleCancelResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalNum")
    public Integer totalNum;

    public static GetOcIcSimpleCancelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcSimpleCancelResponseBody self = new GetOcIcSimpleCancelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcIcSimpleCancelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcIcSimpleCancelResponseBody setData(java.util.List<GetOcIcSimpleCancelResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcIcSimpleCancelResponseBodyData> getData() {
        return this.data;
    }

    public GetOcIcSimpleCancelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcIcSimpleCancelResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcIcSimpleCancelResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcIcSimpleCancelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcIcSimpleCancelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcIcSimpleCancelResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcIcSimpleCancelResponseBodyData extends TeaModel {
        @NameInMap("Department")
        public String department;

        @NameInMap("EntName")
        public String entName;

        @NameInMap("NoticePeriod")
        public String noticePeriod;

        @NameInMap("ScaContent")
        public String scaContent;

        @NameInMap("ScaDate")
        public String scaDate;

        @NameInMap("ScaProposer")
        public String scaProposer;

        @NameInMap("ScaResult")
        public String scaResult;

        @NameInMap("ScaResultDate")
        public String scaResultDate;

        @NameInMap("SocialCreditCode")
        public String socialCreditCode;

        public static GetOcIcSimpleCancelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcIcSimpleCancelResponseBodyData self = new GetOcIcSimpleCancelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcIcSimpleCancelResponseBodyData setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public GetOcIcSimpleCancelResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcIcSimpleCancelResponseBodyData setNoticePeriod(String noticePeriod) {
            this.noticePeriod = noticePeriod;
            return this;
        }
        public String getNoticePeriod() {
            return this.noticePeriod;
        }

        public GetOcIcSimpleCancelResponseBodyData setScaContent(String scaContent) {
            this.scaContent = scaContent;
            return this;
        }
        public String getScaContent() {
            return this.scaContent;
        }

        public GetOcIcSimpleCancelResponseBodyData setScaDate(String scaDate) {
            this.scaDate = scaDate;
            return this;
        }
        public String getScaDate() {
            return this.scaDate;
        }

        public GetOcIcSimpleCancelResponseBodyData setScaProposer(String scaProposer) {
            this.scaProposer = scaProposer;
            return this;
        }
        public String getScaProposer() {
            return this.scaProposer;
        }

        public GetOcIcSimpleCancelResponseBodyData setScaResult(String scaResult) {
            this.scaResult = scaResult;
            return this;
        }
        public String getScaResult() {
            return this.scaResult;
        }

        public GetOcIcSimpleCancelResponseBodyData setScaResultDate(String scaResultDate) {
            this.scaResultDate = scaResultDate;
            return this;
        }
        public String getScaResultDate() {
            return this.scaResultDate;
        }

        public GetOcIcSimpleCancelResponseBodyData setSocialCreditCode(String socialCreditCode) {
            this.socialCreditCode = socialCreditCode;
            return this;
        }
        public String getSocialCreditCode() {
            return this.socialCreditCode;
        }

    }

}
