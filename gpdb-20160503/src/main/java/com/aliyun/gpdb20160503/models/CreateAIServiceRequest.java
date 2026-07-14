// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateAIServiceRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>dramatest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The list of IP addresses in IP address whitelist group. You can specify up to 1,000 IP addresses, separated by commas (,). The value 127.0.0.1 indicates that no external IP addresses are allowed to access the instance. The following formats are supported:</p>
     * <ul>
     * <li>10.23.12.24 (IP address)</li>
     * <li>10.23.12.24/24 (CIDR block. The value /24 indicates the length of the prefix in the address, which ranges from 1 to 32.)</li>
     * </ul>
     * <blockquote>
     * <p>After the service is created, you can call the ModifyAIServiceSecurityIps operation to modify IP address whitelist.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The service account. The following limits apply:</p>
     * <ul>
     * <li>The account name can contain lowercase letters, digits, and underscores (_).</li>
     * <li>The account name must start with a lowercase letter and end with a lowercase letter or digit.</li>
     * <li>The account name cannot start with gp.</li>
     * <li>The account name must be 2 to 16 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dramauser</p>
     */
    @NameInMap("ServiceAccount")
    public String serviceAccount;

    /**
     * <p>The password of the service account. The following limits apply:</p>
     * <ul>
     * <li>The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
     * <li>Supported special characters: !@#$%^&amp;*()_+-=</li>
     * <li>The password must be 8 to 32 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456Aa!</p>
     */
    @NameInMap("ServiceAccountPassword")
    public String serviceAccountPassword;

    /**
     * <p>The service type. Currently, only drama is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>drama</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateAIServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAIServiceRequest self = new CreateAIServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateAIServiceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateAIServiceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAIServiceRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public CreateAIServiceRequest setServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
        return this;
    }
    public String getServiceAccount() {
        return this.serviceAccount;
    }

    public CreateAIServiceRequest setServiceAccountPassword(String serviceAccountPassword) {
        this.serviceAccountPassword = serviceAccountPassword;
        return this;
    }
    public String getServiceAccountPassword() {
        return this.serviceAccountPassword;
    }

    public CreateAIServiceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
