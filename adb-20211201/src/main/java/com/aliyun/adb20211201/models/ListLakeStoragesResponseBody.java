// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListLakeStoragesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
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
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Items")
    public java.util.List<ListLakeStoragesResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>-964D-</strong></strong>-9D31-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListLakeStoragesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLakeStoragesResponseBody self = new ListLakeStoragesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLakeStoragesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLakeStoragesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListLakeStoragesResponseBody setItems(java.util.List<ListLakeStoragesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListLakeStoragesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListLakeStoragesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLakeStoragesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListLakeStoragesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLakeStoragesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLakeStoragesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLakeStoragesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListLakeStoragesResponseBodyItemsPermissions extends TeaModel {
        /**
         * <p>具有该权限的账户或RAM用户ID</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <p>表示是否允许读取湖存储的权限</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Read")
        public Boolean read;

        /**
         * <p>指定权限的账户类型</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>表示是否允许向湖存储写入数据的权限</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Write")
        public Boolean write;

        public static ListLakeStoragesResponseBodyItemsPermissions build(java.util.Map<String, ?> map) throws Exception {
            ListLakeStoragesResponseBodyItemsPermissions self = new ListLakeStoragesResponseBodyItemsPermissions();
            return TeaModel.build(map, self);
        }

        public ListLakeStoragesResponseBodyItemsPermissions setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public ListLakeStoragesResponseBodyItemsPermissions setRead(Boolean read) {
            this.read = read;
            return this;
        }
        public Boolean getRead() {
            return this.read;
        }

        public ListLakeStoragesResponseBodyItemsPermissions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListLakeStoragesResponseBodyItemsPermissions setWrite(Boolean write) {
            this.write = write;
            return this;
        }
        public Boolean getWrite() {
            return this.write;
        }

    }

    public static class ListLakeStoragesResponseBodyItems extends TeaModel {
        /**
         * <p>湖存储被创建的时间</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-01T09:50:18Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>创建湖存储的用户账号的唯一标识符</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("CreatorUid")
        public String creatorUid;

        /**
         * <p>用于指定和挂载到特定ADB主实例的湖存储</p>
         * 
         * <strong>example:</strong>
         * <p>amv-*******</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>对湖存储的描述信息</p>
         * 
         * <strong>example:</strong>
         * <p>Create a role to run ROS StackGroups.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>651</p>
         */
        @NameInMap("FileSize")
        public String fileSize;

        /**
         * <p>用于识别特定湖存储的唯一标识符</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("LakeStorageId")
        public String lakeStorageId;

        /**
         * <p>最后操作湖存储的用户账号的唯一标识符</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("OperatorUid")
        public String operatorUid;

        /**
         * <p>拥有湖存储资源的用户账号的唯一标识符</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("OwnerUid")
        public String ownerUid;

        /**
         * <p>设置湖存储的读/写权限和账户级别权限的数组</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Permissions")
        public java.util.List<ListLakeStoragesResponseBodyItemsPermissions> permissions;

        /**
         * <p>指定要操作的湖存储所在区域的ID</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>湖存储中库表的总数量</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TableCount")
        public Integer tableCount;

        /**
         * <p>湖存储中所有库表的总数据行数</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TotalRows")
        public Long totalRows;

        /**
         * <p>湖存储中数据的总存储量</p>
         * 
         * <strong>example:</strong>
         * <p>111333</p>
         */
        @NameInMap("TotalStorage")
        public String totalStorage;

        /**
         * <p>湖存储最后一次更新的时间</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-15T02:24:32</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListLakeStoragesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListLakeStoragesResponseBodyItems self = new ListLakeStoragesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListLakeStoragesResponseBodyItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListLakeStoragesResponseBodyItems setCreatorUid(String creatorUid) {
            this.creatorUid = creatorUid;
            return this;
        }
        public String getCreatorUid() {
            return this.creatorUid;
        }

        public ListLakeStoragesResponseBodyItems setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public ListLakeStoragesResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLakeStoragesResponseBodyItems setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public ListLakeStoragesResponseBodyItems setLakeStorageId(String lakeStorageId) {
            this.lakeStorageId = lakeStorageId;
            return this;
        }
        public String getLakeStorageId() {
            return this.lakeStorageId;
        }

        public ListLakeStoragesResponseBodyItems setOperatorUid(String operatorUid) {
            this.operatorUid = operatorUid;
            return this;
        }
        public String getOperatorUid() {
            return this.operatorUid;
        }

        public ListLakeStoragesResponseBodyItems setOwnerUid(String ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public String getOwnerUid() {
            return this.ownerUid;
        }

        public ListLakeStoragesResponseBodyItems setPermissions(java.util.List<ListLakeStoragesResponseBodyItemsPermissions> permissions) {
            this.permissions = permissions;
            return this;
        }
        public java.util.List<ListLakeStoragesResponseBodyItemsPermissions> getPermissions() {
            return this.permissions;
        }

        public ListLakeStoragesResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListLakeStoragesResponseBodyItems setTableCount(Integer tableCount) {
            this.tableCount = tableCount;
            return this;
        }
        public Integer getTableCount() {
            return this.tableCount;
        }

        public ListLakeStoragesResponseBodyItems setTotalRows(Long totalRows) {
            this.totalRows = totalRows;
            return this;
        }
        public Long getTotalRows() {
            return this.totalRows;
        }

        public ListLakeStoragesResponseBodyItems setTotalStorage(String totalStorage) {
            this.totalStorage = totalStorage;
            return this;
        }
        public String getTotalStorage() {
            return this.totalStorage;
        }

        public ListLakeStoragesResponseBodyItems setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
