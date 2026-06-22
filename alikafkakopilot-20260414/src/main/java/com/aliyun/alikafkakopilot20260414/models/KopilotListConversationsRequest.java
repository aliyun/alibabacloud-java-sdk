// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkakopilot20260414.models;

import com.aliyun.tea.*;

public class KopilotListConversationsRequest extends TeaModel {
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Size")
    public Integer size;

    public static KopilotListConversationsRequest build(java.util.Map<String, ?> map) throws Exception {
        KopilotListConversationsRequest self = new KopilotListConversationsRequest();
        return TeaModel.build(map, self);
    }

    public KopilotListConversationsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public KopilotListConversationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public KopilotListConversationsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
