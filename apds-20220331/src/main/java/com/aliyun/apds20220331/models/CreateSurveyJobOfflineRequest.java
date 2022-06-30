// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class CreateSurveyJobOfflineRequest extends TeaModel {
    // 调研渠道
    @NameInMap("channel")
    public String channel;

    @NameInMap("cloudType")
    public String cloudType;

    @NameInMap("fileName")
    public String fileName;

    @NameInMap("name")
    public String name;

    @NameInMap("objectName")
    public String objectName;

    @NameInMap("regionId")
    public String regionId;

    public static CreateSurveyJobOfflineRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSurveyJobOfflineRequest self = new CreateSurveyJobOfflineRequest();
        return TeaModel.build(map, self);
    }

    public CreateSurveyJobOfflineRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public CreateSurveyJobOfflineRequest setCloudType(String cloudType) {
        this.cloudType = cloudType;
        return this;
    }
    public String getCloudType() {
        return this.cloudType;
    }

    public CreateSurveyJobOfflineRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateSurveyJobOfflineRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSurveyJobOfflineRequest setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }
    public String getObjectName() {
        return this.objectName;
    }

    public CreateSurveyJobOfflineRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
