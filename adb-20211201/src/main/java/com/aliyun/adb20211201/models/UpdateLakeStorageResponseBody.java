// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class UpdateLakeStorageResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Description&quot;:&quot;Sample lake storage&quot;,&quot;RowCount&quot;:1000,&quot;TableCount&quot;:1}</p>
     */
    @NameInMap("Data")
    public UpdateLakeStorageResponseBodyData data;

    /**
     * <p>The HTTP status code returned for the request. A value of 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The additional information about the call result. Description:</p>
     * <ul>
     * <li>If the request is successful, OK is returned.</li>
     * <li>If the request fails, a specific error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
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
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
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
         * <p>SUB</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The write permission.</p>
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
         * <p>amv-23xxxx</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The description of the lake storage.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The total storage size.</p>
         * 
         * <strong>example:</strong>
         * <p>142</p>
         */
        @NameInMap("FileSize")
        public String fileSize;

        /**
         * <p>The unique identifier of the lake storage.</p>
         * 
         * <strong>example:</strong>
         * <p>adb-lake-cn-hangzhou-1a1aaaa11a</p>
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
         * <p>0</p>
         */
        @NameInMap("PartitionCount")
        public String partitionCount;

        /**
         * <p>The permissions of the lake storage.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Account&quot;:&quot;1234567890123456&quot;,&quot;Read&quot;:true,&quot;Write&quot;:true}]</p>
         */
        @NameInMap("Permissions")
        public java.util.List<UpdateLakeStorageResponseBodyDataPermissions> permissions;

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
         * <p>1000</p>
         */
        @NameInMap("RowCount")
        public Long rowCount;

        /**
         * <p>The number of databases and tables.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("TableCount")
        public Integer tableCount;

        /**
         * <p>The update time.</p>
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
