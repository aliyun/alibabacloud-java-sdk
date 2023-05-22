// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnHttpsDomainListRequest extends TeaModel {
    /**
     * <p>The status of the certificate. Valid values:</p>
     * <br>
     * <p>*   **ok**: The certificate is working as expected.</p>
     * <p>*   **mismatch**: The certificate does not match the specified domain name.</p>
     * <p>*   **expired**: The certificate has expired.</p>
     * <p>*   **expire_soon**: The certificate is about to expire.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The type of the certificate. Valid values:</p>
     * <br>
     * <p>*   **free**: A free certificate.</p>
     * <p>*   **cas**: A certificate that is purchased through Alibaba Cloud SSL Certificates Service.</p>
     * <p>*   **upload**: A user-uploaded certificate.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeDcdnHttpsDomainListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnHttpsDomainListRequest self = new DescribeDcdnHttpsDomainListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnHttpsDomainListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeDcdnHttpsDomainListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnHttpsDomainListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
