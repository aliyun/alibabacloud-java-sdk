// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcJusticeCourtNoticeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcJusticeCourtNoticeResponseBodyData> data;

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

    public static GetOcJusticeCourtNoticeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcJusticeCourtNoticeResponseBody self = new GetOcJusticeCourtNoticeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcJusticeCourtNoticeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcJusticeCourtNoticeResponseBody setData(java.util.List<GetOcJusticeCourtNoticeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcJusticeCourtNoticeResponseBodyData> getData() {
        return this.data;
    }

    public GetOcJusticeCourtNoticeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcJusticeCourtNoticeResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcJusticeCourtNoticeResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcJusticeCourtNoticeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcJusticeCourtNoticeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcJusticeCourtNoticeResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcJusticeCourtNoticeResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Court")
        public String court;

        @NameInMap("Party")
        public String party;

        @NameInMap("PublicDate")
        public String publicDate;

        @NameInMap("Type")
        public String type;

        public static GetOcJusticeCourtNoticeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcJusticeCourtNoticeResponseBodyData self = new GetOcJusticeCourtNoticeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcJusticeCourtNoticeResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetOcJusticeCourtNoticeResponseBodyData setCourt(String court) {
            this.court = court;
            return this;
        }
        public String getCourt() {
            return this.court;
        }

        public GetOcJusticeCourtNoticeResponseBodyData setParty(String party) {
            this.party = party;
            return this;
        }
        public String getParty() {
            return this.party;
        }

        public GetOcJusticeCourtNoticeResponseBodyData setPublicDate(String publicDate) {
            this.publicDate = publicDate;
            return this;
        }
        public String getPublicDate() {
            return this.publicDate;
        }

        public GetOcJusticeCourtNoticeResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
