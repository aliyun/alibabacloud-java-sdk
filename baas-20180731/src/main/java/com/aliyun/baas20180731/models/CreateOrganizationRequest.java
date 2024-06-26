// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateOrganizationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>domain</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Location")
    public String location;

    @NameInMap("MajorVersion")
    public String majorVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PeersCount")
    public Integer peersCount;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("SpecName")
    public String specName;

    public static CreateOrganizationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrganizationRequest self = new CreateOrganizationRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrganizationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateOrganizationRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateOrganizationRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateOrganizationRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public CreateOrganizationRequest setMajorVersion(String majorVersion) {
        this.majorVersion = majorVersion;
        return this;
    }
    public String getMajorVersion() {
        return this.majorVersion;
    }

    public CreateOrganizationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateOrganizationRequest setPeersCount(Integer peersCount) {
        this.peersCount = peersCount;
        return this;
    }
    public Integer getPeersCount() {
        return this.peersCount;
    }

    public CreateOrganizationRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateOrganizationRequest setSpecName(String specName) {
        this.specName = specName;
        return this;
    }
    public String getSpecName() {
        return this.specName;
    }

}
