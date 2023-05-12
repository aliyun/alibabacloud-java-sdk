// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSuspEventQuaraFilesRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to DescribeSuspEventQuaraFiles.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The type of the alert.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The name of the cloud desktop.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the workspace.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The time when the quarantined file was updated.</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeSuspEventQuaraFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventQuaraFilesRequest self = new DescribeSuspEventQuaraFilesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventQuaraFilesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSuspEventQuaraFilesRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeSuspEventQuaraFilesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSuspEventQuaraFilesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSuspEventQuaraFilesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
