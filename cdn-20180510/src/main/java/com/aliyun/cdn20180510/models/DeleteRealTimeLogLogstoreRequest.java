// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteRealTimeLogLogstoreRequest extends TeaModel {
    @NameInMap("Logstore")
    public String logstore;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Project")
    public String project;

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

    public DeleteRealTimeLogLogstoreRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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
