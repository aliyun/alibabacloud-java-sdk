// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class UpdateAutoResourceOptimizeConfigRequest extends TeaModel {
    @NameInMap("AccessKey")
    public String accessKey;

    @NameInMap("AutoDefragment")
    public Integer autoDefragment;

    @NameInMap("AutoDuplicateIndexDelete")
    public Integer autoDuplicateIndexDelete;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Signature")
    public String signature;

    @NameInMap("TableFragmentationRatio")
    public Float tableFragmentationRatio;

    @NameInMap("TableSpaceSize")
    public Float tableSpaceSize;

    @NameInMap("Uid")
    public String uid;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("__context")
    public String context;

    public static UpdateAutoResourceOptimizeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoResourceOptimizeConfigRequest self = new UpdateAutoResourceOptimizeConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAutoResourceOptimizeConfigRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public UpdateAutoResourceOptimizeConfigRequest setAutoDefragment(Integer autoDefragment) {
        this.autoDefragment = autoDefragment;
        return this;
    }
    public Integer getAutoDefragment() {
        return this.autoDefragment;
    }

    public UpdateAutoResourceOptimizeConfigRequest setAutoDuplicateIndexDelete(Integer autoDuplicateIndexDelete) {
        this.autoDuplicateIndexDelete = autoDuplicateIndexDelete;
        return this;
    }
    public Integer getAutoDuplicateIndexDelete() {
        return this.autoDuplicateIndexDelete;
    }

    public UpdateAutoResourceOptimizeConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateAutoResourceOptimizeConfigRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public UpdateAutoResourceOptimizeConfigRequest setTableFragmentationRatio(Float tableFragmentationRatio) {
        this.tableFragmentationRatio = tableFragmentationRatio;
        return this;
    }
    public Float getTableFragmentationRatio() {
        return this.tableFragmentationRatio;
    }

    public UpdateAutoResourceOptimizeConfigRequest setTableSpaceSize(Float tableSpaceSize) {
        this.tableSpaceSize = tableSpaceSize;
        return this;
    }
    public Float getTableSpaceSize() {
        return this.tableSpaceSize;
    }

    public UpdateAutoResourceOptimizeConfigRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public UpdateAutoResourceOptimizeConfigRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UpdateAutoResourceOptimizeConfigRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

}
