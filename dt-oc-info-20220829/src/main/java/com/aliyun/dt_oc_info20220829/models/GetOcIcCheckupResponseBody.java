// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcCheckupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcIcCheckupResponseBodyData> data;

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

    public static GetOcIcCheckupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcCheckupResponseBody self = new GetOcIcCheckupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcIcCheckupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcIcCheckupResponseBody setData(java.util.List<GetOcIcCheckupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcIcCheckupResponseBodyData> getData() {
        return this.data;
    }

    public GetOcIcCheckupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcIcCheckupResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcIcCheckupResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcIcCheckupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcIcCheckupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcIcCheckupResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcIcCheckupResponseBodyData extends TeaModel {
        @NameInMap("Date")
        public String date;

        @NameInMap("Department")
        public String department;

        @NameInMap("Result")
        public String result;

        @NameInMap("Type")
        public String type;

        public static GetOcIcCheckupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcIcCheckupResponseBodyData self = new GetOcIcCheckupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcIcCheckupResponseBodyData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetOcIcCheckupResponseBodyData setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public GetOcIcCheckupResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetOcIcCheckupResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
