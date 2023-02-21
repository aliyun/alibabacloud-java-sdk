// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIpCertificateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcIpCertificateResponseBodyData> data;

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

    public static GetOcIpCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcIpCertificateResponseBody self = new GetOcIpCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcIpCertificateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcIpCertificateResponseBody setData(java.util.List<GetOcIpCertificateResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcIpCertificateResponseBodyData> getData() {
        return this.data;
    }

    public GetOcIpCertificateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcIpCertificateResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcIpCertificateResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcIpCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcIpCertificateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcIpCertificateResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcIpCertificateResponseBodyData extends TeaModel {
        @NameInMap("AuthorizeDate")
        public String authorizeDate;

        @NameInMap("AuthorizeDepartment")
        public String authorizeDepartment;

        @NameInMap("CertNum")
        public String certNum;

        @NameInMap("CertScope")
        public String certScope;

        @NameInMap("CertType")
        public String certType;

        @NameInMap("EntName")
        public String entName;

        @NameInMap("Province")
        public String province;

        @NameInMap("PubDate")
        public String pubDate;

        @NameInMap("ValidEndDate")
        public String validEndDate;

        @NameInMap("ValidStartDate")
        public String validStartDate;

        public static GetOcIpCertificateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcIpCertificateResponseBodyData self = new GetOcIpCertificateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcIpCertificateResponseBodyData setAuthorizeDate(String authorizeDate) {
            this.authorizeDate = authorizeDate;
            return this;
        }
        public String getAuthorizeDate() {
            return this.authorizeDate;
        }

        public GetOcIpCertificateResponseBodyData setAuthorizeDepartment(String authorizeDepartment) {
            this.authorizeDepartment = authorizeDepartment;
            return this;
        }
        public String getAuthorizeDepartment() {
            return this.authorizeDepartment;
        }

        public GetOcIpCertificateResponseBodyData setCertNum(String certNum) {
            this.certNum = certNum;
            return this;
        }
        public String getCertNum() {
            return this.certNum;
        }

        public GetOcIpCertificateResponseBodyData setCertScope(String certScope) {
            this.certScope = certScope;
            return this;
        }
        public String getCertScope() {
            return this.certScope;
        }

        public GetOcIpCertificateResponseBodyData setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public GetOcIpCertificateResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcIpCertificateResponseBodyData setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public GetOcIpCertificateResponseBodyData setPubDate(String pubDate) {
            this.pubDate = pubDate;
            return this;
        }
        public String getPubDate() {
            return this.pubDate;
        }

        public GetOcIpCertificateResponseBodyData setValidEndDate(String validEndDate) {
            this.validEndDate = validEndDate;
            return this;
        }
        public String getValidEndDate() {
            return this.validEndDate;
        }

        public GetOcIpCertificateResponseBodyData setValidStartDate(String validStartDate) {
            this.validStartDate = validStartDate;
            return this;
        }
        public String getValidStartDate() {
            return this.validStartDate;
        }

    }

}
