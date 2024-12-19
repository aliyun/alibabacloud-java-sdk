// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class DeleteDjbhReportRequest extends TeaModel {
    /**
     * <p>Primary key ID of the report.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>26579</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DeleteDjbhReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDjbhReportRequest self = new DeleteDjbhReportRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDjbhReportRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
