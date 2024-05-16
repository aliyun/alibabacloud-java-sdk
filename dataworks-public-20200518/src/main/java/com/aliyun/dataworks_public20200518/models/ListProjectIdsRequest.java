// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListProjectIdsRequest extends TeaModel {
    /**
     * <p>The ID of the specific Alibaba Cloud account. You can log on to the [DataWorks](https://workbench.data.aliyun.com/console) console and move the pointer over the profile picture in the upper-right corner to view the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListProjectIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectIdsRequest self = new ListProjectIdsRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectIdsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
