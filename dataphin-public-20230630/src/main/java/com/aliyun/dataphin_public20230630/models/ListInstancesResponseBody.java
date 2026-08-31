// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of OK indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The paginated result.</p>
     */
    @NameInMap("PageResult")
    public ListInstancesResponseBodyPageResult pageResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstancesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstancesResponseBody setPageResult(ListInstancesResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListInstancesResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListInstancesResponseBodyPageResultDataNodeInfoCreator extends TeaModel {
        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>21313112</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>xx_test</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListInstancesResponseBodyPageResultDataNodeInfoCreator build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyPageResultDataNodeInfoCreator self = new ListInstancesResponseBodyPageResultDataNodeInfoCreator();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyPageResultDataNodeInfoCreator setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListInstancesResponseBodyPageResultDataNodeInfoCreator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListInstancesResponseBodyPageResultDataNodeInfoModifier extends TeaModel {
        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>21313112</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>xx_test</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListInstancesResponseBodyPageResultDataNodeInfoModifier build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyPageResultDataNodeInfoModifier self = new ListInstancesResponseBodyPageResultDataNodeInfoModifier();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyPageResultDataNodeInfoModifier setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListInstancesResponseBodyPageResultDataNodeInfoModifier setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListInstancesResponseBodyPageResultDataNodeInfoOwnerList extends TeaModel {
        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>21313112</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>xx_test</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListInstancesResponseBodyPageResultDataNodeInfoOwnerList build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyPageResultDataNodeInfoOwnerList self = new ListInstancesResponseBodyPageResultDataNodeInfoOwnerList();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyPageResultDataNodeInfoOwnerList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListInstancesResponseBodyPageResultDataNodeInfoOwnerList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListInstancesResponseBodyPageResultDataNodeInfo extends TeaModel {
        /**
         * <p>The business unit.</p>
         * 
         * <strong>example:</strong>
         * <p>xx_test</p>
         */
        @NameInMap("BizUnitName")
        public String bizUnitName;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-30 16:47:13</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The creator of the node.</p>
         */
        @NameInMap("Creator")
        public ListInstancesResponseBodyPageResultDataNodeInfoCreator creator;

        /**
         * <p>The description of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>xx test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the node is a dry run.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DryRun")
        public Boolean dryRun;

        /**
         * <p>The source of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>DATA_PROCES</p>
         */
        @NameInMap("From")
        public String from;

        /**
         * <p>Indicates whether the node has a development environment.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasDev")
        public Boolean hasDev;

        /**
         * <p>Indicates whether the node has a production environment.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasProd")
        public Boolean hasProd;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>n_132331</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-30 16:47:13</p>
         */
        @NameInMap("LastModifiedTime")
        public String lastModifiedTime;

        /**
         * <p>The modifier of the node.</p>
         */
        @NameInMap("Modifier")
        public ListInstancesResponseBodyPageResultDataNodeInfoModifier modifier;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>xx_test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The owner.</p>
         */
        @NameInMap("OwnerList")
        public java.util.List<ListInstancesResponseBodyPageResultDataNodeInfoOwnerList> ownerList;

        /**
         * <p>The priority. Valid values:</p>
         * <ul>
         * <li>HIGHEST</li>
         * <li>HIGH</li>
         * <li>MIDDLE</li>
         * <li>LOW</li>
         * <li>LOWEST</li>
         * </ul>
         */
        @NameInMap("PriorityList")
        public java.util.List<String> priorityList;

        /**
         * <p>The schedule resource groups for execution.</p>
         */
        @NameInMap("ResourceGroupList")
        public java.util.List<String> resourceGroupList;

        /**
         * <p>Specifies whether scheduling is paused.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SchedulePaused")
        public Boolean schedulePaused;

        /**
         * <p>The scheduling period.</p>
         */
        @NameInMap("SchedulePeriodList")
        public java.util.List<String> schedulePeriodList;

        /**
         * <p>The sub-business type. Valid values:</p>
         * <ul>
         * <li>MAX_COMPUTE_SQL</li>
         * <li>HIVE_SQL</li>
         * <li>SHELL</li>
         * <li>PYTHON</li>
         * <li>ONE_SERVICE_SQL</li>
         * <li>DATABASE_SQL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SHELL</p>
         */
        @NameInMap("SubDetailType")
        public String subDetailType;

        /**
         * <p>The business type of the node. Valid values:</p>
         * <ul>
         * <li>SCRIPT: script.</li>
         * <li>LOGICAL_TABLE: logical table.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DATA_PROCES</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListInstancesResponseBodyPageResultDataNodeInfo build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyPageResultDataNodeInfo self = new ListInstancesResponseBodyPageResultDataNodeInfo();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyPageResultDataNodeInfo setBizUnitName(String bizUnitName) {
            this.bizUnitName = bizUnitName;
            return this;
        }
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        public ListInstancesResponseBodyPageResultDataNodeInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListInstancesResponseBodyPageResultDataNodeInfo setCreator(ListInstancesResponseBodyPageResultDataNodeInfoCreator creator) {
            this.creator = creator;
            return this;
        }
        public ListInstancesResponseBodyPageResultDataNodeInfoCreator getCreator() {
            return this.creator;
        }

        public ListInstancesResponseBodyPageResultDataNodeInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListInstancesResponseBodyPageResultDataNodeInfo setDryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Boolean getDryRun() {
            return this.dryRun;
        }

        public ListInstancesResponseBodyPageResultDataNodeInfo setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public ListInstancesResponseBodyPageResultDataNodeInfo setHasDev(Boolean hasDev) {
            this.hasDev = hasDev;
            return this;
        }
        public Boolean getHasDev() {
            return this.hasDev;
        }

        public ListInstancesResponseBodyPageResultDataNodeInfo setHasProd(Boolean hasProd) {
            this.hasProd = hasProd;
            return this;
        }
        public Boolean getHasProd() {
            return this.hasProd;
        }

        public ListInstancesResponseBodyPageResultDataNodeInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListInstancesResponseBodyPageResultDataNodeInfo setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public ListInstancesResponseBodyPageResultDataNodeInfo setModifier(ListInstancesResponseBodyPageResultDataNodeInfoModifier modifier) {
            this.modifier = modifier;
            return this;
        }
        public ListInstancesResponseBodyPageResultDataNodeInfoModifier getModifier() {
            return this.modifier;
        }

        public ListInstancesResponseBodyPageResultDataNodeInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListInstancesResponseBodyPageResultDataNodeInfo setOwnerList(java.util.List<ListInstancesResponseBodyPageResultDataNodeInfoOwnerList> ownerList) {
            this.ownerList = ownerList;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyPageResultDataNodeInfoOwnerList> getOwnerList() {
            return this.ownerList;
        }

        public ListInstancesResponseBodyPageResultDataNodeInfo setPriorityList(java.util.List<String> priorityList) {
            this.priorityList = priorityList;
            return this;
        }
        public java.util.List<String> getPriorityList() {
            return this.priorityList;
        }

        public ListInstancesResponseBodyPageResultDataNodeInfo setResourceGroupList(java.util.List<String> resourceGroupList) {
            this.resourceGroupList = resourceGroupList;
            return this;
        }
        public java.util.List<String> getResourceGroupList() {
            return this.resourceGroupList;
        }

        public ListInstancesResponseBodyPageResultDataNodeInfo setSchedulePaused(Boolean schedulePaused) {
            this.schedulePaused = schedulePaused;
            return this;
        }
        public Boolean getSchedulePaused() {
            return this.schedulePaused;
        }

        public ListInstancesResponseBodyPageResultDataNodeInfo setSchedulePeriodList(java.util.List<String> schedulePeriodList) {
            this.schedulePeriodList = schedulePeriodList;
            return this;
        }
        public java.util.List<String> getSchedulePeriodList() {
            return this.schedulePeriodList;
        }

        public ListInstancesResponseBodyPageResultDataNodeInfo setSubDetailType(String subDetailType) {
            this.subDetailType = subDetailType;
            return this;
        }
        public String getSubDetailType() {
            return this.subDetailType;
        }

        public ListInstancesResponseBodyPageResultDataNodeInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListInstancesResponseBodyPageResultData extends TeaModel {
        /**
         * <p>The business date.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-30</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        /**
         * <p>The scheduling time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-30 16:47:13</p>
         */
        @NameInMap("DueTime")
        public String dueTime;

        /**
         * <p>The execution duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60s</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The execution end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-30 16:47:13</p>
         */
        @NameInMap("EndExecuteTime")
        public Long endExecuteTime;

        /**
         * <p>The extended node information, which contains properties specific to different business system instances, such as the fileId of a pipeline, whether a logical table uses hierarchy dimensions, mid node information, and instance output names.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("ExtendInfo")
        public String extendInfo;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t_23231</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The sequence number of the hourly or minutely instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>The node details.</p>
         */
        @NameInMap("NodeInfo")
        public ListInstancesResponseBodyPageResultDataNodeInfo nodeInfo;

        /**
         * <p>The execution start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-30 16:46:13</p>
         */
        @NameInMap("StartExecuteTime")
        public Long startExecuteTime;

        /**
         * <p>The instance status.</p>
         */
        @NameInMap("StatusList")
        public java.util.List<String> statusList;

        public static ListInstancesResponseBodyPageResultData build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyPageResultData self = new ListInstancesResponseBodyPageResultData();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyPageResultData setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public ListInstancesResponseBodyPageResultData setDueTime(String dueTime) {
            this.dueTime = dueTime;
            return this;
        }
        public String getDueTime() {
            return this.dueTime;
        }

        public ListInstancesResponseBodyPageResultData setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListInstancesResponseBodyPageResultData setEndExecuteTime(Long endExecuteTime) {
            this.endExecuteTime = endExecuteTime;
            return this;
        }
        public Long getEndExecuteTime() {
            return this.endExecuteTime;
        }

        public ListInstancesResponseBodyPageResultData setExtendInfo(String extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public String getExtendInfo() {
            return this.extendInfo;
        }

        public ListInstancesResponseBodyPageResultData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListInstancesResponseBodyPageResultData setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListInstancesResponseBodyPageResultData setNodeInfo(ListInstancesResponseBodyPageResultDataNodeInfo nodeInfo) {
            this.nodeInfo = nodeInfo;
            return this;
        }
        public ListInstancesResponseBodyPageResultDataNodeInfo getNodeInfo() {
            return this.nodeInfo;
        }

        public ListInstancesResponseBodyPageResultData setStartExecuteTime(Long startExecuteTime) {
            this.startExecuteTime = startExecuteTime;
            return this;
        }
        public Long getStartExecuteTime() {
            return this.startExecuteTime;
        }

        public ListInstancesResponseBodyPageResultData setStatusList(java.util.List<String> statusList) {
            this.statusList = statusList;
            return this;
        }
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

    }

    public static class ListInstancesResponseBodyPageResult extends TeaModel {
        /**
         * <p>The paginated records.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListInstancesResponseBodyPageResultData> data;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>107</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListInstancesResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyPageResult self = new ListInstancesResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyPageResult setData(java.util.List<ListInstancesResponseBodyPageResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyPageResultData> getData() {
            return this.data;
        }

        public ListInstancesResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
