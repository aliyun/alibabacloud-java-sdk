// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetPhysicalInstanceResponseBody extends TeaModel {
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

    @NameInMap("Instance")
    public GetPhysicalInstanceResponseBodyInstance instance;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetPhysicalInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalInstanceResponseBody self = new GetPhysicalInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPhysicalInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPhysicalInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPhysicalInstanceResponseBody setInstance(GetPhysicalInstanceResponseBodyInstance instance) {
        this.instance = instance;
        return this;
    }
    public GetPhysicalInstanceResponseBodyInstance getInstance() {
        return this.instance;
    }

    public GetPhysicalInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPhysicalInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPhysicalInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPhysicalInstanceResponseBodyInstanceNodeInfoCreator extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2323111</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetPhysicalInstanceResponseBodyInstanceNodeInfoCreator build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalInstanceResponseBodyInstanceNodeInfoCreator self = new GetPhysicalInstanceResponseBodyInstanceNodeInfoCreator();
            return TeaModel.build(map, self);
        }

        public GetPhysicalInstanceResponseBodyInstanceNodeInfoCreator setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPhysicalInstanceResponseBodyInstanceNodeInfoCreator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetPhysicalInstanceResponseBodyInstanceNodeInfoModifier extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2323111</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetPhysicalInstanceResponseBodyInstanceNodeInfoModifier build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalInstanceResponseBodyInstanceNodeInfoModifier self = new GetPhysicalInstanceResponseBodyInstanceNodeInfoModifier();
            return TeaModel.build(map, self);
        }

        public GetPhysicalInstanceResponseBodyInstanceNodeInfoModifier setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPhysicalInstanceResponseBodyInstanceNodeInfoModifier setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetPhysicalInstanceResponseBodyInstanceNodeInfoOwnerList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2323111</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetPhysicalInstanceResponseBodyInstanceNodeInfoOwnerList build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalInstanceResponseBodyInstanceNodeInfoOwnerList self = new GetPhysicalInstanceResponseBodyInstanceNodeInfoOwnerList();
            return TeaModel.build(map, self);
        }

        public GetPhysicalInstanceResponseBodyInstanceNodeInfoOwnerList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPhysicalInstanceResponseBodyInstanceNodeInfoOwnerList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetPhysicalInstanceResponseBodyInstanceNodeInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("BizUnitName")
        public String bizUnitName;

        /**
         * <strong>example:</strong>
         * <p>2023-02-02 23:53:17</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Creator")
        public GetPhysicalInstanceResponseBodyInstanceNodeInfoCreator creator;

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
         * <p>DATA_PROCESS</p>
         */
        @NameInMap("From")
        public String from;

        /**
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>n_3232312</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>2024-02-02 23:53:17</p>
         */
        @NameInMap("LastModifiedTime")
        public String lastModifiedTime;

        @NameInMap("Modifier")
        public GetPhysicalInstanceResponseBodyInstanceNodeInfoModifier modifier;

        @NameInMap("Name")
        public String name;

        @NameInMap("OwnerList")
        public java.util.List<GetPhysicalInstanceResponseBodyInstanceNodeInfoOwnerList> ownerList;

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
         * <p>DATA_PROCESS</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetPhysicalInstanceResponseBodyInstanceNodeInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalInstanceResponseBodyInstanceNodeInfo self = new GetPhysicalInstanceResponseBodyInstanceNodeInfo();
            return TeaModel.build(map, self);
        }

        public GetPhysicalInstanceResponseBodyInstanceNodeInfo setBizUnitName(String bizUnitName) {
            this.bizUnitName = bizUnitName;
            return this;
        }
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        public GetPhysicalInstanceResponseBodyInstanceNodeInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetPhysicalInstanceResponseBodyInstanceNodeInfo setCreator(GetPhysicalInstanceResponseBodyInstanceNodeInfoCreator creator) {
            this.creator = creator;
            return this;
        }
        public GetPhysicalInstanceResponseBodyInstanceNodeInfoCreator getCreator() {
            return this.creator;
        }

        public GetPhysicalInstanceResponseBodyInstanceNodeInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPhysicalInstanceResponseBodyInstanceNodeInfo setDryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Boolean getDryRun() {
            return this.dryRun;
        }

        public GetPhysicalInstanceResponseBodyInstanceNodeInfo setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public GetPhysicalInstanceResponseBodyInstanceNodeInfo setHasDev(Boolean hasDev) {
            this.hasDev = hasDev;
            return this;
        }
        public Boolean getHasDev() {
            return this.hasDev;
        }

        public GetPhysicalInstanceResponseBodyInstanceNodeInfo setHasProd(Boolean hasProd) {
            this.hasProd = hasProd;
            return this;
        }
        public Boolean getHasProd() {
            return this.hasProd;
        }

        public GetPhysicalInstanceResponseBodyInstanceNodeInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPhysicalInstanceResponseBodyInstanceNodeInfo setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public GetPhysicalInstanceResponseBodyInstanceNodeInfo setModifier(GetPhysicalInstanceResponseBodyInstanceNodeInfoModifier modifier) {
            this.modifier = modifier;
            return this;
        }
        public GetPhysicalInstanceResponseBodyInstanceNodeInfoModifier getModifier() {
            return this.modifier;
        }

        public GetPhysicalInstanceResponseBodyInstanceNodeInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPhysicalInstanceResponseBodyInstanceNodeInfo setOwnerList(java.util.List<GetPhysicalInstanceResponseBodyInstanceNodeInfoOwnerList> ownerList) {
            this.ownerList = ownerList;
            return this;
        }
        public java.util.List<GetPhysicalInstanceResponseBodyInstanceNodeInfoOwnerList> getOwnerList() {
            return this.ownerList;
        }

        public GetPhysicalInstanceResponseBodyInstanceNodeInfo setPriorityList(java.util.List<String> priorityList) {
            this.priorityList = priorityList;
            return this;
        }
        public java.util.List<String> getPriorityList() {
            return this.priorityList;
        }

        public GetPhysicalInstanceResponseBodyInstanceNodeInfo setResourceGroupList(java.util.List<String> resourceGroupList) {
            this.resourceGroupList = resourceGroupList;
            return this;
        }
        public java.util.List<String> getResourceGroupList() {
            return this.resourceGroupList;
        }

        public GetPhysicalInstanceResponseBodyInstanceNodeInfo setSchedulePaused(Boolean schedulePaused) {
            this.schedulePaused = schedulePaused;
            return this;
        }
        public Boolean getSchedulePaused() {
            return this.schedulePaused;
        }

        public GetPhysicalInstanceResponseBodyInstanceNodeInfo setSchedulePeriodList(java.util.List<String> schedulePeriodList) {
            this.schedulePeriodList = schedulePeriodList;
            return this;
        }
        public java.util.List<String> getSchedulePeriodList() {
            return this.schedulePeriodList;
        }

        public GetPhysicalInstanceResponseBodyInstanceNodeInfo setSubDetailType(String subDetailType) {
            this.subDetailType = subDetailType;
            return this;
        }
        public String getSubDetailType() {
            return this.subDetailType;
        }

        public GetPhysicalInstanceResponseBodyInstanceNodeInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetPhysicalInstanceResponseBodyInstance extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-06-25</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        /**
         * <strong>example:</strong>
         * <p>2023-06-27 00:30:00</p>
         */
        @NameInMap("DueTime")
        public String dueTime;

        /**
         * <strong>example:</strong>
         * <p>3600s</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <strong>example:</strong>
         * <p>2023-06-27 02:30:00</p>
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
        public GetPhysicalInstanceResponseBodyInstanceNodeInfo nodeInfo;

        /**
         * <strong>example:</strong>
         * <p>2023-06-27 01:30:00</p>
         */
        @NameInMap("StartExecuteTime")
        public Long startExecuteTime;

        @NameInMap("StatusList")
        public java.util.List<String> statusList;

        public static GetPhysicalInstanceResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalInstanceResponseBodyInstance self = new GetPhysicalInstanceResponseBodyInstance();
            return TeaModel.build(map, self);
        }

        public GetPhysicalInstanceResponseBodyInstance setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public GetPhysicalInstanceResponseBodyInstance setDueTime(String dueTime) {
            this.dueTime = dueTime;
            return this;
        }
        public String getDueTime() {
            return this.dueTime;
        }

        public GetPhysicalInstanceResponseBodyInstance setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetPhysicalInstanceResponseBodyInstance setEndExecuteTime(Long endExecuteTime) {
            this.endExecuteTime = endExecuteTime;
            return this;
        }
        public Long getEndExecuteTime() {
            return this.endExecuteTime;
        }

        public GetPhysicalInstanceResponseBodyInstance setExtendInfo(String extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public String getExtendInfo() {
            return this.extendInfo;
        }

        public GetPhysicalInstanceResponseBodyInstance setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPhysicalInstanceResponseBodyInstance setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public GetPhysicalInstanceResponseBodyInstance setNodeInfo(GetPhysicalInstanceResponseBodyInstanceNodeInfo nodeInfo) {
            this.nodeInfo = nodeInfo;
            return this;
        }
        public GetPhysicalInstanceResponseBodyInstanceNodeInfo getNodeInfo() {
            return this.nodeInfo;
        }

        public GetPhysicalInstanceResponseBodyInstance setStartExecuteTime(Long startExecuteTime) {
            this.startExecuteTime = startExecuteTime;
            return this;
        }
        public Long getStartExecuteTime() {
            return this.startExecuteTime;
        }

        public GetPhysicalInstanceResponseBodyInstance setStatusList(java.util.List<String> statusList) {
            this.statusList = statusList;
            return this;
        }
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

    }

}
