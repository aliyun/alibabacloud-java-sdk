// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class RetryDownloadTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dds-example</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <strong>example:</strong>
     * <p>rm-example</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionCode")
    public String regionCode;

    /**
     * <strong>example:</strong>
     * <p>dt-example</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static RetryDownloadTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryDownloadTaskRequest self = new RetryDownloadTaskRequest();
        return TeaModel.build(map, self);
    }

    public RetryDownloadTaskRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public RetryDownloadTaskRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public RetryDownloadTaskRequest setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public String getRegionCode() {
        return this.regionCode;
    }

    public RetryDownloadTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
