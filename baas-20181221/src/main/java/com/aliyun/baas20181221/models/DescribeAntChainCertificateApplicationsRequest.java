// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainCertificateApplicationsRequest extends TeaModel {
    @NameInMap("AntChainId")
    public String antChainId;

    @NameInMap("Status")
    public String status;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeAntChainCertificateApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainCertificateApplicationsRequest self = new DescribeAntChainCertificateApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainCertificateApplicationsRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public DescribeAntChainCertificateApplicationsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeAntChainCertificateApplicationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAntChainCertificateApplicationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

}
