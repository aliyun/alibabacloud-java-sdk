// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetProjectRequest extends TeaModel {
    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://dataworks.console.aliyun.com/workspace/list">DataWorks console</a> and go to the workspace management page to obtain the ID.</p>
     * <p>This parameter specifies the DataWorks workspace for this API call.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Id")
    public Long id;

    public static GetProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProjectRequest self = new GetProjectRequest();
        return TeaModel.build(map, self);
    }

    public GetProjectRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
