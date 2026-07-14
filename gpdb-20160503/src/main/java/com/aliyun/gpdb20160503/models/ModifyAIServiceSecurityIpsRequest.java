// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyAIServiceSecurityIpsRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the details of all instances in a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The list of IP addresses in the IP address whitelist group. You can add up to 1,000 IP addresses, separated by commas (,). The value 127.0.0.1 indicates that no external IP addresses are allowed to access the instance. The following formats are supported:</p>
     * <ul>
     * <li>10.23.12.24 (IP address)</li>
     * <li>10.23.12.24/24 (CIDR pattern, Classless Inter-Domain Routing. /24 specifies the prefix length, which ranges from 1 to 32.)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The service ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>drama-123456</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The service type. Currently, only drama is supported.</p>
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
