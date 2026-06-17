// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateAIServiceRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to list all AnalyticDB for PostgreSQL instances in the destination region, including their instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>A description of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>dramatest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>A comma-separated list of IP addresses or CIDR blocks in the IP address whitelist. You can specify up to 1000 entries. To block all external IP access, use 127.0.0.1. Valid formats include the following:</p>
     * <ul>
     * <li><p>10.23.12.24 (an IPv4 address)</p>
     * </li>
     * <li><p>10.23.12.24/24 (a CIDR block, where /24 indicates the prefix length, from 1 to 32)</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>After you create the service, call the ModifyAIServiceSecurityIps operation to update the IP address whitelist.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The service account. It must meet these requirements:</p>
     * <ul>
     * <li><p>Contain only lowercase letters, digits, and underscores.</p>
     * </li>
     * <li><p>Start with a lowercase letter and end with a lowercase letter or digit.</p>
     * </li>
     * <li><p>Not start with gp.</p>
     * </li>
     * <li><p>Be 2 to 16 characters long.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dramauser</p>
     */
    @NameInMap("ServiceAccount")
    public String serviceAccount;

    /**
     * <p>The password for the service account. It must meet these requirements:</p>
     * <ul>
     * <li><p>Contain at least three of the following: uppercase letters, lowercase letters, digits, and special characters.</p>
     * </li>
     * <li><p>Support these special characters: !@#$%^&amp;\*()_+-=.</p>
     * </li>
     * <li><p>Be 8 to 32 characters long.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456Aa!</p>
     */
    @NameInMap("ServiceAccountPassword")
    public String serviceAccountPassword;

    /**
     * <p>The service type. Only drama is supported.</p>
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
