// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DeleteAutomateResponseConfigRequest extends TeaModel {
    /**
     * <p>The ID of the rule.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions in China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteAutomateResponseConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutomateResponseConfigRequest self = new DeleteAutomateResponseConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAutomateResponseConfigRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteAutomateResponseConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
