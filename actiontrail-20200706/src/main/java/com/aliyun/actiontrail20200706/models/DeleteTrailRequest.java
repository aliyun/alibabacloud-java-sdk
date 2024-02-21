// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DeleteTrailRequest extends TeaModel {
    /**
     * <p>The name of the trail that you want to delete.</p>
     * <br>
     * <p>The name must be 6 to 36 characters in length. The name must start with a lowercase letter and can contain lowercase letters, digits, hyphens (-), and underscores (\_).</p>
     * <br>
     * <p>> The name must be unique within your Alibaba Cloud account.</p>
     */
    @NameInMap("Name")
    public String name;

    public static DeleteTrailRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrailRequest self = new DeleteTrailRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTrailRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
