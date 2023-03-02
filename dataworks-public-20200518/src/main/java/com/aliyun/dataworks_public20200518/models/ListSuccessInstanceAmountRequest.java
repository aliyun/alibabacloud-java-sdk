// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListSuccessInstanceAmountRequest extends TeaModel {
    /**
     * <p>The ID of the DataWorks workspace. You can log on to the DataWorks console and go to the Workspace Management page to obtain the ID.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ListSuccessInstanceAmountRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSuccessInstanceAmountRequest self = new ListSuccessInstanceAmountRequest();
        return TeaModel.build(map, self);
    }

    public ListSuccessInstanceAmountRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
