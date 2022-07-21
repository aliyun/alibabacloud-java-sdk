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
        @NameInMap("Address")
        public String address;

        @NameInMap("IspCities")
        public String ispCities;

        @NameInMap("OptionsJson")
        public String optionsJson;

        @NameInMap("TaskName")
        public String taskName;

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
