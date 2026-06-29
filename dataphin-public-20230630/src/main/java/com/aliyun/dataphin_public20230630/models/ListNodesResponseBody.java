// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListNodesResponseBody extends TeaModel {
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
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The paging query result.</p>
     */
    @NameInMap("PageResult")
    public ListNodesResponseBodyPageResult pageResult;

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

    public static ListNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodesResponseBody self = new ListNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListNodesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListNodesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNodesResponseBody setPageResult(ListNodesResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListNodesResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListNodesResponseBodyPageResultNodeListCreator extends TeaModel {
        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>23222</p>
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

        public static ListNodesResponseBodyPageResultNodeListCreator build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyPageResultNodeListCreator self = new ListNodesResponseBodyPageResultNodeListCreator();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyPageResultNodeListCreator setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListNodesResponseBodyPageResultNodeListCreator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListNodesResponseBodyPageResultNodeListModifier extends TeaModel {
        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>311131</p>
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

        public static ListNodesResponseBodyPageResultNodeListModifier build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyPageResultNodeListModifier self = new ListNodesResponseBodyPageResultNodeListModifier();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyPageResultNodeListModifier setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListNodesResponseBodyPageResultNodeListModifier setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListNodesResponseBodyPageResultNodeListOwnerList extends TeaModel {
        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>23222</p>
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

        public static ListNodesResponseBodyPageResultNodeListOwnerList build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyPageResultNodeListOwnerList self = new ListNodesResponseBodyPageResultNodeListOwnerList();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyPageResultNodeListOwnerList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListNodesResponseBodyPageResultNodeListOwnerList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListNodesResponseBodyPageResultNodeListProjectInfo extends TeaModel {
        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1121321</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListNodesResponseBodyPageResultNodeListProjectInfo build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyPageResultNodeListProjectInfo self = new ListNodesResponseBodyPageResultNodeListProjectInfo();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyPageResultNodeListProjectInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListNodesResponseBodyPageResultNodeListProjectInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListNodesResponseBodyPageResultNodeList extends TeaModel {
        /**
         * <p>The name of the business unit to which the node belongs.</p>
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
         * <p>2024-05-30 16:47:13</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The creator.</p>
         */
        @NameInMap("Creator")
        public ListNodesResponseBodyPageResultNodeListCreator creator;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>xx test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Specifies whether to perform a dry run.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DryRun")
        public Boolean dryRun;

        /**
         * <p>The extended information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;xx&quot;:&quot;zz&quot;}</p>
         */
        @NameInMap("ExtendInfo")
        public String extendInfo;

        /**
         * <p>The source.</p>
         * 
         * <strong>example:</strong>
         * <p>DATA_PROCESS</p>
         */
        @NameInMap("From")
        public String from;

        /**
         * <p>Indicates whether a development environment exists.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasDev")
        public Boolean hasDev;

        /**
         * <p>Indicates whether a production environment exists.</p>
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
         * <p>n_31111</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-30 16:47:13</p>
         */
        @NameInMap("LastModifiedTime")
        public String lastModifiedTime;

        /**
         * <p>The user who last modified the node.</p>
         */
        @NameInMap("Modifier")
        public ListNodesResponseBodyPageResultNodeListModifier modifier;

        /**
         * <p>The node name.</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The owner.</p>
         */
        @NameInMap("OwnerList")
        public java.util.List<ListNodesResponseBodyPageResultNodeListOwnerList> ownerList;

        /**
         * <p>The priority.</p>
         */
        @NameInMap("PriorityList")
        public java.util.List<String> priorityList;

        /**
         * <p>The project to which the node belongs.</p>
         */
        @NameInMap("ProjectInfo")
        public ListNodesResponseBodyPageResultNodeListProjectInfo projectInfo;

        /**
         * <p>Indicates whether scheduling is paused.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SchedulePaused")
        public Boolean schedulePaused;

        /**
         * <p>The scheduling period.</p>
         */
        @NameInMap("SchedulePeriodList")
        public java.util.List<String> schedulePeriodList;

        /**
         * <p>The sub-business types. Valid values:</p>
         * <ul>
         * <li>MAX_COMPUTE_SQL</li>
         * <li>HIVE_SQL</li>
         * <li>SHELL</li>
         * <li>PYTHON</li>
         * <li>ONE_SERVICE_SQL</li>
         * <li>DATABASE_SQL.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SHELL</p>
         */
        @NameInMap("SubDetailType")
        public String subDetailType;

        /**
         * <p>The node type.</p>
         * 
         * <strong>example:</strong>
         * <p>DATA_PROCESS</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListNodesResponseBodyPageResultNodeList build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyPageResultNodeList self = new ListNodesResponseBodyPageResultNodeList();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyPageResultNodeList setBizUnitName(String bizUnitName) {
            this.bizUnitName = bizUnitName;
            return this;
        }
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        public ListNodesResponseBodyPageResultNodeList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListNodesResponseBodyPageResultNodeList setCreator(ListNodesResponseBodyPageResultNodeListCreator creator) {
            this.creator = creator;
            return this;
        }
        public ListNodesResponseBodyPageResultNodeListCreator getCreator() {
            return this.creator;
        }

        public ListNodesResponseBodyPageResultNodeList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListNodesResponseBodyPageResultNodeList setDryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Boolean getDryRun() {
            return this.dryRun;
        }

        public ListNodesResponseBodyPageResultNodeList setExtendInfo(String extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public String getExtendInfo() {
            return this.extendInfo;
        }

        public ListNodesResponseBodyPageResultNodeList setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public ListNodesResponseBodyPageResultNodeList setHasDev(Boolean hasDev) {
            this.hasDev = hasDev;
            return this;
        }
        public Boolean getHasDev() {
            return this.hasDev;
        }

        public ListNodesResponseBodyPageResultNodeList setHasProd(Boolean hasProd) {
            this.hasProd = hasProd;
            return this;
        }
        public Boolean getHasProd() {
            return this.hasProd;
        }

        public ListNodesResponseBodyPageResultNodeList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListNodesResponseBodyPageResultNodeList setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public ListNodesResponseBodyPageResultNodeList setModifier(ListNodesResponseBodyPageResultNodeListModifier modifier) {
            this.modifier = modifier;
            return this;
        }
        public ListNodesResponseBodyPageResultNodeListModifier getModifier() {
            return this.modifier;
        }

        public ListNodesResponseBodyPageResultNodeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNodesResponseBodyPageResultNodeList setOwnerList(java.util.List<ListNodesResponseBodyPageResultNodeListOwnerList> ownerList) {
            this.ownerList = ownerList;
            return this;
        }
        public java.util.List<ListNodesResponseBodyPageResultNodeListOwnerList> getOwnerList() {
            return this.ownerList;
        }

        public ListNodesResponseBodyPageResultNodeList setPriorityList(java.util.List<String> priorityList) {
            this.priorityList = priorityList;
            return this;
        }
        public java.util.List<String> getPriorityList() {
            return this.priorityList;
        }

        public ListNodesResponseBodyPageResultNodeList setProjectInfo(ListNodesResponseBodyPageResultNodeListProjectInfo projectInfo) {
            this.projectInfo = projectInfo;
            return this;
        }
        public ListNodesResponseBodyPageResultNodeListProjectInfo getProjectInfo() {
            return this.projectInfo;
        }

        public ListNodesResponseBodyPageResultNodeList setSchedulePaused(Boolean schedulePaused) {
            this.schedulePaused = schedulePaused;
            return this;
        }
        public Boolean getSchedulePaused() {
            return this.schedulePaused;
        }

        public ListNodesResponseBodyPageResultNodeList setSchedulePeriodList(java.util.List<String> schedulePeriodList) {
            this.schedulePeriodList = schedulePeriodList;
            return this;
        }
        public java.util.List<String> getSchedulePeriodList() {
            return this.schedulePeriodList;
        }

        public ListNodesResponseBodyPageResultNodeList setSubDetailType(String subDetailType) {
            this.subDetailType = subDetailType;
            return this;
        }
        public String getSubDetailType() {
            return this.subDetailType;
        }

        public ListNodesResponseBodyPageResultNodeList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListNodesResponseBodyPageResult extends TeaModel {
        /**
         * <p>The list of nodes on the current page.</p>
         */
        @NameInMap("NodeList")
        public java.util.List<ListNodesResponseBodyPageResultNodeList> nodeList;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListNodesResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyPageResult self = new ListNodesResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyPageResult setNodeList(java.util.List<ListNodesResponseBodyPageResultNodeList> nodeList) {
            this.nodeList = nodeList;
            return this;
        }
        public java.util.List<ListNodesResponseBodyPageResultNodeList> getNodeList() {
            return this.nodeList;
        }

        public ListNodesResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
