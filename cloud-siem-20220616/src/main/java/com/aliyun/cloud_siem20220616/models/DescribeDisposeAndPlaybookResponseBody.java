// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeDisposeAndPlaybookResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeDisposeAndPlaybookResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeDisposeAndPlaybookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisposeAndPlaybookResponseBody self = new DescribeDisposeAndPlaybookResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDisposeAndPlaybookResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeDisposeAndPlaybookResponseBody setData(DescribeDisposeAndPlaybookResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDisposeAndPlaybookResponseBodyData getData() {
        return this.data;
    }

    public DescribeDisposeAndPlaybookResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDisposeAndPlaybookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDisposeAndPlaybookResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDisposeAndPlaybookResponseBodyDataPageInfo extends TeaModel {
        /**
         * <p>The current page number.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeDisposeAndPlaybookResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisposeAndPlaybookResponseBodyDataPageInfo self = new DescribeDisposeAndPlaybookResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDisposeAndPlaybookResponseBodyDataPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeDisposeAndPlaybookResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeDisposeAndPlaybookResponseBodyDataPageInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeDisposeAndPlaybookResponseBodyDataResponseDataPlaybookList extends TeaModel {
        /**
         * <p>The playbook description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name of the playbook.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The playbook name, which is the unique identifier of the playbook.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The opcode of the playbook, which corresponds to the opcode of the playbook recommended for entity handling.</p>
         */
        @NameInMap("OpCode")
        public String opCode;

        /**
         * <p>Indicates whether quick event handling is selected by default. Valid values:</p>
         * <br>
         * <p>*   2: Quick event handling is selected.</p>
         * <p>*   1: Quick event handling is displayed but not selected.</p>
         */
        @NameInMap("OpLevel")
        public String opLevel;

        /**
         * <p>The opcode configuration.</p>
         */
        @NameInMap("TaskConfig")
        public String taskConfig;

        /**
         * <p>Indicates whether the playbook is intended for Web Application Firewall (WAF). Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("WafPlaybook")
        public Boolean wafPlaybook;

        public static DescribeDisposeAndPlaybookResponseBodyDataResponseDataPlaybookList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisposeAndPlaybookResponseBodyDataResponseDataPlaybookList self = new DescribeDisposeAndPlaybookResponseBodyDataResponseDataPlaybookList();
            return TeaModel.build(map, self);
        }

        public DescribeDisposeAndPlaybookResponseBodyDataResponseDataPlaybookList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDisposeAndPlaybookResponseBodyDataResponseDataPlaybookList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeDisposeAndPlaybookResponseBodyDataResponseDataPlaybookList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDisposeAndPlaybookResponseBodyDataResponseDataPlaybookList setOpCode(String opCode) {
            this.opCode = opCode;
            return this;
        }
        public String getOpCode() {
            return this.opCode;
        }

        public DescribeDisposeAndPlaybookResponseBodyDataResponseDataPlaybookList setOpLevel(String opLevel) {
            this.opLevel = opLevel;
            return this;
        }
        public String getOpLevel() {
            return this.opLevel;
        }

        public DescribeDisposeAndPlaybookResponseBodyDataResponseDataPlaybookList setTaskConfig(String taskConfig) {
            this.taskConfig = taskConfig;
            return this;
        }
        public String getTaskConfig() {
            return this.taskConfig;
        }

        public DescribeDisposeAndPlaybookResponseBodyDataResponseDataPlaybookList setWafPlaybook(Boolean wafPlaybook) {
            this.wafPlaybook = wafPlaybook;
            return this;
        }
        public Boolean getWafPlaybook() {
            return this.wafPlaybook;
        }

    }

    public static class DescribeDisposeAndPlaybookResponseBodyDataResponseData extends TeaModel {
        /**
         * <p>The number of alerts that are associated with the entity.</p>
         */
        @NameInMap("AlertNum")
        public Integer alertNum;

        /**
         * <p>The object for handling.</p>
         */
        @NameInMap("Dispose")
        public String dispose;

        /**
         * <p>The entity ID</p>
         */
        @NameInMap("EntityId")
        public Long entityId;

        /**
         * <p>The entity information.</p>
         */
        @NameInMap("EntityInfo")
        public java.util.Map<String, ?> entityInfo;

        /**
         * <p>The key-value pairs each of which consists of opcode and oplevel.</p>
         */
        @NameInMap("OpcodeMap")
        public java.util.Map<String, String> opcodeMap;

        /**
         * <p>An array consisting of the codes of playbooks that are recommended for entity handling.</p>
         */
        @NameInMap("OpcodeSet")
        public java.util.List<String> opcodeSet;

        /**
         * <p>The playbooks that can handle the entity.</p>
         */
        @NameInMap("PlaybookList")
        public java.util.List<DescribeDisposeAndPlaybookResponseBodyDataResponseDataPlaybookList> playbookList;

        /**
         * <p>An array consisting of the IDs of the users who can handle objects.</p>
         */
        @NameInMap("Scope")
        public java.util.List<?> scope;

        public static DescribeDisposeAndPlaybookResponseBodyDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisposeAndPlaybookResponseBodyDataResponseData self = new DescribeDisposeAndPlaybookResponseBodyDataResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeDisposeAndPlaybookResponseBodyDataResponseData setAlertNum(Integer alertNum) {
            this.alertNum = alertNum;
            return this;
        }
        public Integer getAlertNum() {
            return this.alertNum;
        }

        public DescribeDisposeAndPlaybookResponseBodyDataResponseData setDispose(String dispose) {
            this.dispose = dispose;
            return this;
        }
        public String getDispose() {
            return this.dispose;
        }

        public DescribeDisposeAndPlaybookResponseBodyDataResponseData setEntityId(Long entityId) {
            this.entityId = entityId;
            return this;
        }
        public Long getEntityId() {
            return this.entityId;
        }

        public DescribeDisposeAndPlaybookResponseBodyDataResponseData setEntityInfo(java.util.Map<String, ?> entityInfo) {
            this.entityInfo = entityInfo;
            return this;
        }
        public java.util.Map<String, ?> getEntityInfo() {
            return this.entityInfo;
        }

        public DescribeDisposeAndPlaybookResponseBodyDataResponseData setOpcodeMap(java.util.Map<String, String> opcodeMap) {
            this.opcodeMap = opcodeMap;
            return this;
        }
        public java.util.Map<String, String> getOpcodeMap() {
            return this.opcodeMap;
        }

        public DescribeDisposeAndPlaybookResponseBodyDataResponseData setOpcodeSet(java.util.List<String> opcodeSet) {
            this.opcodeSet = opcodeSet;
            return this;
        }
        public java.util.List<String> getOpcodeSet() {
            return this.opcodeSet;
        }

        public DescribeDisposeAndPlaybookResponseBodyDataResponseData setPlaybookList(java.util.List<DescribeDisposeAndPlaybookResponseBodyDataResponseDataPlaybookList> playbookList) {
            this.playbookList = playbookList;
            return this;
        }
        public java.util.List<DescribeDisposeAndPlaybookResponseBodyDataResponseDataPlaybookList> getPlaybookList() {
            return this.playbookList;
        }

        public DescribeDisposeAndPlaybookResponseBodyDataResponseData setScope(java.util.List<?> scope) {
            this.scope = scope;
            return this;
        }
        public java.util.List<?> getScope() {
            return this.scope;
        }

    }

    public static class DescribeDisposeAndPlaybookResponseBodyData extends TeaModel {
        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("PageInfo")
        public DescribeDisposeAndPlaybookResponseBodyDataPageInfo pageInfo;

        /**
         * <p>The detailed data</p>
         */
        @NameInMap("ResponseData")
        public java.util.List<DescribeDisposeAndPlaybookResponseBodyDataResponseData> responseData;

        public static DescribeDisposeAndPlaybookResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisposeAndPlaybookResponseBodyData self = new DescribeDisposeAndPlaybookResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDisposeAndPlaybookResponseBodyData setPageInfo(DescribeDisposeAndPlaybookResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public DescribeDisposeAndPlaybookResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

        public DescribeDisposeAndPlaybookResponseBodyData setResponseData(java.util.List<DescribeDisposeAndPlaybookResponseBodyDataResponseData> responseData) {
            this.responseData = responseData;
            return this;
        }
        public java.util.List<DescribeDisposeAndPlaybookResponseBodyDataResponseData> getResponseData() {
            return this.responseData;
        }

    }

}
