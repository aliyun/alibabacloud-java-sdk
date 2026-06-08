// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListProcessDefinitionsResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListProcessDefinitionsResponseBodyPagingInfo pagingInfo;

    /**
     * <strong>example:</strong>
     * <p>0bc5df3a17***903790e8e8a</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListProcessDefinitionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProcessDefinitionsResponseBody self = new ListProcessDefinitionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProcessDefinitionsResponseBody setPagingInfo(ListProcessDefinitionsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListProcessDefinitionsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListProcessDefinitionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProcessDefinitionsResponseBodyPagingInfoProcessDefinitions extends TeaModel {
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <strong>example:</strong>
         * <p>10354346</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsSystem")
        public Boolean isSystem;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public String priority;

        @NameInMap("Scopes")
        public java.util.List<String> scopes;

        /**
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("SubType")
        public String subType;

        /**
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListProcessDefinitionsResponseBodyPagingInfoProcessDefinitions build(java.util.Map<String, ?> map) throws Exception {
            ListProcessDefinitionsResponseBodyPagingInfoProcessDefinitions self = new ListProcessDefinitionsResponseBodyPagingInfoProcessDefinitions();
            return TeaModel.build(map, self);
        }

        public ListProcessDefinitionsResponseBodyPagingInfoProcessDefinitions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProcessDefinitionsResponseBodyPagingInfoProcessDefinitions setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListProcessDefinitionsResponseBodyPagingInfoProcessDefinitions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListProcessDefinitionsResponseBodyPagingInfoProcessDefinitions setIsSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            return this;
        }
        public Boolean getIsSystem() {
            return this.isSystem;
        }

        public ListProcessDefinitionsResponseBodyPagingInfoProcessDefinitions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProcessDefinitionsResponseBodyPagingInfoProcessDefinitions setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ListProcessDefinitionsResponseBodyPagingInfoProcessDefinitions setScopes(java.util.List<String> scopes) {
            this.scopes = scopes;
            return this;
        }
        public java.util.List<String> getScopes() {
            return this.scopes;
        }

        public ListProcessDefinitionsResponseBodyPagingInfoProcessDefinitions setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public ListProcessDefinitionsResponseBodyPagingInfoProcessDefinitions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListProcessDefinitionsResponseBodyPagingInfo extends TeaModel {
        @NameInMap("ProcessDefinitions")
        public java.util.List<ListProcessDefinitionsResponseBodyPagingInfoProcessDefinitions> processDefinitions;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListProcessDefinitionsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListProcessDefinitionsResponseBodyPagingInfo self = new ListProcessDefinitionsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListProcessDefinitionsResponseBodyPagingInfo setProcessDefinitions(java.util.List<ListProcessDefinitionsResponseBodyPagingInfoProcessDefinitions> processDefinitions) {
            this.processDefinitions = processDefinitions;
            return this;
        }
        public java.util.List<ListProcessDefinitionsResponseBodyPagingInfoProcessDefinitions> getProcessDefinitions() {
            return this.processDefinitions;
        }

        public ListProcessDefinitionsResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
