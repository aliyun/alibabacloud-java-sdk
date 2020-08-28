// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCommandsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("CommandId")
    public String commandId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("Type")
    public String type;

    @NameInMap("ContentEncoding")
    public String contentEncoding;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    public static DescribeCommandsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommandsRequest self = new DescribeCommandsRequest();
        return TeaModel.build(map, self);
    }

}
