// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveDomainSchdmByPropertyRequest extends TeaModel {
    /**
     * <p>The domain name for which you want to modify the acceleration region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The acceleration region that you want to set. {&quot;coverage&quot;:&quot;overseas&quot;} specifies regions outside the Chinese mainland. Valid values of coverage:</p>
     * <ul>
     * <li>domestic: regions in the Chinese mainland.</li>
     * <li>overseas: regions outside the Chinese mainland.</li>
     * <li>global: regions in and outside the Chinese mainland.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;coverage&quot;:&quot;global&quot;}</p>
     */
    @NameInMap("Property")
    public String property;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyLiveDomainSchdmByPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveDomainSchdmByPropertyRequest self = new ModifyLiveDomainSchdmByPropertyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLiveDomainSchdmByPropertyRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ModifyLiveDomainSchdmByPropertyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyLiveDomainSchdmByPropertyRequest setProperty(String property) {
        this.property = property;
        return this;
    }
    public String getProperty() {
        return this.property;
    }

    public ModifyLiveDomainSchdmByPropertyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
