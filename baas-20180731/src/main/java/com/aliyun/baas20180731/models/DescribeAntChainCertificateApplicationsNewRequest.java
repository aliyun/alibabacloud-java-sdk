// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainCertificateApplicationsNewRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AntChainId")
    public String antChainId;

    @NameInMap("ConsortiumId")
    public String consortiumId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeAntChainCertificateApplicationsNewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainCertificateApplicationsNewRequest self = new DescribeAntChainCertificateApplicationsNewRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainCertificateApplicationsNewRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public DescribeAntChainCertificateApplicationsNewRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public DescribeAntChainCertificateApplicationsNewRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAntChainCertificateApplicationsNewRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAntChainCertificateApplicationsNewRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
