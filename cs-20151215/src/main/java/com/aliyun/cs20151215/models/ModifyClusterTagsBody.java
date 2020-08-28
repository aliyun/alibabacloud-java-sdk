// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterTagsBody extends TeaModel {
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static ModifyClusterTagsBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterTagsBody self = new ModifyClusterTagsBody();
        return TeaModel.build(map, self);
    }

}
