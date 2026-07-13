// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeDisposeAndPlaybookResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response data.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Data")
    public DescribeDisposeAndPlaybookResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: Successful.</li>
     * <li>false: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
         * <p>Indicates whether the playbook is available. Valid values:</p>
         * <ul>
         * <li>1: Available.</li>
         * <li>0: Unavailable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Available")
        public String available;

        /**
         * <p>The playbook description.</p>
         * 
         * <strong>example:</strong>
         * <p>WafBlockIP</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>WafBlockIP</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("DisposeStatus")
        public String disposeStatus;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The playbook name, which is the unique identifier of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>kill_process_isolate_file</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The playbook opcode, which corresponds to the recommended playbook opcode for entity disposition.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("OpCode")
        public String opCode;

        /**
         * <p>Indicates whether the playbook is selected by default for one-click event disposition. Valid values:</p>
         * <ul>
         * <li>2: Selected. </li>
         * <li>1: Displayed but not selected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("OpLevel")
        public String opLevel;

        /**
         * <p>The parameter list and corresponding parameter properties of the playbook.</p>
         */
        @NameInMap("ParamConfig")
        public java.util.List<?> paramConfig;

        /**
         * <p>The opcode configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;opCode&quot;:&quot;3&quot;}</p>
         */
        @NameInMap("TaskConfig")
        public String taskConfig;

        /**
         * <p>The code that indicates why the playbook is unavailable. Valid values:</p>
         * <ul>
         * <li>PARAM_INVALID: The input parameters are invalid. </li>
         * <li>NO_INGESTION: The corresponding product is not connected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PARAM_INVALID</p>
         */
        @NameInMap("UnAvailableCode")
        public String unAvailableCode;

        /**
         * <p>The playbook UUID, which is the unique identifier of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>kill_process_isolate_file</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>Indicates whether this is a WAF playbook. Valid values:</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("WafPlaybook")
        public Boolean wafPlaybook;

        public static DescribeDisposeAndPlaybookResponseBodyDataResponseDataPlaybookList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisposeAndPlaybookResponseBodyDataResponseDataPlaybookList self = new DescribeDisposeAndPlaybookResponseBodyDataResponseDataPlaybookList();
            return TeaModel.build(map, self);
        }

        public DescribeDisposeAndPlaybookResponseBodyDataResponseDataPlaybookList setAvailable(String available) {
            this.available = available;
            return this;
        }
        public String getAvailable() {
            return this.available;
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

        public DescribeDisposeAndPlaybookResponseBodyDataResponseDataPlaybookList setDisposeStatus(String disposeStatus) {
            this.disposeStatus = disposeStatus;
            return this;
        }
        public String getDisposeStatus() {
            return this.disposeStatus;
        }

        public DescribeDisposeAndPlaybookResponseBodyDataResponseDataPlaybookList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
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

        public DescribeDisposeAndPlaybookResponseBodyDataResponseDataPlaybookList setParamConfig(java.util.List<?> paramConfig) {
            this.paramConfig = paramConfig;
            return this;
        }
        public java.util.List<?> getParamConfig() {
            return this.paramConfig;
        }

        public DescribeDisposeAndPlaybookResponseBodyDataResponseDataPlaybookList setTaskConfig(String taskConfig) {
            this.taskConfig = taskConfig;
            return this;
        }
        public String getTaskConfig() {
            return this.taskConfig;
        }

        public DescribeDisposeAndPlaybookResponseBodyDataResponseDataPlaybookList setUnAvailableCode(String unAvailableCode) {
            this.unAvailableCode = unAvailableCode;
            return this;
        }
        public String getUnAvailableCode() {
            return this.unAvailableCode;
        }

        public DescribeDisposeAndPlaybookResponseBodyDataResponseDataPlaybookList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
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
         * <p>The number of alerts associated with the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlertNum")
        public Integer alertNum;

        /**
         * <p>The disposition object.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.<em>.</em></p>
         */
        @NameInMap("Dispose")
        public String dispose;

        /**
         * <p>The entity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345****</p>
         */
        @NameInMap("EntityId")
        public Long entityId;

        /**
         * <p>The entity information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;file_path&quot;: &quot;c:/www/leixi.jsp&quot;,&quot;file_hash&quot;: &quot;aa0ca926ad948cd820e0a3d9a18c****&quot;,&quot;host_uuid&quot;: &quot;efed2cf7-0b77-45d9-a97b-d2cf246b****&quot;,&quot;malware_type&quot;: &quot;${aliyun.siem.sas.alert_tag.webshell}&quot;,&quot;host_name&quot;: &quot;launch-advisor-2023****&quot;}</p>
         */
        @NameInMap("EntityInfo")
        public java.util.Map<String, ?> entityInfo;

        /**
         * <p>The entity type. Valid values:</p>
         * <ul>
         * <li>ip: IP address</li>
         * <li>domain: domain name</li>
         * <li>url: URL</li>
         * <li>process: process</li>
         * <li>file: file</li>
         * <li>host: host</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>The key-value pairs of opcode and oplevel.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("OpcodeMap")
        public java.util.Map<String, String> opcodeMap;

        /**
         * <p>The recommended playbook opcodes for entity disposition.</p>
         * 
         * <strong>example:</strong>
         * <p>[1,3]</p>
         */
        @NameInMap("OpcodeSet")
        public java.util.List<String> opcodeSet;

        /**
         * <p>The list of playbooks that can dispose of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;云安全中心-云服务器安全&quot;,&quot;code&quot;:&quot;1&quot;}]</p>
         */
        @NameInMap("PlaybookList")
        public java.util.List<DescribeDisposeAndPlaybookResponseBodyDataResponseDataPlaybookList> playbookList;

        /**
         * <p>The disposition scope. The list of user IDs that can perform the disposition.</p>
         * 
         * <strong>example:</strong>
         * <p>176618589410****</p>
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

        public DescribeDisposeAndPlaybookResponseBodyDataResponseData setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
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
         * <p>The detailed data.</p>
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
