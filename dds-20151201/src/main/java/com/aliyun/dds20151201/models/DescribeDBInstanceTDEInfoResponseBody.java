// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceTDEInfoResponseBody extends TeaModel {
    /**
     * <p>The custom key of the instance.</p>
     * <br>
     * <p>The Bring Your Own Key (BYOK) feature allows you to manage and obtain your own encryption key. This feature is supported only in the following regions:</p>
     * <br>
     * <p>*   cn-hangzhou</p>
     * <p>*   cn-shanghai</p>
     * <p>*   cn-beijing</p>
     * <p>*   cn-shenzhen</p>
     * <p>*   cn-hongkong</p>
     * <p>*   ap-southeast-1</p>
     * <p>*   ap-southeast-3</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The encryption algorithm.</p>
     */
    @NameInMap("EncryptorName")
    public String encryptorName;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the Resource Access Management (RAM) role to which you want to grant permissions.</p>
     */
    @NameInMap("RoleARN")
    public String roleARN;

    /**
     * <p>The TDE status. Valid values:</p>
     * <br>
     * <p>*   **enabled**</p>
     * <p>*   **disabled**</p>
     */
    @NameInMap("TDEStatus")
    public String TDEStatus;

    public static DescribeDBInstanceTDEInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceTDEInfoResponseBody self = new DescribeDBInstanceTDEInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceTDEInfoResponseBody setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public DescribeDBInstanceTDEInfoResponseBody setEncryptorName(String encryptorName) {
        this.encryptorName = encryptorName;
        return this;
    }
    public String getEncryptorName() {
        return this.encryptorName;
    }

    public DescribeDBInstanceTDEInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceTDEInfoResponseBody setRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }
    public String getRoleARN() {
        return this.roleARN;
    }

    public DescribeDBInstanceTDEInfoResponseBody setTDEStatus(String TDEStatus) {
        this.TDEStatus = TDEStatus;
        return this;
    }
    public String getTDEStatus() {
        return this.TDEStatus;
    }

}
