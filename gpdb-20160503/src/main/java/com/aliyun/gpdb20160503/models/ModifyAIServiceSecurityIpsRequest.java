// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyAIServiceSecurityIpsRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p>To view details of all instances in a destination region, including their IDs, call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>A comma-separated list of IP addresses or CIDR blocks in the IP address whitelist group. You can specify up to 1000 entries. To block all external IP addresses, set this parameter to 127.0.0.1. Valid formats include the following:</p>
     * <ul>
     * <li><p>10.23.12.24 (an IPv4 address)</p>
     * </li>
     * <li><p>10.23.12.24/24 (a CIDR block. The number after the slash indicates the prefix length and must be between 1 and 32.)</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The ID of the service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>drama-123456</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The service type. Only drama is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>drama</p>
     */
    @NameInMap("Type")
    public String type;

    public static ModifyAIServiceSecurityIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAIServiceSecurityIpsRequest self = new ModifyAIServiceSecurityIpsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAIServiceSecurityIpsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyAIServiceSecurityIpsRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public ModifyAIServiceSecurityIpsRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public ModifyAIServiceSecurityIpsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
