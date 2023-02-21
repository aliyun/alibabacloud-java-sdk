// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIpWorksCopyrightResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcIpWorksCopyrightResponseBodyData> data;

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

    public static GetOcIpWorksCopyrightResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcIpWorksCopyrightResponseBody self = new GetOcIpWorksCopyrightResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcIpWorksCopyrightResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcIpWorksCopyrightResponseBody setData(java.util.List<GetOcIpWorksCopyrightResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcIpWorksCopyrightResponseBodyData> getData() {
        return this.data;
    }

    public GetOcIpWorksCopyrightResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcIpWorksCopyrightResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcIpWorksCopyrightResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcIpWorksCopyrightResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcIpWorksCopyrightResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcIpWorksCopyrightResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcIpWorksCopyrightResponseBodyData extends TeaModel {
        @NameInMap("ApprovalDate")
        public String approvalDate;

        @NameInMap("CopyName")
        public String copyName;

        @NameInMap("CopyNum")
        public String copyNum;

        @NameInMap("EntName")
        public String entName;

        @NameInMap("FirstDate")
        public String firstDate;

        @NameInMap("SuccessDate")
        public String successDate;

        @NameInMap("TypeName")
        public String typeName;

        public static GetOcIpWorksCopyrightResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcIpWorksCopyrightResponseBodyData self = new GetOcIpWorksCopyrightResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcIpWorksCopyrightResponseBodyData setApprovalDate(String approvalDate) {
            this.approvalDate = approvalDate;
            return this;
        }
        public String getApprovalDate() {
            return this.approvalDate;
        }

        public GetOcIpWorksCopyrightResponseBodyData setCopyName(String copyName) {
            this.copyName = copyName;
            return this;
        }
        public String getCopyName() {
            return this.copyName;
        }

        public GetOcIpWorksCopyrightResponseBodyData setCopyNum(String copyNum) {
            this.copyNum = copyNum;
            return this;
        }
        public String getCopyNum() {
            return this.copyNum;
        }

        public GetOcIpWorksCopyrightResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcIpWorksCopyrightResponseBodyData setFirstDate(String firstDate) {
            this.firstDate = firstDate;
            return this;
        }
        public String getFirstDate() {
            return this.firstDate;
        }

        public GetOcIpWorksCopyrightResponseBodyData setSuccessDate(String successDate) {
            this.successDate = successDate;
            return this;
        }
        public String getSuccessDate() {
            return this.successDate;
        }

        public GetOcIpWorksCopyrightResponseBodyData setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

}
