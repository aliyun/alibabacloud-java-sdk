// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class BatchCreateIntantSiteMonitorRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskList")
    public java.util.List<BatchCreateIntantSiteMonitorRequestTaskList> taskList;

    public static BatchCreateIntantSiteMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateIntantSiteMonitorRequest self = new BatchCreateIntantSiteMonitorRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateIntantSiteMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public BatchCreateIntantSiteMonitorRequest setTaskList(java.util.List<BatchCreateIntantSiteMonitorRequestTaskList> taskList) {
        this.taskList = taskList;
        return this;
    }
    public java.util.List<BatchCreateIntantSiteMonitorRequestTaskList> getTaskList() {
        return this.taskList;
    }

    public static class BatchCreateIntantSiteMonitorRequestTaskList extends TeaModel {
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

        public static BatchCreateIntantSiteMonitorRequestTaskList build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateIntantSiteMonitorRequestTaskList self = new BatchCreateIntantSiteMonitorRequestTaskList();
            return TeaModel.build(map, self);
        }

        public BatchCreateIntantSiteMonitorRequestTaskList setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public BatchCreateIntantSiteMonitorRequestTaskList setIspCities(String ispCities) {
            this.ispCities = ispCities;
            return this;
        }
        public String getIspCities() {
            return this.ispCities;
        }

        public BatchCreateIntantSiteMonitorRequestTaskList setOptionsJson(String optionsJson) {
            this.optionsJson = optionsJson;
            return this;
        }
        public String getOptionsJson() {
            return this.optionsJson;
        }

        public BatchCreateIntantSiteMonitorRequestTaskList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public BatchCreateIntantSiteMonitorRequestTaskList setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
