// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodeIORequest extends TeaModel {
    @NameInMap("NodeId")
    @Validation(required = true)
    public Long nodeId;

    @NameInMap("ProjectEnv")
    @Validation(required = true)
    public String projectEnv;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    public static ListNodeIORequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodeIORequest self = new ListNodeIORequest();
        return TeaModel.build(map, self);
    }

}
