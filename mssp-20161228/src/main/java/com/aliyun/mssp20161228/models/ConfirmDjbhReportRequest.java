// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class ConfirmDjbhReportRequest extends TeaModel {
    /**
     * <p>Primary key ID of the report.</p>
     * 
     * <strong>example:</strong>
     * <p>24563</p>
     */
    @NameInMap("Id")
    public Long id;

    public static ConfirmDjbhReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmDjbhReportRequest self = new ConfirmDjbhReportRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmDjbhReportRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
