// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIpDomainResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcIpDomainResponseBodyData> data;

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

    public static GetOcIpDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcIpDomainResponseBody self = new GetOcIpDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcIpDomainResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcIpDomainResponseBody setData(java.util.List<GetOcIpDomainResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcIpDomainResponseBodyData> getData() {
        return this.data;
    }

    public GetOcIpDomainResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcIpDomainResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcIpDomainResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcIpDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcIpDomainResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcIpDomainResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcIpDomainResponseBodyData extends TeaModel {
        @NameInMap("CheckDate")
        public String checkDate;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("EntName")
        public String entName;

        @NameInMap("HomeUrl")
        public String homeUrl;

        @NameInMap("Number")
        public String number;

        @NameInMap("SiteName")
        public String siteName;

        public static GetOcIpDomainResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcIpDomainResponseBodyData self = new GetOcIpDomainResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcIpDomainResponseBodyData setCheckDate(String checkDate) {
            this.checkDate = checkDate;
            return this;
        }
        public String getCheckDate() {
            return this.checkDate;
        }

        public GetOcIpDomainResponseBodyData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetOcIpDomainResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcIpDomainResponseBodyData setHomeUrl(String homeUrl) {
            this.homeUrl = homeUrl;
            return this;
        }
        public String getHomeUrl() {
            return this.homeUrl;
        }

        public GetOcIpDomainResponseBodyData setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public GetOcIpDomainResponseBodyData setSiteName(String siteName) {
            this.siteName = siteName;
            return this;
        }
        public String getSiteName() {
            return this.siteName;
        }

    }

}
