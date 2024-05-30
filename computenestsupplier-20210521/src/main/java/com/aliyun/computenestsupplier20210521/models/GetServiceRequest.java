// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceRequest extends TeaModel {
    @NameInMap("FilterAliUid")
    public Boolean filterAliUid;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("ServiceVersion")
    public String serviceVersion;

    @NameInMap("SharedAccountType")
    public String sharedAccountType;

    @NameInMap("ShowDetail")
    public java.util.List<String> showDetail;

    public static GetServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceRequest self = new GetServiceRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceRequest setFilterAliUid(Boolean filterAliUid) {
        this.filterAliUid = filterAliUid;
        return this;
    }
    public Boolean getFilterAliUid() {
        return this.filterAliUid;
    }

    public GetServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetServiceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetServiceRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public GetServiceRequest setSharedAccountType(String sharedAccountType) {
        this.sharedAccountType = sharedAccountType;
        return this;
    }
    public String getSharedAccountType() {
        return this.sharedAccountType;
    }

    public GetServiceRequest setShowDetail(java.util.List<String> showDetail) {
        this.showDetail = showDetail;
        return this;
    }
    public java.util.List<String> getShowDetail() {
        return this.showDetail;
    }

}
