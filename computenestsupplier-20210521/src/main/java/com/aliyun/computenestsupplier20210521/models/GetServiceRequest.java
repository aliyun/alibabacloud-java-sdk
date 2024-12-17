// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceRequest extends TeaModel {
    /**
     * <p>Specifies whether to filter information based on Alibaba Cloud account IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FilterAliUid")
    public Boolean filterAliUid;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The service ID.</p>
     * 
     * <strong>example:</strong>
     * <p>service-4ee86df83fd948******</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The Service Instance Id.</p>
     * 
     * <strong>example:</strong>
     * <p>si-85b1exxx</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    /**
     * <p>The Service Name.</p>
     * 
     * <strong>example:</strong>
     * <p>Wordpress社区版</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The service version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ServiceVersion")
    public String serviceVersion;

    /**
     * <p>The share type of the service. Default value: SharedAccount. Valid values:</p>
     * <ul>
     * <li>SharedAccount: The service is shared by multiple accounts.</li>
     * <li>Resell: The service is distributed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SharedAccount</p>
     */
    @NameInMap("SharedAccountType")
    public String sharedAccountType;

    /**
     * <p>The information that you want to query.</p>
     */
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

    public GetServiceRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public GetServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
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
