// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeFileRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("SpaceId")
    public String spaceId;

    public static DescribeFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileRequest self = new DescribeFileRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFileRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeFileRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
