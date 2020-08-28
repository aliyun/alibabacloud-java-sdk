// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteBusinessRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    @NameInMap("BusinessId")
    @Validation(required = true)
    public Long businessId;

    public static DeleteBusinessRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBusinessRequest self = new DeleteBusinessRequest();
        return TeaModel.build(map, self);
    }

}
