// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteUserDefineRegionRequest extends TeaModel {
    /**
     * <p>The unique ID of the custom namespace. You can call the ListUserDefineRegion operation to query the ID. For more information, see <a href="https://help.aliyun.com/document_detail/149377.html">ListUserDefineRegion</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>2564</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The tag of the custom namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>regiontag</p>
     */
    @NameInMap("RegionTag")
    public String regionTag;

    public static DeleteUserDefineRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserDefineRegionRequest self = new DeleteUserDefineRegionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserDefineRegionRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteUserDefineRegionRequest setRegionTag(String regionTag) {
        this.regionTag = regionTag;
        return this;
    }
    public String getRegionTag() {
        return this.regionTag;
    }

}
