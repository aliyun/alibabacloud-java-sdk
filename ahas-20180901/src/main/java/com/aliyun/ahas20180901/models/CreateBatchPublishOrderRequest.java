// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CreateBatchPublishOrderRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("BatchNum")
    public Integer batchNum;

    @NameInMap("NameSpace")
    public String nameSpace;

    @NameInMap("PauseType")
    public String pauseType;

    @NameInMap("SwitchName")
    public String switchName;

    @NameInMap("SwitchNameSpace")
    public String switchNameSpace;

    @NameInMap("SwitchValue")
    public String switchValue;

    public static CreateBatchPublishOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchPublishOrderRequest self = new CreateBatchPublishOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateBatchPublishOrderRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public CreateBatchPublishOrderRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateBatchPublishOrderRequest setBatchNum(Integer batchNum) {
        this.batchNum = batchNum;
        return this;
    }
    public Integer getBatchNum() {
        return this.batchNum;
    }

    public CreateBatchPublishOrderRequest setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

    public CreateBatchPublishOrderRequest setPauseType(String pauseType) {
        this.pauseType = pauseType;
        return this;
    }
    public String getPauseType() {
        return this.pauseType;
    }

    public CreateBatchPublishOrderRequest setSwitchName(String switchName) {
        this.switchName = switchName;
        return this;
    }
    public String getSwitchName() {
        return this.switchName;
    }

    public CreateBatchPublishOrderRequest setSwitchNameSpace(String switchNameSpace) {
        this.switchNameSpace = switchNameSpace;
        return this;
    }
    public String getSwitchNameSpace() {
        return this.switchNameSpace;
    }

    public CreateBatchPublishOrderRequest setSwitchValue(String switchValue) {
        this.switchValue = switchValue;
        return this;
    }
    public String getSwitchValue() {
        return this.switchValue;
    }

}
