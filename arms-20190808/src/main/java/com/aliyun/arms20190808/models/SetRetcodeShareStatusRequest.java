// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SetRetcodeShareStatusRequest extends TeaModel {
    @NameInMap("Pid")
    @Validation(required = true)
    public String pid;

    @NameInMap("Status")
    @Validation(required = true)
    public Boolean status;

    public static SetRetcodeShareStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetRetcodeShareStatusRequest self = new SetRetcodeShareStatusRequest();
        return TeaModel.build(map, self);
    }

}
