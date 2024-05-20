// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class DeleteServiceDataByIdsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ids")
    public java.util.List<String> ids;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceId")
    public Long serviceId;

    public static DeleteServiceDataByIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceDataByIdsRequest self = new DeleteServiceDataByIdsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceDataByIdsRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

    public DeleteServiceDataByIdsRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

}
