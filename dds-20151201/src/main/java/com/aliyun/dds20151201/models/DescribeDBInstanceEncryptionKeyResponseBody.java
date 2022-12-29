// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceEncryptionKeyResponseBody extends TeaModel {
    // The UID of the key creator.
    @NameInMap("Creator")
    public String creator;

    // The scheduled time when the key for the instance will be deleted. If the value is empty, the key will not be deleted.
    @NameInMap("DeleteDate")
    public String deleteDate;

    // The description of the key for the instance.
    @NameInMap("Description")
    public String description;

    // The key for the instance.
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    // Indicates whether the key for the instance is enabled. Valid values:
    // 
    // *   **Enabled**
    // *   **Disabled**
    @NameInMap("EncryptionKeyStatus")
    public String encryptionKeyStatus;

    // The purpose of the key for the instance.
    @NameInMap("KeyUsage")
    public String keyUsage;

    // The expiration time of the key for the instance. The time is displayed in UTC. If the value is empty, the key for the instance will not expire.
    @NameInMap("MaterialExpireTime")
    public String materialExpireTime;

    // The source of the key for the instance.
    @NameInMap("Origin")
    public String origin;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceEncryptionKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceEncryptionKeyResponseBody self = new DescribeDBInstanceEncryptionKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceEncryptionKeyResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public DescribeDBInstanceEncryptionKeyResponseBody setDeleteDate(String deleteDate) {
        this.deleteDate = deleteDate;
        return this;
    }
    public String getDeleteDate() {
        return this.deleteDate;
    }

    public DescribeDBInstanceEncryptionKeyResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeDBInstanceEncryptionKeyResponseBody setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public DescribeDBInstanceEncryptionKeyResponseBody setEncryptionKeyStatus(String encryptionKeyStatus) {
        this.encryptionKeyStatus = encryptionKeyStatus;
        return this;
    }
    public String getEncryptionKeyStatus() {
        return this.encryptionKeyStatus;
    }

    public DescribeDBInstanceEncryptionKeyResponseBody setKeyUsage(String keyUsage) {
        this.keyUsage = keyUsage;
        return this;
    }
    public String getKeyUsage() {
        return this.keyUsage;
    }

    public DescribeDBInstanceEncryptionKeyResponseBody setMaterialExpireTime(String materialExpireTime) {
        this.materialExpireTime = materialExpireTime;
        return this;
    }
    public String getMaterialExpireTime() {
        return this.materialExpireTime;
    }

    public DescribeDBInstanceEncryptionKeyResponseBody setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public DescribeDBInstanceEncryptionKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
