// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateEcdReportTaskRequest extends TeaModel {
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>The filter conditions for filtering query results. The logical relationship between each filter condition is &quot;and&quot; (&amp;). Each filter condition contains FilterKey and FilterValues, which indicate the key and value for the filter condition.</p>
     */
    @NameInMap("FilterList")
    public java.util.List<CreateEcdReportTaskRequestFilterList> filterList;

    /**
     * <p>The language of the report. An enumerated type.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("LangType")
    public String langType;

    /**
     * <p>The name of the report file.</p>
     * 
     * <strong>example:</strong>
     * <p>Test report name</p>
     */
    @NameInMap("ReportFileName")
    public String reportFileName;

    /**
     * <p>The sub-type of the report export task.</p>
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

    public CreateEcdReportTaskRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
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
         * <li><p>KeyWord: cloud computer keyword (supports automatic recognition)</p>
         * </li>
         * <li><p>RegionId: region ID</p>
         * </li>
         * <li><p>DesktopId: cloud computer ID</p>
         * </li>
         * <li><p>DesktopName: cloud computer name (supports fuzzy matching)</p>
         * </li>
         * <li><p>OfficeSiteId: office network ID</p>
         * </li>
         * <li><p>OfficeSiteName: office network name (supports fuzzy matching)</p>
         * </li>
         * <li><p>Status: cloud computer status</p>
         * </li>
         * <li><p>DesktopType: desktop type</p>
         * </li>
         * <li><p>DesktopIP: cloud computer IP address</p>
         * </li>
         * <li><p>SubPayType: billing method</p>
         * </li>
         * <li><p>EndUserId: user name (supports fuzzy matching)</p>
         * </li>
         * <li><p>ExpireTime: expiration date and time, in the yyyy-MM-dd\&quot;T\&quot;HH:mm:ss\&quot;Z\&quot; format</p>
         * </li>
         * <li><p>IncludeAssignedUser: indicates whether the cloud computer is assigned to users or not</p>
         * </li>
         * <li><p>ResourceGroupId: resource group ID</p>
         * </li>
         * <li><p>PolicyId: policy ID</p>
         * </li>
         * <li><p>Tag:{Tag Key value}: cloud computer tag (To filter data using multiple tags, specify multiple filter condition objects.)</p>
         * </li>
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
         * <li><p>KeyWord</p>
         * </li>
         * <li><p>DesktopName</p>
         * </li>
         * <li><p>OfficeSiteName</p>
         * </li>
         * <li><p>DesktopIP</p>
         * </li>
         * <li><p>EndUserId</p>
         * </li>
         * <li><p>ExpireTime</p>
         * </li>
         * <li><p>IncludeAssignedUser</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Test cloud desktop name</p>
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
