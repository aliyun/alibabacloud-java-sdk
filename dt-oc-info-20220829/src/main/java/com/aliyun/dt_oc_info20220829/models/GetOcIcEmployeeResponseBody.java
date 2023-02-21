// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcEmployeeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcIcEmployeeResponseBodyData> data;

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

    public static GetOcIcEmployeeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcEmployeeResponseBody self = new GetOcIcEmployeeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcIcEmployeeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcIcEmployeeResponseBody setData(java.util.List<GetOcIcEmployeeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcIcEmployeeResponseBodyData> getData() {
        return this.data;
    }

    public GetOcIcEmployeeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcIcEmployeeResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcIcEmployeeResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcIcEmployeeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcIcEmployeeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcIcEmployeeResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcIcEmployeeResponseBodyData extends TeaModel {
        @NameInMap("JobTitle")
        public String jobTitle;

        @NameInMap("Name")
        public String name;

        public static GetOcIcEmployeeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcIcEmployeeResponseBodyData self = new GetOcIcEmployeeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcIcEmployeeResponseBodyData setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }
        public String getJobTitle() {
            return this.jobTitle;
        }

        public GetOcIcEmployeeResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
