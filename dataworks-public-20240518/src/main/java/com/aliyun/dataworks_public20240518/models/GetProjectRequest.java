// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetProjectRequest extends TeaModel {
    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://dataworks.console.aliyun.com/workspace/list">DataWorks console</a> and go to the Workspace page to query the ID.</p>
     * <p>You must configure this parameter to specify the DataWorks workspace to which the API operation is applied.</p>
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
