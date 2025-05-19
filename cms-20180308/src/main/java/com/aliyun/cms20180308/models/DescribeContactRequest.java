// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DescribeContactRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeContactRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContactRequest self = new DescribeContactRequest();
        return TeaModel.build(map, self);
    }

    public DescribeContactRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public DescribeContactRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
