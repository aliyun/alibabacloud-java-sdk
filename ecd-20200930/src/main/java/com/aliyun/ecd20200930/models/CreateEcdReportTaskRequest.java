// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateEcdReportTaskRequest extends TeaModel {
    /**
     * <p>The filter conditions for filtering query results. The logical relationship between each filter condition is &quot;and&quot; (&amp;). Each filter condition contains FilterKey and FilterValues, which indicate the key and value for the filter condition.</p>
     */
    @NameInMap("FilterList")
    public java.util.List<CreateEcdReportTaskRequestFilterList> filterList;

    /**
     * <p>The language of the report. An enumerated type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>zh-CN (default): Chinese</li>
     * <li>en-GB: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("LangType")
    public String langType;

    /**
     * <p>The name of the report file.</p>
     */
    @NameInMap("ReportFileName")
    public String reportFileName;

    /**
     * <p>The sub-type of the report export task.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>DESKTOP: cloud computer</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DESKTOP</p>
     */
    @NameInMap("SubType")
    public String subType;

    /**
     * <p>The type of the report task.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>RESOURCE_REPORT</li>
     * </ul>
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
         * <p>The key of the filter condition for filtering query results. When SubType is set to:</p>
         * <ol>
         * <li>DESKTOP (indicating a cloud computer report), the following filter conditions are available:</li>
         * </ol>
         * <ul>
         * <li>KeyWord: cloud computer keyword (supports automatic recognition)</li>
         * <li>RegionId: region ID</li>
         * <li>DesktopId: cloud computer ID</li>
         * <li>DesktopName: cloud computer name (supports fuzzy matching)</li>
         * <li>OfficeSiteId: office network ID</li>
         * <li>OfficeSiteName: office network name (supports fuzzy matching)</li>
         * <li>Status: cloud computer status</li>
         * <li>DesktopType: desktop type</li>
         * <li>DesktopIP: cloud computer IP address</li>
         * <li>SubPayType: billing method</li>
         * <li>EndUserId: user name (supports fuzzy matching)</li>
         * <li>ExpireTime: expiration date and time, in the yyyy-MM-dd\&quot;T\&quot;HH:mm:ss\&quot;Z\&quot; format</li>
         * <li>IncludeAssignedUser: indicates whether the cloud computer is assigned to users or not</li>
         * <li>ResourceGroupId: resource group ID</li>
         * <li>PolicyId: policy ID</li>
         * <li>Tag:{Tag Key value}: cloud computer tag (To filter data using multiple tags, specify multiple filter condition objects.)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Tag:TestKey</p>
         */
        @NameInMap("FilterKey")
        public String filterKey;

        /**
         * <p>The value of the filter condition. Only the first value of the FilterValues parameter is used, if FilterKey is set to one of the following values:</p>
         * <ul>
         * <li>KeyWord</li>
         * <li>DesktopName</li>
         * <li>OfficeSiteName</li>
         * <li>DesktopIP</li>
         * <li>EndUserId</li>
         * <li>ExpireTime</li>
         * <li>IncludeAssignedUser</li>
         * </ul>
         */
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
