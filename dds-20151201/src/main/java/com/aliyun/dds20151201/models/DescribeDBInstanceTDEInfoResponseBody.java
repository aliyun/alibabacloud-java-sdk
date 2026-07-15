// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceTDEInfoResponseBody extends TeaModel {
    /**
     * <p>The custom key of the instance.</p>
     * <p>Currently, only the following regions support Bring Your Own Key (BYOK), which allows you to manage and own encryption keys:</p>
     * <ul>
     * <li>China (Hangzhou)</li>
     * <li>China (Shanghai)</li>
     * <li>China (Beijing)</li>
     * <li>China (Shenzhen)</li>
     * <li>Hong Kong (China)</li>
     * <li>Singapore</li>
     * <li>Malaysia (Kuala Lumpur)</li>
     * </ul>
     * <blockquote>
     * <p>If BYOK is supported, you can manage and own the key, and the system returns your custom key. If BYOK is not supported, you cannot manage the key, and the system returns the string <code>NoActiveBYOK</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2axxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The encryption algorithm.</p>
     * 
     * <strong>example:</strong>
     * <p>aes-256-cbc</p>
     */
    @NameInMap("EncryptorName")
    public String encryptorName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F4DD0E29-361B-42F2-9301-B0048CCCE5D6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The global resource descriptor ARN (Alibaba Cloud Resource Name) of the role pending authorization.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012****:role/aliyunrdsinstanceencryptiondefaultrole</p>
     */
    @NameInMap("RoleARN")
    public String roleARN;

    /**
     * <p>The TDE enabling status. Valid values:</p>
     * <ul>
     * <li><strong>enabled</strong>: TDE is enabled.</li>
     * <li><strong>disabled</strong>: TDE is disabled.</li>
     * </ul>
     * <blockquote>
     * <p>If the TDE status is disabled, the <strong>RoleARN</strong>, <strong>EncryptionKey</strong>, and <strong>EncryptorName</strong> parameters are not returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
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
