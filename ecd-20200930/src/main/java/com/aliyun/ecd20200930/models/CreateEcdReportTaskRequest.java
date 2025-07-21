// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateEcdReportTaskRequest extends TeaModel {
    @NameInMap("FilterList")
    public java.util.List<CreateEcdReportTaskRequestFilterList> filterList;

    /**
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("LangType")
    public String langType;

    @NameInMap("ReportFileName")
    public String reportFileName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DESKTOP</p>
     */
    @NameInMap("SubType")
    public String subType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RESOURCE_REPORT</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static CreateEcdReportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEcdReportTaskRequest self = new CreateEcdReportTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateEcdReportTaskRequest setFilterList(java.util.List<CreateEcdReportTaskRequestFilterList> filterList) {
        this.filterList = filterList;
        return this;
    }
    public java.util.List<CreateEcdReportTaskRequestFilterList> getFilterList() {
        return this.filterList;
    }

    public CreateEcdReportTaskRequest setLangType(String langType) {
        this.langType = langType;
        return this;
    }
    public String getLangType() {
        return this.langType;
    }

    public CreateEcdReportTaskRequest setReportFileName(String reportFileName) {
        this.reportFileName = reportFileName;
        return this;
    }
    public String getReportFileName() {
        return this.reportFileName;
    }

    public CreateEcdReportTaskRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public CreateEcdReportTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public static class CreateEcdReportTaskRequestFilterList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Tag:TestKey</p>
         */
        @NameInMap("FilterKey")
        public String filterKey;

        @NameInMap("FilterValues")
        public java.util.List<String> filterValues;

        public static CreateEcdReportTaskRequestFilterList build(java.util.Map<String, ?> map) throws Exception {
            CreateEcdReportTaskRequestFilterList self = new CreateEcdReportTaskRequestFilterList();
            return TeaModel.build(map, self);
        }

        public CreateEcdReportTaskRequestFilterList setFilterKey(String filterKey) {
            this.filterKey = filterKey;
            return this;
        }
        public String getFilterKey() {
            return this.filterKey;
        }

        public CreateEcdReportTaskRequestFilterList setFilterValues(java.util.List<String> filterValues) {
            this.filterValues = filterValues;
            return this;
        }
        public java.util.List<String> getFilterValues() {
            return this.filterValues;
        }

    }

}
