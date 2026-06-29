// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetSupplementDagrunInstanceResponseBody extends TeaModel {
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
     * <p>The list of instances.</p>
     */
    @NameInMap("InstanceList")
    public java.util.List<GetSupplementDagrunInstanceResponseBodyInstanceList> instanceList;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

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
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSupplementDagrunInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSupplementDagrunInstanceResponseBody self = new GetSupplementDagrunInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSupplementDagrunInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSupplementDagrunInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSupplementDagrunInstanceResponseBody setInstanceList(java.util.List<GetSupplementDagrunInstanceResponseBodyInstanceList> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<GetSupplementDagrunInstanceResponseBodyInstanceList> getInstanceList() {
        return this.instanceList;
    }

    public GetSupplementDagrunInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSupplementDagrunInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSupplementDagrunInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfoCreator extends TeaModel {
        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001012</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfoCreator build(java.util.Map<String, ?> map) throws Exception {
            GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfoCreator self = new GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfoCreator();
            return TeaModel.build(map, self);
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfoCreator setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfoCreator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfoModifier extends TeaModel {
        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001012</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfoModifier build(java.util.Map<String, ?> map) throws Exception {
            GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfoModifier self = new GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfoModifier();
            return TeaModel.build(map, self);
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfoModifier setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfoModifier setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfoOwnerList extends TeaModel {
        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001012</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfoOwnerList build(java.util.Map<String, ?> map) throws Exception {
            GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfoOwnerList self = new GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfoOwnerList();
            return TeaModel.build(map, self);
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfoOwnerList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfoOwnerList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfo extends TeaModel {
        /**
         * <p>The business unit.</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("BizUnitName")
        public String bizUnitName;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-30 10:08:49</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The creator of the node.</p>
         */
        @NameInMap("Creator")
        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfoCreator creator;

        /**
         * <p>The node description.</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the node is a dry run.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DryRun")
        public Boolean dryRun;

        /**
         * <p>The source business system. Valid values:</p>
         * <ul>
         * <li>DATA_PROCESS: code development.</li>
         * <li>BLACK_BOX: black box.</li>
         * <li>ONE_ID: extraction.</li>
         * <li>PIPELINE: pipeline.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DATA_PROCESS</p>
         */
        @NameInMap("From")
        public String from;

        /**
         * <p>Indicates whether the node exists in the development environment.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasDev")
        public Boolean hasDev;

        /**
         * <p>Indicates whether the node exists in the production environment.</p>
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
         * <p>n_239496</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-30 10:08:49</p>
         */
        @NameInMap("LastModifiedTime")
        public String lastModifiedTime;

        /**
         * <p>The modifier.</p>
         */
        @NameInMap("Modifier")
        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfoModifier modifier;

        /**
         * <p>The node name.</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The owners of the node.</p>
         */
        @NameInMap("OwnerList")
        public java.util.List<GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfoOwnerList> ownerList;

        /**
         * <p>The priority. Valid values:</p>
         * <ul>
         * <li>HIGHEST</li>
         * <li>HIGH</li>
         * <li>MIDDLE</li>
         * <li>LOW</li>
         * <li>LOWEST.</li>
         * </ul>
         */
        @NameInMap("PriorityList")
        public java.util.List<String> priorityList;

        /**
         * <p>The schedule resource groups.</p>
         */
        @NameInMap("ResourceGroupList")
        public java.util.List<String> resourceGroupList;

        /**
         * <p>Indicates whether the node is paused.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SchedulePaused")
        public Boolean schedulePaused;

        /**
         * <p>The scheduling period. Valid values:</p>
         * <ul>
         * <li>MINUTELY</li>
         * <li>HOURLY</li>
         * <li>DAILY</li>
         * <li>WEEKLY</li>
         * <li>MONTHLY</li>
         * <li>QUARTERLY.</li>
         * </ul>
         */
        @NameInMap("SchedulePeriodList")
        public java.util.List<String> schedulePeriodList;

        /**
         * <p>The node subtype.</p>
         * 
         * <strong>example:</strong>
         * <p>SHELL</p>
         */
        @NameInMap("SubDetailType")
        public String subDetailType;

        /**
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li>DATA_PROCESS: code node.</li>
         * <li>BBOX_LOGIC_TABLE_NODE: black box logical table node.</li>
         * <li>ONE_ID_LABEL: extraction label node.</li>
         * <li>ONE_ID_RULE: extraction label node.</li>
         * <li>PIPELINE_NODE: pipeline node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DATA_PROCESS</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfo self = new GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfo();
            return TeaModel.build(map, self);
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfo setBizUnitName(String bizUnitName) {
            this.bizUnitName = bizUnitName;
            return this;
        }
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfo setCreator(GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfoCreator creator) {
            this.creator = creator;
            return this;
        }
        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfoCreator getCreator() {
            return this.creator;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfo setDryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Boolean getDryRun() {
            return this.dryRun;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfo setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfo setHasDev(Boolean hasDev) {
            this.hasDev = hasDev;
            return this;
        }
        public Boolean getHasDev() {
            return this.hasDev;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfo setHasProd(Boolean hasProd) {
            this.hasProd = hasProd;
            return this;
        }
        public Boolean getHasProd() {
            return this.hasProd;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfo setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfo setModifier(GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfoModifier modifier) {
            this.modifier = modifier;
            return this;
        }
        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfoModifier getModifier() {
            return this.modifier;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfo setOwnerList(java.util.List<GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfoOwnerList> ownerList) {
            this.ownerList = ownerList;
            return this;
        }
        public java.util.List<GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfoOwnerList> getOwnerList() {
            return this.ownerList;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfo setPriorityList(java.util.List<String> priorityList) {
            this.priorityList = priorityList;
            return this;
        }
        public java.util.List<String> getPriorityList() {
            return this.priorityList;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfo setResourceGroupList(java.util.List<String> resourceGroupList) {
            this.resourceGroupList = resourceGroupList;
            return this;
        }
        public java.util.List<String> getResourceGroupList() {
            return this.resourceGroupList;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfo setSchedulePaused(Boolean schedulePaused) {
            this.schedulePaused = schedulePaused;
            return this;
        }
        public Boolean getSchedulePaused() {
            return this.schedulePaused;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfo setSchedulePeriodList(java.util.List<String> schedulePeriodList) {
            this.schedulePeriodList = schedulePeriodList;
            return this;
        }
        public java.util.List<String> getSchedulePeriodList() {
            return this.schedulePeriodList;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfo setSubDetailType(String subDetailType) {
            this.subDetailType = subDetailType;
            return this;
        }
        public String getSubDetailType() {
            return this.subDetailType;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetSupplementDagrunInstanceResponseBodyInstanceList extends TeaModel {
        /**
         * <p>The business date.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-01</p>
         */
        @NameInMap("BizDate")
        public Long bizDate;

        /**
         * <p>The scheduled date.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-02</p>
         */
        @NameInMap("DueTime")
        public Long dueTime;

        /**
         * <p>The execution duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The end time of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-12 00:25:02</p>
         */
        @NameInMap("EndExecuteTime")
        public Long endExecuteTime;

        /**
         * <p>The extended information. This field contains information specific to instances of different business systems, such as the fileId of a pipeline, whether a logical table is a hierarchy dimension table, mid-node information, and instance output names.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;a&quot;:&quot;b&quot;}</p>
         */
        @NameInMap("ExtendInfo")
        public String extendInfo;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t_239496_20210411_246982077481</p>
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
         * <p>The details of the node associated with the instance.</p>
         */
        @NameInMap("NodeInfo")
        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfo nodeInfo;

        /**
         * <p>The start time of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-12 00:00:00</p>
         */
        @NameInMap("StartExecuteTime")
        public Long startExecuteTime;

        /**
         * <p>The list of instance statuses. A physical instance list contains only one status. Valid values:</p>
         * <ul>
         * <li>NIT: init.</li>
         * <li>WATING: waiting.</li>
         * <li>RUNNING: running.</li>
         * <li>SUCCESS: succeeded.</li>
         * <li>FAILED: failed.</li>
         * </ul>
         */
        @NameInMap("StatusList")
        public java.util.List<String> statusList;

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li>NORMAL: periodic instance.</li>
         * <li>SUPPLEMENT: data backfill instance.</li>
         * <li>MANUAL: manual instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUPPLEMENT</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetSupplementDagrunInstanceResponseBodyInstanceList build(java.util.Map<String, ?> map) throws Exception {
            GetSupplementDagrunInstanceResponseBodyInstanceList self = new GetSupplementDagrunInstanceResponseBodyInstanceList();
            return TeaModel.build(map, self);
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceList setBizDate(Long bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public Long getBizDate() {
            return this.bizDate;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceList setDueTime(Long dueTime) {
            this.dueTime = dueTime;
            return this;
        }
        public Long getDueTime() {
            return this.dueTime;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceList setEndExecuteTime(Long endExecuteTime) {
            this.endExecuteTime = endExecuteTime;
            return this;
        }
        public Long getEndExecuteTime() {
            return this.endExecuteTime;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceList setExtendInfo(String extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public String getExtendInfo() {
            return this.extendInfo;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceList setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceList setNodeInfo(GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfo nodeInfo) {
            this.nodeInfo = nodeInfo;
            return this;
        }
        public GetSupplementDagrunInstanceResponseBodyInstanceListNodeInfo getNodeInfo() {
            return this.nodeInfo;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceList setStartExecuteTime(Long startExecuteTime) {
            this.startExecuteTime = startExecuteTime;
            return this;
        }
        public Long getStartExecuteTime() {
            return this.startExecuteTime;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceList setStatusList(java.util.List<String> statusList) {
            this.statusList = statusList;
            return this;
        }
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

        public GetSupplementDagrunInstanceResponseBodyInstanceList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
