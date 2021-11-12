// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListListenerCertificatesResponseBody extends TeaModel {
    // 监听SSL证书列表
    @NameInMap("Certificates")
    public java.util.List<ListListenerCertificatesResponseBodyCertificates> certificates;

    // 本次查询返回记录数量
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 分页查询标识
    @NameInMap("NextToken")
    public String nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 总记录数
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListListenerCertificatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListListenerCertificatesResponseBody self = new ListListenerCertificatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListListenerCertificatesResponseBody setCertificates(java.util.List<ListListenerCertificatesResponseBodyCertificates> certificates) {
        this.certificates = certificates;
        return this;
    }
    public java.util.List<ListListenerCertificatesResponseBodyCertificates> getCertificates() {
        return this.certificates;
    }

    public ListListenerCertificatesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListListenerCertificatesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListListenerCertificatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListListenerCertificatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListListenerCertificatesResponseBodyCertificates extends TeaModel {
        // 证书Id
        @NameInMap("CertificateId")
        public String certificateId;

        // 证书类型
        @NameInMap("CertificateType")
        public String certificateType;

        // 是否为默认证书
        @NameInMap("IsDefault")
        public Boolean isDefault;

        // 证书状态
        @NameInMap("Status")
        public String status;

        public static ListListenerCertificatesResponseBodyCertificates build(java.util.Map<String, ?> map) throws Exception {
            ListListenerCertificatesResponseBodyCertificates self = new ListListenerCertificatesResponseBodyCertificates();
            return TeaModel.build(map, self);
        }

        public ListListenerCertificatesResponseBodyCertificates setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

        public ListListenerCertificatesResponseBodyCertificates setCertificateType(String certificateType) {
            this.certificateType = certificateType;
            return this;
        }
        public String getCertificateType() {
            return this.certificateType;
        }

        public ListListenerCertificatesResponseBodyCertificates setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListListenerCertificatesResponseBodyCertificates setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
