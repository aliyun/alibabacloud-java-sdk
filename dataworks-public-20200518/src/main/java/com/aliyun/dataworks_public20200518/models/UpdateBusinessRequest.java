// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateBusinessRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    @NameInMap("BusinessName")
    public String businessName;

    @NameInMap("Description")
    public String description;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("BusinessId")
    @Validation(required = true)
    public Long businessId;

    public static UpdateBusinessRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBusinessRequest self = new UpdateBusinessRequest();
        return TeaModel.build(map, self);
    }

}
