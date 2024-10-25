// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class LaunchServiceRequest extends TeaModel {
    @NameInMap("Categories")
    public java.util.List<String> categories;

    /**
     * <strong>example:</strong>
     * <p>10CM943JP0EN9D51H</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Recommend")
    public Boolean recommend;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>service-0e6fca6a51a544xxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("ServiceVersion")
    public String serviceVersion;

    public static LaunchServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        LaunchServiceRequest self = new LaunchServiceRequest();
        return TeaModel.build(map, self);
    }

    public LaunchServiceRequest setCategories(java.util.List<String> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<String> getCategories() {
        return this.categories;
    }

    public LaunchServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public LaunchServiceRequest setRecommend(Boolean recommend) {
        this.recommend = recommend;
        return this;
    }
    public Boolean getRecommend() {
        return this.recommend;
    }

    public LaunchServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public LaunchServiceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public LaunchServiceRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}
