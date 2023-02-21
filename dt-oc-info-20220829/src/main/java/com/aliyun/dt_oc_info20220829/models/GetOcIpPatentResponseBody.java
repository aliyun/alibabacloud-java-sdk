// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIpPatentResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcIpPatentResponseBodyData> data;

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

    public static GetOcIpPatentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcIpPatentResponseBody self = new GetOcIpPatentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcIpPatentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcIpPatentResponseBody setData(java.util.List<GetOcIpPatentResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcIpPatentResponseBodyData> getData() {
        return this.data;
    }

    public GetOcIpPatentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcIpPatentResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcIpPatentResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcIpPatentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcIpPatentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcIpPatentResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcIpPatentResponseBodyData extends TeaModel {
        @NameInMap("Agency")
        public String agency;

        @NameInMap("Agent")
        public String agent;

        @NameInMap("Brief")
        public String brief;

        @NameInMap("CateNum")
        public String cateNum;

        @NameInMap("EntName")
        public String entName;

        @NameInMap("InventorList")
        public String inventorList;

        @NameInMap("MainClaim")
        public String mainClaim;

        @NameInMap("PatentName")
        public String patentName;

        @NameInMap("PatentStatus")
        public String patentStatus;

        @NameInMap("PatentType")
        public String patentType;

        @NameInMap("PatenteeList")
        public String patenteeList;

        @NameInMap("PrioDate")
        public String prioDate;

        @NameInMap("PrioNum")
        public String prioNum;

        @NameInMap("PublicDate")
        public String publicDate;

        @NameInMap("PublicNum")
        public String publicNum;

        @NameInMap("RequestDate")
        public String requestDate;

        @NameInMap("RequestNum")
        public String requestNum;

        public static GetOcIpPatentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcIpPatentResponseBodyData self = new GetOcIpPatentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcIpPatentResponseBodyData setAgency(String agency) {
            this.agency = agency;
            return this;
        }
        public String getAgency() {
            return this.agency;
        }

        public GetOcIpPatentResponseBodyData setAgent(String agent) {
            this.agent = agent;
            return this;
        }
        public String getAgent() {
            return this.agent;
        }

        public GetOcIpPatentResponseBodyData setBrief(String brief) {
            this.brief = brief;
            return this;
        }
        public String getBrief() {
            return this.brief;
        }

        public GetOcIpPatentResponseBodyData setCateNum(String cateNum) {
            this.cateNum = cateNum;
            return this;
        }
        public String getCateNum() {
            return this.cateNum;
        }

        public GetOcIpPatentResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcIpPatentResponseBodyData setInventorList(String inventorList) {
            this.inventorList = inventorList;
            return this;
        }
        public String getInventorList() {
            return this.inventorList;
        }

        public GetOcIpPatentResponseBodyData setMainClaim(String mainClaim) {
            this.mainClaim = mainClaim;
            return this;
        }
        public String getMainClaim() {
            return this.mainClaim;
        }

        public GetOcIpPatentResponseBodyData setPatentName(String patentName) {
            this.patentName = patentName;
            return this;
        }
        public String getPatentName() {
            return this.patentName;
        }

        public GetOcIpPatentResponseBodyData setPatentStatus(String patentStatus) {
            this.patentStatus = patentStatus;
            return this;
        }
        public String getPatentStatus() {
            return this.patentStatus;
        }

        public GetOcIpPatentResponseBodyData setPatentType(String patentType) {
            this.patentType = patentType;
            return this;
        }
        public String getPatentType() {
            return this.patentType;
        }

        public GetOcIpPatentResponseBodyData setPatenteeList(String patenteeList) {
            this.patenteeList = patenteeList;
            return this;
        }
        public String getPatenteeList() {
            return this.patenteeList;
        }

        public GetOcIpPatentResponseBodyData setPrioDate(String prioDate) {
            this.prioDate = prioDate;
            return this;
        }
        public String getPrioDate() {
            return this.prioDate;
        }

        public GetOcIpPatentResponseBodyData setPrioNum(String prioNum) {
            this.prioNum = prioNum;
            return this;
        }
        public String getPrioNum() {
            return this.prioNum;
        }

        public GetOcIpPatentResponseBodyData setPublicDate(String publicDate) {
            this.publicDate = publicDate;
            return this;
        }
        public String getPublicDate() {
            return this.publicDate;
        }

        public GetOcIpPatentResponseBodyData setPublicNum(String publicNum) {
            this.publicNum = publicNum;
            return this;
        }
        public String getPublicNum() {
            return this.publicNum;
        }

        public GetOcIpPatentResponseBodyData setRequestDate(String requestDate) {
            this.requestDate = requestDate;
            return this;
        }
        public String getRequestDate() {
            return this.requestDate;
        }

        public GetOcIpPatentResponseBodyData setRequestNum(String requestNum) {
            this.requestNum = requestNum;
            return this;
        }
        public String getRequestNum() {
            return this.requestNum;
        }

    }

}
