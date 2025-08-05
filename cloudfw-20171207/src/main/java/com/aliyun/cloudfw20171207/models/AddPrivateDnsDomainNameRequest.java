// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddPrivateDnsDomainNameRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cfw-xxx</p>
     */
    @NameInMap("AccessInstanceId")
    public String accessInstanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainNameList")
    public java.util.List<String> domainNameList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    public static AddPrivateDnsDomainNameRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPrivateDnsDomainNameRequest self = new AddPrivateDnsDomainNameRequest();
        return TeaModel.build(map, self);
    }

    public AddPrivateDnsDomainNameRequest setAccessInstanceId(String accessInstanceId) {
        this.accessInstanceId = accessInstanceId;
        return this;
    }
    public String getAccessInstanceId() {
        return this.accessInstanceId;
    }

    public AddPrivateDnsDomainNameRequest setDomainNameList(java.util.List<String> domainNameList) {
        this.domainNameList = domainNameList;
        return this;
    }
    public java.util.List<String> getDomainNameList() {
        return this.domainNameList;
    }

    public AddPrivateDnsDomainNameRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

}
