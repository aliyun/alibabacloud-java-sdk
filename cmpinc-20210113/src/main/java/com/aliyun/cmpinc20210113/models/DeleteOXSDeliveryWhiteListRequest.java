// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmpinc20210113.models;

import com.aliyun.tea.*;

public class DeleteOXSDeliveryWhiteListRequest extends TeaModel {
    @NameInMap("IdcName")
    public String idcName;

    @NameInMap("TaskId")
    public Long taskId;

    public static DeleteOXSDeliveryWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOXSDeliveryWhiteListRequest self = new DeleteOXSDeliveryWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOXSDeliveryWhiteListRequest setIdcName(String idcName) {
        this.idcName = idcName;
        return this;
    }
    public String getIdcName() {
        return this.idcName;
    }

    public DeleteOXSDeliveryWhiteListRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
