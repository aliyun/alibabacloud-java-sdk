// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteRealTimeLogLogstoreRequest extends TeaModel {
    /**
     * <p>The name of the Logstore to which log entries are delivered.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LogstoreName</p>
     */
    @NameInMap("Logstore")
    public String logstore;

    /**
     * <p>The name of the Log Service project that is used for real-time log delivery.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ProjectName</p>
     */
    @NameInMap("Project")
    public String project;

    /**
     * <p>The ID of the region where the Log Service project is deployed. For more information, see <a href="https://help.aliyun.com/document_detail/144883.html">Regions that support real-time log delivery</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    public static DeleteRealTimeLogLogstoreRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRealTimeLogLogstoreRequest self = new DeleteRealTimeLogLogstoreRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRealTimeLogLogstoreRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public DeleteRealTimeLogLogstoreRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DeleteRealTimeLogLogstoreRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
