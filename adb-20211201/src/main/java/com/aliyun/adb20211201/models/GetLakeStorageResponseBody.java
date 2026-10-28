// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetLakeStorageResponseBody extends TeaModel {
    /**
     * <p>The status code or POP error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public GetLakeStorageResponseBodyData data;

    /**
     * <p>The HTTP status code returned for the request. A value of 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The additional information about the call result. Valid values:</p>
     * <ul>
     * <li>If the request is normal, <strong>Ok</strong> is returned.                                </li>
     * <li>If the request is abnormal, a specific error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>-3EEC-</strong></strong></strong>-9F06-******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetLakeStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLakeStorageResponseBody self = new GetLakeStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLakeStorageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLakeStorageResponseBody setData(GetLakeStorageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLakeStorageResponseBodyData getData() {
        return this.data;
    }

    public GetLakeStorageResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetLakeStorageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLakeStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLakeStorageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetLakeStorageResponseBodyDataPermissions extends TeaModel {
        /**
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <p>The read permission.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Read")
        public Boolean read;

        /**
         * <p>The account type.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The write permission.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Write")
        public Boolean write;

        public static GetLakeStorageResponseBodyDataPermissions build(java.util.Map<String, ?> map) throws Exception {
            GetLakeStorageResponseBodyDataPermissions self = new GetLakeStorageResponseBodyDataPermissions();
            return TeaModel.build(map, self);
        }

        public GetLakeStorageResponseBodyDataPermissions setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public GetLakeStorageResponseBodyDataPermissions setRead(Boolean read) {
            this.read = read;
            return this;
        }
        public Boolean getRead() {
            return this.read;
        }

        public GetLakeStorageResponseBodyDataPermissions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLakeStorageResponseBodyDataPermissions setWrite(Boolean write) {
            this.write = write;
            return this;
        }
        public Boolean getWrite() {
            return this.write;
        }

    }

    public static class GetLakeStorageResponseBodyData extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-15T07:24:58Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The UID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("CreatorUid")
        public String creatorUid;

        /**
         * <p>The ADB instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-*******</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The description of the lake storage.</p>
         * 
         * <strong>example:</strong>
         * <p>a test db</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The total storage size.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FileSize")
        public String fileSize;

        /**
         * <p>The unique identifier of the lake storage.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("LakeStorageId")
        public String lakeStorageId;

        /**
         * <p>The UID of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("OperatorUid")
        public String operatorUid;

        /**
         * <p>The UID of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("OwnerUid")
        public String ownerUid;

        /**
         * <p>The number of partitions.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("PartitionCount")
        public String partitionCount;

        /**
         * <p>The permissions of the lake storage.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Permissions")
        public java.util.List<GetLakeStorageResponseBodyDataPermissions> permissions;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The total number of data rows.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("RowCount")
        public Long rowCount;

        /**
         * <p>The number of databases and tables.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("TableCount")
        public Integer tableCount;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-14T02:28:41Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetLakeStorageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLakeStorageResponseBodyData self = new GetLakeStorageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLakeStorageResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetLakeStorageResponseBodyData setCreatorUid(String creatorUid) {
            this.creatorUid = creatorUid;
            return this;
        }
        public String getCreatorUid() {
            return this.creatorUid;
        }

        public GetLakeStorageResponseBodyData setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public GetLakeStorageResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLakeStorageResponseBodyData setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public GetLakeStorageResponseBodyData setLakeStorageId(String lakeStorageId) {
            this.lakeStorageId = lakeStorageId;
            return this;
        }
        public String getLakeStorageId() {
            return this.lakeStorageId;
        }

        public GetLakeStorageResponseBodyData setOperatorUid(String operatorUid) {
            this.operatorUid = operatorUid;
            return this;
        }
        public String getOperatorUid() {
            return this.operatorUid;
        }

        public GetLakeStorageResponseBodyData setOwnerUid(String ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public String getOwnerUid() {
            return this.ownerUid;
        }

        public GetLakeStorageResponseBodyData setPartitionCount(String partitionCount) {
            this.partitionCount = partitionCount;
            return this;
        }
        public String getPartitionCount() {
            return this.partitionCount;
        }

        public GetLakeStorageResponseBodyData setPermissions(java.util.List<GetLakeStorageResponseBodyDataPermissions> permissions) {
            this.permissions = permissions;
            return this;
        }
        public java.util.List<GetLakeStorageResponseBodyDataPermissions> getPermissions() {
            return this.permissions;
        }

        public GetLakeStorageResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetLakeStorageResponseBodyData setRowCount(Long rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Long getRowCount() {
            return this.rowCount;
        }

        public GetLakeStorageResponseBodyData setTableCount(Integer tableCount) {
            this.tableCount = tableCount;
            return this;
        }
        public Integer getTableCount() {
            return this.tableCount;
        }

        public GetLakeStorageResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
