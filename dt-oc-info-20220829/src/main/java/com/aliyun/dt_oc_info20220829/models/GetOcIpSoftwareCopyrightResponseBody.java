// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIpSoftwareCopyrightResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcIpSoftwareCopyrightResponseBodyData> data;

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

    public static GetOcIpSoftwareCopyrightResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcIpSoftwareCopyrightResponseBody self = new GetOcIpSoftwareCopyrightResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcIpSoftwareCopyrightResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcIpSoftwareCopyrightResponseBody setData(java.util.List<GetOcIpSoftwareCopyrightResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcIpSoftwareCopyrightResponseBodyData> getData() {
        return this.data;
    }

    public GetOcIpSoftwareCopyrightResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcIpSoftwareCopyrightResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcIpSoftwareCopyrightResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcIpSoftwareCopyrightResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcIpSoftwareCopyrightResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcIpSoftwareCopyrightResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcIpSoftwareCopyrightResponseBodyData extends TeaModel {
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

        @NameInMap("ShortName")
        public String shortName;

        @NameInMap("SuccessDate")
        public String successDate;

        @NameInMap("TypeNum")
        public String typeNum;

        @NameInMap("Version")
        public String version;

        public static GetOcIpSoftwareCopyrightResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcIpSoftwareCopyrightResponseBodyData self = new GetOcIpSoftwareCopyrightResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcIpSoftwareCopyrightResponseBodyData setApprovalDate(String approvalDate) {
            this.approvalDate = approvalDate;
            return this;
        }
        public String getApprovalDate() {
            return this.approvalDate;
        }

        public GetOcIpSoftwareCopyrightResponseBodyData setCopyName(String copyName) {
            this.copyName = copyName;
            return this;
        }
        public String getCopyName() {
            return this.copyName;
        }

        public GetOcIpSoftwareCopyrightResponseBodyData setCopyNum(String copyNum) {
            this.copyNum = copyNum;
            return this;
        }
        public String getCopyNum() {
            return this.copyNum;
        }

        public GetOcIpSoftwareCopyrightResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcIpSoftwareCopyrightResponseBodyData setFirstDate(String firstDate) {
            this.firstDate = firstDate;
            return this;
        }
        public String getFirstDate() {
            return this.firstDate;
        }

        public GetOcIpSoftwareCopyrightResponseBodyData setShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }
        public String getShortName() {
            return this.shortName;
        }

        public GetOcIpSoftwareCopyrightResponseBodyData setSuccessDate(String successDate) {
            this.successDate = successDate;
            return this;
        }
        public String getSuccessDate() {
            return this.successDate;
        }

        public GetOcIpSoftwareCopyrightResponseBodyData setTypeNum(String typeNum) {
            this.typeNum = typeNum;
            return this;
        }
        public String getTypeNum() {
            return this.typeNum;
        }

        public GetOcIpSoftwareCopyrightResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
