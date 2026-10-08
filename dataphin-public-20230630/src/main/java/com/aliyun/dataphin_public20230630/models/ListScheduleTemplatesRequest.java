// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListScheduleTemplatesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListScheduleTemplatesCommand")
    public ListScheduleTemplatesRequestListScheduleTemplatesCommand listScheduleTemplatesCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
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
         * <strong>example:</strong>
         * <p>小时</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
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
