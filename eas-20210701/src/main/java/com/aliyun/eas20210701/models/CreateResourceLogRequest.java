// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateResourceLogRequest extends TeaModel {
    /**
     * <p>The Simple Log Service (SLS) Logstore. For more information about how to query Logstores, see <a href="https://help.aliyun.com/document_detail/426970.html">ListLogStores</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>access_log</p>
     */
    @NameInMap("LogStore")
    public String logStore;

    /**
     * <p>The name of the Simple Log Service (SLS) project for the resource group. The project must be created in Simple Log Service in advance. This operation does not support automatic creation of the project. You can call the ListProject operation to query existing projects, or call the CreateProject operation to create a project first.</p>
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
