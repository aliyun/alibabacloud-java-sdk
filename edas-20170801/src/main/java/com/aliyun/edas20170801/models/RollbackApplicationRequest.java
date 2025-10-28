// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class RollbackApplicationRequest extends TeaModel {
    /**
     * <p>The application ID. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/423162.html">ListApplication</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3616cdca-4f92-4413-************</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The number of batches for the rollback. Default value: 1. Valid values: 1 to 5.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Batch")
    public Integer batch;

    /**
     * <p>The wait time between batches. Default value: 0. The default value indicates no wait time. Valid values: 0 to 5. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BatchWaitTime")
    public Integer batchWaitTime;

    /**
     * <p>The application group ID. You can call the ListDeployGroup operation to query the application group ID. For more information, see <a href="https://help.aliyun.com/document_detail/423184.html">ListDeployGroup</a>.</p>
     * <p>If you need to roll back the application in all application groups, set this parameter to <code>all</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8123db90-880f-48***************</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The historical version to which you want to roll back the application. Call the ListHistoryDeployVersion operation to query the historical versions of the application. Then, set this parameter based on the returned value of <code>PackageVersion</code>. For more information, see <a href="https://help.aliyun.com/document_detail/423163.html">ListHistoryDeployVersion</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-11-13 14:22:22</p>
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
