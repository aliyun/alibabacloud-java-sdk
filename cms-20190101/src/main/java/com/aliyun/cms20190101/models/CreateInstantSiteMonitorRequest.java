// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateInstantSiteMonitorRequest extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("IspCities")
    public String ispCities;

    @NameInMap("OptionsJson")
    public String optionsJson;

    @NameInMap("RandomIspCity")
    public Integer randomIspCity;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TaskType")
    public String taskType;

    public static CreateInstantSiteMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstantSiteMonitorRequest self = new CreateInstantSiteMonitorRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstantSiteMonitorRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CreateInstantSiteMonitorRequest setIspCities(String ispCities) {
        this.ispCities = ispCities;
        return this;
    }
    public String getIspCities() {
        return this.ispCities;
    }

    public CreateInstantSiteMonitorRequest setOptionsJson(String optionsJson) {
        this.optionsJson = optionsJson;
        return this;
    }
    public String getOptionsJson() {
        return this.optionsJson;
    }

    public CreateInstantSiteMonitorRequest setRandomIspCity(Integer randomIspCity) {
        this.randomIspCity = randomIspCity;
        return this;
    }
    public Integer getRandomIspCity() {
        return this.randomIspCity;
    }

    public CreateInstantSiteMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateInstantSiteMonitorRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateInstantSiteMonitorRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
