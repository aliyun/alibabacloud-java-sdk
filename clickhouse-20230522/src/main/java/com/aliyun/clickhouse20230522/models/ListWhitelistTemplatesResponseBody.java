// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ListWhitelistTemplatesResponseBody extends TeaModel {
    /**
     * <p>The query results.</p>
     */
    @NameInMap("Data")
    public ListWhitelistTemplatesResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListWhitelistTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWhitelistTemplatesResponseBody self = new ListWhitelistTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWhitelistTemplatesResponseBody setData(ListWhitelistTemplatesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListWhitelistTemplatesResponseBodyData getData() {
        return this.data;
    }

    public ListWhitelistTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListWhitelistTemplatesResponseBodyDataTemplatesDbInstances extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-asdfwef</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        public static ListWhitelistTemplatesResponseBodyDataTemplatesDbInstances build(java.util.Map<String, ?> map) throws Exception {
            ListWhitelistTemplatesResponseBodyDataTemplatesDbInstances self = new ListWhitelistTemplatesResponseBodyDataTemplatesDbInstances();
            return TeaModel.build(map, self);
        }

        public ListWhitelistTemplatesResponseBodyDataTemplatesDbInstances setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

    public static class ListWhitelistTemplatesResponseBodyDataTemplates extends TeaModel {
        /**
         * <p>The list of associated instances.</p>
         */
        @NameInMap("DbInstances")
        public java.util.List<ListWhitelistTemplatesResponseBodyDataTemplatesDbInstances> dbInstances;

        /**
         * <p>The IP address whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1,10.0.0.1</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <p>The whitelist template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>g-asdfwem</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The whitelist template name.</p>
         * 
         * <strong>example:</strong>
         * <p>g-asdfwem</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static ListWhitelistTemplatesResponseBodyDataTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListWhitelistTemplatesResponseBodyDataTemplates self = new ListWhitelistTemplatesResponseBodyDataTemplates();
            return TeaModel.build(map, self);
        }

        public ListWhitelistTemplatesResponseBodyDataTemplates setDbInstances(java.util.List<ListWhitelistTemplatesResponseBodyDataTemplatesDbInstances> dbInstances) {
            this.dbInstances = dbInstances;
            return this;
        }
        public java.util.List<ListWhitelistTemplatesResponseBodyDataTemplatesDbInstances> getDbInstances() {
            return this.dbInstances;
        }

        public ListWhitelistTemplatesResponseBodyDataTemplates setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public ListWhitelistTemplatesResponseBodyDataTemplates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListWhitelistTemplatesResponseBodyDataTemplates setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class ListWhitelistTemplatesResponseBodyData extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrPageNumbers")
        public Integer currPageNumbers;

        /**
         * <p>Whether a next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasNext")
        public Boolean hasNext;

        /**
         * <p>Whether a previous page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasPrev")
        public Boolean hasPrev;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The list of whitelist templates.</p>
         */
        @NameInMap("Templates")
        public java.util.List<ListWhitelistTemplatesResponseBodyDataTemplates> templates;

        /**
         * <p>The total number of templates.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalPageNumbers")
        public Integer totalPageNumbers;

        public static ListWhitelistTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWhitelistTemplatesResponseBodyData self = new ListWhitelistTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWhitelistTemplatesResponseBodyData setCurrPageNumbers(Integer currPageNumbers) {
            this.currPageNumbers = currPageNumbers;
            return this;
        }
        public Integer getCurrPageNumbers() {
            return this.currPageNumbers;
        }

        public ListWhitelistTemplatesResponseBodyData setHasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }
        public Boolean getHasNext() {
            return this.hasNext;
        }

        public ListWhitelistTemplatesResponseBodyData setHasPrev(Boolean hasPrev) {
            this.hasPrev = hasPrev;
            return this;
        }
        public Boolean getHasPrev() {
            return this.hasPrev;
        }

        public ListWhitelistTemplatesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListWhitelistTemplatesResponseBodyData setTemplates(java.util.List<ListWhitelistTemplatesResponseBodyDataTemplates> templates) {
            this.templates = templates;
            return this;
        }
        public java.util.List<ListWhitelistTemplatesResponseBodyDataTemplates> getTemplates() {
            return this.templates;
        }

        public ListWhitelistTemplatesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListWhitelistTemplatesResponseBodyData setTotalPageNumbers(Integer totalPageNumbers) {
            this.totalPageNumbers = totalPageNumbers;
            return this;
        }
        public Integer getTotalPageNumbers() {
            return this.totalPageNumbers;
        }

    }

}
