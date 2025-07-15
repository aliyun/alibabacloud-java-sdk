// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainMultiStreamConfigRequest extends TeaModel {
    /**
     * <p>The main streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pliveplay.gstv.com.cn</p>
     */
    @NameInMap("Domain")
    public String domain;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeLiveDomainMultiStreamConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainMultiStreamConfigRequest self = new DescribeLiveDomainMultiStreamConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainMultiStreamConfigRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeLiveDomainMultiStreamConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
