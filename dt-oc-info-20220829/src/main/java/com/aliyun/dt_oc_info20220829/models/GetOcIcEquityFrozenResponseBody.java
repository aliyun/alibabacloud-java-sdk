// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcEquityFrozenResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcIcEquityFrozenResponseBodyData> data;

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

    public static GetOcIcEquityFrozenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcEquityFrozenResponseBody self = new GetOcIcEquityFrozenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcIcEquityFrozenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcIcEquityFrozenResponseBody setData(java.util.List<GetOcIcEquityFrozenResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcIcEquityFrozenResponseBodyData> getData() {
        return this.data;
    }

    public GetOcIcEquityFrozenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcIcEquityFrozenResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcIcEquityFrozenResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcIcEquityFrozenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcIcEquityFrozenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcIcEquityFrozenResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcIcEquityFrozenResponseBodyData extends TeaModel {
        @NameInMap("FreezeAmount")
        public String freezeAmount;

        @NameInMap("FreezeCardNum")
        public String freezeCardNum;

        @NameInMap("FreezeCardType")
        public String freezeCardType;

        @NameInMap("FreezeCourt")
        public String freezeCourt;

        @NameInMap("FreezeEndDate")
        public String freezeEndDate;

        @NameInMap("FreezeExecItem")
        public String freezeExecItem;

        @NameInMap("FreezeExecPerson")
        public String freezeExecPerson;

        @NameInMap("FreezeNoticeNum")
        public String freezeNoticeNum;

        @NameInMap("FreezePublishDate")
        public String freezePublishDate;

        @NameInMap("FreezeStartDate")
        public String freezeStartDate;

        @NameInMap("Status")
        public String status;

        @NameInMap("UnfreezeAdjustNum")
        public String unfreezeAdjustNum;

        @NameInMap("UnfreezeCourt")
        public String unfreezeCourt;

        @NameInMap("UnfreezeDate")
        public String unfreezeDate;

        @NameInMap("UnfreezeReason")
        public String unfreezeReason;

        public static GetOcIcEquityFrozenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcIcEquityFrozenResponseBodyData self = new GetOcIcEquityFrozenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcIcEquityFrozenResponseBodyData setFreezeAmount(String freezeAmount) {
            this.freezeAmount = freezeAmount;
            return this;
        }
        public String getFreezeAmount() {
            return this.freezeAmount;
        }

        public GetOcIcEquityFrozenResponseBodyData setFreezeCardNum(String freezeCardNum) {
            this.freezeCardNum = freezeCardNum;
            return this;
        }
        public String getFreezeCardNum() {
            return this.freezeCardNum;
        }

        public GetOcIcEquityFrozenResponseBodyData setFreezeCardType(String freezeCardType) {
            this.freezeCardType = freezeCardType;
            return this;
        }
        public String getFreezeCardType() {
            return this.freezeCardType;
        }

        public GetOcIcEquityFrozenResponseBodyData setFreezeCourt(String freezeCourt) {
            this.freezeCourt = freezeCourt;
            return this;
        }
        public String getFreezeCourt() {
            return this.freezeCourt;
        }

        public GetOcIcEquityFrozenResponseBodyData setFreezeEndDate(String freezeEndDate) {
            this.freezeEndDate = freezeEndDate;
            return this;
        }
        public String getFreezeEndDate() {
            return this.freezeEndDate;
        }

        public GetOcIcEquityFrozenResponseBodyData setFreezeExecItem(String freezeExecItem) {
            this.freezeExecItem = freezeExecItem;
            return this;
        }
        public String getFreezeExecItem() {
            return this.freezeExecItem;
        }

        public GetOcIcEquityFrozenResponseBodyData setFreezeExecPerson(String freezeExecPerson) {
            this.freezeExecPerson = freezeExecPerson;
            return this;
        }
        public String getFreezeExecPerson() {
            return this.freezeExecPerson;
        }

        public GetOcIcEquityFrozenResponseBodyData setFreezeNoticeNum(String freezeNoticeNum) {
            this.freezeNoticeNum = freezeNoticeNum;
            return this;
        }
        public String getFreezeNoticeNum() {
            return this.freezeNoticeNum;
        }

        public GetOcIcEquityFrozenResponseBodyData setFreezePublishDate(String freezePublishDate) {
            this.freezePublishDate = freezePublishDate;
            return this;
        }
        public String getFreezePublishDate() {
            return this.freezePublishDate;
        }

        public GetOcIcEquityFrozenResponseBodyData setFreezeStartDate(String freezeStartDate) {
            this.freezeStartDate = freezeStartDate;
            return this;
        }
        public String getFreezeStartDate() {
            return this.freezeStartDate;
        }

        public GetOcIcEquityFrozenResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetOcIcEquityFrozenResponseBodyData setUnfreezeAdjustNum(String unfreezeAdjustNum) {
            this.unfreezeAdjustNum = unfreezeAdjustNum;
            return this;
        }
        public String getUnfreezeAdjustNum() {
            return this.unfreezeAdjustNum;
        }

        public GetOcIcEquityFrozenResponseBodyData setUnfreezeCourt(String unfreezeCourt) {
            this.unfreezeCourt = unfreezeCourt;
            return this;
        }
        public String getUnfreezeCourt() {
            return this.unfreezeCourt;
        }

        public GetOcIcEquityFrozenResponseBodyData setUnfreezeDate(String unfreezeDate) {
            this.unfreezeDate = unfreezeDate;
            return this;
        }
        public String getUnfreezeDate() {
            return this.unfreezeDate;
        }

        public GetOcIcEquityFrozenResponseBodyData setUnfreezeReason(String unfreezeReason) {
            this.unfreezeReason = unfreezeReason;
            return this;
        }
        public String getUnfreezeReason() {
            return this.unfreezeReason;
        }

    }

}
