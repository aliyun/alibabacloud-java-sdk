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
         * <p>The URL or IP address that is monitored by the task.</p>
         * <br>
         * <p>>  You must create at least one site monitoring task. You must specify all of the `Address`, `TaskName`, and `TaskType` parameters in each request.</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The detection points. If you leave this parameter empty, the system randomly selects three detection points.</p>
         * <br>
         * <p>The value is a `JSON array`. Example: `{"city":"546","isp":"465"},{"city":"572","isp":"465"},{"city":"738","isp":"465"}`. The values of the city field indicate Beijing, Hangzhou, and Qingdao.</p>
         * <br>
         * <p>For information about how to obtain detection points, see [DescribeSiteMonitorISPCityList](~~115045~~).</p>
         */
        @NameInMap("IspCities")
        public String ispCities;

        /**
         * <p>The extended options of the protocol that is used by the site monitoring task. The options vary based on the protocol.</p>
         */
        @NameInMap("OptionsJson")
        public String optionsJson;

        /**
         * <p>The name of the site monitoring task.</p>
         * <br>
         * <p>The name must be 4 to 100 characters in length, and can contain letters, digits, and underscores (\_).</p>
         * <br>
         * <p>>  You must create at least one site monitoring task. You must specify all of the `Address`, `TaskName`, and `TaskType` parameters in each request.</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The type of the site monitoring task.</p>
         * <br>
         * <p>Valid values: HTTP, PING, TCP, UDP, DNS, SMTP, POP3, and FTP.</p>
         * <br>
         * <p>>  You must create at least one site monitoring task. You must specify all of the `Address`, `TaskName`, and `TaskType` parameters in each request.</p>
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
