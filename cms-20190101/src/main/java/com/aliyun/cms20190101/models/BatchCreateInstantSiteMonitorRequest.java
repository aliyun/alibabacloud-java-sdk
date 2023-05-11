// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class BatchCreateInstantSiteMonitorRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskList")
    public java.util.List<BatchCreateInstantSiteMonitorRequestTaskList> taskList;

    public static BatchCreateInstantSiteMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateInstantSiteMonitorRequest self = new BatchCreateInstantSiteMonitorRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateInstantSiteMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public BatchCreateInstantSiteMonitorRequest setTaskList(java.util.List<BatchCreateInstantSiteMonitorRequestTaskList> taskList) {
        this.taskList = taskList;
        return this;
    }
    public java.util.List<BatchCreateInstantSiteMonitorRequestTaskList> getTaskList() {
        return this.taskList;
    }

    public static class BatchCreateInstantSiteMonitorRequestTaskList extends TeaModel {
        /**
         * <p>The HTTP status code.</p>
         * <br>
         * <p>>  The status code 200 indicates that the call was successful.</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The ID of the site monitoring task.</p>
         */
        @NameInMap("IspCities")
        public String ispCities;

        /**
         * <p>The detection points. If you leave this parameter empty, the system randomly selects three detection points.</p>
         * <br>
         * <p>The value is a `JSON array`. Example: `{"city":"546","isp":"465"},{"city":"572","isp":"465"},{"city":"738","isp":"465"}`. The values of the city field indicate Beijing, Hangzhou, and Qingdao.</p>
         * <br>
         * <p>For information about how to obtain detection points, see [DescribeSiteMonitorISPCityList](~~115045~~).</p>
         */
        @NameInMap("OptionsJson")
        public String optionsJson;

        /**
         * <p>The operation that you want to perform. Set the value to **BatchCreateInstantSiteMonitor**.</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The name of the site monitoring task.</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static BatchCreateInstantSiteMonitorRequestTaskList build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateInstantSiteMonitorRequestTaskList self = new BatchCreateInstantSiteMonitorRequestTaskList();
            return TeaModel.build(map, self);
        }

        public BatchCreateInstantSiteMonitorRequestTaskList setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public BatchCreateInstantSiteMonitorRequestTaskList setIspCities(String ispCities) {
            this.ispCities = ispCities;
            return this;
        }
        public String getIspCities() {
            return this.ispCities;
        }

        public BatchCreateInstantSiteMonitorRequestTaskList setOptionsJson(String optionsJson) {
            this.optionsJson = optionsJson;
            return this;
        }
        public String getOptionsJson() {
            return this.optionsJson;
        }

        public BatchCreateInstantSiteMonitorRequestTaskList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public BatchCreateInstantSiteMonitorRequestTaskList setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
