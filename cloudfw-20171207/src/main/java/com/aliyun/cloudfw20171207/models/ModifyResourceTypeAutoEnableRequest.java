// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyResourceTypeAutoEnableRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <strong>example:</strong>
     * <p>{&quot;SlbEIP&quot;:true,&quot;GaEIP&quot;:false,&quot;EcsIPv6&quot;:true,&quot;NatPublicIP&quot;:true,&quot;SlbIPv6&quot;:false,&quot;BastionHostIngressIP&quot;:false,&quot;EIP&quot;:true,&quot;NatEIP&quot;:true,&quot;SlbPublicIP&quot;:true,&quot;EcsEIP&quot;:true,&quot;EniEIP&quot;:true,&quot;HAVIP&quot;:true,&quot;NlbEIP&quot;:true,&quot;NlbIPv6&quot;:false,&quot;EniEIPv6&quot;:false,&quot;EcsPublicIP&quot;:true,&quot;AlbIPv6&quot;:true,&quot;BastionHostIP&quot;:false,&quot;BastionHostEgressIP&quot;:true,&quot;GaEIPV6&quot;:false,&quot;AlbEIP&quot;:false}</p>
     */
    @NameInMap("ResourceTypeAutoEnable")
    public String resourceTypeAutoEnable;

    public static ModifyResourceTypeAutoEnableRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourceTypeAutoEnableRequest self = new ModifyResourceTypeAutoEnableRequest();
        return TeaModel.build(map, self);
    }

    public ModifyResourceTypeAutoEnableRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyResourceTypeAutoEnableRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public ModifyResourceTypeAutoEnableRequest setResourceTypeAutoEnable(String resourceTypeAutoEnable) {
        this.resourceTypeAutoEnable = resourceTypeAutoEnable;
        return this;
    }
    public String getResourceTypeAutoEnable() {
        return this.resourceTypeAutoEnable;
    }

}
