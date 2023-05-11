// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateInstantSiteMonitorRequest extends TeaModel {
    /**
     * <p>The URL or IP address that you want to test.</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The detection points. If you leave this parameter empty, the system randomly selects three detection points.</p>
     * <br>
     * <p>The value is a `JSON array`. Example: {"city":"546","isp":"465"},{"city":"572","isp":"465"},{"city":"738","isp":"465"}. The values of the city field indicate Beijing, Hangzhou, and Qingdao.</p>
     * <br>
     * <p>For information about how to obtain detection points, see [DescribeSiteMonitorISPCityList](~~115045~~).</p>
     * <br>
     * <p>> You must specify one of the `IspCities` and `RandomIspCity` parameters.</p>
     */
    @NameInMap("IspCities")
    public String ispCities;

    /**
     * <p>The extended options of the protocol that is used by the instant test task. The options vary based on the protocol.</p>
     */
    @NameInMap("OptionsJson")
    public String optionsJson;

    /**
     * <p>The number of detection points.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   You must specify one of the `IspCities` and `RandomIspCity` parameters. If you specify the `RandomIspCity` parameter, the `IspCities` parameter automatically becomes invalid.</p>
     */
    @NameInMap("RandomIspCity")
    public Integer randomIspCity;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the instant test task.</p>
     * <br>
     * <p>The name must be 4 to 100 characters in length, and can contain letters, digits, and underscores (\_).</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The type of the instant test task. Valid values: HTTP, PING, TCP, UDP, and DNS.</p>
     */
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
