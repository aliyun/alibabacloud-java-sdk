// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceEncryptionKeyResponseBody extends TeaModel {
    /**
     * <p>The UID of the key creator.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <p>The scheduled deletion time of the instance key. If this value is empty, the key is not automatically deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-07-06T18:22:03Z</p>
     */
    @NameInMap("DeleteDate")
    public String deleteDate;

    /**
     * <p>The description of the instance key.</p>
     * 
     * <strong>example:</strong>
     * <p>key description example</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance key.</p>
     * 
     * <strong>example:</strong>
     * <p>2axxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The status of the instance key. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: The instance key is available.</li>
     * <li><strong>Disabled</strong>: The instance key is unavailable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("EncryptionKeyStatus")
    public String encryptionKeyStatus;

    /**
     * <p>The purpose of the instance key.</p>
     * 
     * <strong>example:</strong>
     * <p>ENCRYPT/DECRYPT</p>
     */
    @NameInMap("KeyUsage")
    public String keyUsage;

    /**
     * <p>The expiration time of the key (UTC). If this value is empty, the key does not expire.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-07-06T18:22:03Z</p>
     */
    @NameInMap("MaterialExpireTime")
    public String materialExpireTime;

    /**
     * <p>The source of the instance key.</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun_KMS</p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>783C2062-A2D3-4EA8-88AD-E43F990C23BB</p>
     */
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
