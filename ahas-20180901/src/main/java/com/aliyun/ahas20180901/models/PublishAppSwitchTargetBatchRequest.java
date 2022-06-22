// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class PublishAppSwitchTargetBatchRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("NameSpace")
    public String nameSpace;

    @NameInMap("PublishOrderId")
    public Long publishOrderId;

    @NameInMap("SwitchName")
    public String switchName;

    @NameInMap("SwitchNameSpace")
    public String switchNameSpace;

    @NameInMap("SwitchValue")
    public String switchValue;

    @NameInMap("TargetBatch")
    public Integer targetBatch;

    public static PublishAppSwitchTargetBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishAppSwitchTargetBatchRequest self = new PublishAppSwitchTargetBatchRequest();
        return TeaModel.build(map, self);
    }

    public PublishAppSwitchTargetBatchRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public PublishAppSwitchTargetBatchRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public PublishAppSwitchTargetBatchRequest setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

    public PublishAppSwitchTargetBatchRequest setPublishOrderId(Long publishOrderId) {
        this.publishOrderId = publishOrderId;
        return this;
    }
    public Long getPublishOrderId() {
        return this.publishOrderId;
    }

    public PublishAppSwitchTargetBatchRequest setSwitchName(String switchName) {
        this.switchName = switchName;
        return this;
    }
    public String getSwitchName() {
        return this.switchName;
    }

    public PublishAppSwitchTargetBatchRequest setSwitchNameSpace(String switchNameSpace) {
        this.switchNameSpace = switchNameSpace;
        return this;
    }
    public String getSwitchNameSpace() {
        return this.switchNameSpace;
    }

    public PublishAppSwitchTargetBatchRequest setSwitchValue(String switchValue) {
        this.switchValue = switchValue;
        return this;
    }
    public String getSwitchValue() {
        return this.switchValue;
    }

    public PublishAppSwitchTargetBatchRequest setTargetBatch(Integer targetBatch) {
        this.targetBatch = targetBatch;
        return this;
    }
    public Integer getTargetBatch() {
        return this.targetBatch;
    }

}
