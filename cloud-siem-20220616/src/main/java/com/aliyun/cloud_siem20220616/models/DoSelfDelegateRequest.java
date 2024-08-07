// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DoSelfDelegateRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account of an ordinary member of the threat analysis feature.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>104423523217****</p>
     */
    @NameInMap("AliUid")
    public Long aliUid;

    /**
     * <p>Specifies whether to use a delegated administrator account. Valid values:</p>
     * <ul>
     * <li>1: use a delegated administrator account.</li>
     * <li>0: do not use a delegated administrator account.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DelegateOrNot")
    public Integer delegateOrNot;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in regions inside the Chinese mainland or in the China (Hong Kong) region.</li>
     * <li>ap-southeast-1: Your assets reside in regions outside the Chinese mainland, excluding the China (Hong Kong) region.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DoSelfDelegateRequest build(java.util.Map<String, ?> map) throws Exception {
        DoSelfDelegateRequest self = new DoSelfDelegateRequest();
        return TeaModel.build(map, self);
    }

    public DoSelfDelegateRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DoSelfDelegateRequest setDelegateOrNot(Integer delegateOrNot) {
        this.delegateOrNot = delegateOrNot;
        return this;
    }
    public Integer getDelegateOrNot() {
        return this.delegateOrNot;
    }

    public DoSelfDelegateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
