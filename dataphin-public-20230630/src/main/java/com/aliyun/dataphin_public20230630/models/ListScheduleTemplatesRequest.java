// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListScheduleTemplatesRequest extends TeaModel {
    /**
     * <p>The query conditions for the scheduling template list. This is a JSON object that supports keyword search and pagination.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListScheduleTemplatesCommand")
    public ListScheduleTemplatesRequestListScheduleTemplatesCommand listScheduleTemplatesCommand;

    /**
     * <p>The tenant ID, which indicates the tenant for the current operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the user who performs the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static ListScheduleTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScheduleTemplatesRequest self = new ListScheduleTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListScheduleTemplatesRequest setListScheduleTemplatesCommand(ListScheduleTemplatesRequestListScheduleTemplatesCommand listScheduleTemplatesCommand) {
        this.listScheduleTemplatesCommand = listScheduleTemplatesCommand;
        return this;
    }
    public ListScheduleTemplatesRequestListScheduleTemplatesCommand getListScheduleTemplatesCommand() {
        return this.listScheduleTemplatesCommand;
    }

    public ListScheduleTemplatesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListScheduleTemplatesRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class ListScheduleTemplatesRequestListScheduleTemplatesCommand extends TeaModel {
        /**
         * <p>The keyword for fuzzy matching by template name. If this parameter is empty or not specified, no filtering is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>Hour</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>The page number. Pages start from 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page. Default value: 50. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The scheduling templatetype. Valid values:</p>
         * <ul>
         * <li>BASE_SCHEDULE_TEMPLATE: basic scheduling template</li>
         * <li>CONDITION_SCHEDULE_TEMPLATE: conditional scheduling template
         * If this parameter is not specified, all types are returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BASE_SCHEDULE_TEMPLATE</p>
         */
        @NameInMap("ScheduleTemplateType")
        public String scheduleTemplateType;

        public static ListScheduleTemplatesRequestListScheduleTemplatesCommand build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleTemplatesRequestListScheduleTemplatesCommand self = new ListScheduleTemplatesRequestListScheduleTemplatesCommand();
            return TeaModel.build(map, self);
        }

        public ListScheduleTemplatesRequestListScheduleTemplatesCommand setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListScheduleTemplatesRequestListScheduleTemplatesCommand setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListScheduleTemplatesRequestListScheduleTemplatesCommand setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListScheduleTemplatesRequestListScheduleTemplatesCommand setScheduleTemplateType(String scheduleTemplateType) {
            this.scheduleTemplateType = scheduleTemplateType;
            return this;
        }
        public String getScheduleTemplateType() {
            return this.scheduleTemplateType;
        }

    }

}
