// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcBranchResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcIcBranchResponseBodyData> data;

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

    public static GetOcIcBranchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcBranchResponseBody self = new GetOcIcBranchResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcIcBranchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcIcBranchResponseBody setData(java.util.List<GetOcIcBranchResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcIcBranchResponseBodyData> getData() {
        return this.data;
    }

    public GetOcIcBranchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcIcBranchResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcIcBranchResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcIcBranchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcIcBranchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcIcBranchResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcIcBranchResponseBodyData extends TeaModel {
        @NameInMap("EntName")
        public String entName;

        @NameInMap("EntStatus")
        public String entStatus;

        @NameInMap("EsDate")
        public String esDate;

        @NameInMap("OperName")
        public String operName;

        public static GetOcIcBranchResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcIcBranchResponseBodyData self = new GetOcIcBranchResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcIcBranchResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcIcBranchResponseBodyData setEntStatus(String entStatus) {
            this.entStatus = entStatus;
            return this;
        }
        public String getEntStatus() {
            return this.entStatus;
        }

        public GetOcIcBranchResponseBodyData setEsDate(String esDate) {
            this.esDate = esDate;
            return this;
        }
        public String getEsDate() {
            return this.esDate;
        }

        public GetOcIcBranchResponseBodyData setOperName(String operName) {
            this.operName = operName;
            return this;
        }
        public String getOperName() {
            return this.operName;
        }

    }

}
