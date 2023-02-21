// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcChangeRecordResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcIcChangeRecordResponseBodyData> data;

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

    public static GetOcIcChangeRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcChangeRecordResponseBody self = new GetOcIcChangeRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcIcChangeRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcIcChangeRecordResponseBody setData(java.util.List<GetOcIcChangeRecordResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcIcChangeRecordResponseBodyData> getData() {
        return this.data;
    }

    public GetOcIcChangeRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcIcChangeRecordResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcIcChangeRecordResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcIcChangeRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcIcChangeRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcIcChangeRecordResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcIcChangeRecordResponseBodyData extends TeaModel {
        @NameInMap("AfterContent")
        public String afterContent;

        @NameInMap("BeforeContent")
        public String beforeContent;

        @NameInMap("ChangeDate")
        public String changeDate;

        @NameInMap("Type")
        public String type;

        public static GetOcIcChangeRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcIcChangeRecordResponseBodyData self = new GetOcIcChangeRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcIcChangeRecordResponseBodyData setAfterContent(String afterContent) {
            this.afterContent = afterContent;
            return this;
        }
        public String getAfterContent() {
            return this.afterContent;
        }

        public GetOcIcChangeRecordResponseBodyData setBeforeContent(String beforeContent) {
            this.beforeContent = beforeContent;
            return this;
        }
        public String getBeforeContent() {
            return this.beforeContent;
        }

        public GetOcIcChangeRecordResponseBodyData setChangeDate(String changeDate) {
            this.changeDate = changeDate;
            return this;
        }
        public String getChangeDate() {
            return this.changeDate;
        }

        public GetOcIcChangeRecordResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
