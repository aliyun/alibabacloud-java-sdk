// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class ListSurveyJobsRequest extends TeaModel {
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

    public static ListSurveyJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSurveyJobsRequest self = new ListSurveyJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListSurveyJobsRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ListSurveyJobsRequest setCloudType(String cloudType) {
        this.cloudType = cloudType;
        return this;
    }
    public String getCloudType() {
        return this.cloudType;
    }

    public ListSurveyJobsRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ListSurveyJobsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListSurveyJobsRequest setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }
    public String getObjectName() {
        return this.objectName;
    }

    public ListSurveyJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
