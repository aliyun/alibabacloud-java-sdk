// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class BatchCreateOnceSiteMonitorRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskList")
    public java.util.List<BatchCreateOnceSiteMonitorRequestTaskList> taskList;

    public static BatchCreateOnceSiteMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateOnceSiteMonitorRequest self = new BatchCreateOnceSiteMonitorRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateOnceSiteMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public BatchCreateOnceSiteMonitorRequest setTaskList(java.util.List<BatchCreateOnceSiteMonitorRequestTaskList> taskList) {
        this.taskList = taskList;
        return this;
    }
    public java.util.List<BatchCreateOnceSiteMonitorRequestTaskList> getTaskList() {
        return this.taskList;
    }

    public static class BatchCreateOnceSiteMonitorRequestTaskList extends TeaModel {
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

        public static BatchCreateOnceSiteMonitorRequestTaskList build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateOnceSiteMonitorRequestTaskList self = new BatchCreateOnceSiteMonitorRequestTaskList();
            return TeaModel.build(map, self);
        }

        public BatchCreateOnceSiteMonitorRequestTaskList setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public BatchCreateOnceSiteMonitorRequestTaskList setIspCities(String ispCities) {
            this.ispCities = ispCities;
            return this;
        }
        public String getIspCities() {
            return this.ispCities;
        }

        public BatchCreateOnceSiteMonitorRequestTaskList setOptionsJson(String optionsJson) {
            this.optionsJson = optionsJson;
            return this;
        }
        public String getOptionsJson() {
            return this.optionsJson;
        }

        public BatchCreateOnceSiteMonitorRequestTaskList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public BatchCreateOnceSiteMonitorRequestTaskList setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
