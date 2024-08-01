// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceTDEInfoResponseBody extends TeaModel {
    /**
     * <p>实例的自定义密钥。</p>
     * <p>目前仅以下地域支持BYOK（Bring Your Own Key，用户可以自行管理和拥有加密密钥）：</p>
     * <ul>
     * <li>华东1（杭州）</li>
     * <li>华东2（上海）</li>
     * <li>华北2（北京）</li>
     * <li>华南1（深圳）</li>
     * <li>中国（香港）</li>
     * <li>新加坡</li>
     * <li>马来西亚（吉隆坡）</li>
     * </ul>
     * <blockquote>
     * <p>支持BYOK，用户可以管理且拥有密钥，系统将返回用户的自定义密钥；不支持BYOK，用户不可管理密钥，系统将返回字符串<code>NoActiveBYOK</code>。</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2axxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>加密算法。</p>
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
     * <p>指定待授权角色的全局资源描述符ARN（Alibaba Cloud Resource Name）信息。</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012****:role/aliyunrdsinstanceencryptiondefaultrole</p>
     */
    @NameInMap("RoleARN")
    public String roleARN;

    /**
     * <p>The TDE status. Valid values:</p>
     * <ul>
     * <li><strong>enabled</strong></li>
     * <li><strong>disabled</strong></li>
     * </ul>
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
