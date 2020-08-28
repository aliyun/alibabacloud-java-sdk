// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutContactGroupRequest extends TeaModel {
    @NameInMap("ContactGroupName")
    @Validation(required = true)
    public String contactGroupName;

    @NameInMap("Describe")
    public String describe;

    @NameInMap("ContactNames")
    @Validation(required = true)
    public java.util.List<String> contactNames;

    public static PutContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        PutContactGroupRequest self = new PutContactGroupRequest();
        return TeaModel.build(map, self);
    }

}
