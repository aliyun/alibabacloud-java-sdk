// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcFuzzSearchResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcFuzzSearchResponseBodyData> data;

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

    public static GetOcFuzzSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcFuzzSearchResponseBody self = new GetOcFuzzSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcFuzzSearchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcFuzzSearchResponseBody setData(java.util.List<GetOcFuzzSearchResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcFuzzSearchResponseBodyData> getData() {
        return this.data;
    }

    public GetOcFuzzSearchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcFuzzSearchResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcFuzzSearchResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcFuzzSearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcFuzzSearchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcFuzzSearchResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcFuzzSearchResponseBodyData extends TeaModel {
        @NameInMap("EntName")
        public String entName;

        public static GetOcFuzzSearchResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcFuzzSearchResponseBodyData self = new GetOcFuzzSearchResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcFuzzSearchResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

    }

}
