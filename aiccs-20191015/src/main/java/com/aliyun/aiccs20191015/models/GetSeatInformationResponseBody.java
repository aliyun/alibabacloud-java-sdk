// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSeatInformationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSeatInformationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetSeatInformationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSeatInformationResponseBody self = new GetSeatInformationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSeatInformationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSeatInformationResponseBody setData(GetSeatInformationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSeatInformationResponseBodyData getData() {
        return this.data;
    }

    public GetSeatInformationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSeatInformationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSeatInformationResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetSeatInformationResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Rowr")
        public String rowr;

        @NameInMap("TotalNum")
        public Integer totalNum;

        public static GetSeatInformationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSeatInformationResponseBodyData self = new GetSeatInformationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSeatInformationResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetSeatInformationResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetSeatInformationResponseBodyData setRowr(String rowr) {
            this.rowr = rowr;
            return this;
        }
        public String getRowr() {
            return this.rowr;
        }

        public GetSeatInformationResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
