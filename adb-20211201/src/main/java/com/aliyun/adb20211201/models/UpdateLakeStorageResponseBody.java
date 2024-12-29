// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class UpdateLakeStorageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public UpdateLakeStorageResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>-3EEC-</strong></strong></strong>-9F06-******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateLakeStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLakeStorageResponseBody self = new UpdateLakeStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLakeStorageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateLakeStorageResponseBody setData(UpdateLakeStorageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateLakeStorageResponseBodyData getData() {
        return this.data;
    }

    public UpdateLakeStorageResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateLakeStorageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateLakeStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLakeStorageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateLakeStorageResponseBodyDataPermissions extends TeaModel {
        /**
         * <p>具有该权限的账户或RAM用户ID</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
         * <p>SUB</p>
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

        public static UpdateLakeStorageResponseBodyDataPermissions build(java.util.Map<String, ?> map) throws Exception {
            UpdateLakeStorageResponseBodyDataPermissions self = new UpdateLakeStorageResponseBodyDataPermissions();
            return TeaModel.build(map, self);
        }

        public UpdateLakeStorageResponseBodyDataPermissions setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public UpdateLakeStorageResponseBodyDataPermissions setRead(Boolean read) {
            this.read = read;
            return this;
        }
        public Boolean getRead() {
            return this.read;
        }

        public UpdateLakeStorageResponseBodyDataPermissions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateLakeStorageResponseBodyDataPermissions setWrite(Boolean write) {
            this.write = write;
            return this;
        }
        public Boolean getWrite() {
            return this.write;
        }

    }

    public static class UpdateLakeStorageResponseBodyData extends TeaModel {
        /**
         * <p>湖存储被创建的时间</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-15T07:24:58Z</p>
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
         * <p>amv-23xxxx</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>对湖存储的描述信息</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>湖存储中数据的总存储量</p>
         * 
         * <strong>example:</strong>
         * <p>142</p>
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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PartitionCount")
        public String partitionCount;

        /**
         * <p>设置湖存储的读/写权限和账户级别权限的数组</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Permissions")
        public java.util.List<UpdateLakeStorageResponseBodyDataPermissions> permissions;

        /**
         * <p>指定要操作的湖存储所在区域的ID</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>湖存储中所有库表的总数据行数</p>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * <p>=</p>
         * </blockquote>
         */
        @NameInMap("RowCount")
        public Long rowCount;

        /**
         * <p>湖存储中库表的总数量</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("TableCount")
        public Integer tableCount;

        /**
         * <p>湖存储最后一次更新的时间</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-01T09:22:17Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static UpdateLakeStorageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateLakeStorageResponseBodyData self = new UpdateLakeStorageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateLakeStorageResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateLakeStorageResponseBodyData setCreatorUid(String creatorUid) {
            this.creatorUid = creatorUid;
            return this;
        }
        public String getCreatorUid() {
            return this.creatorUid;
        }

        public UpdateLakeStorageResponseBodyData setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public UpdateLakeStorageResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateLakeStorageResponseBodyData setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public UpdateLakeStorageResponseBodyData setLakeStorageId(String lakeStorageId) {
            this.lakeStorageId = lakeStorageId;
            return this;
        }
        public String getLakeStorageId() {
            return this.lakeStorageId;
        }

        public UpdateLakeStorageResponseBodyData setOperatorUid(String operatorUid) {
            this.operatorUid = operatorUid;
            return this;
        }
        public String getOperatorUid() {
            return this.operatorUid;
        }

        public UpdateLakeStorageResponseBodyData setOwnerUid(String ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public String getOwnerUid() {
            return this.ownerUid;
        }

        public UpdateLakeStorageResponseBodyData setPartitionCount(String partitionCount) {
            this.partitionCount = partitionCount;
            return this;
        }
        public String getPartitionCount() {
            return this.partitionCount;
        }

        public UpdateLakeStorageResponseBodyData setPermissions(java.util.List<UpdateLakeStorageResponseBodyDataPermissions> permissions) {
            this.permissions = permissions;
            return this;
        }
        public java.util.List<UpdateLakeStorageResponseBodyDataPermissions> getPermissions() {
            return this.permissions;
        }

        public UpdateLakeStorageResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateLakeStorageResponseBodyData setRowCount(Long rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Long getRowCount() {
            return this.rowCount;
        }

        public UpdateLakeStorageResponseBodyData setTableCount(Integer tableCount) {
            this.tableCount = tableCount;
            return this;
        }
        public Integer getTableCount() {
            return this.tableCount;
        }

        public UpdateLakeStorageResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
