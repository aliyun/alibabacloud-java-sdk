// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListAccountAccessIdRequest extends TeaModel {
    /**
     * <p>The code of the cloud service provider.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   qcloud</p>
     * <p>*   hcloud</p>
     */
    @NameInMap("CloudCode")
    public String cloudCode;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions in China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListAccountAccessIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccountAccessIdRequest self = new ListAccountAccessIdRequest();
        return TeaModel.build(map, self);
    }

    public ListAccountAccessIdRequest setCloudCode(String cloudCode) {
        this.cloudCode = cloudCode;
        return this;
    }
    public String getCloudCode() {
        return this.cloudCode;
    }

    public ListAccountAccessIdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
