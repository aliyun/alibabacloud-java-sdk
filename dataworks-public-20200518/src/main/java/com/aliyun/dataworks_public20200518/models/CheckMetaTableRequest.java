// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CheckMetaTableRequest extends TeaModel {
    @NameInMap("TableGuid")
    @Validation(required = true)
    public String tableGuid;

    public static CheckMetaTableRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckMetaTableRequest self = new CheckMetaTableRequest();
        return TeaModel.build(map, self);
    }

}
