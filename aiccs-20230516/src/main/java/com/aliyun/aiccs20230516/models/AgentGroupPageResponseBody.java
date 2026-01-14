// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AgentGroupPageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>a</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public AgentGroupPageResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>71</p>
     */
    @NameInMap("Timestamp")
    public Long timestamp;

    public static AgentGroupPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AgentGroupPageResponseBody self = new AgentGroupPageResponseBody();
        return TeaModel.build(map, self);
    }

    public AgentGroupPageResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public AgentGroupPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AgentGroupPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AgentGroupPageResponseBody setModel(AgentGroupPageResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public AgentGroupPageResponseBodyModel getModel() {
        return this.model;
    }

    public AgentGroupPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AgentGroupPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AgentGroupPageResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static class AgentGroupPageResponseBodyModelRecords extends TeaModel {
        /**
         * <p>坐席组ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgentGroupId")
        public Long agentGroupId;

        /**
         * <p>坐席组名称</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("AgentGroupName")
        public String agentGroupName;

        /**
         * <p>坐席组下的坐席id列表</p>
         */
        @NameInMap("AgentIds")
        public java.util.List<Long> agentIds;

        /**
         * <p>创建坐席组的时间</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01 11:11:11</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        public static AgentGroupPageResponseBodyModelRecords build(java.util.Map<String, ?> map) throws Exception {
            AgentGroupPageResponseBodyModelRecords self = new AgentGroupPageResponseBodyModelRecords();
            return TeaModel.build(map, self);
        }

        public AgentGroupPageResponseBodyModelRecords setAgentGroupId(Long agentGroupId) {
            this.agentGroupId = agentGroupId;
            return this;
        }
        public Long getAgentGroupId() {
            return this.agentGroupId;
        }

        public AgentGroupPageResponseBodyModelRecords setAgentGroupName(String agentGroupName) {
            this.agentGroupName = agentGroupName;
            return this;
        }
        public String getAgentGroupName() {
            return this.agentGroupName;
        }

        public AgentGroupPageResponseBodyModelRecords setAgentIds(java.util.List<Long> agentIds) {
            this.agentIds = agentIds;
            return this;
        }
        public java.util.List<Long> getAgentIds() {
            return this.agentIds;
        }

        public AgentGroupPageResponseBodyModelRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

    public static class AgentGroupPageResponseBodyModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>62</p>
         */
        @NameInMap("Current")
        public Long current;

        /**
         * <strong>example:</strong>
         * <p>82</p>
         */
        @NameInMap("Pages")
        public Long pages;

        @NameInMap("Records")
        public java.util.List<AgentGroupPageResponseBodyModelRecords> records;

        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Total")
        public Long total;

        public static AgentGroupPageResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            AgentGroupPageResponseBodyModel self = new AgentGroupPageResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public AgentGroupPageResponseBodyModel setCurrent(Long current) {
            this.current = current;
            return this;
        }
        public Long getCurrent() {
            return this.current;
        }

        public AgentGroupPageResponseBodyModel setPages(Long pages) {
            this.pages = pages;
            return this;
        }
        public Long getPages() {
            return this.pages;
        }

        public AgentGroupPageResponseBodyModel setRecords(java.util.List<AgentGroupPageResponseBodyModelRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<AgentGroupPageResponseBodyModelRecords> getRecords() {
            return this.records;
        }

        public AgentGroupPageResponseBodyModel setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public AgentGroupPageResponseBodyModel setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
