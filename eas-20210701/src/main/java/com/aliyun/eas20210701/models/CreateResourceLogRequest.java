// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateResourceLogRequest extends TeaModel {
    /**
     * <p>The Logstore of Log Service. For more information about how to query a Logstore, see <a href="https://help.aliyun.com/document_detail/426970.html">ListLogStores</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>access_log</p>
     */
    @NameInMap("LogStore")
    public String logStore;

    /**
     * <p>The Log Service project that is associated with the resource group. For more information about how to query the project, see <a href="https://help.aliyun.com/document_detail/74955.html">ListProject</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-r-asdasdasd-sls</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    public static CreateResourceLogRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceLogRequest self = new CreateResourceLogRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceLogRequest setLogStore(String logStore) {
        this.logStore = logStore;
        return this;
    }
    public String getLogStore() {
        return this.logStore;
    }

    public CreateResourceLogRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
