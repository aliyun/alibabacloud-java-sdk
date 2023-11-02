// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeDisposeAndPlaybookResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeDisposeAndPlaybookResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
        @NameInMap("Description")
        public String description;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Name")
        public String name;

        @NameInMap("OpCode")
        public String opCode;

        @NameInMap("OpLevel")
        public String opLevel;

        @NameInMap("TaskConfig")
        public String taskConfig;

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
        @NameInMap("AlertNum")
        public Integer alertNum;

        @NameInMap("Dispose")
        public String dispose;

        @NameInMap("EntityId")
        public Long entityId;

        @NameInMap("EntityInfo")
        public java.util.Map<String, ?> entityInfo;

        @NameInMap("OpcodeMap")
        public java.util.Map<String, String> opcodeMap;

        @NameInMap("OpcodeSet")
        public java.util.List<String> opcodeSet;

        @NameInMap("PlaybookList")
        public java.util.List<DescribeDisposeAndPlaybookResponseBodyDataResponseDataPlaybookList> playbookList;

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
        @NameInMap("PageInfo")
        public DescribeDisposeAndPlaybookResponseBodyDataPageInfo pageInfo;

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
