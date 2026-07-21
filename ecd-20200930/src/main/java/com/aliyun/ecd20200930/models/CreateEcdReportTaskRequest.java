// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateEcdReportTaskRequest extends TeaModel {
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>The list of filter conditions for query results. The filter condition objects have a logical AND (&amp;) relationship.
     * Each filter condition contains FilterKey and FilterValues, which represent the filter condition name and specific values.</p>
     */
    @NameInMap("FilterList")
    public java.util.List<CreateEcdReportTaskRequestFilterList> filterList;

    /**
     * <p>The report language type. This is an enumerated value.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("LangType")
    public String langType;

    /**
     * <p>The report file name.</p>
     * 
     * <strong>example:</strong>
     * <p>Test report name</p>
     */
    @NameInMap("ReportFileName")
    public String reportFileName;

    /**
     * <p>The report task subtype.
     * [_single.params.SubType.enum.  DESKTOP]Cloud computer</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DESKTOP</p>
     */
    @NameInMap("SubType")
    public String subType;

    /**
     * <p>The report task type.</p>
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
         * <p>The report query filter condition. The valid values vary based on the SubType value:</p>
         * <ol>
         * <li>Cloud computer report</li>
         * </ol>
         * <ul>
         * <li>KeyWord: automatic keyword recognition for cloud computers.</li>
         * <li>RegionId: the region ID.</li>
         * <li>DesktopId: the cloud computer ID.</li>
         * <li>DesktopName: the cloud computer name (fuzzy match).</li>
         * <li>OfficeSiteId: the office network ID.</li>
         * <li>OfficeSiteName: the office network name (fuzzy match).</li>
         * <li>Status: the cloud computer status.</li>
         * <li>DesktopType: the desktop specifications.</li>
         * <li>DesktopIP: the cloud computer IP address.</li>
         * <li>SubPayType: the billing method.</li>
         * <li>EndUserId: the username (fuzzy match).</li>
         * <li>ExpireTime: the expiration time in the yyyy-MM-dd\&quot;T\&quot;HH:mm:ss\&quot;Z\&quot; format.</li>
         * <li>IncludeAssignedUser: specifies whether users are assigned.</li>
         * <li>ResourceGroupId: the resource group ID.</li>
         * <li>PolicyId: the policy ID.</li>
         * <li>Tag:{Tag Key}: the cloud computer tag. To query by multiple tags, pass in multiple Filter objects.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Tag:TestKey</p>
         */
        @NameInMap("FilterKey")
        public String filterKey;

        /**
         * <p>The values of the filter condition.
         * When FilterKey is set to one of the following values, only the first value in FilterValues is used:</p>
         * <ul>
         * <li>KeyWord</li>
         * <li>DesktopName</li>
         * <li>OfficeSiteName</li>
         * <li>DesktopIP</li>
         * <li>EndUserId</li>
         * <li>ExpireTime</li>
         * <li>IncludeAssignedUser</li>
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
