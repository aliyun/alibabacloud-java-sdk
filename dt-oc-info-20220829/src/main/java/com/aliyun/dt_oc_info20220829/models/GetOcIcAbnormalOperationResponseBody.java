// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcAbnormalOperationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcIcAbnormalOperationResponseBodyData> data;

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

    public static GetOcIcAbnormalOperationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcAbnormalOperationResponseBody self = new GetOcIcAbnormalOperationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcIcAbnormalOperationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcIcAbnormalOperationResponseBody setData(java.util.List<GetOcIcAbnormalOperationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcIcAbnormalOperationResponseBodyData> getData() {
        return this.data;
    }

    public GetOcIcAbnormalOperationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcIcAbnormalOperationResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcIcAbnormalOperationResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcIcAbnormalOperationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcIcAbnormalOperationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcIcAbnormalOperationResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcIcAbnormalOperationResponseBodyData extends TeaModel {
        @NameInMap("InDate")
        public String inDate;

        @NameInMap("InDepartment")
        public String inDepartment;

        @NameInMap("InReason")
        public String inReason;

        @NameInMap("OutDate")
        public String outDate;

        @NameInMap("OutDepartment")
        public String outDepartment;

        @NameInMap("OutReason")
        public String outReason;

        public static GetOcIcAbnormalOperationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcIcAbnormalOperationResponseBodyData self = new GetOcIcAbnormalOperationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcIcAbnormalOperationResponseBodyData setInDate(String inDate) {
            this.inDate = inDate;
            return this;
        }
        public String getInDate() {
            return this.inDate;
        }

        public GetOcIcAbnormalOperationResponseBodyData setInDepartment(String inDepartment) {
            this.inDepartment = inDepartment;
            return this;
        }
        public String getInDepartment() {
            return this.inDepartment;
        }

        public GetOcIcAbnormalOperationResponseBodyData setInReason(String inReason) {
            this.inReason = inReason;
            return this;
        }
        public String getInReason() {
            return this.inReason;
        }

        public GetOcIcAbnormalOperationResponseBodyData setOutDate(String outDate) {
            this.outDate = outDate;
            return this;
        }
        public String getOutDate() {
            return this.outDate;
        }

        public GetOcIcAbnormalOperationResponseBodyData setOutDepartment(String outDepartment) {
            this.outDepartment = outDepartment;
            return this;
        }
        public String getOutDepartment() {
            return this.outDepartment;
        }

        public GetOcIcAbnormalOperationResponseBodyData setOutReason(String outReason) {
            this.outReason = outReason;
            return this;
        }
        public String getOutReason() {
            return this.outReason;
        }

    }

}
