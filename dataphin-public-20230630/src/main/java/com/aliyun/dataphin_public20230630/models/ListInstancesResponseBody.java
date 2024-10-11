// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("PageResult")
    public ListInstancesResponseBodyPageResult pageResult;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
         * <strong>example:</strong>
         * <p>21313112</p>
         */
        @NameInMap("Id")
        public String id;

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
         * <strong>example:</strong>
         * <p>21313112</p>
         */
        @NameInMap("Id")
        public String id;

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
         * <strong>example:</strong>
         * <p>21313112</p>
         */
        @NameInMap("Id")
        public String id;

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
        @NameInMap("BizUnitName")
        public String bizUnitName;

        /**
         * <strong>example:</strong>
         * <p>2024-05-30 16:47:13</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Creator")
        public ListInstancesResponseBodyPageResultDataNodeInfoCreator creator;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DryRun")
        public Boolean dryRun;

        /**
         * <strong>example:</strong>
         * <p>DATA_PROCES</p>
         */
        @NameInMap("From")
        public String from;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasDev")
        public Boolean hasDev;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasProd")
        public Boolean hasProd;

        /**
         * <strong>example:</strong>
         * <p>n_132331</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>2024-05-30 16:47:13</p>
         */
        @NameInMap("LastModifiedTime")
        public String lastModifiedTime;

        @NameInMap("Modifier")
        public ListInstancesResponseBodyPageResultDataNodeInfoModifier modifier;

        @NameInMap("Name")
        public String name;

        @NameInMap("OwnerList")
        public java.util.List<ListInstancesResponseBodyPageResultDataNodeInfoOwnerList> ownerList;

        @NameInMap("PriorityList")
        public java.util.List<String> priorityList;

        @NameInMap("ResourceGroupList")
        public java.util.List<String> resourceGroupList;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SchedulePaused")
        public Boolean schedulePaused;

        @NameInMap("SchedulePeriodList")
        public java.util.List<String> schedulePeriodList;

        /**
         * <strong>example:</strong>
         * <p>SHELL</p>
         */
        @NameInMap("SubDetailType")
        public String subDetailType;

        /**
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
         * <strong>example:</strong>
         * <p>2024-05-30</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        /**
         * <strong>example:</strong>
         * <p>2024-05-30 16:47:13</p>
         */
        @NameInMap("DueTime")
        public String dueTime;

        /**
         * <strong>example:</strong>
         * <p>60s</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <strong>example:</strong>
         * <p>2024-05-30 16:47:13</p>
         */
        @NameInMap("EndExecuteTime")
        public Long endExecuteTime;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("ExtendInfo")
        public String extendInfo;

        /**
         * <strong>example:</strong>
         * <p>t_23231</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        @NameInMap("NodeInfo")
        public ListInstancesResponseBodyPageResultDataNodeInfo nodeInfo;

        /**
         * <strong>example:</strong>
         * <p>2024-05-30 16:46:13</p>
         */
        @NameInMap("StartExecuteTime")
        public Long startExecuteTime;

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
        @NameInMap("Data")
        public java.util.List<ListInstancesResponseBodyPageResultData> data;

        /**
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
