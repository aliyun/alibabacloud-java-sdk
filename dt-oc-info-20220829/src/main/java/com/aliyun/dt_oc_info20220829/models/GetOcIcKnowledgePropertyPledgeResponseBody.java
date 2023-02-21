// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcKnowledgePropertyPledgeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcIcKnowledgePropertyPledgeResponseBodyData> data;

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

    public static GetOcIcKnowledgePropertyPledgeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcKnowledgePropertyPledgeResponseBody self = new GetOcIcKnowledgePropertyPledgeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcIcKnowledgePropertyPledgeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcIcKnowledgePropertyPledgeResponseBody setData(java.util.List<GetOcIcKnowledgePropertyPledgeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcIcKnowledgePropertyPledgeResponseBodyData> getData() {
        return this.data;
    }

    public GetOcIcKnowledgePropertyPledgeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcIcKnowledgePropertyPledgeResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcIcKnowledgePropertyPledgeResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcIcKnowledgePropertyPledgeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcIcKnowledgePropertyPledgeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcIcKnowledgePropertyPledgeResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcIcKnowledgePropertyPledgeResponseBodyData extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Number")
        public String number;

        @NameInMap("Pawnee")
        public String pawnee;

        @NameInMap("Period")
        public String period;

        @NameInMap("Pledgor")
        public String pledgor;

        @NameInMap("PublicDate")
        public String publicDate;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static GetOcIcKnowledgePropertyPledgeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcIcKnowledgePropertyPledgeResponseBodyData self = new GetOcIcKnowledgePropertyPledgeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcIcKnowledgePropertyPledgeResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetOcIcKnowledgePropertyPledgeResponseBodyData setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public GetOcIcKnowledgePropertyPledgeResponseBodyData setPawnee(String pawnee) {
            this.pawnee = pawnee;
            return this;
        }
        public String getPawnee() {
            return this.pawnee;
        }

        public GetOcIcKnowledgePropertyPledgeResponseBodyData setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public GetOcIcKnowledgePropertyPledgeResponseBodyData setPledgor(String pledgor) {
            this.pledgor = pledgor;
            return this;
        }
        public String getPledgor() {
            return this.pledgor;
        }

        public GetOcIcKnowledgePropertyPledgeResponseBodyData setPublicDate(String publicDate) {
            this.publicDate = publicDate;
            return this;
        }
        public String getPublicDate() {
            return this.publicDate;
        }

        public GetOcIcKnowledgePropertyPledgeResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetOcIcKnowledgePropertyPledgeResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
