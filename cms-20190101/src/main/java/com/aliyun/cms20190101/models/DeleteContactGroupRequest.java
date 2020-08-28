// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteContactGroupRequest extends TeaModel {
    @NameInMap("ContactGroupName")
    @Validation(required = true)
    public String contactGroupName;

    public static DeleteContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactGroupRequest self = new DeleteContactGroupRequest();
        return TeaModel.build(map, self);
    }

}
