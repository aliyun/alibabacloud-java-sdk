// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListPipelineRunItemsResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListPipelineRunItemsResponseBodyPagingInfo pagingInfo;

    /**
     * <strong>example:</strong>
     * <p>C99E2BE6-9DEA-5C2E-8F51-1DDCFEADE490</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPipelineRunItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineRunItemsResponseBody self = new ListPipelineRunItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelineRunItemsResponseBody setPagingInfo(ListPipelineRunItemsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListPipelineRunItemsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListPipelineRunItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPipelineRunItemsResponseBodyPagingInfoPipelineRunItems extends TeaModel {
        /**
         * <p>发布包创建时间戳</p>
         * 
         * <strong>example:</strong>
         * <p>1724984066000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>860438872620113XXXX</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>创建人</p>
         * 
         * <strong>example:</strong>
         * <p>Error Message</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>修改时间</p>
         * 
         * <strong>example:</strong>
         * <p>1724984066000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>{ &quot;version&quot;: &quot;1.1.0&quot;, &quot;kind&quot;: &quot;Node&quot;, &quot;spec&quot;: { &quot;nodes&quot;: [ { &quot;recurrence&quot;: &quot;Normal&quot;, &quot;id&quot;: &quot;860438872620113XXXX&quot;, &quot;timeout&quot;: 0, &quot;instanceMode&quot;: &quot;T+1&quot;, &quot;rerunMode&quot;: &quot;Allowed&quot;, &quot;rerunTimes&quot;: 3, &quot;rerunInterval&quot;: 180000, &quot;datasource&quot;: { &quot;name&quot;: &quot;odps_test&quot;, &quot;type&quot;: &quot;odps&quot; }, &quot;script&quot;: { &quot;language&quot;: &quot;odps-sql&quot;, &quot;path&quot;: &quot;XX/OpenAPI_Test/ODPS_SQL_Test&quot;, &quot;runtime&quot;: { &quot;command&quot;: &quot;ODPS_SQL&quot;, &quot;commandTypeId&quot;: 10 }, &quot;content&quot;: &quot;select now();&quot;, &quot;id&quot;: &quot;853573334108680XXXX&quot; }, &quot;trigger&quot;: { &quot;type&quot;: &quot;Scheduler&quot;, &quot;id&quot;: &quot;543680677872062XXXX&quot;, &quot;cron&quot;: &quot;00 00 00 * * ?&quot;, &quot;startTime&quot;: &quot;1970-01-01 00:00:00&quot;, &quot;endTime&quot;: &quot;9999-01-01 00:00:00&quot;, &quot;timezone&quot;: &quot;Asia/Shanghai&quot;, &quot;delaySeconds&quot;: 0 }, &quot;runtimeResource&quot;: { &quot;resourceGroup&quot;: &quot;S_res_group_XXXX_XXXX&quot;, &quot;id&quot;: &quot;623731286945488XXXX&quot;, &quot;resourceGroupId&quot;: &quot;7201XXXX&quot; }, &quot;name&quot;: &quot;ODPS_SQL_Test&quot;, &quot;owner&quot;: &quot;110755000425XXXX&quot;, &quot;metadata&quot;: { &quot;owner&quot;: &quot;110755000425XXXX&quot;, &quot;ownerName&quot;: &quot;<a href="mailto:XXXXX@test.XXX.com">XXXXX@test.XXX.com</a>&quot;, &quot;projectId&quot;: &quot;307XXX&quot; }, &quot;inputs&quot;: { &quot;nodeOutputs&quot;: [ { &quot;data&quot;: &quot;lwttest_standard_root&quot;, &quot;artifactType&quot;: &quot;NodeOutput&quot; } ] }, &quot;outputs&quot;: { &quot;nodeOutputs&quot;: [ { &quot;data&quot;: &quot;860438872620113XXXX&quot;, &quot;artifactType&quot;: &quot;NodeOutput&quot;, &quot;refTableName&quot;: &quot;ODPS_SQL_Test&quot;, &quot;isDefault&quot;: true } ] } } ], &quot;flow&quot;: [ { &quot;nodeId&quot;: &quot;860438872620113XXXX&quot;, &quot;depends&quot;: [ { &quot;type&quot;: &quot;Normal&quot;, &quot;output&quot;: &quot;lwttest_standard_root&quot; } ] } ] }, &quot;metadata&quot;: { &quot;uuid&quot;: &quot;860438872620113XXXX&quot; } }</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>发布流程状态</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>Node</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>项目Id</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Long version;

        public static ListPipelineRunItemsResponseBodyPagingInfoPipelineRunItems build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineRunItemsResponseBodyPagingInfoPipelineRunItems self = new ListPipelineRunItemsResponseBodyPagingInfoPipelineRunItems();
            return TeaModel.build(map, self);
        }

        public ListPipelineRunItemsResponseBodyPagingInfoPipelineRunItems setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListPipelineRunItemsResponseBodyPagingInfoPipelineRunItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListPipelineRunItemsResponseBodyPagingInfoPipelineRunItems setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListPipelineRunItemsResponseBodyPagingInfoPipelineRunItems setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListPipelineRunItemsResponseBodyPagingInfoPipelineRunItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPipelineRunItemsResponseBodyPagingInfoPipelineRunItems setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListPipelineRunItemsResponseBodyPagingInfoPipelineRunItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPipelineRunItemsResponseBodyPagingInfoPipelineRunItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListPipelineRunItemsResponseBodyPagingInfoPipelineRunItems setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class ListPipelineRunItemsResponseBodyPagingInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("PipelineRunItems")
        public java.util.List<ListPipelineRunItemsResponseBodyPagingInfoPipelineRunItems> pipelineRunItems;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListPipelineRunItemsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineRunItemsResponseBodyPagingInfo self = new ListPipelineRunItemsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListPipelineRunItemsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListPipelineRunItemsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPipelineRunItemsResponseBodyPagingInfo setPipelineRunItems(java.util.List<ListPipelineRunItemsResponseBodyPagingInfoPipelineRunItems> pipelineRunItems) {
            this.pipelineRunItems = pipelineRunItems;
            return this;
        }
        public java.util.List<ListPipelineRunItemsResponseBodyPagingInfoPipelineRunItems> getPipelineRunItems() {
            return this.pipelineRunItems;
        }

        public ListPipelineRunItemsResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
