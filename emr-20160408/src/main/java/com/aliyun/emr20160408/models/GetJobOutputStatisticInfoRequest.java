// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class GetJobOutputStatisticInfoRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("FromDatetime")
    public String fromDatetime;

    @NameInMap("ToDatetime")
    public String toDatetime;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static GetJobOutputStatisticInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobOutputStatisticInfoRequest self = new GetJobOutputStatisticInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetJobOutputStatisticInfoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetJobOutputStatisticInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetJobOutputStatisticInfoRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetJobOutputStatisticInfoRequest setFromDatetime(String fromDatetime) {
        this.fromDatetime = fromDatetime;
        return this;
    }
    public String getFromDatetime() {
        return this.fromDatetime;
    }

    public GetJobOutputStatisticInfoRequest setToDatetime(String toDatetime) {
        this.toDatetime = toDatetime;
        return this;
    }
    public String getToDatetime() {
        return this.toDatetime;
    }

    public GetJobOutputStatisticInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetJobOutputStatisticInfoRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

}
