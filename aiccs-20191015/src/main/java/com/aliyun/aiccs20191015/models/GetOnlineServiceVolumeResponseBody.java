// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetOnlineServiceVolumeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetOnlineServiceVolumeResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetOnlineServiceVolumeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOnlineServiceVolumeResponseBody self = new GetOnlineServiceVolumeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOnlineServiceVolumeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOnlineServiceVolumeResponseBody setData(GetOnlineServiceVolumeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOnlineServiceVolumeResponseBodyData getData() {
        return this.data;
    }

    public GetOnlineServiceVolumeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOnlineServiceVolumeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOnlineServiceVolumeResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetOnlineServiceVolumeResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Rows")
        public String rows;

        @NameInMap("TotalNum")
        public Integer totalNum;

        public static GetOnlineServiceVolumeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOnlineServiceVolumeResponseBodyData self = new GetOnlineServiceVolumeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOnlineServiceVolumeResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetOnlineServiceVolumeResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetOnlineServiceVolumeResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public GetOnlineServiceVolumeResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
