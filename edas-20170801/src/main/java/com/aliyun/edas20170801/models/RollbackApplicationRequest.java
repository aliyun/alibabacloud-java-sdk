// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class RollbackApplicationRequest extends TeaModel {
    /**
     * <p>The application ID. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](https://help.aliyun.com/document_detail/423162.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The number of batches for the rollback. Default value: 1. Valid values: 1 to 5.</p>
     */
    @NameInMap("Batch")
    public Integer batch;

    /**
     * <p>The wait time between batches. Default value: 0. The default value indicates no wait time. Valid values: 0 to 5. Unit: minutes.</p>
     */
    @NameInMap("BatchWaitTime")
    public Integer batchWaitTime;

    /**
     * <p>The application group ID. You can call the ListDeployGroup operation to query the application group ID. For more information, see [ListDeployGroup](https://help.aliyun.com/document_detail/423184.html).</p>
     * <br>
     * <p>If you need to roll back the application in all application groups, set this parameter to `all`.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The historical version to which you want to roll back the application. Call the ListHistoryDeployVersion operation to query the historical versions of the application. Then, set this parameter based on the returned value of `PackageVersion`. For more information, see [ListHistoryDeployVersion](https://help.aliyun.com/document_detail/423163.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("HistoryVersion")
    public String historyVersion;

    public static RollbackApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackApplicationRequest self = new RollbackApplicationRequest();
        return TeaModel.build(map, self);
    }

    public RollbackApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RollbackApplicationRequest setBatch(Integer batch) {
        this.batch = batch;
        return this;
    }
    public Integer getBatch() {
        return this.batch;
    }

    public RollbackApplicationRequest setBatchWaitTime(Integer batchWaitTime) {
        this.batchWaitTime = batchWaitTime;
        return this;
    }
    public Integer getBatchWaitTime() {
        return this.batchWaitTime;
    }

    public RollbackApplicationRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RollbackApplicationRequest setHistoryVersion(String historyVersion) {
        this.historyVersion = historyVersion;
        return this;
    }
    public String getHistoryVersion() {
        return this.historyVersion;
    }

}
